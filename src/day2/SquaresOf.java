package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOf {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};
//        int k = 3;

        int[] nums = {1};
        int k = 1;

        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int temp = k;
        int stt = 0;
        int[] res = new int[nums.length];

        if (k % len == 0) {
            return;
        }

        if (len <= k) {
            for (int i = 0; i < len; i++) {
                int idx = (i + k) % len;
                res[i] = nums[idx];
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (i <= k - 1) {
                    res[i] = nums[len -1 - temp-- + 1];
                } else {
                    res[i] = nums[stt++];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
}
