package io;

import java.util.*;
import java.io.*;

public class PhoneNums {

	public ArrayList<String> readPhoneNumbers() {

		String filename = "data/phone.txt"; 
		ArrayList<String> output = new ArrayList<String>();

		try {
			Scanner input = new Scanner ( new FileReader(filename) );

			while (input.hasNextLine()) {
				String line =  input.nextLine();
				Scanner nums = new Scanner(line);
				
				/*	
				 *	Fill-in 
				 */
				
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return output;
		
	}
	
	

}
