package day1;

public class FirstBad {
    public static void main(String[] args) {
        int n = 5;
        int bad = 4;
    }

    public static int firstBadVersion(int n) {
        if (n == 1) {
            return n;
        }

        int max = n;
        int min = 1;
        while (min < max) {
            int middle = min + (max - min) / 2;
            if (isBadVersion(middle)) {
                max = middle;
            } else {
                min = middle + 1;
            }
        }
        return min;

    }

    static boolean isBadVersion(int num) {
        return true;
    }


}
