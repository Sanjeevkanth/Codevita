import java.io.*;
import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String s1="";
      for(int i=s.length()-1;i>=0;i--){
          if(Character.isDigit(s.charAt(i))){
              int x=Integer.parseInt(String.valueOf(s.charAt(i)));
              String s2="";
              for(int j=0;j<x;j++){
                  s2=s1+s2;
              }
              s1=s2;
          }else
          s1=String.valueOf(s.charAt(i))+s1;
      }
      System.out.print(s1);
	}
}