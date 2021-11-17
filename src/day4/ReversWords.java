package day4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReversWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        return Arrays.stream(arr).map(v -> reverseString(v.toCharArray())).collect(Collectors.joining(" "));
    }

    public static String reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        return String.valueOf(s);
    }
}
