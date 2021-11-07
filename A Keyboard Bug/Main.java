import java.util.*;
public class Main
{
static String keyBug(String st1,String st2)
{
String ans;
int n, m, i=0, j=0;
char a[]=st1.toCharArray();
char b[]=st2.toCharArray();
n = st1.length();
m = st2.length();

while(i<n && j<m && a[i] == b[j])
{
    while(i<n && j<m && a[i] == b[j])
    {
    	i++; j++;
    }
    while(j<m && a[i-1] == b[j])
        j++;
}

return(((i==n && j==m) ? "YES" : "NO"));
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String result[]=new String[n];

for(int i=0;i<n;i++)
{
String s1=s.next();
String s2=s.next();
result[i]=keyBug(s1,s2);;
}
for(int i=0;i<n;i++)
	System.out.println(result[i]);
}
}