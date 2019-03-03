package 第四章_解决面试的思路;

import common.Node;

import java.util.Arrays;

/**
 * 已存在一棵二叉树
 * 和一个二叉树的后序序列
 */
public class 二叉搜索树的后序遍历序列 {

    public static void main(String[] args) {
        int[] arr={7,4,6,5};
        int[] arr2={5,7,6,9,11,10,8};
        boolean result=verifySqeuenceOfBST(arr2,arr2.length);
        System.out.println(result);
    }

    public static boolean verifySqeuenceOfBST(int[] arr,int length) {
        if(arr==null || length<=0){
            return false;
        }
        // 即然是后序遍历，那么它最后一个元素就是根
        int last=arr[arr.length-1];
        int i=0;    // 搜索所有小于根节点的，因为是二叉搜索树，左小于根，右大于根
        for(;i<length-1;i++){
            if(arr[i]>last){
                break;
            }
        }
        int j=i;
        // 判断后面的数是否都大于根节点
        for(;j<length-1;j++){
            if(arr[j]<last){
                return false;
            }
        }
        boolean left=true;
        if(i>0){
            left=verifySqeuenceOfBST(arr,i);
        }
        boolean right=true;
        if(i<length-1){
            right=verifySqeuenceOfBST(arr,length-i-1);
        }
        return (left && right);
    }

}
