package projectEuler.projectEuler1;

import java.util.Scanner;

public class Solution {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sumMultiplesThree=0L, sumMultiplesFive=0L, sumMultiplesFifteen=0L;

            sumMultiplesThree = n % 3 == 0 ?
                    (3 == n-3 ? 3 * (n/3) / 2 : n * (n/3-1) / 2) :
                    (3+n-n%3) * (n/3) / 2;
            sumMultiplesFive = n % 5 == 0 ?
                    (5 == n-5 ? 5 * (n/5) / 2 : n * (n/5-1) / 2) :
                    (5+n-n%5) * (n/5) / 2;
            sumMultiplesFifteen = n % 15 == 0 ?
                    (15 == n-15 ? 15 * (n/15) / 2 : n * (n/15-1) / 2) :
                    (15+n-n%15) * (n/15) / 2;

            System.out.println(sumMultiplesThree+sumMultiplesFive-sumMultiplesFifteen);

//            long aux1, aux2, aux3;
//            if (n%3 == 0){
//                if (3 == n-3){
//                    sumMultiplesThree = 3 * (n/3) / 2;
//                } else {
//                    sumMultiplesThree = n * (n/3-1) / 2;
//                }
//            } else {
//                aux1 = (3+(n-n%3));
//                aux2 = n/3;
//                sumMultiplesThree = aux1 * aux2 / 2;
//            }
//
//            if (n%5 == 0){
//                if (5 == n-5){
//                    sumMultiplesFive = 5 * (n/5) / 2;
//                } else {
//                    sumMultiplesFive = n * (n/5-1) / 2;
//                }
//            } else {
//                aux1 = (5+(n-n%5));
//                aux2 = n/5;
//                sumMultiplesFive = aux1 * aux2 / 2;
//            }
//
//            if (n%15 == 0){
//                if (15 == n-15){
//                    sumMultiplesFifteen = 15 * (n/15) / 2;
//                } else {
//                    sumMultiplesFifteen = n * (n/15-1) / 2;
//                }
//            } else {
//                aux1 = (15+(n-n%15));
//                aux2 = n/15;
//                sumMultiplesFifteen = aux1 * aux2 / 2;
//            }
//

////            Solution with Set
//            Set<Long> multiples = new HashSet<>();
//            Set<Long> multiples3 = new HashSet<>();
//            for (long i = 1; i*3 < n || i*5 < n; i++) {
//                if (i*3 < n) {multiples.add(i*3); multiples3.add(i*3);}
//                if (i*5 < n) multiples.add(i*5);
//            }

//            System.out.println(multiples.stream().reduce(0L,(subtotal, el) -> subtotal + el));
//            System.out.println(multiples3.stream().reduce(0L,(subtotal, el) -> subtotal + el));

        }
    }

}
