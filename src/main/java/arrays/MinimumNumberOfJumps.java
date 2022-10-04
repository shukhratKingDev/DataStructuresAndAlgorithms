package arrays;

import java.time.LocalDate;
import java.time.LocalTime;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int []array={1,2,6,1,0,0,4,3};
//        int []array={2, 3 ,1,1 ,2 ,4, 2, 0, 1 ,1};
//        int []array={  0,0,0,0,0,0,0,};
//        int []array={  8, 9, 2, 6, 7, 6, 8, 9,1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9,9, 2, 6, 7, 6, 8, 9,8, 9, 2, 6, 7, 6, 8, 9,1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9,9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(array));

    }

    static int minJumps(int[] arr) {

        int k = 1;
        for (int i = 0; i < arr.length;) {
            if (i + arr[i] >= arr.length - 1) {
                return k;
            }
            i =i+ arr[i];
            k++;
            if (k>arr.length){
                return -1;
            }
        }

        return -1;

    }
}
