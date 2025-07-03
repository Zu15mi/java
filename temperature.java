//Temp
import java.io.*;
class temperature
{
 public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("temp in Celsius :");
 float c = Float.parseFloat(br.readLine());
float f=((c*9/5)+32);
System.out.println("Celsius :" + c+ " ,Fahrenheit :" +f);
}
}