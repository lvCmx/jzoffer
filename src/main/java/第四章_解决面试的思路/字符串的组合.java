package 第四章_解决面试的思路;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串的排列与组合是考试常见到的题目
 * 原文 https://www.jb51.net/article/134398.htm
 * 要么选择长度为n的字符串中的第一个字符，那么要在其余的长度n-1的字符串中选择m-1个字符
 * 要么不选择长度为n的字符串中的第一个字符，那么要在其余的长度n-1的字符串中选择m个字符。
 */
public class 字符串的组合 {

    public static void main(String[] args) {
        String str = "abc";
        perm(str);
    }

    public static void perm(String str){
        // 将结果保存到这里面
        List<String> result = new ArrayList<String>();
        // 从单个字母开始
        for(int i=1;i<=str.length();i++){
            combination(str,i,result);
        }
    }

    // 从字符串str中选择m个字符
    public static void combination(String str, int m, List<String> result){
        // 如果m==0，则递归结束，输出当前结果
        if(m == 0){
            for (int i = 0; i < result.size(); i++){
                System.out.print(result.get(i));
            }
            System.out.print("、");
            return;
        }
        if(str.length()!=0){
            // 选择当前元素
            result.add(str.charAt(0)+"");
            // substring用法，截取出从1开始到n结束的字符串
            combination(str.substring(1, str.length()), m - 1, result);
            result.remove(result.size() - 1);
            // 不选当前元素
            combination(str.substring(1, str.length()), m, result);
        }
    }
}
