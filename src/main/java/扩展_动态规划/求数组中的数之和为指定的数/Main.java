package 扩展_动态规划.求数组中的数之和为指定的数;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,3,6,8,3,5,4,2};
        int num=15;
        boolean max=getMax(arr,arr.length-1,num);
        System.out.println(max);
    }

    /**
     * 使用递归式
     * @param arr
     * @param i
     * @param num
     * @return
     */
    private static boolean getMax(int[] arr,int i, int num) {
        if(arr==null || arr.length<=0){
            return false;
        }
        if(num==0){
            return true;
        }else if(i==0){
            return arr[i]==num;
        }else if(arr[i]>num){
            return getMax(arr,i-1, num);
        }else {
            boolean resultA=getMax(arr,i-1, num-arr[i]);
            boolean resultB=getMax(arr,i-1, num);
            return resultA || resultB;
        }
    }
}
