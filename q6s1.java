import java.io.*;
import java.util.Scanner;

class BUBBLE
{
void bubble_sort(int a[], int n)
{
int i,m,flag,pass1,ncomp,t;
flag=0;
pass1=0;
ncomp=0;
m=n;
while(flag==0)
{
flag=1;
pass1=pass1+1;
m=m-1;
for(i=0; i<m; i++)
{
if(a[i]>a[i+1])
{
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
flag=0;
}
ncomp=ncomp+1;
System.out.print("pass#="+pass1+"ncomp="+ncomp+" :");
display(a,n);
}
}
}
void display(int a[], int n)
{
	int i;
	String ch;
	Scanner SC1=new Scanner(System.in);
	for(i=0; i<n; i++)
	{
		if(i!=(n-1))
		System.out.print(a[i]+" ,");
else{
System.out.print(a[i]);
System.out.print(" Press<Enter>key--->");
ch=SC1.nextLine();
}}}}
class q6s1
{
	public static void main(String args[]) throws IOException
{
	int n,i;
	BUBBLE B=new BUBBLE();
	Scanner S = new Scanner(System.in);
	System.out.print("Enter size of your array(1-20):");
n=S.nextInt();
int a[]=new int[n];
System.out.println("Enter"+n+"elements one by one--->");
	for(i=0; i<n; i++)
	{
System.out.print("a["+i+"]=");
a[i]=S.nextInt();
	}
	System.out.println("Unsorted List");
	B.display(a,n);
	B.bubble_sort(a,n);
	System.out.println("Sorted List");
	B.display(a,n);
}
}
	
	
