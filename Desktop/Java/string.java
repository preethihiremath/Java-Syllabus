public class string
{
public String toString()
{
      return "good morning";
}
public static String ret(int n)
{
      if(n==0)
      return "False";
      else
      return "True";
}
public static void main(String args[])
{
      char[] arr={'a','b','c','d','e','f'};
      String s1=new String(arr,2,3);
      System.out.println("String s1 : "+s1);
      String s2=new String(s1);
      System.out.println("String s2 : "+s2);

      String str1="hello world";
      String str2="bms college";
      String str3=str1+str2;
      System.out.println("String str3 : "+str3);

      string obj=new string();
      System.out.println(obj);
      String s3="hello";
      System.out.println(s3.replace(s3.charAt(1),'s'));

      String s4=new String("This is Java Programming");
      char[] arr2=s4.toCharArray();
      System.out.print("[ ");
      for(int i=0;i<s4.length();i++)
            System.out.print(arr2[i]+" ");
      System.out.println("]");

      String s5="hello world";
      String s6="hello world";
      String s7="bms college";
      System.out.println("s5.compareTo(s6) : "+ret(s5.compareTo(s6)));
      System.out.println("s5.compareTo(s7) : "+ret(s5.compareTo(s7)));
      System.out.println("s5 == s6 : "+(s5==s6));
      System.out.println("s5.equals(s6) : "+s5.equals(s6));

      String s8="good morning";
      String s9="morning is started";
      int i=s8.indexOf("good");
      if(i>=0)
      System.out.println("\nThe word 'good' is found in the string 'good morning' in the position : "+(i+1));
      else
      System.out.println("\nThe word 'good' is not found in the string 'good morning'"); 
      i=s9.indexOf("good");
      if(i>=0)
      System.out.println("\nThe word 'good' is found in the string 'morning is started' in the position : "+(i+1));
      else
      System.out.println("\nThe word 'good' is not found in the string 'morning is started' ");

      String s10=s8.substring(s8.indexOf("good"),"good".length());
      System.out.println("String s10 : "+s10);

      String s11=new String("hello world");
      System.out.println(s11.replace("hello","greetings"));

      String s12=new String("Hello BMSCE Good Morning");
      System.out.println(s12.replace(" ",""));
      
      String[] arr3={"xyz","24"};
      String s13="xyz@gmail.com";
      String s14="9999999999";
      s13=s13+arr3[0];
      s14=s14+arr3[1];
      System.out.println("String s13 : "+s13);
      System.out.println("String s14 : "+s14);
}
}