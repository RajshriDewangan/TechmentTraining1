package com.techment.assignment4.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks 
{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int num = scanner.nextInt();
		
		ArrayList<Double> marks = new ArrayList<Double>();
		System.out.println("Enter marks");
		
		for(int i=0 ; i<num ; i++)
		{
			marks.add(scanner.nextDouble());
		}
		
		System.out.println(marks);
		Double array[]=new Double[num];
		
		for(int i=0; i<num; i++)
		{
           array[i]=marks.get(i);
	
		}       
		
		System.out.println("highest:"+Collections.max(marks));
        int sum = 0;
        for(int j=0; j<num; j++)
        {
        	sum+=array[j];
        }
        float average = sum/num;
        
        System.out.println("average marks "+average);
        
        System.out.println("3rd student marks "+array[2]);
        
		Collections.sort(marks);
		System.out.println("sorted marks "+marks);

	}

}