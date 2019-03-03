package 第四章_解决面试的思路;

import java.util.Stack;

/**
 * 给定一个序列的压入顺序，判断第二个序列是否为该栈的出序序列
 *
 * 这一题的思路是：将第一个序列压入栈，采用第二个序列的出队方式，如果可以，则说明是ok的
 */
public class 栈的压入及弹出序列 {

    public static void main(String[] args) {
        int[] in={1,2,3,4,5};
        int[] out={4,3,5,1,2};
        int[] out2={4,5,3,2,1};

        boolean result = isPull(in, out2);
        System.out.println(result);
    }

    public static boolean isPull(int[] in,int[] out){
        if(in==null || out==null || in.length<=0 || out.length<=0){
            return false;
        }
        Stack<Integer> stackData = new Stack<Integer>();

        int lastIndex=0;
        for(int i=0;i<out.length;i++){
            //压入栈
            for(int j=lastIndex;j<out[i];j++){
                stackData.push(in[j]);
                lastIndex=out[i];
            }
            if(!stackData.isEmpty() && out[i]==stackData.peek()){
                stackData.pop();
            }
        }
        if(stackData.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}