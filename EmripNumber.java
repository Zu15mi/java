//EmripNumber
/* the numberand its reversed is prime */
import java.util.*;
class EmripNumber
{
  int chkPrime(int n)
{
    int ctr=0;
      for(int i=1;i<=n;i++)
  {
    if(n%i==0)
    ctr++;
  }
 if(ctr==2)
return 1;
else
return 0;
}
int reverse(int n)
{
   int rev=0;
   do
{
  int d=n%10;
   rev=rev*10+d;
n=n/10;
}while(n!=0);
return rev;
}
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int no=sc.nextInt();
    EmripNumber obj=new EmripNumber();
    int rev=obj.reverse(no);
    System.out.println("Reverse is "+rev);
    int chkPrime=obj.chkPrime(no);
    if(chkPrime==1)
    {
       System.out.println("Number is prime");
      int chkPrime2=obj.chkPrime(rev);
      if(chkPrime2==1)//checking if the reverse the is prime
      {
        System.out.println("The number is a EmripNumber");
      }
     }
  }
}
       