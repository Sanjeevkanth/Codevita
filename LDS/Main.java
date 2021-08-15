import java.io.*;
import java.util.*;

class Main
{
	public static void main (String[] args)      { 

		Scanner sc=new Scanner(System.in);
		int n, i, j ,max=0;
        n=sc.nextInt();
        int ar[]=new int[n];
        int dp[]=new int [n];
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            dp[i]=1;
        }
        for(i=0 ; i<n ; ++i)
        {
            for( j=0 ; j<i ; ++j)
            {
                if(ar[j] > ar[i])
                    dp[i] = dp[i] > dp[j] + 1 ? dp[i] : dp[j] + 1;
            }
            if(dp[i]>max)
                max=dp[i];
        }
        System.out.println(max);
	}
}