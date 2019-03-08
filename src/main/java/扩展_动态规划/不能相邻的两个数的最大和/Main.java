package 扩展_动态规划.不能相邻的两个数的最大和;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * 例如：给定一个数组，求它们不相信的两个数的最大和
 * [1,2,4,1,7,8,3]
 */
public class Main {

    public static void main(String[] args){
        int[] arr={1,2,4,1,7,8,3};
//        int max=getMax(arr,arr.length-1);
//        System.out.println(max);
        System.out.println("方式二");
        int max1 = getMax(arr);
        System.out.println(max1);
    }

    /**
     * 方法一：采用递归的方式来解决
     * 这种方式会存在重复计算的过程
     */
    public static int getMax(int[] arr,int i){
        if(i==0){
            return arr[0];
        }else if(i==1){
            return Math.max(arr[0],arr[1]);
        }else{
            // 当选择当前节点的时候
            int resultA=getMax(arr,i-2)+arr[i];
            // 当不选择当前节点的时候
            int resultB=getMax(arr,i-1);
            return Math.max(resultA,resultB);
        }
    }

    /**
     * 采用非递归的方式，就是需要记录每次已经计算的结果，这样无需再重复的计算
     */
    public static int getMax(int[] arr){
        if(arr==null || arr.length<=0){
            return -1;
        }
        int[] opt=new int[arr.length];
        if(arr.length==1){
            return arr[0];
        }else if(arr.length==2){
            return Math.max(arr[0],arr[1]);
        }else{
            opt[0]=arr[0];
            opt[1]=Math.max(arr[0],arr[1]);
            for(int i=2;i<arr.length;i++){
                // 如果选择当前节点的话
                int resultA=opt[i-2]+arr[i];
                int resultB=opt[i-1];
                opt[i]=Math.max(resultA,resultB);
            }
        }
        return opt[opt.length-1];
    }
}
