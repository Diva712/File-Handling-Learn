package com.diva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		//Write a program to merge data from two files into third files.
//		PrintWriter pw = new PrintWriter("result.txt");
//		
//		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
//		
//		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
//		
//		
//		String line = br1.readLine();
//		while(line!=null) {
//			pw.println(line);
//			line = br1.readLine();
//		}
//		
//		line = br2.readLine();
//		while(line!=null) {
//			pw.println(line);
//			line = br2.readLine();
//		}
//		pw.flush();
//		br1.close();
//		br2.close();
//		pw.close();
//		
//		System.out.println("Result is created !!");
		
		//***************************************************************************
		
		//Write a program to merge data from two file into 3rd file where merging should be done line by line alternatively
//		PrintWriter pw = new PrintWriter("result2.txt");
//		
//		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
//		
//		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
//		
//		String line1 = br1.readLine();
//		String line2 = br2.readLine();
//		
//		
//		while(line1!=null || line2!=null) {
//			
//			if(line1!=null) {
//				pw.println(line1);
//				line1 = br1.readLine();
//				
//			}
//			if(line2!=null) {
//				pw.println(line2);
//				line2 = br2.readLine();
//				
//			}
//		}
//		
//		pw.flush();
//		br1.close();
//		br2.close();
//		pw.close();
//		System.out.println("Result generated !!");
		
		
		//***********************************************************************************
		//Write a program to merge data of all file in D:\Job Hunting into output.
		
//		File file = new File("D:\\Job Hunting");
//		String [] files = file.list();
//		PrintWriter pw = new PrintWriter ("result3.txt");
//		for(String str : files) {
//			File file1 = new File(file , str);
//			BufferedReader br = new BufferedReader(new FileReader(file1));
//			String line = br.readLine();
//			while(line!=null) {
//				pw.println(line);
//				line = br.readLine();
//			}
//			br.close();
//		}
//		
//		pw.flush();
//		pw.close();
//		System.out.println("result Successfully obtained !!");
//		
	}
}
