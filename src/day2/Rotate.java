package day2;

import java.util.Arrays;
import java.util.Collections;

public class Rotate {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(sortedSquares(nums));
    }

    public static int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length -1;
        int idx = nums.length -1;
        int[] res = new int[nums.length];

        while (l <= r) {
            if (Math.abs(nums[l]) < Math.abs(nums[r])) {
                res[idx--] = nums[r] * nums[r];
                r--;
            } else {
                res[idx--] = nums[l] * nums[l];
                l++;
            }
        }

        return res;
    }
}
