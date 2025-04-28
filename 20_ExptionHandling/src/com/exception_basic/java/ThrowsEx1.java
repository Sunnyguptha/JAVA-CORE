package com.exception_basic.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx1 {

	public static void main(String[] args) throws FileNotFoundException {
		
/*  with try and catch
 * 
		File file=new File("D:/resume.docx");
		
		FileInputStream fis=null;
		try {
		 fis=new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
		System.out.println(fis);
*/
		//instead using close() we can use try with-resource
		
		/*
		package com.java;

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;

		public class ExceptionEx1 {

		    public static void main(String[] args) {

		        File f = new File("D:/resume.docx");
		        try (FileInputStream fis = new FileInputStream(f)) {
		            System.out.println("File opened successfully.");
		            // You can add file processing logic here.
		        } catch (FileNotFoundException e) {
		            System.out.println("File not found: " + e);
		        } catch (IOException e) {
		            System.out.println("Error closing file: " + e);
		        }
		    }
		}
		*/

	
		// throws
		/*
		package com.java;

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;

		public class ExceptionEx2 {

		    public static void main(String[] args) throws FileNotFoundException, IOException {
		        File f = new File("D:/resume");

		        FileInputStream fis = null;
		        try {
		            // Attempt to open the file
		            fis = new FileInputStream(f);
		            System.out.println("File opened successfully: " + fis);
		        } finally {
		            // Ensuring the stream is closed, even if an exception occurs
		            if (fis != null) {
		                fis.close();
		                System.out.println("File stream closed.");
		            }
		        }
		    }
		}

*/
		
	}
}


