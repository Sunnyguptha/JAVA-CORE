package com.fileHandlingIO.java;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class PrintAllcurrentListInDirectory {

	public static void main(String[] args) throws IOException {
		//    separator=\\ or/
		
		File f=new File("D:/Java2025/FileHandling");
		
		//System.out.println(Arrays.toString(f.list()));
		
//		for(String fileName:f.list()){
//			System.out.println(fileName);
//		}

//		for(File fileName:f.listFiles()){
//		System.out.println(fileName);
//		}
		
		//System.out.println(f.getName());
		
		//System.out.println(f.getAbsolutePath());
		
		/*
		System.out.println(f.getParent());
		
		File f2=new File(f.getParent()+"/resume2.docx");
		f2.createNewFile();
		System.out.println(f2);
		*/
		
		//System.out.println(new Date(f.lastModified()));
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
	
	}

}
