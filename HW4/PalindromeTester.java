package ed.monmouth.HW4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Stack;

public class PalindromeTester {

	public static void main(String[] args) throws IOException {
		/*
		 * Redirect stdout and stderr to LOGFILENAME in HW4Constants
		 */

		try {
			PrintStream stout = new PrintStream(HW4Constants.LOGFILENAME);
			System.setOut(stout);
			System.setErr(stout);
		} catch (FileNotFoundException ioe) {
			System.err.println("Cannot redirect stderr and stdout " + ioe.getMessage());
			ioe.printStackTrace();
			System.exit(-1);
		}
		// Takes the parameters in main
		String newFIle = args[0];
		// takes file and puts in under properties
		Properties prop = new Properties();
		prop.load(new FileReader(newFIle));
		// creates new filewriter using the property "log_file_name"
		FileWriter newWriter = new FileWriter(new File(prop.getProperty("log_file_name")));
		String line = prop.getProperty("words");
		// splits up the words
		String[] word = line.split(",");
		// goes through word list and sees if they are palindromes
		String output = "";
		for (int i = 0; i < word.length; i++) {
			if (palindrome(word[i])) {
				output = output + word[i] + ": palindrome\n";
			} else {
				output = output + word[i] + ": not a palindrome\n";
			}
		}
		// prints out which ones are and aren't a palindrome
		System.out.println(output);
		newWriter.close();

	}

	public static boolean palindrome(String x) {
		// creating a new stack and adding each character in string parameter to it
		Stack<Character> one = new Stack<>();
		for (int i = 0; i < x.length(); i++) {
			one.push(x.charAt(i));
		}
		// Declare a StringBuilder that will be used to house each letter popped off the
		// stack
		StringBuilder stringStack = new StringBuilder();
		/*
		 * Create a second loop that will pop each letter off the stack, appending the
		 * character onto the StringBuilder
		 */
		while (!one.isEmpty()) {
			stringStack.append(one.pop());
		}
		/*
		 * Compare the StringBuilder to the word to check. If they are equal the word it
		 * is a palindrome.
		 */
		if (stringStack.toString().equals(x)) {
			return true;
		} else {
			return false;
		}

	}

}
