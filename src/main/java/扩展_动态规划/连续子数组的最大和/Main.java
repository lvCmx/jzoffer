package 扩展_动态规划.连续子数组的最大和;

public class Main {
    public static void main(String[] args) {
        int[] arr={-101,3,-4,5,7,-8,4,-3,6,-8};
        int sum = findGreatestSumOfSubArray(arr,arr.length-1);
        System.out.println(sum);
    }

    /**
     * @param arr
     * @return
     */
    private static int findGreatestSumOfSubArray(int[] arr,int i) {
        if(arr==null || arr.length<=0){
            return 0;
        }
        int sum=arr[0];
        int max=arr[0];
        for(int j=1;j<arr.length;j++){
            sum=getMax(sum+arr[j],arr[j]);
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    public static int getMax(int a,int b){
        return a > b ? a: b;
    }
}
