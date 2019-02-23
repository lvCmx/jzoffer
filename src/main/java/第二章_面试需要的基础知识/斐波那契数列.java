package 第二章_面试需要的基础知识;

import org.junit.Test;

public class 斐波那契数列 {

    @Test
    public void test(){
        int fibonacci = fibonacci(10);
        System.out.println(fibonacci);

        int fibonacci2 = fibonacci2(10);
        System.out.println(fibonacci2);



    }

    //递归解法
    public int fibonacci(int n){
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //循环解法
    public int fibonacci2(int i){
        int f1=1;
        int f2=1;
        int f3=f1+f2;
        if(i==1 || i==2){
            return 1;
        }else if(i==3){
            return f2;
        }else{
            for(int t=3;t<i;t++){
                f1=f2;
                f2=f3;
                f3=f1+f2;
            }
        }
        return f3;
    }
}
