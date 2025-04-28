package com.TextHandleEx2.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {

		File file = new File("./Sample7.txt");

		if (file.exists())
			file.delete();
		file.createNewFile();

		// writing String

		String str = "hello guys";

		FileWriter fw = new FileWriter(file);
		
		//fw.write(str);
		
		fw.write(str.toCharArray());

		fw.flush();

		fw.close();

	}

}
