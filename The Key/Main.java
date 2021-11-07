import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	long i,l,count=0;
    	l=sc.nextLong();
    	String s;
    	s=sc.next();
    	for(i=0;i<l;i++)
    	{
    		if ((s.charAt((int)i)-'0')%2==0) count+=(i+1);
    	}
    	System.out.println(count);
	}
}
