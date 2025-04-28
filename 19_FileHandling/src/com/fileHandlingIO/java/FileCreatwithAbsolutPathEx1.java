package com.fileHandlingIO.java;

import java.io.File;
import java.io.IOException;

public class FileCreatwithAbsolutPathEx1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\YoutubeJava\\TestFiles\\resume.txt");
		
/*
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		f.delete();
		System.out.println(f.exists());
		
*/
		
		if(f.exists())
			f.delete();
		//System.out.println(f.createNewFile());
		
		//System.out.println(f.isHidden());
		
		System.out.println(f.canWrite());
		f.setWritable(true);
		System.out.println(f.canWrite());
		
	}

}
