package com.TextHandleEx2.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx1 {

	public static void main(String[] args) throws IOException {

		File file = new File("./Sample8.txt");
/*
		if (file.exists())
			file.delete();
		file.createNewFile();
*/
		
		//  update an existingg data
		String existingText=new String();
		String line="";
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		while((line=br.readLine())!=null) {
			existingText+=line+"\n";
		}
		// writing String
		//String str1="hello";
		String str2 = "what are you doing guys";
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		bw.write(str2);
		
		bw.flush();

		bw.close();

	}

}
