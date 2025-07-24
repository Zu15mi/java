import java.io.*;
import java.util.Scanner;

class TOH 
{
    public static long n = 0;
	long tower_of_hanoi(char p1, char p2, char p3, int nd)
	
	{
        if (nd == 1) 
		{
            n = n + 1;
            System.out.println("Step " + n + ": Move Disk-" + nd + " From Peg -" + p1 + " to Peg -" + p2);
            return n;
        }

        tower_of_hanoi(p1, p3, p2, (nd - 1));
        n = n + 1;
        System.out.println("Step " + n + ": Move Disk-" + nd + " From Peg -" + p1 + " to Peg -" + p2);
        tower_of_hanoi(p3, p2, p1, (nd - 1));
		return n;
    }
}

class q10s1 
{
    public static void main(String args[]) throws IOException
	{
		long n=0;
        char p1 = '1', p2 = '2', p3 = '3';
		int nd;
        Scanner sc = new Scanner(System.in);
		TOH T=new TOH();
        System.out.print("Enter number of disks = ");
        nd = sc.nextInt();
		n=T.tower_of_hanoi(p1,p2,p3,nd);
        System.out.println("Total number of movements to shift"+nd+"disks="+n);
    }
}
