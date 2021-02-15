package thirtyDaysOfCode.day16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//
//        try{
//            int number = Integer.parseInt(S);
//            System.out.println(number);
//        } catch (NumberFormatException err){
//            System.out.println("Bad String");
//        }

        // More clean code
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println(Integer.parseInt(scanner.next()));
        } catch (NumberFormatException err){
            System.out.println("Bad String");
        }

    }

}
