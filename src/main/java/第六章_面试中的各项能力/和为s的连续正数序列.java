package 第六章_面试中的各项能力;

/**
 * 输入一个正整数s，打印出所有和为s的连续正整数序列。
 */
public class 和为s的连续正数序列 {
    void findContinuousSequence(int sum) {
        if (sum < 3) {
            return;
        }
        int small = 1;
        int big = 2;
        int mid = (1 + sum) / 2;
        int curSum = small + big;
        while (small < mid) {
            if (sum == curSum) {
                System.out.println(small + "->" + big);
            }
            while (curSum > sum && small < mid) {
                curSum -= small;
                small++;
                if (sum == curSum) {
                    System.out.println(small + "->" + big);
                }
            }
            big++;
            curSum += big;
        }
    }
}
