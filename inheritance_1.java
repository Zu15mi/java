/* inheritance_1.java: write a program in the to implement multilevel inheritance. input 'n' elements and 
store in 1-dim array a[]. calculate and print 
(i) sum of all elements,
(ii) average of all elements,
(iii) largest value, and
(iv) standard deviation
*/

import java.io.*;
import java.util.Scanner;
class Sum // defining a class to calculate sum of n-numbers
{
public int sum(int a[],int n)
{
int i,s;
s=0;
for(i=0;i<n;i++)
s=s+a[i];
return s;
}
public int large(int a[], int n)
{
int big,i;
big=a[0];
for(i=1;i<n;i++)
if(a[i]>big)
big=a[i];
return big;
}
}

class Average extends Sum // Average is a derived class 
{
	public float average(int a[], int n)
	{
		float avg;
		avg=(float)(sum(a,n)/n);
		return avg;
	}
}

class S_Dev extends Average //S_Dev is a derived class
{
	public float s_dev(int a[], int n) //double
	{
		float av,sd;
		int i;
		sd=0;
		av=average(a,n);
		for(i=0;i<n;i++)
			sd=sd+(a[i]-av)*(a[i]-av);
		sd=(float)Math.sqrt((double)(sd/n));
		return sd;
	}
}
//class to define main() method
class inheritance_1
{
	public static void main(String args[])throws IOException
	{
		int a[]=new int[20];
		int i,s,big,n;
		float av,sd;
		Scanner SC=new Scanner(System.in);
		S_Dev SD=new S_Dev(); //defining object standard deviation class
		System.out.print("Enetr size of your array(1-20)=");
		n=SC.nextInt();
		System.out.println("Enter"+n+"numbers one by one---->");
		for(i=0;i<n;i++)
		{
		System.out.print("a["+i+"]=");
        a[i]=SC.nextInt();
		}
        s=SD.sum(a,n);// to calculate sum of 'n' numbers
        av=SD.average(a,n);
        big=SD.large(a,n);
        sd=SD.s_dev(a,n);
        System.out.println("Sum of "+n+" numbers = "+s);
        System.out.println("Average of "+n+" numbers = "+av);
        System.out.println("Largest value = "+big);
        System.out.println("Standaed deviation = "+sd);
	}
}

		
		


