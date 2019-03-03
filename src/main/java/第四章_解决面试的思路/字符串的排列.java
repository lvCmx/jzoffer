package 第四章_解决面试的思路;

/**
 * 输入一个字符串，打印出该字符串所能排列出来的所有字符串
 */
public class 字符串的排列 {
    public static void main(String[] args) {
        String str="abc";
        permutation(str.toCharArray(),0,str.length()-1);

    }

    /*
     * 参数arrayA:给定字符串的字符数组
     * 参数start:开始遍历字符与其后面各个字符将要进行交换的位置
     * 参数end:字符串数组的最后一位
     */
    public static void permutation(char[] arr,int start,int end){
        if(end<=1){
            return;
        }
        if(start==end){
            //说明已经交换到了最后，可以输出这个字符串了
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else{
            for(int i=start;i<=end;i++){
                swap(arr,i,start);
                permutation(arr,start+1,end);
                swap(arr,i,start);
            }
        }
    }

    //交换数组m位置和n位置上的值
    public static void swap(char[] arrayA,int m,int n){
        char temp = arrayA[m];
        arrayA[m] = arrayA[n];
        arrayA[n] = temp;
    }

}
