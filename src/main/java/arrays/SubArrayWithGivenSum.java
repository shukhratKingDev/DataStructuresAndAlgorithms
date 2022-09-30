package arrays;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
//       int [] a= {1, 2, 3, 7, 5};

        LocalDateTime date=LocalDateTime.now();
        System.out.println(date);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int sum=0;
        int k=0;
        int counter=0;
        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=k;i<n;i++){
////            for(int j=i;j<n;j++){
////                sum+=arr[j];
////                if(sum==s){
////                    list.add(i+1) ;list.add(j+1);
////                    return list;
////                }
////                k++;
////            }
////            sum-=arr[c];
////            c++;
////            i=k;
////            for (int integer : arr) {
////                sum+=integer;
////                if (sum==s){
////                    list.add(0,)
////                }
////            }
//
//
//        }
//        list.add(0,-1);
//        return list;
        for (int i=counter;i<n;i++){
            for (int j=i;j  <n;j++){

                sum+=arr[j];
                if(sum==s){
                    list.add(0,k+1);
                     list.add(1,j+1);
                     return list;
                }
                counter++;
                if(sum>s){
                    break;
                }
            }
            sum-=arr[k];
            k++;
            i=counter;

        }
        list.add(0,-1);
        return list;

    }

    public static ArrayList<Integer> subarraySum_1(int [] arr,int n,int s){
        int sum=0;
        int k=1;
        ArrayList<Integer>list=new ArrayList<>();

        return list;
    }
    public static void findSum(int[]arr,int sum,int s,int k,ArrayList<Integer> list){
        for (int i=k;i<arr.length;i++){
if (sum==s){
    list.add(0,k);
    list.add(1,i);
}
        }
    }
}
