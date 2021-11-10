package day1;

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int target = 3;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int max = nums.length - 1;
        int min = 0;

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] > target) {
                max = mid;
            } else if ( nums[mid] == target ){
              return mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}
