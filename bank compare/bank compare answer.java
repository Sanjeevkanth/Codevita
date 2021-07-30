import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double p,s,mi,sum,emi,sq;
        double bank[]=new double [5];
        int y,n,k,i,yrs,l=0;
        p=sc.nextDouble();
        y=sc.nextInt();
        for(k=0;k<2;k++)
        {
        	n=sc.nextInt();
            sum=0;
            for(i=0;i<n;i++)
            {
                yrs=sc.nextInt();
                s=sc.nextDouble();
                sq=Math.pow((1+s),yrs*12);
                emi= (p*(s))/(1-1/sq);
                sum= sum + emi;
            }bank[l++]=sum;
        }
        if(bank[0]<bank[1])
        	System.out.println("Bank A");
        else
        	System.out.println("Bank B");
	}
}
