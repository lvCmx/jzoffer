package 第三章_高质量的代码;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 这题是上题的进化版
 * 在交换的时候，还需要保持在原数组中的次序不能改变
 *
 * 这题参考网上的答案： * https://blog.csdn.net/wangshihui512/article/details/51242868
 * 1、奇数往前移
 * 2、统计偶数的个数
 * 3、将偶数放入队列
 */
public class 奇数位于前面偶数位于后面并且不改原在原数组中的顺序 {

    public static void main(String[] args) {
        int[] arr={1,2,5,-53,6,7,4,3,13};

        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 网上某个大佬的思路
    public static void reOrderArray(int[] arr){
        Queue<Integer> odd=new ArrayBlockingQueue<Integer>(arr.length);
        if(null==arr || arr.length<=0){
            return;
        }
        int oddNumber=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                odd.add(arr[i]);
                oddNumber++;
                // 需要将元素前移
                for(int j=i;j<arr.length-1-(oddNumber-1);j++){
                    arr[j]=arr[j+1];
                }
            }
            if((i+oddNumber)==arr.length){
                break;
            }
        }
        for(int i=arr.length-oddNumber;i<arr.length;i++){
            arr[i]=odd.poll();
        }
    }
}
