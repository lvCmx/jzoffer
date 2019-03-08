package 第五章_优化时间和空间效率;

import java.util.*;

/**
 * 找出一个数列中最小的k个数字
 * 最简单的思路：排序返回前面k个数，时间复杂度为nlogn
 *
 *
 * 我们可以用一个k大小的容器，将k个数排序的方式进行比较，这个思路与用大顶堆来实现是一样的
 */
public class 最小的k个数 {
    public static void main(String[] args) {
        int[] arr={1,6,3,9,0,4,2,5,7};
        //Set kNum = findKNum(arr, 3);

        getLeastNumbers(arr,arr.length,3);
        System.out.println(Arrays.toString(arr));


        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
    }

    // 基于partition这种方式会改变数组的顺序
    public static void getLeastNumbers(int[] arr,int length,int k){
        if(arr==null || arr.length<=0 || k<=0 || k>arr.length){
            return ;
        }
        int start=0;
        int end=length-1;
        int partition = partition(arr, start, end);
        while(partition!=k-1){
            if(partition>k-1){
                partition=partition(arr,start,partition-1);
            }else{
                partition=partition(arr,partition+1,end);
            }
        }
    }

    /**
     * 这种时间复杂度为nlogk，时间复杂度为O(K)
     * @param arr
     * @param k
     * @return
     */
    public static Set findKNum(int[] arr, int k){
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.size()<k){
                set.add(arr[i]);
            }else{
                set.add(arr[i]);
                Integer last = set.last();
                set.remove(last);
            }
        }
        return set;
    }

    /**
     * 基于partition的写法
     */
    private static int partition(int[] arr,int left,int right) {
        int key=arr[left];
        while(left<right) {
            while(left<right && arr[right]>=key) {
                right--;
            }
            arr[left]=arr[right];
            while(left<right && arr[left]<=key) {
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=key;
        return left;
    }
}
