package 第五章_优化时间和空间效率;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在字符串中找出指点一个出现一次的字符。如输入：abacdeff则输出b
 *
 * 题目有几种做法：
 *  1、先对数组进行排序，然后再求第一个只出现一次的字符
 *  2、利用hash表，hash长度为1的第一次出现一次的字符。
 */
public class 第一个只出现一次的字符 {

    public static void main(String[] args) {
        String str="acabdeff";
        findFirstChat(str.toCharArray());
    }

    public static void findFirstChat(char[] arrs){
        if(arrs==null || arrs.length<=0){
            return;
        }
        Map<Character,Integer> map=new LinkedHashMap();
        for (char c:arrs) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
