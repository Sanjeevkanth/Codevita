import java.io.*;
import java.util.*;
class Main{
	public static void main(String arghs[]){
		Scanner sc=new Scanner(System.in);
    int n, k, i, j, l;

    n=sc.nextInt();
	k=sc.nextInt();
    int [][]ar=new int[n][n];
    for(i=0 ; i<n ; ++i)
        for(j=0 ; j<n ; ++j)
            ar[i][j]=sc.nextInt();
    for(l=0 ; l<n/2 ; ++l)
    {
        ArrayList<Integer>temp=new ArrayList<Integer>();
        int x = n - 2*l - 1;
        for(j=l ; j<l+x ; ++j)
            temp.add(ar[l][j]);
        
        for(i=l ; i<l+x ; ++i)
            temp.add(ar[i][l+x]);
        
        for(j=l+x ; j>=l ; --j)
            temp.add(ar[l+x][j]);
        
        for(i=l+x-1 ; i>l ; --i)
            temp.add(ar[i][l]);
        
        int size = temp.size();
        int pos = k % size;

        for(j=l ; j<l+x ; ++j, pos=(pos+1)%size)
            ar[l][j] = temp.get(pos);
        
        for(i=l ; i<l+x ; ++i, pos=(pos+1)%size)
            ar[i][l+x] = temp.get(pos);
        
        for(j=l+x ; j>=l ; --j, pos=(pos+1)%size)
            ar[l+x][j] = temp.get(pos);
        
        for(i=l+x-1 ; i>l ; --i, pos=(pos+1)%size)
            ar[i][l] = temp.get(pos);
    }

    for(i=0 ; i<n ; ++i)
    {
        for(j=0 ; j<n ; ++j)
            System.out.print(ar[i][j]+" ");
        System.out.println("");
    }
    		
	}
}