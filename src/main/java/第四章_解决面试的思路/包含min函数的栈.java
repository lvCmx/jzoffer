package 第四章_解决面试的思路;

import java.util.Stack;

/**
 * 这题是通过两个栈来实现的
 * 正常一个栈是用来存数据，另外一个辅助栈是用来存放当前最小的值
 */
public class 包含min函数的栈 {

    private static Stack<Integer> stackData = new Stack<Integer>();
    private static Stack<Integer> stackMin = new Stack<Integer>();

    public static void main(String[] args) {
        push(4);
        push(3);
        push(2);

        Integer min = getMin();
        System.out.println(min);
    }

    /**
     * 存放元素的时候，我们往stackData中存放，存放的时候，判断该数与stackMin顶的最小值进行比较
     *  如果比最小值小，则也同样进入到stackMin中
     *  如果比最小值大，则最小值再一次进入到栈中
     * @param val
     * @return
     */
    public static Integer push(Integer val){
        if(stackMin.isEmpty()){
            stackMin.push(val);
        }else{
            Integer peek = stackMin.peek();
            if(val>peek){
                stackMin.push(peek);
            }else{
                stackMin.push(val);
            }
        }
        stackData.push(val);
        return val;
    }

    /**
     * 出栈的时候
     * @return
     */
    public static Integer poll(){
        if(stackData.isEmpty()){
            return -1;
        }
        Integer pop = stackData.pop();
        Integer peek = stackMin.pop();
        return pop;
    }

    /**
     * 获取最小值的时候
     */
    public static Integer getMin(){
        if(stackMin.isEmpty()){
            return -1;
        }
        Integer peek = stackMin.peek();
        return peek;
    }
}
