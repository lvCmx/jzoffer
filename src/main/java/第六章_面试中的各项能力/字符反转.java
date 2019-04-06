package 第六章_面试中的各项能力;

/**
 * 例如：student
 * udentst
 */
public class 字符反转 {
    public static void main(String[] args) {
        String str="student";
        int num=3;
        String result=reverseChar(str,num);
        System.out.println(result);
    }

    private static String reverseChar(String str, int num) {
        if(str==null || str.length()<2){
            return str;
        }
        String sLeft=swap(str.substring(0,num),0,num-1);
        String sRight=swap(str.substring(num),0,str.length()-num-1);

        String result=swap(sLeft+sRight,0,str.length()-1);
        return result;
    }

    private static String swap(String str, int left, int right) {
        char[] chars = str.toCharArray();
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
