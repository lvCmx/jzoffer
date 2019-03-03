package 第五章_优化时间和空间效率;

/**
 * 如果累加的数比本身还小，则不重新统计
 */
public class 连续子数组的最大和 {
    public static void main(String[] args) {
        int[] arr={1,2,-4,5,7,-8,4,-3,6,-8};
        int greatestSumOfSubArray = findGreatestSumOfSubArray(arr);
        System.out.println(greatestSumOfSubArray);
    }

    public static int findGreatestSumOfSubArray(int[] arr){
        if(null==arr || arr.length<=0){
            return 0;
        }
        int sum=0;
        int greatestSum=0;
        for(int i=0;i<arr.length;i++){
            if(sum<=0){
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
            if(sum>greatestSum){
                greatestSum=sum;
            }
        }
        return greatestSum;
    }
}
