package 第六章_面试中的各项能力;

/**
 * 统计一个数字在排序数组中出现的次数
 * 方法1：
 * 循环一遍数组，取出某数字在数组中出现的次数，时间复杂度O(n)
 * 方法2：
 * 因为数组是有序的，所以可以通过二分查找，然后左右两边扫描，最坏时间复杂度O(n)
 * 方法3：
 * 通过折半找到第一个出现的k
 */
public class 数字在排序数组中出现的次数 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 3, 4, 5};
        int leftNum = getFirstK(arr, 0, arr.length - 1, 3);
        int rightNum = getLastK(arr, 0, arr.length - 1, 3);
        System.out.println(rightNum-leftNum+1);
    }

    /**
     * 获取第一个k
     *
     * @param arr
     * @param left
     * @param right
     * @param k
     * @return
     */
    private static int getFirstK(int[] arr, int left, int right, int k) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == k) {
            //判断是不是第一个
            if (mid > 0 && arr[mid - 1] != k) {
                return mid;
            } else {
                right = mid - 1;
            }
        } else if (arr[mid] < k) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return getFirstK(arr, left, right, k);
    }

    /**
     * 获取最后一个k
     *
     * @param arr
     * @param left
     * @param right
     * @param k
     * @return
     */
    private static int getLastK(int[] arr, int left, int right, int k) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == k) {
            //判断是不是第一个
            if (mid > 0 && arr[mid + 1] != k) {
                return mid;
            } else {
                left = mid + 1;
            }
        } else if (arr[mid] < k) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return getLastK(arr, left, right, k);
    }
}
