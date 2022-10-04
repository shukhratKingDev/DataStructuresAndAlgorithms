package arrays;

import java.util.ArrayList;

public class FindTheSafePosition {
    public static void main(String[] args) {
        System.out.println(safePos(10,3));
    }
    static int safePos(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(i);
        }
        while(list.size()!=1){
            for (int i = 1; i < n; i++) {
                if (i % k == 0) {
                    list.remove(i-1);
                    i++;
                    n--;
                }
            }
        }

       return list.get(0);
         }
}
