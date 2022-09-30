package arrays;

import java.util.Arrays;

public class FittingTheArray {


    public static void main(String[] args) {

 int [] a={40 ,22 ,11 ,10, 5, 1 ,61, 30};
 int []b={78 ,5 ,20 ,36 ,44 ,26 ,22 ,65};
        System.out.println(isFit(a,b,8));
    }

    public static boolean isFit (int arr[], int brr[], int n) {

        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i=0;i<n;i++){
            if (brr[i]<arr[i]){
                return false;
            }
        }
return true;
    }

}
