package com.cognixia.jump.intermediateJava.javaFinalProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	
		File file = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		PrintWriter printWriter = null;
		
		try {
			file = new File("Resources/employees.txt");
			if(file.createNewFile()) {
				System.out.println("Sucess");
			}
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			printWriter = new PrintWriter(bufferedWriter);
			
			
		//	writeToFile(bufferedWriter, o.toString());
		}
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				if(bufferedWriter != null) {
				
				try {
					bufferedWriter.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			
				}
				
				if(fileWriter != null) {
					
					try {
						fileWriter.close();
					} catch(IOException e) {
						e.printStackTrace();
					}
				
					}
			}
	}
	
	public static void writeToFile(BufferedWriter writer, String str)throws IOException{
			writer.write(str);
			writer.write("\n");
	}
	
	public static void appendToFile(BufferedWriter writer, String str)throws IOException{
			writer.append(str);
	}
	

}
