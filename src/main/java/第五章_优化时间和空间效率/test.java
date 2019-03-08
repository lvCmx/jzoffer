package 第五章_优化时间和空间效率;

import java.util.*;

public class test {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            long[] dp=new long[n+1];
            if(n==1)
                System.out.println(0);
            else if(n==2)
                System.out.println(1);
            else if(n==3)
                System.out.println(2);
            else{
                dp[1]=0;
                dp[2]=2;
                dp[3]=3;
                for(int i=4;i<=n;i++){
                    for(int j=1;j<i;j++) {
                        dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
                    }
                }
                System.out.println(dp[n]);
            }
        }
    }
}
