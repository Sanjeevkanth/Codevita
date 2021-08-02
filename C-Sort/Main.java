import java.io.*;
import java.util.*;

class Main
{
	public static void main (String[] args)      { 

		Scanner sc=new Scanner(System.in);
		int n, i, j ,k ,temp;
        n=sc.nextInt();
        int a[][]=new int[n][n];
        for(i=0 ; i<n ; i++)
            for(j=0 ; j<n ;j++)
                a[i][j]=sc.nextInt();
        for(j=0;j<n;j++){
	        for(i=0;i<n;i++){
	            for (k=i+1;k<n;++k){
 				    if (a[i][j] > a[k][j]) 
 				    {
 					    temp = a[i][j];
 				        a[i][j] = a[k][j];
 					    a[k][j] = temp;
 				    }
 			    }
	        }
	    } 
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();    
        }
	}
}