package 第五章_优化时间和空间效率;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 找出一个数列中最小的k个数字
 * 最简单的思路：排序返回前面k个数，时间复杂度为nlogn
 *
 *
 * 我们可以用一个k大小的容器，将k个数排序的方式进行比较，这个思路与用大顶堆来实现是一样的
 */
public class 最小的k个数 {
    public static void main(String[] args) {
        int[] arr={1,6,3,9,0,4,2,5,7};
        Set kNum = findKNum(arr, 3);
        System.out.println(kNum);
    }
    public static Set findKNum(int[] arr, int k){
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.size()<k){
                set.add(arr[i]);
            }else{
                set.add(arr[i]);
                Integer last = set.last();
                set.remove(last);
            }
        }
        return set;
    }
}
