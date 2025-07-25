import java.io.*;
import java.util.Scanner;
class Knum
{
public static void main(String args[]) throws IOException
{
Scanner SC= new Scanner(System.in);
System.out.println("enter a num:");
int n=sc.nextInt();
int cp=n, s=0;
while(n>0)
{
s+=fact(n%10);
n/=10;
}
if(s==cp)
System.out.println("Is a Knum");
else
System.out.println("Is not a Knum");
}
}