package arrays;

import java.util.Arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int []array={1};
        int n=2;
//
//        int []array={1,2,3,4,5,7,8,9,10};
//        int n=10;
        System.out.println(missingNumber(array,n));
    }
   public static int missingNumber(int [] array, int n) {
       Arrays.sort(array);
       if(array[n-2]!=n){
           return n;
       }
       for (int i=0;i<n-1;i++){
           if (array[i]!=i+1){
               return i+1;
           }
       }
       return -1;
    }

}
