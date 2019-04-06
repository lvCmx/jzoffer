package 第六章_面试中的各项能力;

/**
 * 1.反转每个字符
 * 2.反转每个单词
 * I am a student.
 * student. a am I
 */
public class 翻转单词顺序 {
    public static void main(String[] args) {
        String str="I am a student.";
        String result=reverseStr(str);
        System.out.println(result);
    }

    private static String reverseStr(String str) {
        if(str==null || str.length()<=1){
            return str;
        }
        String s1=swap(str);
        // 反转每个单词
        String[] split = s1.split(" ");
        StringBuilder result = new StringBuilder("");
        for (String s:split) {
            result.append(swap(s)+" ");
        }
        return result.toString();
    }

    private static String swap(String str) {
        int left=0;
        int right=str.length()-1;
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
