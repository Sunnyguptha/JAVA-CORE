package com.TextHandle.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("./Sample.text");
		
		//System.out.println(file.exists());
		
		if(!file.exists())
			file.createNewFile();
		
		FileInputStream fis=new FileInputStream(file);
		
		//char ch=(char)fis.read();
		//System.out.println(ch);
		
		/*
		int asciiCode;
		//asciiCode =fis.read()-->read one one character
		
		while((asciiCode =fis.read())!=-1) {
			
			System.out.print((char)asciiCode);
			
		}
		fis.close();
		*/
		//if want string another way
		
		
		int asciiCode;
		String text=new String();
		
		while((asciiCode=fis.read())!=-1)
		{
			text+=String.valueOf((char)asciiCode);
		}
		System.out.println(text);
		
		fis.close();

	}

}
