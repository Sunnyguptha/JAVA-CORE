package com.TextHandle.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) throws IOException {
File file=new File("./Sample3.text");
		
		if(!file.exists())
		file.createNewFile();
		
		FileInputStream fis=new FileInputStream(file);
		Scanner scanner=new Scanner(fis);
		
		String text=new String();
		while(scanner.hasNextLine())//hasNest()
		{
			text+=scanner.nextLine()+"\n";//next
		}

		System.out.println (text );

		fis.close();
		scanner.close();
		
	}

}
