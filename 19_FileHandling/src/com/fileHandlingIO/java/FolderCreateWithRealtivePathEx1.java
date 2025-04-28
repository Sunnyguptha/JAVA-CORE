package com.fileHandlingIO.java;

import java.io.File;

public class FolderCreateWithRealtivePathEx1 {

	public static void main(String[] args) {
		File f=new File("./Resources/Test");
		System.out.println(f.mkdirs());
		
	//	if(f.exists())
	//		f.delete();
	//	System.out.println(f.exists());
	}

}
