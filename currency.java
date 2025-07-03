//currency
import java.io.*;
class currency
{
	public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print(" enter the amt in INR :");
	
	float inr = Float.parseFloat(br.readLine());
	
	float usd = inr / 85.60f ;
	float cad = inr / 62.78f ;
	
	System.out.println("INR :" + inr);
	System.out.println("USD :" + usd);
	System.out.println("CAD :" + cad);
}
}