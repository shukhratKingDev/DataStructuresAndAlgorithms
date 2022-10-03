package arrays;
public class ModifiedNumbersAndQueries {
    public static void main(String[] args) {
        System.out.println(sumOfAll(4, 13));
    }
    public static int sumOfAll(int l, int r) {
        int sum = 0;
        if (l == 1) {
            sum = 1;
            l++;
        }
        for (int i = l; i <= r; i++) {
            for (int j = 2; j <= i; j++) {

                if (i % j == 0) {
                    if (isPrime(j)) {
                        sum += j;
                    }
                }

            }
        }
        return sum;
    }
    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
