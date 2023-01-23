import java.util.Arrays;

class FindingMedian {
    public static void main(String args[]) {
        int[] numbers = new int[] {1, 3, 2, 6, 4, 5, 7};
        int result = findMedian(numbers);
        System.out.println(result);
    }

    static int findMedian(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        // Count of numbers within the array
        int count = nums.length;

        int median;
        if (count % 2 == 0) {
            /**
             * Return the middle value from the array
             * if the length of the array is odd
             */
            median = (nums[count / 2] + nums[count / 2 - 1]) / 2;
        } else {
            /**
             * Return the average of the middle two points
             * if the length of the array is even
             */
            median = nums[count / 2];
        }

        return median;
    } 
}