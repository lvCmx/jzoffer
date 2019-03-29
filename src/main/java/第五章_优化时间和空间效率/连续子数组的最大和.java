package 第五章_优化时间和空间效率;

/**
 * 如果累加的数比本身还小，则不重新统计
 */
public class 连续子数组的最大和 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, 5, 7, -8, 4, -3, 6, -8};
        int greatestSumOfSubArray = findGreatestSumOfSubArray(arr);
        System.out.println(greatestSumOfSubArray);

        int greatestSumOfSubArray1 = findSumOfSubArray(arr);
        System.out.println(greatestSumOfSubArray1);

    }

    public static int findGreatestSumOfSubArray(int[] arr) {
        if (null == arr || arr.length <= 0) {
            return 0;
        }
        int sum = 0;
        int greatestSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum <= 0) {
                sum = arr[i];
            } else {
                sum += arr[i];
            }
            if (sum > greatestSum) {
                greatestSum = sum;
            }
        }
        return greatestSum;
    }

    /**
     * 动态规划
     * 动态规划思路：对于第i项来说，要么选择第i项+之前的和，要么只选择第i项抛弃之前的和
     * 也就是
     * DP[i] = max(dp[i-1]+num[i] , num[i])
     *
     * @param array
     * @return
     */
    public static int findSumOfSubArray(int[] array) {
        if (array == null || array.length <= 0) {
            return -1;
        }
        int sum = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = Math.max(sum + array[i], array[i]);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
