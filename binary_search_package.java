/* binary_search_package.java: write a package to search a number in an array using binary search algorithm.
create mypackage in bin: 
C:\Java\bin>mkdir mypackage
C:\Java\bin>cd mypackage

C:\Java\bin\mypackage>cd..
C:\Java\bin>javac binary_search_package.java

C:\Java\bin>copy binary_search_package.* C:\Java\bin\mypackage
binary_search_package.class
Overwrite C:\Java\bin\mypackage\binary_search_package.class? (Yes/No/All): a
binary_search_package.java
        2 file(s) copied.
 */
 package mypackage;
public class binary_search_package
{
	public void binary_search(int a[],int n,int num)
	{
		int low,high,mid;
		int flag,i;
		low=0;
		high=n-1;
		flag=0;//NOT FOUND
		while(low<=high)
		{
			mid=(low+high)/2;
			if(num<a[mid])
				high=mid-1;
			else if(num>a[mid])
				low=mid+1;
			else
			{
			 flag=1;
			 break;
			}
		}
		if(flag==1)
			System.out.println(num+" found");
		else
			System.out.println(num+" not found");
		
	}
}

