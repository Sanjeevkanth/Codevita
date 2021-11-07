import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class Main{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String input = sc.next();
      String Str = "[b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z]+";
      Pattern pattern = Pattern.compile(Str);
      Matcher matcher = pattern.matcher(input);
      String replace = "_*_";
      List<String> cons=new ArrayList<String>();
      while(matcher.find())
      {
          String cons1 = matcher.group();
          cons.add(cons1);
      }
      String outputStr = matcher.replaceAll(replace);
      List<String> vowel=Arrays.asList(outputStr.split("_"));
      Collections.reverse(cons);
      int c=0,v=0;
      for(int i=0;i<vowel.size();i++)
      {
          if(vowel.get(i).equals("*"))
          {
              if(i!=0)
              {
                  System.out.print(cons.get(v));
                  v++;
              }
          }
          else
          {
              System.out.print(vowel.get(i));
              c++;
          }
      }
   }
}