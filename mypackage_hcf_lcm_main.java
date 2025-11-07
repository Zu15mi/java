/*C:\Java\bin>javac mypackage_hcf_lcm_main.java

C:\Java\bin>java mypackage_hcf_lcm_main
Enter a=
45
Enter b=
13
HCF(45,13) = 1
LCM(45,13) = 585*/

import java.io.*;
import java.util.Scanner;
import mypackage.hcf_lcm_package;

class mypackage_hcf_lcm_main
{
public static void main(String args[])throws IOException
	{
int a,b,h,lc;
Scanner SC=new Scanner(System.in);
hcf_lcm_package obj1=new hcf_lcm_package();
System.out.println("Enter a=");
a=SC.nextInt();
System.out.println("Enter b=");
b=SC.nextInt();
h=obj1.hcf(a,b);
lc=obj1.lcm(a,b);
System.out.println("HCF("+a+","+b+") = "+h);
System.out.println("LCM("+a+","+b+") = "+lc);
}
}