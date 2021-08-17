package com.techment.day9.io;

import java.io.FileReader;


public class FileReaderDemo {

	public static void main(String[] args) throws Exception{

		FileReader fr = new FileReader("abc.txt");
		
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//
//		System.out.println(fr.read());
//		System.out.println(fr.read());
//		System.out.println(fr.read());

		int ch = fr.read();
		System.out.println(ch);
		
		while(ch!=-1)
		{
			//System.out.println(fr.read());
			
			System.out.println((char)ch);
			ch=fr.read();
		}
	}

}
