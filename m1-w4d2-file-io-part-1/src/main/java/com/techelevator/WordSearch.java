package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {
	

	public static void main(String[] args) 
	{
		try(Scanner userInput = new Scanner(System.in))
		{
			File aliceToLowerCase = new File("/Users/ddistelhorst/Desktop/alice.txt");
			boolean lowerCase = false;
			
			System.out.print("Enter Search Term >>> ");
			String searchTerm = userInput.nextLine();
			
			System.out.print("Enter File Path >>> ");
			String filePath = userInput.nextLine();
			
			System.out.print("ignore case (y or n) >>> ");
			String caseString = userInput.nextLine();
			boolean caseInsensitive = false;
			if(caseString.toLowerCase().contains("y")) {
				caseInsensitive = true;
			}
			// /Users/ddistelhorst/Desktop/alice.txt
			try {
				File searchFile = getSearchFile(filePath);
				try(Scanner fileInput = new Scanner(searchFile)) {
					while(fileInput.hasNextLine()) {
						 String line = fileInput.nextLine();
						 boolean match = false;
						 
						 if(caseInsensitive)  {
							 match = line.toLowerCase().contains(searchTerm.toLowerCase());
						 } else {
							 match = line.contains(searchTerm);
						 }
						 
						 if(match) {
							 System.out.println(line);
						 }
					}
				}
			} catch(IOException ex) {
				System.out.println(ex.getMessage());
			}

			
						
//		try
//			{
//				File searchFile = getSearchFile(filePath);
//			try(Scanner fileInput = new Scanner(searchFile)) 
//			{
//				int lineNumber = 1;
//				{
//					while(fileInput.hasNextLine()){
//						String line = fileInput.nextLine();
//						if (line.contains(searchTerm))
//						{
//							System.out.println(line + " ) " + 1);
//							lineNumber ++;
//							System.out.println("the word "+ searchFile + "appears " +lineNumber + "times");
//
//						}
//					}
//				}
//			}
//			}
//	
//			catch(FileNotFoundException ex) 
//			{
//				System.out.println(ex.getMessage());
//				System.exit(1);
//			}
//			catch(IOException ex) 
//			{
//				System.out.println(ex.getMessage());
//				System.exit(1);
//			}
		
			
		
	}
}
	
	
	private static File getSearchFile(String filePath) throws IOException{
		File searchFile = new File(filePath);

		if(!searchFile.exists()){
			throw new FileNotFoundException("Search file "+  filePath + " does not exist.");
		}
		if(!searchFile.isFile()){
			throw new IOException("Search file " + filePath + " exists but is not a file.");
		}
		return searchFile;
	}

}
