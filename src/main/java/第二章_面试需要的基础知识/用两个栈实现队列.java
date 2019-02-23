package 第二章_面试需要的基础知识;

import java.util.Stack;

public class 用两个栈实现队列 {
    static Stack<Integer> stack1=new Stack<Integer>();
    static Stack<Integer> stack2=new Stack<Integer>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        System.out.println(pop());
    }

    //放入元素
    public static void push(Integer value){
        stack1.push(value);
    }

    //取出元素
    public static Integer pop(){
        if(stack2.isEmpty()){
            //将stack1中的元素放入到stack2中
            if(stack1.isEmpty()){
                return -1;
            }else{
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }
}
