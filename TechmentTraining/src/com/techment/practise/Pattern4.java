package com.techment.practise;

public class Pattern4 {

	public static void main(String[] args) {

		int temp;
		for(int i=1;i<=3;i++) 
		{
						
			temp=i;

			for(int j=1;j<=i;j++)
			{
				
				System.out.print(temp++);
			}
			System.out.println();
		}
	}

}
