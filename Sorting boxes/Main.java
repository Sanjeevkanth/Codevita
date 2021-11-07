import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String[]args)
    {
    Scanner s=new Scanner(System.in);
    int n,k; 
    n=s.nextInt();k=s.nextInt(); 
    int A[]=new int[n];
    int B[]=new int[n];
    int C[]=new int[n];
    k--;
    int ans = 0;
    int pos[]=new int[10000000];
    int posf[]=new int[10000000];
    int index=0,mn=99999;
    for(int i=0;i<n;i++){
        A[i]=s.nextInt();   
        pos[A[i]] = i;
        B[i]=A[i];
        C[i]=A[i];
        if(A[i]<mn){
            mn = A[i];
            index = i;
        }
    }
    Arrays.sort(C);
    Arrays.sort(B);
    for(int i=n-1;i>=k;i--){
        B[i]=B[i-1];
    }
    B[k] = C[n-1];
    for(int i=0;i<n;i++){
        posf[B[i]]=i;
    }
    for(int i=n-1;i>=1;i--){
        int pos_cur = pos[C[i]];
        int pos_f = posf[C[i]];
        if(pos_cur==pos_f) continue;
        int cur_value_f = A[pos_f];
        int temp5 = A[pos_f];
        int r_cost = cur_value_f * C[i];
        int f_cost = cur_value_f * mn + C[i] * mn;
        if(r_cost<f_cost){
            int temp1 = pos[C[i]];
            A[temp1] = A[pos_f];
            A[pos_f] = C[i];
            pos[C[i]] = pos_f;
            pos[A[temp1]]  = temp1;
            ans+= r_cost;
        }
        else{
            ans+= f_cost;
            int temp = pos[C[i]];
            int temp1 = pos[mn];
            int temp2 = A[pos_f];
            A[pos_f] = C[i];
            A[temp1] = temp2;
            A[temp] = mn;
            pos[C[i]]  = pos_f;
            pos[mn] = temp2;
            pos[temp2] = temp1;
        }
    }
    System.out.println(ans);   
    }
}
 