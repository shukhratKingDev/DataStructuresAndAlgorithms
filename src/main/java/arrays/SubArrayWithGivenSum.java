package arrays;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(subarraySum_1_3(a, 10, 15));
    }

    static ArrayList<Integer> subarraySum_1(int[] arr, int n, int s) {
        int sum = 0;
        int k = 0;
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = counter; i < n; i++) {
            for (int j = i; j < n; j++) {

                sum += arr[j];
                if (sum == s) {
                    list.add(0, k + 1);
                    list.add(1, j + 1);
                    return list;
                }
                counter++;
                if (sum > s) {
                    break;
                }
            }
            sum -= arr[k];
            k++;
            i = counter;

        }
        list.add(0, -1);
        return list;

    }

    public static ArrayList<Integer> subarraySum_1_2(int[] arr, int n, int s) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < s && i == n - 1 || sum > s && i == n - 1) {
                list.add(0, -1);
                return list;
            }
            if (sum > s) {
                sum -= arr[n - i];
            }
            if (sum == s) {
                list.add(0, n - i + 1);
                list.add(1, i + 1);
                return list;
            }

        }
        return list;
    }

    public static ArrayList<Integer> subarraySum_1_3(int[] arr, int n, int s) {
        int k = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == s) {
                list.add(0, k + 1);
                list.add(1, i + 1);
                return list;
            }
            if (sum > s) {
                sum = 0;
                k++;
                i = k - 1;
            }

            if ((sum < s || sum > s) && i == n - 1) {
                list.add(0, -1);
                return list;
            }
        }
        list.add(0, -1);
        return list;

    }
}
