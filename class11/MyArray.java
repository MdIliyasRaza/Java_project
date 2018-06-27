import java.io.*;
import java.util.Scanner;
class MyArray
{
	public static void main(String[] args)
	{
		Val v=new Val();
		v.add(56);
		v.add(89);
		v.add(53);
		v.add(12);
		v.add(45);

		v.display();
	}
}	
class Val
{
	static int defaultVal=4;
	static int i=0;
	int arr1[]=new int[defaultVal];
	void add(int value)
	{
		if(i>=defaultVal)
		{
			defaultVal=(int)arr1.length*2;
			int arr2[]=new int[defaultVal];
			arr2=arr1.clone();
			arr1=new int[defaultVal];
			for(int a=0;a<arr2.length;a++)
			{
				arr1[a]=arr2[a];
			}
			arr1[i]=value;
			i++;
		}
		else
		{
			arr1[i]=value;
			i++;

		}
	}
void display()
{
	for(int k=0;k<i;k++)
	{
		System.out.println(arr1[k]);
	}
}
}