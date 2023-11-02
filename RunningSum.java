public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6,7,8,9,10};
        int[] result = runningSum(nums);

        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
