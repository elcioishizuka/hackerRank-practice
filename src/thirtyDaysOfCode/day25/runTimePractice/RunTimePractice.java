package thirtyDaysOfCode.day25.runTimePractice;

import com.sun.prism.shader.AlphaOne_RadialGradient_AlphaTest_Loader;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.HashMap;

public class RunTimePractice {

    public static int findNumsOfRepetitions(String s, char c) {
        // Linear time; O(n) time
        int sum = 0; // 1
        for (int i = 0; i < s.length(); i++) { // 1, n+1 ,n
            if (s.charAt(i) == c){ // n
                sum ++; // n
            }
        }
        return sum;
    }

    public static int[] findNumsOfRepetitionsv1(String s, char[] c){
        // Quad time: O(n*m) time
        int[] sums = new int[c.length]; // 1
        for (int i = 0; i < s.length(); i++) { // 1, n+1, n
            for (int j = 0; j < c.length; j++) { // n, n*m + 1, n*m
                if (s.charAt(i) == c[j]){ // n*m
                    sums[j] ++; // n*m
                }
            }
        }
        return sums;
    }

    public static int[] findNumsOfRepetitionsv2(String s, char[] c){
        // Optimal time: O(n)
        int[] sums = new int[c.length]; // 1
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }

        for (int i = 0; i < c.length; i++) {
            int sum;
            if (!map.containsKey(c[i])){
                sums[i] = 0;
            } else {
                sums[i] = map.get(c[i]);
            }

        }

        return sums;

    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("adckjbbjkpiopruenaaaaaaamscvgfsdgdfgsdgbvxcbxcvbdfsafsdtgerjhytjuliç.bmnbvnl084jdfncaaavnsjnvnsjklfgsdfjklgjkldfsga", 'a'));
        long endTime = System.currentTimeMillis();
        long durantion = endTime - startTime;
        System.out.println("Test " + durantion + " ms");

        char[] a = "abcdefghijklmnokçdafmnvncuperioq489209jklnvcxajkfdççklvdaçsjfjksdpqrsfadf".toCharArray();

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv1("adckjbbjkpiopruenaaaaaaamscvgfsdgdfgsdgbvxcbxcvbdfsafsdtgerjhytjuliç.bmnbvnl084jdfncaaavnsjnvnsjklfgsdfjklgjkldfsga", a));
        endTime = System.currentTimeMillis();
        durantion = endTime - startTime;
        System.out.println("Test " + durantion + " ms");

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv2("adckjbbjkpiopruenaaaaaaamscvgfsdgdfgsdgbvxcbxcvbdfsafsdtgerjhytjuliç.bmnbvnl084jdfncaaavnsjnvnsjklfgsdfjklgjkldfsga", a));
        endTime = System.currentTimeMillis();
        durantion = endTime - startTime;
        System.out.println("Test " + durantion + " ms");
    }

}
