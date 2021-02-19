package thirtyDaysOfCode.day20;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), counter=0, temp;
        int[] a = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    counter++;
                }
            }
        }

        System.out.format("Array is sorted in %d swaps.\n", counter);
        System.out.format("First Element: %d\n", a[0]);
        System.out.format("Last Element: %d\n", a[a.length-1]);

    }
}