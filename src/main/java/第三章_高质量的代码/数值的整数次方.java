package 第三章_高质量的代码;

/**
 * 这题有两个暗点：
 * 1.如果指数是负数的时候怎么办？
 *  可以先对指数求绝对值，然后算出次方的结果之后再取倒数，小心底数是0
 * 2.如果这个数是很大的数，怎么办？
 *  java中有BigInteger类
 */
public class 数值的整数次方 {
    public static void main(String[] args) {
        double power = power(2, 4);
        System.out.println(power);
    }

    public static double power(double base,int exponent){
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return base;
        }
        // 除以2 exponent>>1
        double result= power(base,exponent>>1);
        result*=result;
        //说明是奇数
        if((exponent & 0x1) ==1){
            //奇数就再重一个base
            result*=base;
        }
        return result;
    }
}
