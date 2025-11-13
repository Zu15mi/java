/*inheritance_2.java: write a program in java to input number of elements say 'n' and store in 1-dim array a[]. calculate
i. sum,
ii. average,
iii. largest value,
iv. standard deviation.
use inheritance and also initialize the base class.*/

import java.util.Scanner;
import java.io.*;
class SUM //sum is our base class
{
int n;
int a[]=new int[20];
SUM(int x[], int m) //defining constructor
{
int i;
n=m;
for(i=0; i<n; i++)
{
a[i]=x[i];
}
}
public int sum()
{
int s,i;
s=0;
for(i=0; i<n; i++)
s=s+a[i];
return s;
}
public int large()
{
int i,big;
big=a[0];
for(i=0; i<n; i++)
if(a[i]>big)
big=a[i];
return big;
}
}
class AVERAGE extends SUM //average is a derived class
{
AVERAGE(int x[], int m)
{
super(x,m);
}
public float average()
{
float avg;
avg=(float)(sum()/n);
return avg;
}
}
class STANDARD_DEVIATION extends AVERAGE //STANDARD_DEVIATION is a derived class
{
STANDARD_DEVIATION(int x[], int m)
{
super(x,m);
}
public float s_dev()
{
float avg,sd;
int i;
sd=0;
avg=average(); //calling average() function
for(i=0; i<n; i++)
sd=sd+(a[i]-avg)*(a[i]-avg);
sd=(float)Math.sqrt((double)(sd/n));
return sd;
}
}
class inheritance_2
{
public static void main(String args[])throws IOException
{
int a[]=new int[20];
int n,i,big,s;
float avg,sd;
Scanner SC=new Scanner(System.in);
System.out.print("Enter the size of your array(1-20)=");
n=SC.nextInt();
System.out.println("Enter"+n+"elements one by one---->");
for(i=0; i<n; i++)
{
System.out.print("a["+i+"]=");
a[i]=SC.nextInt();
}
STANDARD_DEVIATION SD=new STANDARD_DEVIATION(a,n);
s=SD.sum();
big=SD.large();
avg=SD.average();
sd=SD.s_dev();
System.out.println("sum="+s);
System.out.println("largest value="+big);
System.out.println("average="+avg);
System.out.println("standard deviation="+sd);
}
}