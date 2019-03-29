package 第五章_优化时间和空间效率;

/**
 * 即然这个数字超过了一半，那么排序后，它一定是在数组中间位置 排序最快时间复杂度为nlogn
 * <p>
 * 如果要求时间复杂度为O(n)话，上面这种方式就不合适了
 */
public class 数组中出现次数超过一半的数字 {

    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 7, 4, 3, 6, 7, 7, 7, 3, 7, 4, 7, 6, 7};
        int moreNum = findNumByPartition(arr);
        System.out.println(moreNum);
    }

    /**
     * 第一种 基于partition快排函数，partition位于函数的数组，
     */
    public static int findNumByPartition(int[] arr){
        if(arr==null || arr.length<=0){
            throw new RuntimeException("空的");
        }
        int partition = partition(arr, 0, arr.length - 1);
        while(partition!=arr.length/2){
            if(partition>arr.length/2){
                partition = partition(arr, 0, partition-1);
            }else{
                partition = partition(arr, partition+1, arr.length-1);
            }
        }
        if(partition==arr.length/2){
            return arr[partition];
        }
        return -1;
    }
    public static int partition(int[] arr, int left, int right) {
        int key = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= key) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= key) {
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=key;
        return left;
    }

    /**
     * 第二种 记录元素的次数，相同+1,不同则减1
     *
     * @param arr
     * @return
     */
    public static int findMoreNum(int[] arr) {
        if (null == arr || arr.length <= 0) {
            return -1;
        }
        int result = arr[0];
        int times = 1;
        for (int i = 0; i < arr.length; i++) {
            if (times == 0) {
                result = arr[i];
                times = 1;
            } else if (arr[i] == result) {
                times++;
            } else {
                times--;
            }
        }
        return result;
    }
}
