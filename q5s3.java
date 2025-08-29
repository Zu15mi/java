import java.io.*;
import java.util.Scanner;
 class q5s3
 {
public static void main(String args[])throws IOException
{
int ch,n;
String file1;
Scanner SC=new Scanner(System.in);
System.out.print("Enter your Input File Name=");
file1=SC.nextLine();
FileInputStream fp1=new FileInputStream(file1);
n=0;
while((ch=fp1.read())!=-1)
{
n=n+1;
System.out.println(n+" : "+(char)ch+" : "+ch);
}
fp1.close();
System.out.println("Size of " +file1+"="+n+" Bytes");
}
 }