import java.io.*;
import java.util.*;
class Main{
	public static void rotate(int a[][],int b){
    int i,j,temp,k;
    for (k=0;k<b;k++){
    for(i=0;i<3;i++){
            temp=a[0][i];
            a[0][i]=a[1][i];
            a[1][i]=a[2][i];
            a[2][i]=a[3][i];
            a[3][i]=temp;
    }}}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
   int front[][]=new int[3][3];
   int bottom[][]=new int[3][3];
   int back[][]=new int [3][3];
   int top[][]=new int[3][3];
   int i,slen,num=0,ko,j,m=0,r=0,l=0,mrot=0,rrot=0,lrot=0;
   int fr[][]=new int[3][3];
   int bo[][]=new int[3][3];
   int ba[][]=new int[3][3];
   int to[][]=new int[3][3];
   int llist[][]=new int[4][3];
   int mlist[][]=new int[4][3];
   int rlist[][]=new int[4][3];
   char u='0';
   String s1=new String();
    for (i=0;i<3;i++){
        for(j=0;j<3;j++){
            front[i][j]=sc.nextInt();
        }
    }
    for (i=0;i<3;i++){
        for(j=0;j<3;j++){
            bottom[i][j]=sc.nextInt();
        }
    }
    for (i=0;i<3;i++){
        for(j=0;j<3;j++){
            back[i][j]=sc.nextInt();
        }
    }
    for (i=0;i<3;i++){
        for(j=0;j<3;j++){
            top[i][j]=sc.nextInt();
        }
    }
    s1=sc.next();
	char []s=s1.toCharArray();
    slen=s1.length();
    for(i=0;i<slen;i++){
        if ((s[i]=='M') || (s[i]=='R') || (s[i]=='L'))
        {
            if (num==0)
            {
                u=s[i];
            }
            else
            {
                num=num/10;
                if (u=='M')
                {
                    m+=num;
                }
                if (u=='R')
                {
                    r+=num;
                }
                if (u=='L')
                {
                    l+=num;
                }
            }
            u=s[i];
            num=0;
        }
        else
        {
            num+=(s[i]-'0');
            num*=10;
        }
    }
    num=num/10;
    if (u=='M'){
        m+=num;
    }
    if (u=='R'){
        r+=num;
    }
    if (u=='L'){
        l+=num;
    }
    mrot=m%4;
    rrot=r%4;
    lrot=l%4;
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            fr[j][i]=front[i][j];
            bo[j][i]=bottom[i][j];
            ba[j][i]=back[i][j];
            to[j][i]=top[i][j];
        }
    }
    for(j=0;j<3;j++){
        llist[0][j]=fr[0][j];
    }
    for(j=0;j<3;j++){
        llist[1][j]=bo[0][j];
    }
    for(j=0;j<3;j++){
        llist[2][j]=ba[0][j];
    }
    for(j=0;j<3;j++){
        llist[3][j]=to[0][j];
    }
    for(j=0;j<3;j++){
        mlist[0][j]=fr[1][j];
    }
    for(j=0;j<3;j++){
        mlist[1][j]=bo[1][j];
    }
    for(j=0;j<3;j++){
        mlist[2][j]=ba[1][j];
    }
    for(j=0;j<3;j++){
        mlist[3][j]=to[1][j];
    }
    for(j=0;j<3;j++){
        rlist[0][j]=fr[2][j];
    }
    for(j=0;j<3;j++){
        rlist[1][j]=bo[2][j];
    }
    for(j=0;j<3;j++){
        rlist[2][j]=ba[2][j];
    }
    for(j=0;j<3;j++){
        rlist[3][j]=to[2][j];
    }
    rotate(llist, lrot);
    rotate(mlist, mrot);
    rotate(rlist, rrot);
    for (i=0;i<4;i++){
        for (j=0;j<3;j++){
            System.out.print(llist[i][j]+" ");
            System.out.print(mlist[i][j]+" ");
            System.out.print(rlist[i][j]);
            System.out.println();
        }
    }
   
}
}
