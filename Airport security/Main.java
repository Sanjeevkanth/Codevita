import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n, i, j, c = 0;
		n=s1.length();
		char s[]=s1.toCharArray();
		char t[]=s2.toCharArray();
	    for(i=0 ; i<n ; ++i)
	    {
	        for(j=0 ; j<n ; ++j)
	            if(s[(i+j) % n] != t[j])
	                break;
	    if(j == n)
	        {
	            c = 1;
	            break;
	        }
	    }
	    if(c==1)
	        System.out.println("YES");
	    else
	        System.out.println("NO");
		}
}