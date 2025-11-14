//mythread_1.java :write a program in java to implement thread class

import java.io.*;
class myclass_A extends Thread
{
public void run()
{
int s,i;
s=0; 
System.out.println("Enter in thread myclass_A---->");
for(i=0;i<10;i++)
{
s=s+i;
System.out.println("From Myclass_A i="+i+" sum="+s);
}
System.out.println("Exit from thread myclass_A--->");
}
}

class myclass_B extends Thread
{
public void run()
{
int p,j;
p=1; 
System.out.println("Enter in thread myclass_B---->");
for(j=1;j<=10;j++)
{
p=p*j;
System.out.println("From Myclass_B j="+j+" p="+p);
}
System.out.println("Exit from thread myclass_B--->");
}
}

class myclass_C extends Thread
{
public void run()
{
int k,s1,s;
s=s1=0; 
System.out.println("Enter in thread myclass_C---->");
for(k=1;k<=10;k++)
{
s1=s1+k;
s=s+s1;
System.out.println("From Myclass_C k="+k+" s="+s);
}
System.out.println("Exit from thread myclass_C--->");
}
}

class mythread_1
{
public static void main(String args[])throws IOException
{
new myclass_A().start();
new myclass_B().start();
new myclass_C().start();
}
}

