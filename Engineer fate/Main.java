import java.io.*;
import java.util.*;
class Main{
	public static int fact(int n){
		int result=1;
		for(int i=1;i<n;i++){
			result=result*i;
		}
		return result;
	}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    int fact[]=new int[21];
    fact[0] = 1;
    for(int i=1 ; i<21 ; ++i)
        fact[i] = i * fact[i-1];
    int t, n,l;
    String s=new String();
	t=sc.nextInt();
    String []ar=new String[t];
    for(int i=0 ; i<t ; ++i)
        ar[i]=sc.next();
    int []ans=new int[t];
    for(l=0 ; l<t ; ++l)
    {
        s = ar[l];
        n = s.length();
        int []alpha=new int[26];
for(int i=0;i<26;i++){
	alpha[i]=0;
}
        for(int i=0 ; i<n ; ++i)
            alpha[s.charAt(i)-'a']++;
        int res = 0;
        for(int i=0 ; i<n ; ++i)
        {
            for(int j=0 ; j<s.charAt(i)-'a' ; ++j)
            {
                if(alpha[j] == 0) continue;

                int rep = 1;

                alpha[j]--;
                for(int k=0 ; k<26 ; ++k)
                    if(alpha[k] > 0)
                    {
                        rep *= alpha[k];
                    }
                
                res += (fact[n - (i+1)] / rep);
                
                alpha[j]++;
            }
            
            alpha[s.charAt(i)-'a']--;
        }
        
        ans[l] = res + 1;
    }

    int mx = 0;
    for(int i=1 ; i<t ; ++i)
        if(ans[i] < ans[mx])
            mx = i;
    
    System.out.print(ar[mx]);
}
}