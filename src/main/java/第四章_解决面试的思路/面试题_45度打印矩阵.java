package 第四章_解决面试的思路;

public class 面试题_45度打印矩阵 {
    public static void main(String[] args) {
        int[][] arrs={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printRightTop(arrs);

        printLeftTop(arrs);
    }

    // 打印左下角的三角型
    public static void printLeftTop(int[][] arrs) {
        if(null==arrs || arrs.length<=0){
            return ;
        }
        int endY=arrs.length-1;
        for(int i=1;i<=endY;i++){
            int temp=i;
            for(int j=0;j<=endY-i;j++){
                System.out.print(arrs[temp++][j]+" ");
            }
            System.out.println();
        }
    }

    // 打印右上角的三角型
    public static void printRightTop(int[][] arrs){
        if(null==arrs || arrs.length<=0){
            return;
        }
        int end=arrs[0].length-1;
        for(int i=end;i>=0;i--){
            int temp=i;
            for(int j=0;j<=end-i;j++){
                System.out.print(arrs[j][temp++]+" ");
            }
            System.out.println();
        }
    }
}
