package thirtyDaysOfCode.day26;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int fine=0;

        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        if (returnedYear == dueYear){
            if (returnedMonth <= dueMonth){
                if (returnedDay <= dueDay){
                    fine = 0;
                } else {
                    fine = 15 * (returnedDay - dueDay);
                }
            } else {
                fine = 500 * (returnedMonth - dueMonth);
            }
        } else if (returnedYear > dueYear) {
            fine = 10000;
        } else {
            fine = 0;
        }

        System.out.println(fine);

    }
}


//public class Solution {
//
//    public static Calendar getDate(String[] information){
//        int day, month, year;
//
//        day = Integer.parseInt(information[0]);
//        month = Integer.parseInt(information[1]);
//        year = Integer.parseInt(information[2]);
//
//        Calendar date = new GregorianCalendar(year, month-1, day);
//
//        return date;
//    }
//
//    public static void main(String[] args) throws IOException {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Calendar returnedDate, dueDate;
//        long fine=0;
//
//        returnedDate = getDate(br.readLine().split(" "));
//        dueDate = getDate(br.readLine().split(" "));
//
//        long daysDifference = TimeUnit.MILLISECONDS.toDays(returnedDate.getTimeInMillis() - dueDate.getTimeInMillis());
//        long monthsDifference = daysDifference / 30;
//
//        if (returnedDate.after(dueDate)) {
//            if (returnedDate.YEAR <= dueDate.YEAR && returnedDate.MONTH <= dueDate.MONTH) {
//                fine = 15 * daysDifference;
//            } else if (returnedDate.YEAR <= dueDate.YEAR && returnedDate.MONTH > dueDate.MONTH) {
//                fine = 500 * monthsDifference;
//            } else {
//                fine = 10000;
//            }
//        }
//
////        if (daysDifference <= 0){
////            fine = 0;
////        } else if (returnedDate.YEAR > dueDate.YEAR){
////            fine = 10000;
////        } else if (returnedDate.MONTH > dueDate.MONTH){
////            fine = 500 * monthsDifference;
////        } else {
////            fine = 15 * daysDifference;
////        }
//
//        System.out.println(fine);
//
//    }
//}