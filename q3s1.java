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


