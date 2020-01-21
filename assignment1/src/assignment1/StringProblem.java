//William Capon, Intro to Computer Science II

package assignment1;
import java.util.Scanner;

public class StringProblem extends BaseProblem {
	/**
	 * Takes a string and allows the user to guess its length.
	 * Displays correct length as well as whether or not user is correct, high, or low.
	 */
	public StringProblem() {
		super("String Length");
	}
	@Override
	public void Execute() {
		this.problemScanner = new Scanner(System.in);
		String word;
		String response;
		int guess;
		int diff;
		
		//Get the string
		System.out.println("Please enter a word or phrase.");
		word = this.problemScanner.nextLine();
		
		//Get the guess
		System.out.println("Please enter a number.");
		guess = this.problemScanner.nextInt();
		
		//Determine difference
		diff = word.length() - guess;
		
		response = ""; //Init response
		if(diff == 0) { //Exactly right
			response = "Exactly right!  ";
		}
		else if(diff > 0) { //The number is less than it should be
			response = "No, more than that.  "; 
		} else if(diff < 0) { //The number is more than it should be
			response = "No, less than that.  ";
		}
		response += String.format("%s is %s letter long.", "\"" + word + "\"",Integer.toString(word.length())); //Add the correct answer to every response
		System.out.println(response); //Print the final response
		
	}
}
