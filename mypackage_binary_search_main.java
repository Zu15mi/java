/* mypackage_binary_search_main.java: write main program to use a package for binary search algorithm
C:\Java\bin>javac mypackage_binary_search_main.java

C:\Java\bin>java mypackage_binary_search_main
Enter the size of your array(1-20)=5
Enter 5sorted numbers one by one---->
a[0]=50
a[1]=40
a[2]=30
a[3]=20
a[4]=10
Enter numbers to be searched=30
30 found
 */
import mypackage.binary_search_package;
import java.io.*;
import java.util.Scanner;
public class mypackage_binary_search_main
{
public static void main(String args[])throws IOException
{
int a[]=new int[20];
int i,n,num;
Scanner SC=new Scanner(System.in);
binary_search_package obj1=new binary_search_package();
System.out.print("Enter the size of your array(1-20)=");
n=SC.nextInt();
System.out.println("Enter "+n+"sorted numbers one by one---->");
for(i=0; i<n; i++)
{
System.out.print("a["+i+"]=");
a[i]=SC.nextInt();
}
System.out.print("Enter numbers to be searched=");
num=SC.nextInt();
obj1.binary_search(a,n,num);
}
}
