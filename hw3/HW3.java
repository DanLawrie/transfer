package edu.monmouth.hw3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import edu.monmouth.bookExercise.*;

public class HW3 {
	public static void main(String[] args) {
		// Creating an arraylist that stores strings
		List<String> ArrayListString = new ArrayList<>();
		// Creating an Linkedlist that stores strings
		List<String> linkedString = new LinkedList<>();
		// Creating an arraylist that stores Books
		List<Book> ArrayListBook = new ArrayList<>();
		// Creating an Linkedlist that stores books
		List<Book> linkedBook = new LinkedList<>();
		
		
		/*
		 * redirects standard error and standard out
		 */
		try {
			PrintStream stout = new PrintStream(HW3Constants.LOGFILENAME);
			System.setOut(stout);
			System.setErr(stout);
		} catch (FileNotFoundException ioe) {
			System.err.println("Cannot redirect stderr and stdout " + ioe.getMessage());
			ioe.printStackTrace();
		}

		/*
		 * takes the lines from STRINGFILENAME and puts it into the ArrayListString and
		 * linkedString
		 */

		try {
			BufferedReader stringReader = new BufferedReader(new FileReader(HW3Constants.STRINGFILENAME));

			String text = "";
			while ((text = stringReader.readLine()) != null) {
				ArrayListString.add(text);
				linkedString.add(text);
			}
			stringReader.close();
		} catch (IOException ioe) {
			System.err.println("Cannot find STRINGFILENAME " + ioe.getMessage());
			ioe.printStackTrace();
		}
		/*
		 * goes through BOOKSFILENAME, seperates them by comma and uses the new
		 * variables from the split to make a new book. It stores the new book in
		 * ArrayListBook and linkedBook
		 */
		try {
			BufferedReader bookReader = new BufferedReader(new FileReader(HW3Constants.BOOKSFILENAME));

			String line = "";
			while ((line = bookReader.readLine()) != null) {
				String[] splitLine = line.split(HW3Constants.SEPERATOR);

				String title = splitLine[0];

				BookTypes bookType = null;
				if (splitLine[1].equals("HARDBACK")) {
					bookType = BookTypes.HARDBACK;
				} else if (splitLine[1].equals("SOFTBACK")) {
					bookType = BookTypes.SOFTBACK;
				} else if (splitLine[1].equals("ELECTRONIC")) {
					bookType = BookTypes.ELECTRONIC;
				}

				int numberOfPages = Integer.parseInt(splitLine[2]);

				double price = Double.parseDouble(splitLine[3]);

				try {

					Book inputedBook = new Book(numberOfPages, bookType, title, price);
					ArrayListBook.add(inputedBook);
					linkedBook.add(inputedBook);

				} catch (BookException e) {
					System.err.println("Cannot create book " + e.getMessage());
					e.printStackTrace();
				}
			}
			bookReader.close();
		} catch (IOException ioe) {
			System.err.println("Cannot find and/or make books " + ioe.getMessage());
			ioe.printStackTrace();
		}

		// checks if ArrayListString are empty and returns true or false
		System.out.println("ArrayListString is empty: " + ArrayListString.isEmpty());
		// checks if ArrayListBook are empty and returns true or false
		System.out.println("ArrayListBook is empty: " + ArrayListBook.isEmpty());
		// removes the value at 1 from each array list
		System.out.println("ArrayListString removes string at position 1: " + ArrayListString.remove(1));
		System.out.println("ArrayListBook removes book at position 1: " + ArrayListBook.remove(1));
		// returns the size of the ArrayListString
		System.out.println("ArrayListString size: " + ArrayListString.size());
		// returns the size of the ArrayListBook
		System.out.println("ArrayListBook size: " + ArrayListBook.size());

		// adds a new string to the ArrayListString
		System.out.println("ArrayListString adding a string: " + ArrayListString.add("TCNJ"));

		// adds a new books to the ArrayListBook
		try {
			System.out.println("ArrayListBook adding a book: "
					+ ArrayListBook.add(new Book(90, BookTypes.HARDBACK, "Lord of the Flies", 8.99)));
		} catch (BookException ioe) {
			System.err.println("Cannot find and/or make books " + ioe.getMessage());
			ioe.printStackTrace();
		}
		// iterates through ArrayListString using an iterator
		System.out.println("Using iterator to iterate through ArrayListString:");
		Iterator<String> stringIterator = ArrayListString.iterator();
		while (stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
		// iterates through ArrayListBook using an iterator
		System.out.println("Using iterator to iterate through ArrayListBook:");
		Iterator<Book> bookIterator = ArrayListBook.iterator();
		while (bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}
		// iterates through ArrayListString using a list iterator
		System.out.println("Using listiterator to iterate through ArrayListString:");
		ListIterator<String> stringlistIterator = ArrayListString.listIterator(ArrayListString.size());
		while (stringlistIterator.hasPrevious()) {
			System.out.println(stringlistIterator.previous());
		}
		// iterates through ArrayListBook using a list iterator
		System.out.println("Using listiterator to iterate through ArrayListBook:");
		ListIterator<Book> booklistIterator = ArrayListBook.listIterator(ArrayListBook.size());
		while (booklistIterator.hasPrevious()) {
			System.out.println(booklistIterator.previous());
		}
		System.out.println();

		// adds a string or a book to list and prints it out
		System.out.println("linkedString adding a string: " + linkedString.add("Cornell"));

		try {
			System.out.println("linkedBook adding a book: "
					+ linkedBook.add(new Book(90, BookTypes.HARDBACK, "Lord of the Flies", 8.99)));
		} catch (BookException ioe) {
			System.err.println("Cannot find and/or make books " + ioe.getMessage());
			ioe.printStackTrace();
		}
		System.out.println("Using iterator to iterate through linkedString:");
		// iterates through linkedString using an iterator
		Iterator<String> linkstringIterator = linkedString.iterator();
		while (linkstringIterator.hasNext()) {
			System.out.println(linkstringIterator.next());
		}
		System.out.println("Using iterator to iterate through linkedBook:");
		// iterates through linkedBook using an iterator
		Iterator<Book> linkbookIterator = linkedBook.iterator();
		while (linkbookIterator.hasNext()) {
			System.out.println(linkbookIterator.next());
		}
		System.out.println("Using listiterator to iterate through linkedString:");
		// iterates through linkedString using a list iterator
		ListIterator<String> linkstringlistIterator = linkedString.listIterator(linkedString.size());
		while (linkstringlistIterator.hasPrevious()) {
			System.out.println(linkstringlistIterator.previous());
		}
		System.out.println("Using listiterator to iterate through linkedBook:");
		// iterates through linkedBook using a list iterator
		ListIterator<Book> linkbooklistIterator = linkedBook.listIterator(linkedString.size());
		while (linkbooklistIterator.hasPrevious()) {
			System.out.println(linkbooklistIterator.previous());
		}
		System.out.println();

		// removes the value at 1 from each linked list
		System.out.println("linkedString removes the string: " + linkedString.remove("MacBook"));
		try {
		System.out.println("linkedBook removes the book: " + linkedBook.remove(new Book(439,BookTypes.ELECTRONIC,"Harry Potter and the Half-Blood Prince",19.99)));
		}catch (BookException ioe) {
			System.err.println("Cannot find and/or make books " + ioe.getMessage());
			ioe.printStackTrace();
		}
		
		// returns whether or not each arraylist contains the book or string
		System.out.println("linkedString contains: " + linkedString.contains("Monmouth University"));
		try {
			System.out.println("linkedBook contains: "
					+ linkedBook.contains(new Book(90, BookTypes.HARDBACK, "Lord of the Flies", 8.99)));
		} catch (BookException ioe) {
			System.err.println("Cannot find and/or make books " + ioe.getMessage());
			ioe.printStackTrace();
		}

		// removes a value from both linked list that is not in the list
		System.out.println("linkedString removes string at position 1: " + linkedString.remove("stuff"));
		try {
			System.out.println("linkedBook removes book at position 1: "
					+ linkedBook.remove(new Book(90, BookTypes.HARDBACK, "Lord of ths", 8.99)));
		} catch (BookException ioe) {
			System.err.println("Cannot find and/or make books " + ioe.getMessage());
			ioe.printStackTrace();
		}
		// returns whether or not each arraylist contains the book or string
		System.out.println("linkedString contains: " + linkedString.contains("Penn"));
		try {
			System.out.println(
					"linkedBook contains: " + linkedBook.contains(new Book(10, BookTypes.HARDBACK, "books", 12)));
		} catch (BookException ioe) {
			System.err.println("Cannot find and/or make books " + ioe.getMessage());
			ioe.printStackTrace();
		}

	}
}
