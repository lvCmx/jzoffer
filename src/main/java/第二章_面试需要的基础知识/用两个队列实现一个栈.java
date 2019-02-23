package 第二章_面试需要的基础知识;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class 用两个队列实现一个栈 {
    private static Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(10);
    private static Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.out.println(poll());
        System.out.println(poll());
    }

    //栈放入元素
    public static void push(Integer value){
        if(queue1.isEmpty() && queue1.isEmpty()){
            queue1.add(value);
        }else{
            if(!queue1.isEmpty()){
                queue1.add(value);
            }else{
                queue2.add(value);
            }
        }
    }
    //栈取出元素
    public static Integer poll(){
        Integer v=-1;
        if(!queue1.isEmpty()){
            while(!queue1.isEmpty()){
                if(queue1.size()>1){
                    queue2.add(queue1.poll());
                }else{
                    v=queue1.poll();
                    queue1.clear();
                }
            }
        }else{
            while(!queue2.isEmpty()){
                if(queue2.size()>1){
                    queue1.add(queue2.poll());
                }else{
                    v=queue2.poll();
                    queue2.clear();
                }
            }
        }
        return v;
    }
}
