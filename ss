import java.io.*;
import java.util.Scanner;
class SIN_COS_TAN
{
double sine(float x)

{
double xrad,term,pox,fact,eps,csin,ccos;
int i,n,sf;
xrad=x*3.141592653589/180;
csin=xrad;
if(csin<0)
eps=-csin;
else
eps=csin;
sf=-1;
n=3;
while(eps>1e-16)
{
fact=1;
pox=1;
for(i=1; i<=n; i++)
{
fact=fact*i;
pox=pox*xrad;
}
term=sf*pox/fact;
if(term>=0)
eps=-term;
else
csin=csin+term;
n=n+2;
sf=-sf;
}
return csin;
}
double cosine(float x)
{
double xrad,term,pox,fact,eps,ccos;
int i,n,sf;
xrad=x*3.141592653589/180;
ccos=xrad;
if(ccos<0)
eps=-ccos;
else
eps=ccos;
sf=-1;
n=3;
while(eps>1e-16)
{
fact=1;
pox=1;
for(i=1; i<=n; i++)
{
fact=fact*i;
pox=pox*xrad;
}
term=sf*pox/fact;
if(term>=0)
eps=-term;
else
ccos=ccos+term;
n=n+2;
sf=-sf;
}
return ccos;
}
}
class q3s1
{
	public static void main(String args[]) throws IOException
	{
		double y1,y2,y3;
		float x;
		SIN_COS_TAN SCT=new SIN_COS_TAN();
		for(x=0F; x<=180F; x=x+5F)
		{
			y1=SCT.sine(x);
			y2=SCT.ccosine(x);
			System.out.println("Sine("+x+")="+y1+"\tcos("+x+")="+y2);
		}
	}
}


double tangent(float x)
{double y;
y=sine(x)/cosine(x);
return y;
}
System.out.println("Sine("+x+")="+y1+"\tcos("+x+")="+y2+"\ttangent("+x+")="+y3);

        import java.io.*;
import java.util.Scanner;
class S_DEV
{
int mysum(int a[], int n)
{
int i,s;
s=0;
for(i=0; i<n; i++)
s=s+a[i];
return s;
}

float average(int a[],int n)
{
	float avg;
	avg=mysum(a,n)/(float)n;
	return avg;
}

int large (int a[], int n)
{
int big,i;
big=a[0];
for(i=0; i<n; i++)
if(a[i]>big)
	big=a[i];
return big;	
}
double STDEV(int a[], int n) 
{
        float avg = average(a, n);
        double sumSq = 0;
        for (int i = 0; i < n; i++) 
		{
            sumSq += Math.pow(a[i] - avg, 2);
        }
        return Math.sqrt(sumSq / n);
    }
}
class q4s1
{
public static void main(String args[]) throws IOException
{
int i,s,n,big;
float avg;
int a[]=new int[20];
S_DEV SD=new S_DEV();
Scanner S = new Scanner(System.in);
System.out.print("Enter Size of your array(1-20)=");
n=S.nextInt();
System.out.println("Enter"+n+"elements one by one--->");
for(i=0; i<n; i++)
{
System.out.print("a["+i+"]=");
a[i]=S.nextInt();
}
s=SD.mysum(a,n);
avg=SD.average(a,n);
big=SD.large(a,n);
System.out.println("Sum of"+n+" elements="+s);
System.out.println("avg of"+n+" elements="+avg);
System.out.println("largest value of"+n+" elements="+big);
}
}


                                                                                                                                                                                                                                                                                                                                          

