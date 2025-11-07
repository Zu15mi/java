import java.io.*;
import java.util.Scanner;
import mypackage.Bubblesort_package;

class mypackage_Bubblesort_main
{
public static void main(String args[])throws IOException
	{
int a[]=new int[20];
int i,n;
Scanner SC=new Scanner(System.in);
Bubblesort_package obj1=new Bubblesort_package();
System.out.println("Enter the no of elements to be sorted= ");
n=SC.nextInt();
System.out.println("Enter "+n+"elements one by one = ");
for(i=0;i<n;i++)
{
System.out.print("a["+i+"]=");
a[i]=SC.nextInt();
System.out.println("unsorted list : ");
obj1.display(a,n);
obj1.bubble(a,n);
System.out.println("Sorted List : ");
obj1.display(a,n);
}
}
}