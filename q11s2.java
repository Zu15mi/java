import java.io.*;
import java.util.Scanner;

class NUMBER_TO_WORDS
{
void word_conversion(int n)
{
int m,nlkh,nlkh1,nlkh2,nth,nth1,nth2,nh,nt1,nt2;

String word;

String a[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight",
"Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen",
"Seventeen","Eighteen","Nineteen"};

String b[]={"X","X","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

m=n; //copy n to m

//to extract digits from lakh place
nlkh=n/100000;
if(nlkh>19)
{
nlkh1=nlkh/10;
nlkh2=nlkh%10;
}
else
{
nlkh1=0;
nlkh2=nlkh;
}

//to extract digits from thousands place
nth=n%100000;
nth=n/1000;
if(nth>19)
{
nth1=nth/10;
nth2=nth%10;
}
else
{
nth1=0;
nth2=nth;
} 

//to extract digits from hundredth place
n=n%1000;
nh=n/100;

//to extract digits from tenth place and unit place
n=n%100;
if(n>19)
{
nt1=n/10;
nt2=n%10;
}
else
{
nt1=0;
nt2=n;
} 

//to decode the no
word="";

//decoding lakh place digits
if(nlkh1!=0 && nlkh2!=0)
word=word+b[nlkh1]+" "+a[nlkh2]+" Lakh ";
else if(nlkh1!=0 && nlkh2==0)
word=word+b[nlkh1]+" Lakh ";
else if(nlkh1==0 && nlkh2!=0)
word=word+a[nlkh2]+" Lakh ";

//decoding thousand place digits
if(nth1!=0 && nth2!=0)
word=word+b[nth1]+" "+a[nth2]+" Thousand ";
else if(nth1!=0 && nth2==0)
word=word+b[nth1]+" Thousand ";
else if(nth1==0 && nth2!=0)
word=word+a[nth2]+" Thousand ";

//decoding hundredth place digits
if(nh!=0)
word=word+a[nh]+" Hundred ";

//decoding tenth place digits
if(nt1!=0 && nt2!=0)
word=word+b[nt1]+" "+a[nt2];
else if(nt1!=0 && nt2==0)
word=word+b[nt1];
else if(nt1==0 && nt2!=0)
word=word+a[nt2];
if (nt1 == 0 && nt2 == 0 && nh != 0) 
word = word.trim(); // trim extra space

System.out.println(m+" : "+word);
}
}

class q11s2
{
public static void main(String args[])throws IOException
{
int n1,n2,i;
Scanner SC=new Scanner(System.in);
System.out.print("Enter your lower limit(1-9999999) = ");
n1=SC.nextInt();
System.out.print("Enter your upper limit(1-9999999) = ");
n2=SC.nextInt();
NUMBER_TO_WORDS NW=new NUMBER_TO_WORDS();
for(i=n1; i<=n2; i++)
{
NW.word_conversion(i);
}
}
}