import java.io.*;
import java.util.Scanner;

class q10s3 
{
    public static void main(String args[]) throws IOException 
	{
        int ch, n; 
		int flag, nw;
        String file1, file2;
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter your Input File Name = ");
        file1 = SC.nextLine();

        System.out.print("Enter your Output File Name = ");
        file2 = SC.nextLine();

        FileInputStream fp1 = new FileInputStream(file1);
        FileOutputStream fp2 = new FileOutputStream(file2); 

        nw = 0; // Number of word copied to output
        n = 0;  // Total characters in input file
		flag=1; //means 1st char position of word

        while ((ch = fp1.read()) != -1) 
		{
            n=n+1;
            if ((ch >= 65 && ch <= 90) || (ch>=97 && ch <=122))
			{
                if(flag==1)
				{
				nw=nw+1;
				flag=0;
				}
				System.out.print((char)ch);
                fp2.write(ch);
            }
			else if(flag==0)
			{
				System.out.print('\n');
                fp2.write(10);
				flag=1;
			}
        }
        System.out.println("Number of words found "+nw);

        fp1.close();
        fp2.close();

        System.out.println("Size of " + file1 + " = " + n + " Bytes");
        
    }
}
