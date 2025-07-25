import java.io.*;
import java.util.Scanner;
class Marks
{
public static void main(String args[]) throws IOException
{
Scanner SC= new Scanner(System.in);
int[] marks=new int[5];
int sum=0;
System.out.println("enter marks for 5 subject(out of 100):");

for(i=0; i<5; i++)
{
System.out.print("subject"+(i+1)+":");
marks[i]=SC.nextInt();
sum+=marks[i];
}
int max=marks[0];
int min=marks[0];
for(i=0; i<5; i++)
{
if(marks[i]>max)max=marks[i];
if(marks[i]<min)min=marks[i];
}
double ptg=((double)sum/500)*100;
double cgpa=ptg/9.5;
String grade;
if(ptg>=90)
grade="A";

elseif(ptg>=80)
grade="B";

elseif(ptg>=70)
grade="C";

elseif(ptg>=60)
grade="D";

else
grade="F";

System.out.println("\n----Result----\n");
System.out.println("max marks="+max);
System.out.println("min marks="+min);
System.out.println("cgpa="+cgpa);
System.out.println("grade="+grade);
}
}