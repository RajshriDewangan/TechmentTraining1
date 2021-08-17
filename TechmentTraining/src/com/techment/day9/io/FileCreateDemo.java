package com.techment.day9.io;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {

//		File file = new File("abc.txt");
//		System.out.println(file.exists());
//		file.createNewFile();
//		System.out.println(file.exists());
		
		File file = new File("abc.txt");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());

	}

}
