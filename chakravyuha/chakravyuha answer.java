import java.util.*;
public class Example
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int a[][]=new int[p][p];
        int endrow=p,endcol=p,k=0,l=0,i,j;
        int value=1;
        int power=2*(((p*p)/11)+1);
        int b[]=new int[power];
        b[0]=0;b[1]=0;
        int t=2;
        while(k<endrow && l<endcol)
        {
            for(i=l;i<endcol;++i)
            {
                if(value%11==0)
                {
                    b[t]=k;
                    b[t+1]=i;
                    t=t+2;
                }
                a[k][i]=value;
                value++;
            }
        k++;
        for(i=k;i<endrow;++i)
        {
             if(value%11==0)
             {
                 b[t]=i;
                 b[t+1]=endcol-1;
                 t=t+2;
             }
            a[i][endcol-1]=value;
            value++;
        }
        endcol--;
        if(k<endrow)
        {
            for(i=endcol-1;i>=l;--i)
            {
                 if(value%11==0)
                 {
                   b[t]=endrow-1;
                   b[t+1]=i;
                   t=t+2;
                 }
                a[endrow-1][i]=value;
                value++;
            }
            endrow--;
        }
        if(l<endcol)
        {
            for(i=endrow-1;i>=k;--i)
            {
                 if(value%11==0)
                 {
                   b[t]=i;
                   b[t+1]=l;
                   t=t+2;
                 }
                a[i][l]=value;
                value++;
            }
            l++;
        }
    }
    for(i=0;i<p;i++)
    {
        for(j=0;j<p;j++)
        {
          System.out.print(a[i][j]+"\t");
        }
        System.out.println("");
    }
    System.out.println(power/2);
    i=0;
    while(i<power)
    {
        System.out.println("("+b[i]+","+b[i+1]+")");
        i=i+2;
}
}
}