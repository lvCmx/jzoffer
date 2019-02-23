package 第二章_面试需要的基础知识;

import org.junit.Test;

public class 跳台阶与变态跳台阶 {

    @Test
    public void test1(){
        System.out.println(fib1(4));
        System.out.println(fib2(4));
    }

    //跳台阶
    public int fib1(int n){
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        return fib1(n-1)+fib1(n-2);
    }

    //变态跳
    public int fib2(int n){
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return 2*fib2(n-1);
    }
}
