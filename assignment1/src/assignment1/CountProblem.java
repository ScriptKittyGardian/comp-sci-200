//William Capon, Intro to Computer Science II

package assignment1;
import java.lang.Math;
import java.util.Scanner;

public class CountProblem extends BaseProblem {
	/**
	 * Takes a number and counts to it from zero.
	 */
	public CountProblem() {
		
		super("Count Problem"); //Send parent our name
		
	}
	
	//Main problem function
	@Override
	public void Execute() {
		this.problemScanner = new Scanner(System.in);

		//Define local variables
		String finalString = "";
		int problemNumber;
		//Get input from the user
		System.out.println("Please enter a number.");
		problemNumber = this.problemScanner.nextInt();
		
		for(int i = 0; i <= Math.abs(problemNumber);i++) {
			finalString += Integer.toString(i * (int)Math.signum((float)problemNumber)); //Add number with correct sign
			if(i != Math.abs(problemNumber)) { //Append commas when necessary
				finalString += ",";
			}
		}
		System.out.println(finalString); //Display the end result
				
	}
}
