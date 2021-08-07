import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,c=0,k;
        n = sc.nextInt();
        int[][] a = new int[n][n];
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                a[i][j] = sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j>0;j--)
            {
                int r = c+1;
                for(k=j-1;k>=0;k--)
                {
                    if(a[j][c]>a[k][r])
                    {
                        int t = a[j][c];
                        a[j][c] = a[k][r];
                        a[k][r] = t;
                    }
                    r+=1;
                }
                c+=1;
            }
            c = 0;
        }
        int q = 1;
        for(i=1;i<=n-1;i++)
        {
            int e = q;
            for(j=n-1;j>=q;j--)
            {
                int f = e+1;
                for(k=j-1;k>=q;k--)
                {
                    if(a[j][e]>a[k][f])
                    {
                        int r = a[j][e];
                        a[j][e] = a[k][f];
                        a[k][f] = r;
                    }
                    f+=1;
                }
                e+=1;
            }
            q+=1;
        }
	    for(i=0;i<n;i++)
    	{
    		for(j=0;j<n;j++)
        	{
            	System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
     	}
   }
}