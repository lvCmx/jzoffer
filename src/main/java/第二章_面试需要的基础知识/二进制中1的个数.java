package 第二章_面试需要的基础知识;

import org.junit.Test;

public class 二进制中1的个数 {
    // 时间复杂度是O(n)
    @Test
    public void test(){
        int key=-1;
        int flag=1;
        int num=0;
        while(flag>0){
            if((key & flag)>0){
                num++;
            }
            flag=flag << 1;
        }
        System.out.println(num);
    }

    /**
     *
     * 上面的代码可以解决正数和负数的问题，如果key是32位的数，它要循环32次。
     * 下面给出最优代码(有多少个1，就执行多少次循环)
     */
    @Test
    public void test2(){
        int count=0;
        int n=-1;
        while(n!=0){
            count++;
            n=(n-1) & n;
        }
        System.out.println(count);
    }
}
