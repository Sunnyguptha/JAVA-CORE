package com.TextHandle.java;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		File file = new File("./Sample4.text");

		if (!file.exists())
			file.createNewFile();

		FileReader fr=new FileReader(file);
		int asciiCode;
		String text=new String();
		
		while((asciiCode=fr.read())!=-1)
		{
			text+=String.valueOf((char)asciiCode);
		}
		System.out.println(text);
		
		fr.close();

		
	}

}
