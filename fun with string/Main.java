import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int t=sc.nextInt();
    String ar[]=new String[t];
    int arr[]=new int[t];
    for(int i=0;i<t;i++)
    {
        ar[i]=sc.next();
    }
   sc.close();
    for(int i=0;i<t;i++)
    {
        StringBuffer bf=new StringBuffer(s);
        for(int j=0;j<ar[i].length();j++)
        {
            for(int z=0;z<bf.length();z++)
            {
            if(ar[i].charAt(j)==bf.charAt(z))
            {
            bf.replace(z,z+1,"-");
            break;
            }
            }
        }
        arr[i]=bf.lastIndexOf("-");
    }
    for(int i=0;i<t;i++)
    System.out.println(arr[i]+1);
}
}

