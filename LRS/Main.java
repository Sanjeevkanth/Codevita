import java.util.*;
public class Main
{
    public static int max(int x,int y)
    {
        return x>y?x:y;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	String string1;
    	int l1,i,j;
    	string1=sc.next();
    	l1=string1.length();
    	int l[][]=new int[l1+1][l1+1];
    	for (i=0;i<=l1;i++)
    	{
    		for(j=0;j<=l1;j++)
    		{
    			l[i][j]=0;
    		}
    	}
    	for(i=1;i<=l1;i++)
    	{
    		for(j=1;j<=l1;j++)
    		{
    			if((string1.charAt(i-1)==string1.charAt(j-1)) && (i!=j)) l[i][j]=l[i-1][j-1]+1;
    			else l[i][j]=max(l[i-1][j],l[i][j-1]);
    		}
    	}
    
    	System.out.println(l[l1][l1]);

	}
}
