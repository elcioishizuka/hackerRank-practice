package thirtyDaysOfCode.day5Loops;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 1; i <= 10 ; i++){
            System.out.format("%d x %d = %d \n", n, i, n*i);
        }

        scanner.close();
    }
}

