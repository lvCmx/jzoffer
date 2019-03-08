package 扩展_动态规划.最大的利益;

import java.util.Arrays;

/**
 * 题目说明，每个恢色的条代表着每个工作的时候，里面的数字代表着完成它的利益，求如何去做才能得到最大的解
 */
public class Main {

    public static void main(String[] args) {
        int prev[] ={0,0,0,0,1,0,2,3,5};
        int value[]={0,5,1,8,4,6,3,2,4};

        int opt[]=new int[prev.length];
        opt[0]=0;
        for(int i=1;i<prev.length;i++){
            // 对当前的情况有两种可能，是选和不选
            // 如果能选的话，我们就是当前的 value加上它之前的价值
            // 如果不选的话，它的值就是它前一个值
            opt[i]=max(value[i]+opt[prev[i]],opt[i-1]);
        }

        System.out.println(Arrays.toString(opt));
    }

    public static int max(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
}