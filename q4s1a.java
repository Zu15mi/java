import java.io.*;
import java.util.Scanner;
class S_DEV
{
int a[]=new int[20];
int n;
S_DEV(int x[]; int m)
{
for(i=0; i<n; i++)
a[i]=x[i];
}

int mysum()
{
int i,s;
s=0;
for(i=0; i<n; i++)
s=s+a[i];
return s;
}

float average()
{
	float avg;
	avg=mysum(a,n)/(float)n;
	return avg;
}

int large ()
{
int big,i;
big=a[0];
for(i=0; i<n; i++)
if(a[i]>big)
	big=a[i];
return big;	
}
float STDEV() 
{
	float avg,sd;
	int i;
    avg = average(a, n);
	sd=0;
        for (int i = 0; i < n; i++) 
		{
            sd=sd+(a[i]-avg)*(a[i]-avg);
			sd=(flaot)Math.sqrt((double)sd/(double)n;
			return sd;
        }
        
    }
}
class q4s1a
{
public static void main(String args[]) throws IOException
{
int i,s,n,big;
float sd1, avg;
int a[]=new int[20];

Scanner S = new Scanner(System.in);
System.out.print("Enter Size of your array(1-20)=");
n=S.nextInt();
System.out.println("Enter"+n+"elements one by one--->");
for(i=0; i<n; i++)
{
System.out.print("a["+i+"]=");
a[i]=S.nextInt();
}
S_DEV SD=new S_DEV();
s=SD.mysum();
avg=SD.average();
big=SD.large();
sd1=SD.sdev();
System.out.println("Sum of"+n+" elements="+s);
System.out.println("avg of"+n+" elements="+avg);
System.out.println("largest value of"+n+" elements="+big);
System.out.println("sd of"+n+" elements="+sd1);
}
}