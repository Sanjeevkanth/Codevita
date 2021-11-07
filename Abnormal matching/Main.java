import java.io.*;
import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    int a,n, m,i,j;
    String []s=new String[22];
	String []t=new String[22];
    n=sc.nextInt();
	m=sc.nextInt();
    for(i=0; i<n; i++)
        s[i]=sc.next();
    for(i=0; i<m; i++)
        t[i]=sc.next();
     j=sc.nextInt();
    while(j--!=0){
        a=sc.nextInt();
        a--;
        System.out.println(s[a % n] + t[a % m]);
    } 
}
}