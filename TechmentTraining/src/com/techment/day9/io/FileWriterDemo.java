package com.techment.day9.io;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

//		FileWriter fw = new FileWriter("abc.txt");
//		fw.write("hello");
//		fw.write(92);
		
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("hi \n");
		fw.write("welcome");

		fw.close();
	}

}
