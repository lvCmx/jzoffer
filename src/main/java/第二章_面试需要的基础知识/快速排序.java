package 第二章_面试需要的基础知识;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int arr[] ={2,6,4,3,78,8,96,43};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int [] arr,int left,int right){
        int index=0;
        if(left<right){
            index=partition(arr,left,right);
            quickSort(arr,left,index-1);
            quickSort(arr,index+1,right);
        }
    }

    private static int partition(int[] arr,int left,int right){
        int key=arr[left];
        while(left<right){
            while(left<right && arr[right]>=key){
                right--;
            }
            arr[left]=arr[right];
            while(left<right && arr[left]<=key){
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=key;
        return left;
    }
}
