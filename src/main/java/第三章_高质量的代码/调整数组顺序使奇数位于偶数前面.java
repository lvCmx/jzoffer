package 第三章_高质量的代码;

import java.util.Arrays;

/**
 * 这题的思路：设置left和right两个指针，分别判断left是不是偶数，right是不是奇数，如果满足条件，则交换
 */
public class 调整数组顺序使奇数位于偶数前面 {

    public static void main(String[] args) {
        int[] arr={1,2,5,-53,6,7,4,3,13};
        partition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void partition(int[] arr,int left,int right){
        if(null==arr || arr.length<=0){
            return ;
        }
        while(left<right){
            // 当左边是奇数的时候，则left++
            while(arr[left]%2!=0 && left<right){
                left++;
            }
            while(arr[right]%2==0 && left<right){
                right--;
            }
            if(left<right){
                //交换位置
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
}
