package arrays;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {
        int []a={0,1,0,0,0,2,2,2,};
        int n=2;
//        sort012(a,n);
    sort012_1(a,n);
    }

    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort012_1(int a[], int n)
    {for (int i=0;i<a.length;i++){
        for (int j=i+1;j<=a.length-1;j++){
            if (a[i]>=a[j]){
                a[i]+=a[j];
                a[j]=a[i]-a[j];
                a[i]=a[i]-a[j];
            }
        }
    }

        System.out.println(Arrays.toString(a));
    }


}
