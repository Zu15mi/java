/* thread3.java: define 3 threads and calculate
i.sum and average of 2 numbers
ii.product of 'n' numbers
iii.sum of digits in any +ve integers
use sleep() mode. */

import java.io.*;
import java.util.Scanner;

class myclass_A extends Thread
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
			System.out.println("Output of Thread Class_A: sum= "+s+"avg="+avg);
			System.out.println("\nExit from Thread class_A");
		}
		catch(Exception e)
		{}
	}
}

class myclass_B extends Thread
{
	public void run()
	{
		try
		{
			int i,p=1,n=5;
			for(i=1;i<=n;i++)
		{
				p=p*i;
			System.out.println("Output of Thread Class_B: i= "+i+"p="+p);	
			if(i==3)
			{
				System.out.println("Thread class_B goes to sleep mode");
				sleep(10000);
				System.out.println("Thread class_B is out of sleep mode");
			}	
		}		
		System.out.println("\nExit from Thread class_B");
		}
		catch(Exception e)
		{}
	}
}

class myclass_C extends Thread
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
			System.out.println("Output of Thread Class_C: d= "+d+"s1="+s1);	
			
		    }		
		System.out.println("\nExit from Thread class_C");
		}
	}
}

class mythread3
{
public static void main(String args[])throws IOException
{
class_A A=new myclass_A();
class_B B=new myclass_B();
class_C C=new myclass_C();
A.start();
B.start();
C.start();
}
}				