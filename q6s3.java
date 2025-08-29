import java.io.*;
import java.util.Scanner;

class q6s3 {
    public static void main(String args[]) throws IOException {
        int ch, n, nc;
        String file1, file2;
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter your Input File Name = ");
        file1 = SC.nextLine();

        System.out.print("Enter your Output File Name = ");
        file2 = SC.nextLine();

        FileInputStream fp1 = new FileInputStream(file1);
        FileOutputStream fp2 = new FileOutputStream(file2); 

        nc = 0; // Number of characters copied to output
        n = 0;  // Total characters in input file

        while ((ch = fp1.read()) != -1) {
            n=n+1;
            if (ch >= 32 && ch <= 122) {
                nc=nc+1;
                fp2.write(ch);
            }
        }

        fp1.close();
        fp2.close();

        System.out.println("Size of " + file1 + " = " + n + " Bytes");
        System.out.println("Size of " + file2 + " = " + nc + " Bytes");
    }
}
