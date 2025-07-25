import java.io.*;
import java.util.Scanner;
class LINEAR_SEARCH
{
int a[]=new int[20];
int n;
int num;
LINEAR_SEARCH(int x[], int m, int num1)
{
int i;
n=m;
num=num1;
for(i=0; i<n; i++)
a[i]=x[i];
}
int linear_search_method()
{
int nf=-1;
int i;
for(i=0; i<n; i++)
if(num==a[i])
{
nf=i;
break;
}
 return nf;
}
}
class q7s1
{
public static void main(String args[]) throws IOException

{
int a[]=new int[20];
int i,num,n,flag;
Scanner SC= new Scanner(System.in);
System.out.print("enter size of your list(1-20)=");
n=SC.nextInt();
System.out.println("enter"+n+"nos pne by one-->");
for(i=0; i<n; i++)
{
System.out.print("a["+i+"]=");
a[i]=SC.nextInt();
}
System.out.print("enter the no to be searched=");
num=SC.nextInt();
LINEAR_SEARCH LS=new LINEAR_SEARCH(a,n,num);

flag = LS.linear_search_method();
if(flag!=-1)
System.out.println(num+"found at index"+flag);
else
System.out.println(num+"not found at index"+flag);
}
}