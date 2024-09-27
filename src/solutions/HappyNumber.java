package solutions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {

        Set<Integer> seenNumbers = new HashSet<>();

        while(n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSumOfSquares(n);
        }
        return n==1;
    }

    private static int getSumOfSquares(int n){
        int sum = 0;

        while(n != 0) {
            int digit = n % 10; // Get the last digit
            sum = sum + digit*digit;
            n /= 10;
        }
        return sum;
    }
}
