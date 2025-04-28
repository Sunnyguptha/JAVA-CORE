package com.TextHandle.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
public static void main(String[] args) throws IOException {
	

	File file=new File("./Sample5.text");
	
	if(!file.exists())
		file.createNewFile();
	
	//FileReader fr=new FileReader(file);
	FileReader fr=new FileReader(file);
	FileInputStream fis=new FileInputStream(file);
	InputStreamReader isr=new InputStreamReader(fis);
	BufferedReader br=new BufferedReader(isr);
	//BufferedReader br=new BufferedReader(fr);
	
	//character by character read kar raha hu
	
	/*
	int asciiCode;
	String text=new String();
	
	while((asciiCode=br.read())!=-1)
	{
		text+=String.valueOf((char)asciiCode);
	}
	System.out.println(text);
	
	fr.close();
	br.close();

*/
	
	//line by line read kar raha hu
	
	String text=new String();
	
	String line=new String();
	while((line =br.readLine())!=null)
	{
		//System.out.println(line);
		text+=line +"\n";
	}
	System.out.println(text);
	
	fis.close();
	isr.close();
	fr.close();
	br.close();
}
}


