The prime numbers are written in a spiral form starting at (0,0) and moving as shown in the diagram below.

Sample Input
2
1 0
0 1
Sample Output
3
7
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
                if(ar[j] < ar[i])
        dp[i] = dp[i] > dp[j] + 1 ? dp[i] : dp[j] + 1;
            }
            if(dp[i]>max)
                max=dp[i];
        }
        System.out.println(max);
	}
}