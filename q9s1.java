import java.io.*;
import java.util.Scanner;
  

class FIB
{
long fibonacci(int n)
{
if (n<=2)
return 1;
else
return fibonacci(n-1)+fibonacci(n-2);
}
}
class q9s1
{
public static void main(String args[]) throws IOException
{
int i,n1,n2;
long f;
Scanner S= new Scanner(System.in);
FIB F=new FIB();
System.out.print("Enter lower Limit(n1)=");
n1=S.nextInt();
System.out.print("Enter upper Limit(n2)=");
n2=S.nextInt();
for(i=n1; i<=n2; i++)
{
f=F.fibonacci(i);
System.out.println("fib("+i+")="+f);
}
}
}
