package 第四章_解决面试的思路;

import java.util.Scanner;

/**
 * 在全排列的基础上，排除存在重复的
 * 1、可以将全排列存到集合中，每次添加的时候判断是否已经存在，不存在则添加
 * 2、判断当前字母在之前是否已经出现过，如果已经出现过，则本字符不再进行计算排列
 */
public class 字符串的全排列_去除重复 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        permutation(s.toCharArray(),0,s.length()-1);
    }

    private static void permutation(char[] chars, int size, int end) {
        if(end<=1){
            return;
        }
        if(size==end){
            System.out.println(String.valueOf(chars));
        }
        for(int i=size;i<=end;i++){
            if(!isDuplicate(chars,size,i)){
                continue;
            }
            swap(chars,i,size);
            permutation(chars,size+1,end);
            swap(chars,i,size);
        }
    }

    private static boolean isDuplicate(char[] chars, int size, int i) {
        while(size<i){
            if(chars[size]==chars[i]){
                return false;
            }
            size++;
        }
        return true;
    }

    //交换数组m位置和n位置上的值
    public static void swap(char[] arrayA,int m,int n){
        char temp = arrayA[m];
        arrayA[m] = arrayA[n];
        arrayA[n] = temp;
    }
}
