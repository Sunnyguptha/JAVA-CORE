package com.TextHandle.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) throws IOException {
File file=new File("./Sample2.text");
		
		if(!file.exists())
		file.createNewFile();
		
		Scanner scanner=new Scanner(file);
		
		String text=new String();
		while(scanner.hasNextLine())//hasNest()
		{
			text+=scanner.nextLine()+"\n";//next
		}

		System.out.println (text );

		scanner.close();
		
	}

}
