import java.io.*;
class salary_bill_reading_1
{
	public static void main(String args[])throws IOException
	{		
		double bs=0,da=0,hra=0,med=0,gross=0,pf=0,net=0;
		 String file1="salary_bill_2.csv";
		
		String record=""; //record= 1 complete record/line
		
		BufferedReader fp1=new BufferedReader(new FileReader(file1)); //fp1=objcet of the input file
		String header_1;
		header_1=fp1.readLine();
		
		System.out.println(header_1);
		int n=0;
		while((record=fp1.readLine())!=null)
		{
			System.out.println(record);
			values=record.split(",");
			
			bs=bs+Double.parseDouble(values[2]);
			da=da+Double.parseDouble(values[3]);
			hra=hra+Double.parseDouble(values[4]);
			med=med+Double.parseDouble(values[5]);
			gross=gross+Double.parseDouble(values[6]);
			pf=pf+Double.parseDouble(values[7]);
			net=net+Double.parseDouble(values[8]);
			
			
		}
		fp1.close();
		System.out.println("Total BASIC=" +bs);
		System.out.println("Total DA=" +da);
		System.out.println("Total HRA=" +hra);
		System.out.println("Total MEDICAL=" +med);
		System.out.println("Total GROSS=" +gross);
		System.out.println("Total PF=" +pf);
		System.out.println("Total NET=" +net);
		
		System.out.println("Total number of records found in "+file1+" = " + n);
		System.out.println(file1+" read successfully ...");
	}
} 
			
			