package DP;

public class MinimumJumps {

    public static int jump(int[] nums) {
        int[] minStep = new int[nums.length];
        int lastReached = 0;
        for (int i = 0; i < nums.length; i++)
            for(int j = lastReached + 1; j < nums.length && j <= i + nums[i]; j++) {
                lastReached++;
                minStep[lastReached] = 1 + minStep[i];
            }
        return minStep[minStep.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        System.out.println(jump(arr));
    }
}
