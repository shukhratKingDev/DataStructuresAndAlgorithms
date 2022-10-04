package arrays;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,4);
        list.add(1,1);
        list.add(2,3);
        list.add(3,90);
        list.add(4,5);
        list.add(5,8);

        reverseInGroups(list,6,3);
    }

  public   static void  reverseInGroups(ArrayList<Integer> arr, int n, int k) {

      List<Integer> list=new ArrayList<>();
      for (int i=0;i<n;i++){
            if ((i+1)%k==0){
                list.addAll(arr.subList(i,i+k));
                list.sort(Comparator.reverseOrder());

            }
        }
    }
}
