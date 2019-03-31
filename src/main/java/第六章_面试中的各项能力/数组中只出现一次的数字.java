package 第六章_面试中的各项能力;

import java.util.Arrays;

/**
 * 这题主要是利用 异或运算来做
 */
public class 数组中只出现一次的数字 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 3, 2, 5, 5};
        int[] result = findNumsAppearOnce(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findNumsAppearOnce(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        int exqResult = 0;
        for (int i = 0; i < arr.length; i++) {
            exqResult ^= arr[i];
        }
        // 寻找异或结果的第1个1所在的位置
        int indexOf1 = findFirstBitIs1(exqResult);
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isBit(arr[i], indexOf1)) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }
        return new int[]{num1, num2};
    }

    private static boolean isBit(int i, int indexOf1) {
        i >>= indexOf1;
        return (i & 1) != 0;
    }

    private static int findFirstBitIs1(int exqResult) {
        int index = 0;
        while ((exqResult & 1) == 0) {
            exqResult >>= 1;
            index++;
        }
        return index;
    }
}
