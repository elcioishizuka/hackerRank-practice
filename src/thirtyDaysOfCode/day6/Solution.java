package thirtyDaysOfCode.day6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();

        for (int i = 0; i < numberOfCases; i++) {
            String word = scanner.next();
            String even = "";
            String odd = "";
            for (int j = 0; j < word.length(); j++) {
                if(j%2 == 0){
                    even = even + word.substring(j, j+1);
                } else {
                    odd = odd + word.substring(j, j+1);
                }
            }
            System.out.println(even + " " + odd);
        }

    }

}
