import java.io.*;
class salary_bill_creation_1
{
	public static void main(String args[])throws IOException
	{
		
		String emp[][]={
			{"501","alhaithem"},
			{"502","benjamin"},
			{"503","citali"},
			{"504","durin"},
			{"505","elena"},
			{"506","furina"},
			{"507","gunma"},
			{"508","hokaje"},
			{"509","itadori"},
			{"510","joro"},
		};
		
		int basic[]={50000,60000,75000,45000,70000,65000,78000,58000,49000,45000};
		double basicsalary,da,hra,medical,gross,pf,net;
		
		String file1="salary_bill_1.csv";
		
		String record=""; //record= 1 complete record/line
		
		FileWriter fp2=new FileWriter(file1); //fp2=object of output file
		String header_1="Ecode,Name,Basicsalary,DA,HRA,Medical,Gross,PF,Net\n";
		fp2.append(header_1); //adding header_1 in output csv file
		
		int n=10;
		
		System.out.print(header_1);
		int i;
		for(i=0;i<n;i++)
		{
			da=0.1*basic[i];
			hra=1.5*basic[i]>10000?10000:1.5*basic[i];
			medical=0.5*basic[i]<5000?5000:basic[i];
			gross=basic[i]+da+hra+medical;
			pf=0.083*(basic[i]+da);
			net=gross-pf;
			
			record=emp[i][0]+","+emp[i][1]+","+basic[i]+","+da+","+hra+","+medical+","+gross+","+pf+","+net+","+"\n";
			
			fp2.append(record);
			System.out.print(record);
		}
		fp2.close();
		System.out.println(file1+" created successfully ...");
	}
} 
			
			