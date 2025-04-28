package com.TextHandleEx2.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamEx1 {

	public static void main(String[] args) throws IOException {
	
		File file=new File("./Sample6.text");
		
		if(file.exists())
			file.delete();
		file.createNewFile();
		
		//writing String
		
		String str="hello guys";
				
		FileOutputStream fos=new FileOutputStream(file);
		
		for(char ch:str.toCharArray()) {
			fos.write((int)ch);
		}
		
		/*
		//writing character 
		fos.write(72);
		fos.write(69);
		fos.write(76);
		fos.write(76);
		fos.write(79);
		*/
		
		
		fos.flush();
		
		fos.close();
		

	}

}
