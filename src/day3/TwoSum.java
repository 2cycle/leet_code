package day3;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int min = 0;
        int max = numbers.length - 1;
        while (numbers[max] + numbers[min] != target) {
            if (numbers[max] + numbers[min] > target) {
                max--;
                min = 0;
                continue;
            }
            min ++;
        }
        return new int[] { min + 1 , max + 1};
    }

}
