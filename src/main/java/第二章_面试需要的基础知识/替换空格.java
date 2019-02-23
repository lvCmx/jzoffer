package 第二章_面试需要的基础知识;

/**
 * 这题对于java可以直接使用replace把空格进行替换成%20，但这样太没意思了，
 * 我们按照剑指offer上面的思路实现一个代码
 * 首先统计一下空格的个数，然后将数组扩大到(arr.length+num*"%20".length)-1
 */
public class 替换空格 {
    public static void main(String[] args) {
        String str="we are happy";
        String result = replaceStr(str);
        System.out.println(result);
    }
    public static String replaceStr(String str) {
        if (null == str) {
            return str;
        }
        int num = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                num++;
            }
        }
        int newLen = str.length() + num * 2;
        //扩大数组
        char[] newArr = new char[newLen];
        // 对数组倒着循环
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ' ') {
                newArr[--newLen]=arr[i];
            }else{
                newArr[--newLen]='0';
                newArr[--newLen]='2';
                newArr[--newLen]='%';
            }
        }
        return new String(newArr);
    }
}
