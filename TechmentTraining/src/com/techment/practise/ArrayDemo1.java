package com.techment.practise;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int high1,high2,low,sum=0;
		
		System.out.println("how many marks you want to enter:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int marks[]= new int[num];
		
		//taking marks input
		
		for(int i=0; i<num ; i++)
		{
			System.out.println("enter marks "+(i+1)+" :");
			marks[i]=scanner.nextInt();
			
		}
		
		//show all marks
		
		for(int i=0; i<num ; i++)
		{
			System.out.println("marks "+i+" :"+marks[i]);
			
		}
		
		
		//pass or fail
		for(int i=0; i<num ; i++)
		{
			if(marks[i]>40)
				System.out.println(i+" is Pass");
			else
				System.out.println(i+" is Fail");
		}
		
		
		//highest marks
		high1=marks[0];	
		for(int i=0; i<num ; i++)
		{
			for(int j=0; j<num ; j++)
			{
				if(marks[i]>high1)
					high1=marks[i];
			}
		}
		System.out.println("Highest marks is :"+high1);
		
			
		//lowest marks

		low=marks[0];	
		for(int i=0; i<num ; i++)
		{
			for(int j=0; j<num ; j++)
			{
				if(low<marks[i])
					low=marks[i];
			}
		}
		System.out.println("Lowest marks is :"+low);
		
		//sum of all marks
		for(int i=0; i<num ; i++)
		{
			sum=sum + marks[i];
		}
		System.out.println("sum of marks is : "+sum);



	}

}
