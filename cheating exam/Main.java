import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	int depth,i,j,r=0,c=0,k=-1,x=0;
    	String s;
    	depth=sc.nextInt();
    	s=sc.next();
    	char [][]matrix1=new char[depth][s.length()];
    	for(i=0;i<depth;i++)
    	{
    		for(j=0;j<s.length();j++)
    		{
    			matrix1[i][j]='0';
    		}
    	}
    	for(i=0;i<s.length();i++)
    	{
    		matrix1[r][c]='*';
    	    c++;
    	    if ((r==0) || (r==depth-1)) k*=-1;      
    	    r+=k;
    	}
    	for(i=0;i<depth;i++)
    	{
    		for(j=0;j<s.length();j++)
    		{
    			if (matrix1[i][j]=='*')
    			{
    				matrix1[i][j]=s.charAt(x);
    				x++;
    			}
    		}
    	}
    	r=0;
    	c=0;
    	k=-1;
    	StringBuilder ans=new StringBuilder();
    	for(i=0;i<s.length();i++)
    	{
    		ans.append(matrix1[r][c]);
    	    c++;
    	    if ((r==0) || (r==depth-1)) k*=-1;      
    	    r+=k;
    	}
    	for(i=(ans.length()-1);i>=0;i--)
    	{
    		if ((ans.charAt(i)!='X') && (ans.charAt(i)!='x')){
            ans.delete(i,i);
            break;}
    		
    	}	
    	for(i=0;i<ans.length();i++)
    	{
    		System.out.print(ans.charAt(i));
    	}
 
}}
