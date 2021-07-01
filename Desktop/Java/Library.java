import java.io.*;
import java.util.*;

public class Library
{
public static void main(String args[])
{
if(args.length==0)
{
System.out.println("Filename not provided...");
return;
}
else
{
try(FileInputStream fin=new FileInputStream(args[0]);
FileOutputStream fout=new FileOutputStream(args[0]);)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the Bookname : ");
String book=s.nextLine();
System.out.print("Enter the Author : ");
String author=s.nextLine();
while(!book.equals("stop") && !author.equals("stop"))
{
String content=book+" : "+author+"\n";
byte[] b=content.getBytes(); 
fout.write(b);
System.out.print("Enter the Bookname : ");
book=s.nextLine();
System.out.print("Enter the Author : ");
author=s.nextLine();
}
System.out.println("\nReading the Contents of the File : ");
int i;
while((i=fin.read())!=-1)
System.out.print((char)i);
}
catch(Exception e)
{
System.out.println("Exception Occurred ..."+e.getMessage());
} } } }


