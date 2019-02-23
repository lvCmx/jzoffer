package 第二章_面试需要的基础知识;

/**
 * 说明：目前我所知道的单例模式主要有4种实现方式：
 * 懒汉式、饿汉式、内部类、枚举
 */
public class Singleton模式 {
    public static void main(String[] args) {
        SingletonTest4.INSTANCE.test();
    }
}
/**
 * 懒汉式
 */
class SingletonTest1{
    private static SingletonTest1 instance=null;

    public static SingletonTest1 getInstance(){
        // 双重锁检查
        if(null==instance){
            // 多线程问题
            synchronized (instance) {
                if(instance==null){
                    instance = new SingletonTest1();
                }
            }
        }
        return instance;
    }
}

/**
 * 饿汉式
 */
class SingletonTest2{
    private static SingletonTest2 instance=new SingletonTest2();

    public static SingletonTest2 getInstance(){
        return instance;
    }
}

/**
 * 内部类实现方式，由于类在加载的时候，内部类不会被加载，只有当调用它的时候才会被加载
 * 加载一个类时，其内部类不会同时被加载。一个类被加载，当且仅当其某个静态成员（静态域、构造器、静态方法等）被调用时发生。
 * 实现了懒汉式与线程安全问题
 */
class SingletonTest3{

    public static SingletonTest3 getInstance(){
        return Inner.instance;
    }

    public static class Inner{
        public static final SingletonTest3 instance=new SingletonTest3();
    }
}

/**
 * 枚举类实现单例
 * 饿汉式+线程安全
 * 主要是用到了枚举中的变量都会被转换成public static final的，之后，会在静态代码中对枚举量进行初始化。
 */
enum SingletonTest4{
    INSTANCE;
    public void test(){
        System.out.println("test enum singleton...");
    }
}
