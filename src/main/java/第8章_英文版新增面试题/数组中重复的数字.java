package 第8章_英文版新增面试题;

/**
 * 思路1：排序，再遍历
 * 思路2：数组元素对应下标
 */
public class 数组中重复的数字 {
    public static void main(String[] args) {
        int[] arr={2,3,1,0,2,5,3};
        int result=duplicate(arr);
        System.out.println(result);
    }

    private static int duplicate(int[] arr) {
        if(arr==null || arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            while(i!=arr[i]){
                if(arr[i]==arr[arr[i]]){
                    return arr[i];
                }
                // 交换位置
                int temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
            }

        }
        return -1;
    }
}
