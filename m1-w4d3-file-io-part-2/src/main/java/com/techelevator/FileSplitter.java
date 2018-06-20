package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) 
	{
		try(Scanner userInput = new Scanner(System.in))
		{
			System.out.println("which file do you want to split?");
			String filePath = userInput.nextLine();
			
			try{
				File fileToRead = getFileAtPath(filePath);
				System.out.println("how many lines o you want in each split file?");
				int linesPerFile = 0;
				boolean isValidValue = false;
				while(!isValidValue){
					try{
						linesPerFile = userInput.nextInt();
						isValidValue = true;
						if(linesPerFile >0){
						isValidValue = true;
						}
						else{
							throw new InputMismatchException();
						}
					}catch(InputMismatchException ex){
						System.out.println("That was not a valid number, try again.");
					
					}finally{
						userInput.nextLine();
					}
				}
				
				
				try(Scanner fileInput = new Scanner(fileToRead)){
					int fileCount = 1;
					while(fileInput.hasNextLine()){
						String splitFileName = getNextFileName(fileToRead, fileCount);
						File outputFile = new File(fileToRead.getParentFile(), splitFileName);
						
						try(PrintWriter fileOutput = new PrintWriter(outputFile)){
							for(int i = 0; i < linesPerFile; i ++){
								if(fileInput.hasNextLine()){
									fileOutput.println(fileInput.nextLine());
								} else{
									break;
								}
							}
						}
						fileCount++;
					}
				}
				
			}catch(IOException ex){
				System.out.println(ex.getMessage());
				System.exit(1);
			}
			
		}
	}
	//        			/Users/ddistelhorst/Desktop/alice.txt
	
	private static String getNextFileName (File inputFile, int count){
		String fileName = inputFile.getName();
		String extension = fileName.substring(fileName.lastIndexOf('.'));
		String nameNoExt = fileName.substring(0, fileName.lastIndexOf('.'));
		return nameNoExt + "-" + count + extension;
	}

	private static File getFileAtPath(String filePath) throws IOException{
		File ourFile = new File(filePath);
		if(!ourFile.exists()){
			throw new FileNotFoundException("there was no file at file path " + filePath);
			
		}
		if (!ourFile.isFile()){
			throw new IOException(filePath + " is not valid file");

		}
		return ourFile;
	}
}
