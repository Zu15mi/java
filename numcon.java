import java.io.*;
import java.util.Scanner;
public class NumCon
 {
public static void main(String[args]) throws IOException 
{
Scanner sc=new Scanner(System.in);
char continueChoice;
do {
System.out.print("Enter a decimal no:");
int decimal=sc.nextInt();
System.out.println("Choose type:");
System.out.println("1.Binary");
System.out.println("2.Octal");
System.out.println("3.Hex");
System.out.print("Enter choice(1-3):");
int choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Binary:"+Integer+toBinaryString(decimal));
break;
case 2:
System.out.println("Octal:"+Integer+toOctalString(decimal));
break;
case 3:
System.out.println("Hex:"+Integer+toHexString(decimal).toUpperCase());
break;
default;
System.out.println("wrong Choice");
}

}
}
}