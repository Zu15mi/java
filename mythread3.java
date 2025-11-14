/* thread3.java: define 3 threads and calculate
i.sum and average of 2 numbers
ii.product of 'n' numbers
iii.sum of digits in any +ve integers
use sleep() mode. */

import java.io.*;
import java.util.Scanner;

class class_A extends Thread
{
	public void run()
	{
		try
		{
			int a,b,s,avg;
			System.out.print("\nEnter B=");
			a=45;
			b=55;
			s=a+b;
			avg=s/2;
			System.out.println("Output of Thread Class_A: sumb= "+s+" avg = "+avg);
			System.out.println("\nExit from Thread class_A");
		}
		catch(Exception e)
		{}
	}
}

class class_B extends Thread
{
	public void run()
	{
		try
		{
			int i,p=1,n=5;
			for(i=1;i<=n;i++)
		{
				p=p*i;
			System.out.println("Output of Thread Class_B: i = "+i+" p = "+p);	
			if(i==3)
			{
				System.out.println("Thread class_B goes to sleep mode");
				sleep(10000);
				System.out.println("Thread class_B is out of sleep mode");
			}	
		}		
		System.out.println("\nExit from Thread Class_B");
		}
		catch(Exception e)
		{}
	}
}

class class_C extends Thread
{
	public void run()
	{
		try
		{
			int i,s1=0,n=1234,d;
			while(n!=0)
			{
				d=n%10;
				s1=s1+d;
				n=n/10;
			System.out.println("Output of Thread Class_C: d = "+d+" s1 = "+s1);	
			}
		}
			catch(Exception e)
			{}
			
		System.out.println("\nExit from Thread Class_C");
	}
}

class mythread3
{
public static void main(String args[])throws IOException
{
class_A A=new class_A();
class_B B=new class_B();
class_C C=new class_C();
A.start();
B.start();
C.start();
}
}				