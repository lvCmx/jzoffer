package 第五章_优化时间和空间效率;

/**
 * 即然这个数字超过了一半，那么排序后，它一定是在数组中间位置 排序最快时间复杂度为nlogn
 *
 * 如果要求时间复杂度为O(n)话，上面这种方式就不合适了
 *
 */
public class 数组中出现次数超过一半的数字 {

    public static void main(String[] args) {
        int[] arr={7,6,4,7,4,3,6,7,7,7,3,7,4,7,6,7};
        int moreNum = findMoreNum(arr);
        System.out.println(moreNum);
    }

    public static int findMoreNum(int[] arr){
        if(null==arr || arr.length<=0){
            return -1;
        }
        int result=arr[0];
        int times=1;
        for(int i=0;i<arr.length;i++){
            if(times==0){
                result=arr[i];
                times=1;
            }else if(arr[i]==result){
                times++;
            }else{
                times--;
            }
        }
        return result;
    }
}
