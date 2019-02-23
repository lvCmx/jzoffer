package 第二章_面试需要的基础知识;

/**
 * 参考答案
 */
public class 二维数组中的查找 {
    public static void main(String[] args) {
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(findNum(arr,3));
    }
    public static boolean findNum(int[][] arr,int num){
        if(null==arr || arr.length==0){
            return false;
        }
        int row=0;
        int column=arr[0].length-1;
        while(row<arr[0].length && column>=0){
            if(num==arr[row][column]){
                return true;
            }else if(num>arr[row][column]){
                row++;
            }else{
                column--;
            }
        }
        return false;
    }
}
