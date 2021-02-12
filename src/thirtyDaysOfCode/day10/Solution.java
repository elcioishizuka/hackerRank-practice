package thirtyDaysOfCode.day10;

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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int remainder, maxConsec = 0, consec = 0, digit;
        Stack<Integer> stack = new Stack<>();

        while (n > 0){
            remainder =  n % 2;
            n = n / 2;
            stack.push(remainder);
        }

        while(!stack.empty()){
            digit = stack.pop();
            if (digit == 1){
                consec ++;
                if (consec > maxConsec){
                    maxConsec = consec;
                }
            } else {
                consec = 0;
            }
//            System.out.print(digit);
        }

        System.out.println("\n" + maxConsec);


        scanner.close();
    }
}
