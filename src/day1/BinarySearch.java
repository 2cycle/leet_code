package day1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        int res = search(nums, target);
        System.out.println("res = " + res);
    }

    public static int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

        int middleIdx = 0;
        int max = nums.length -1;
        int min = 0;
        while(min <= max) {
            middleIdx = (min + max) / 2;
            int binary = nums[middleIdx];
            if (binary == target) {
                return middleIdx;
            } else if (binary > target) {
                max = middleIdx - 1;
            } else if (binary < target) {
                min = middleIdx + 1;
            }
        }
        return -1;
    }
}
