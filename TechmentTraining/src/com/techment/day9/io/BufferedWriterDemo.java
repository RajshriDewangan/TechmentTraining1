package com.techment.day9.io;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception{

		FileWriter f = new FileWriter("abc.txt");
		BufferedWriter b = new BufferedWriter(f);
		
		b.write(100);
		b.newLine();
		
		char[] ch = {'a','b','c','d'};
		
		b.write(ch);
		b.newLine();
		b.write("namaskar");
		b.newLine();
		b.write("software");
		
		b.flush();
		b.close();

	}

}
