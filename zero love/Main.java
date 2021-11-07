import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,start=0,end=0;
		int min_sum=100000000;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) arr[i]=sc.nextInt();
		for (i = 0; i < n; i++) {  
	        int curr_sum = arr[i]; 
	        if (min_sum > Math.abs(curr_sum)) { 
	            min_sum = Math.abs(curr_sum); 
	            start = i; 
	            end = i; 
	        } 
	        for (j = i + 1; j < n; j++) { 
	            curr_sum = curr_sum + arr[j];  
	            if (min_sum > Math.abs(curr_sum)) { 
	                min_sum = Math.abs(curr_sum); 
	                start = i; 
	                end = j; 
	            } 
	        } 
	    } 
	    
		System.out.println((end-start+1));
		}

}
