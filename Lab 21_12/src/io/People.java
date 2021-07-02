package io;

import java.util.*;
import java.io.*;

public class People {

	public ArrayList<Person> readFile() {
		// this version asks for the file
		System.out.print("Enter the file name: ");
		Scanner kbd = new Scanner(System.in);
		String filename = kbd.next();
		return readFile(filename);
	}


	public ArrayList<Person> readFile(String filename) {
		// create people array
		ArrayList<Person> people = new ArrayList<Person>();
	
		try {
			
			Scanner input = new Scanner ( new FileReader(filename) );
			while (input.hasNextLine()) {
				String line = input.nextLine();
				Scanner person = new Scanner(line);
				person.useDelimiter("\t");

			





				people.add(p);
				
				person.close();

				 
				
								/*
				 * Fill-in .. Do not touch the rest of the code
				 */ 

				// end of code to be filled in
			} 
	
	

			input.close();	
		

					} catch ( NoSuchElementException e){
			System.out.println(e); 

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		return people;	
	
		
	}
	
	
	

	


	public void printPeople(ArrayList<Person> people) {
		for (Person p : people) {
			System.out.println(p);
	
							}
	if(people.size()>0){
	System.out.println("Total people " +people.size());
	}
	}


}
