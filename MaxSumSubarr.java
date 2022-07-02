// 7/1/22
public class MaxSumSubarr {
    public static void maxSumSubarr(int[] nums) {
        int sumToHere = 0;
        int currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            sumToHere += nums[i];
            if (sumToHere > currMax) {
                currMax = sumToHere;
            }
            if (sumToHere < 0) {
                sumToHere = 0;
            }
        }
        System.out.println(currMax);
    }

    public static void main(String[] args) {
        int[] negatives = new int[] {-2, -3, -1, -5, -4};
        int[] positives = new int[] {1, 4, 3, 5, 2};
        int[] soloPos = new int[] {-5, -3, 4, -2, -1};
        int[] soloNeg = new int[] {5, 2, 4, -2, 1};

        maxSumSubarr(negatives); // expect: 0
        maxSumSubarr(positives); // expect: 15
        maxSumSubarr(soloPos); // expect: 4
        maxSumSubarr(soloNeg); // expect: 11
    }
}