package 第三章_高质量的代码;

import java.util.Arrays;

/**
 给定一个由正数,负数和0组成的整数数组,将所有为0的元素,挪到数组末尾。要求时间复杂度O(n)
 请设计一个函数,完成此功能。(语言不限)
 实现思路：
 利用两个变量分别指向数组首部与数组的尾部，然后判断首部是否为0，不为0则首部+1
 如果首部为0，则交换首尾元素，首尾各+1
 如果首部为0，尾部也为0，则尾部+1再交换
 这种实现方式中需要遍历一遍数组，所以时间复杂度为O(1)，空间复杂度O(1)
 */
public class 面试题_调整0位于数组的最后面 {
    public static void main(String[] args) {
        int[] arr= {1,6,4,-3,0,5,0,9};
        int[] arr1= {0,0,0};
        swapZero(arr1);
        System.out.println("最终结果："+Arrays.toString(arr1));
    }

    public static void swapZero(int[] arr){
        if(null==arr || arr.length<=1){
            return;
        }
        int begin=0;
        int end=arr.length-1;
        while(begin<end){
            // 数组前面为不为0
            while(arr[begin]!=0 && begin<end){
                begin++;
            }
            // 数组后面为0
            while(arr[end]==0 && begin<end){
                end--;
            }
            if(arr[begin]==0 && arr[end]!=0){
                int temp=arr[begin];
                arr[begin]=arr[end];
                arr[end]=temp;
                begin++;
                end--;
            }
        }
    }

    public static void swap(int n,int m){
        int temp=n;
        n=m;
        m=temp;
    }
}