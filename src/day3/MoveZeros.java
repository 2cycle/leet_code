package day3;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int index = 0;
        for (int i =0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;

                index++;
            }
        }

        //O(n)?


    }
}
