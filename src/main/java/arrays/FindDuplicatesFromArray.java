package arrays;

import java.util.*;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        int []arr={13, 9, 25, 1, 1, 0 ,22, 13 ,22, 20 ,3 ,8 ,11 ,25,10, 3, 15 ,11 ,19 ,20, 2, 4, 25 ,14 ,23 ,14};
        System.out.println(duplicates(arr,8));
    }
    public static ArrayList<Integer> duplicates(int[] arr, int n) {

        Arrays.sort(arr);
     Set<Integer> set=new LinkedHashSet<>();
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]==arr[i]){
                set.add(arr[i]);
            }
        }

        if (set.isEmpty()){
           set.add(-1);
        }

return new ArrayList<Integer>(set);
    }
}
