import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String [] a = new String[150];
		int n = input.nextInt();
		int i;
		int j;
		String temp;
		String inp;
		for(i=0;i<n;i++)
		{
		    inp = input.next();
		    a[i] = inp;
		    
		}
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n-1;j++)
		    {
		        if(a[j].length()>a[j+1].length())
		        {
		            temp = a[j];
		            a[j] = a[j+1];
		            a[j+1] = temp;
		        }
		    }
		}
		for(i=0;i<n;i++)
		{
		    System.out.println(a[i]);
		}
	}
}