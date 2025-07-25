/* krishnamurthy number sum of factorial of the digit is equal to the number */
import java.util.*;
class Krishnamurthy
{
   int digitExtract(int no)
   {
     do
     {
        int r=no%10;
         int fac=fac(r);
        no=no/10;
      }while(no!=0);
        
    return fac;
  }
  int fac(int r)
 {
   int fac=1;
   for(int i=1;i<=r;i++)
   {
     fac=fac*i;
}
return fac;
}
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of n");
   int n=sc.nextInt();
  Krishnamurthy obj=new Krishnamurthy();
  int fac=obj.digitExtract(n);
  int sum=sum+fac;
 if(sum==n)
 {
   System.out.println("Krishnamurty number ");
}
else
{
System.out.println(" Not a Krishnamurty number ");
}
}
}
  
  
   
