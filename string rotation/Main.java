import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
    int n, m, x, i, strt = 0;
    String s1=sc.next();
    char c;
	char[]s=s1.toCharArray();
    n = s.length;
int []cnt1=new int[26];
    m=sc.nextInt();
    for(i=0 ; i<m ; ++i)
    {
        c=sc.next().charAt(0);
		x=sc.nextInt();

        if(c == 'L')
            strt = (strt + x) % n;
        else
            strt = (strt - x + n) % n;
        
        cnt1[s[strt] - 'a']++;
    }
	int []cnt2=new int[26];
    for(i=0 ; i<m ; ++i)
        cnt2[s[i] - 'a']++;
    
    if(cnt1 == cnt2)
    {
        System.out.print("YES");
		System.exit(0);
    }

    for(i=0 ; i+m<n ; ++i)
    {
        cnt2[s[i] - 'a']--;
        cnt2[s[i+m] - 'a']++;

        if(cnt1 == cnt2)
            break;
    }

    System.out.print((i+m < n) ? "YES" : "NO");

    }
}