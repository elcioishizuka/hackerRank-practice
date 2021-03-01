package thirtyDaysOfCode.day28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static boolean isGmail(String email) {
//        String regExPattern = "[@gmail.com]$";
        String regExPattern = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regExPattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) return true;
        else return false;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> gmailNameList = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if (isGmail(emailID) == true){
                gmailNameList.add(firstName);
            }
        }

        gmailNameList.stream().sorted().forEach(System.out::println);


        scanner.close();
    }
}
