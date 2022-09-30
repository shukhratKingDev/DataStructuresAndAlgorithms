package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        int []arr={1,1,1,2,3,4,5,5,1,1,1,2,3,4,5,5,1,1,1,2,3,4,5,5,55,55,78,78,909,90,90};
        System.out.println(duplicates(arr,8));
    }
    public static ArrayList<Integer> duplicates(int[] arr, int n) {

        Arrays.sort(arr);
     Set set=new HashSet();
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]==arr[i]){
                set.add(arr[i]);
            }
        }
return new ArrayList<Integer>(set);
    }
}
