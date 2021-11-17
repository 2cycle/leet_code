package day4;

public class ReverseString {
    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] output = {'o', 'l', 'l', 'e', 'h'};

        reverseString(input);
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length -1;

        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;j--;
        }

        System.out.println(s);

    }
}
