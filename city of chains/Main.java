import java.util.Scanner;

public class Main {

    private static int max(int i, int i1) {
        if(i>=i1){
            return i;
        } else {
            return i1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1;
        int ans[] = new int[]{0,1};
        String ar[] = new String[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.next();
        }
        for(int a=0;a<n;a++){
            for(int b=a+1;b<n;b++){
                String s = ar[a];
                String t = ar[b];
                int x = s.length();
                int y = t.length();
                int dp[][] = new int[x+1][y+1];
                for(int i=0;i<x+1;i++){
                    for(int j=0;j<y+1;j++){
                        if(i==0 || j==0){
                            dp[i][j]=0;
                        } else if( s.charAt(i-1)==t.charAt(j-1)){
                            dp[i][j] = dp[i-1][j-1]+1;
                        } else {
                            dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
                        }
                    }
                }
                if(dp[x][y]>max){
                    max = dp[x][y];
                    ans[0] = a;
                    ans[1] = b;
                }
            }
        }
        sc.close();
        System.out.println(ar[ans[0]]);
        System.out.println(ar[ans[1]]);
    }
}