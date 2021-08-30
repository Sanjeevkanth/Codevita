import java.io.*;
import java.util.*;
class Main{
public static void sort(int a[],int n)
{
	int k,o,temp;
	for (k=0;k<n;k++){
		for (o=0;o<n-k-1;o++){
			if (a[o]>a[o+1]){
				temp=a[o];
				a[o]=a[o+1];
				a[o+1]=temp;
			}
		}
	}
	for (k=0;k<n;k++){
			System.out.print(a[k]+" ");}
	System.out.println();
	
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    int n, i, j;
    n=sc.nextInt();
    int [][]ar=new int[n][n];
	int []x=new int[n];
    for(i=0 ; i<n ; i++){
        for(j=0 ; j<n ;j++){
            ar[i][j]=sc.nextInt();
			}}
    for(i=0 ; i<n ;i++){
    	for(j=0;j<n;j++){
    		x[j]=ar[i][j];
		}
		sort(x,n);
    }
}
}