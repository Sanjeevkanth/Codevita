import java.io.*;
import java.util.*; 
class Main { 
     static int maxSub(int arr[]) 
    { 
        int maxSum = 0;
		if (arr.length == 1) {
			return arr[0];
		}
		for (int i = 0; i < arr.length; i++) {
			int sum1 = 0;
			for (int j = i; j< arr.length ; j++) {
				sum1 += arr[j];
				maxSum = Math.max(sum1, maxSum);
			}
		}
		return maxSum;
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }
    int sum = maxSub(a); 
    System.out.println(sum); 
    } 
} 