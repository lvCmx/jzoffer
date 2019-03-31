package 第六章_面试中的各项能力;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法1：利用map
 * 方法2：先排序，然后利用left与right指针
 * 题目：输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s
 */
public class 和为s的两个数 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 9, 11, 15};
        int s = 13;
        List<String> result = findNumbersWithSum(arr, s);
        System.out.println(result);
    }

    private static List<String> findNumbersWithSum(int[] arr, int s) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        List result = new ArrayList();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left] + arr[right];
            if (temp == s) {
                result.add(arr[left] + "," + arr[right]);
                left++;
                right--;
            } else if (temp > s) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
