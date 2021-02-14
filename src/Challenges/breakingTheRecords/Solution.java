package Challenges.breakingTheRecords;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int[] countHighestScore = new int[scores.length];
        int[] countLowestScore = new int[scores.length];
        int[] result = new int[2];
        int highestScore, lowestScore;

        highestScore = scores[0];
        lowestScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            countHighestScore[i] = scores[i] > highestScore ? 1 : 0;
            highestScore = scores[i] > highestScore ? scores[i] : highestScore;
            countLowestScore[i] = scores[i] < lowestScore ? 1 : 0;
            lowestScore = scores[i] < lowestScore ? scores[i] : lowestScore;
        }


        result[0] = Arrays.stream(countHighestScore).sum();
        result[1] = Arrays.stream(countLowestScore).sum();


        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        Arrays.stream(result).forEach(System.out::println);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
