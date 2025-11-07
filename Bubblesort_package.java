/*bubble_sort_package.java:write a program in java to create a package to implement bubble sort 
algorithm to sort 'n' elements
C:\Java\bin>javac Bubblesort_package.java

C:\Java\bin>copy Bubblesort_package.* C:\Java\bin\mypackage
Bubblesort_package.class
Bubblesort_package.java
        2 file(s) copied.
*/

package mypackage;
class Bubblesort_package
{
public void bubble(int a[], int n)
{
int i,flag,pass,nstep,m,t;
m=n;
flag=0;
pass=0;
nstep=0;
while(flag==0)
{
flag=1; //sorted
pass=pass+1;
m=m-1;
for(i=0;i<m;i++)
{
if(a[i]>a[i+1])
{
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
flag=0; //not sorted
}
display(a,n);
}
System.out.println("pass#="+pass+"No of steps="+nstep);
display(a,n);
}
}
public void display(int a[],int n)
{
	int i;
	System.out.println("Elements in the list---->");
	for(i=0;i<n;i++)
	{
		if(i!=(n-1))
		System.out.print(a[i]+",");
	    else
			System.out.print(a[i]);
	}
}	
}