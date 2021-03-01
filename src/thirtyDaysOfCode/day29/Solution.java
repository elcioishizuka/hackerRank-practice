package thirtyDaysOfCode.day29;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int result = 0, tmp;

            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    tmp = a & b;
                    if (result < tmp & tmp < k & a != b){
                        result = tmp;
                    }
                }
            }
            System.out.println(result);


        }

        scanner.close();
    }
}
