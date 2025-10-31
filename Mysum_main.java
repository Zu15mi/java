/* Mysum_main.java: write main program to use user defined
C:\Java\bin>javac Mysum_main.java

C:\Java\bin>java Mysum_main
Enter n=
10
Sum of 10 numbers = 55
*/

//package mypackage;

import java.io.*;
import java.util.Scanner;
import mypackage.Mysum;

class Mysum_main
{
public static void main(String args[])throws IOException
	{

int n,s;
Scanner SC=new Scanner(System.in);
System.out.println("Enter n=");
n=SC.nextInt();
Mysum S1=new Mysum();
s=S1.sum1(n);
System.out.println("Sum of "+n+" numbers = "+s);
}
}