package thirtyDaysOfCode.day14;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] a){
        this.elements = a;
    }

    public int computeDifference(){
        maximumDifference = 0;

        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1] - elements[0];

        return maximumDifference;
    }

} // End of Difference class


//// Hardcoded max and min values
//class Difference {
//    private int[] elements;
//    public int maximumDifference;
//
//    // Add your code here
//    public Difference(int[] a){
//        this.elements = a;
//    }
//
//    public int computeDifference(){
//        maximumDifference = 0;
//        int max = 1;
//        int min = 100;
//
//        for (int i = 0; i < elements.length; i++) {
//            max = elements[i] > max ? elements[i] : max;
//            min = elements[i] < min ? elements[i] : min;
//        }
//
//        maximumDifference = max-min;
//
//        return maximumDifference;
//    }
//
//} // End of Difference class


//// Non-performatic solution
//class Difference {
//    private int[] elements;
//    public int maximumDifference;
//
//    // Add your code here
//    public Difference(int[] a){
//        this.elements = a;
//    }
//
//    private int calculateAsoluteDifference(int a, int b){
//        if(a-b >= 0){
//            return a-b;
//        } else {
//            return -(a-b);
//        }
//    }
//
//    public int computeDifference(){
//        int absoluteDifference;
//        maximumDifference = 0;
//
//        for (int i = 0; i < elements.length; i++) {
//            for (int j = 0; j < elements.length; j++) {
//                absoluteDifference = calculateAsoluteDifference(elements[i], elements[j]);
//                maximumDifference = absoluteDifference > maximumDifference? absoluteDifference : maximumDifference;
//            }
//        }
//
//        return maximumDifference;
//    }
//
//} // End of Difference class


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
