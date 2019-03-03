package 第四章_解决面试的思路;

public class 顺时针打印矩阵 {
    public static void main(String[] args) {
        int[][] arrs={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printCircel(arrs);
    }

    public static void printCircel(int[][] arrs){
        if(arrs==null || arrs.length<=0){
            return;
        }
        int columns=arrs.length-1;
        int rows=arrs[0].length-1;
        int start=0;
        while(columns>start*2 && rows>start*2){
            printMatrixInCircle(arrs,columns,rows,start);
            start++;
        }
    }

    private static void printMatrixInCircle(int[][] arrs, int columns, int rows, int start) {
        int endX=columns-start;
        int endY=rows-start;

        //从左到右打印一行
        for(int i=start;i<=endX;i++){
            System.out.print(arrs[start][i]+" ");
        }
        System.out.println();
        // 从上到下打印一列
        if(start<endY){
            for(int i=start+1;i<=endY;i++){
                System.out.print(arrs[i][endY]+" ");
            }
        }
        System.out.println();
        //从右到左打印一行
        if(start<endX && start<endY){
            for(int i=endX-1;i>=start;--i){
                System.out.print(arrs[endY][i]+" ");
            }
        }
        System.out.println();
        if(start<endX && start<endY-1){
            for(int i=endY-1;i>=start+1;i--){
                System.out.print(arrs[i][start]+" ");
            }
        }
        System.out.println();
    }
}
