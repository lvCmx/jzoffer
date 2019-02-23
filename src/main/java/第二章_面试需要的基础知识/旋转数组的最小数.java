package 第二章_面试需要的基础知识;

public class 旋转数组的最小数 {
    public static void main(String[] args) {
        int arr[]={6,1,2,3,4,5};
        int val=reverseArr(arr);
        System.out.println(val);
    }

    private static int reverseArr(int[] arr) {
        if(null==arr || arr.length<=0){
            return -1;
        }

        int left=0;
        int right=arr.length-1;
        int mid=left;
        while(arr[left]>=arr[right]){
            mid=(left+right)/2;
            if(right-left==1){
                mid=right;
                break;
            }
            if(arr[mid]>=arr[left]){
                left=mid;
            }else if(arr[mid]<=arr[right]){
                right=mid;
            }
        }
        return arr[mid];
    }
}
