//William Capon, Intro to Computer Science II

package assignment1;
import java.util.Scanner;

public class MeanProblem extends BaseProblem {
	/**
	 * Takes a series of five numbers and displays the mean and max to the user
	 */
	public MeanProblem() {
		super("Mean and Max");
	}
	
	@Override
	public void Execute() {
		int[] numbers = new int[5];
		int biggest = 0;
		double mean = 0;
		this.problemScanner = new Scanner(System.in);
		
		//Get the numbers
		System.out.println("Please enter five numbers.");
		for(int i = 0;i < 5;i++) {
			numbers[i] = this.problemScanner.nextInt();
			//Add to total
			mean += numbers[i];
			
			//Update max
			if(i == 0) { //First number is always the biggest
				biggest = numbers[i];
			} else { 
				if(numbers[i] > biggest) { //Is it bigger
					biggest = numbers[i];
				}
			}
		}
		
		mean /= 5;
		
		System.out.println("The average of those numbers is " + Double.toString(mean));
		System.out.println("The largest of those numbers is " + Integer.toString(biggest));
		
		
		
	}
}
