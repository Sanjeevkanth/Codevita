import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test!=0)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		    int result=n-1;
		    for(int i=0;i<n;i++)
		    {
		        if(s.charAt(i)=='>'||s.charAt(n-i-1) =='<')
		        {
		            result=i;
		            break;
		        }
		    }
		    System.out.println(result);
		    test--;
		}
		
	}
}
