/* Mysum.java: write a package to calculate sum of 'n' natural numbers
C:\Java\bin>javac Mysum.java
C:\Java\bin>copy Mysum.java c:\java\bin\mypackage
        1 file(s) copied.*/

package mypackage;
public class Mysum
{
public int sum1(int n)
{
int i,s;
s=0;
for(i=1;i<=n;i++)
s=s+i;
return s;
}
}