package assignment1;
import java.util.*;

/**
 * Main class.
 * Handles the running and presentation of all other classes.
 */
public class Main {
	
	private static List<BaseProblem> problemList = new LinkedList<BaseProblem>();
	private static Boolean isRunning = true;
	private static Scanner menuScanner;
	/**
	 * Sets up list of problem classes
	 */
	private static void init() {
		problemList.add(new CountProblem());
		problemList.add(new StringProblem());
		problemList.add(new MeanProblem());
	}
	
	/**
	 * Displays the menu
	 */
	private static void displayMenu() {
		System.out.println("Select which problem you would like to run:");
		for(int i = 0;i < problemList.size();i++) {
			System.out.println(Integer.toString(i) + " - " + problemList.get(i).GetName());
		}
		System.out.println(Integer.toString(problemList.size()) + " - Exit");
	}
	/**
	 * Takes input and executes problems
	 */
	private static void runMenu() {
		int input = menuScanner.nextInt();
		if(input < problemList.size() && input >= 0) {
			problemList.get(input).Execute();
			return;
		}
		if(input == problemList.size()) {
			System.out.println("Goodbye!");
			isRunning = false;
			return;
		}
		
		System.out.println("Looks like you don't know what you want.  Try again please");
		
	}
	/**
	 * Main loop
	 */
	public static void main(String[] args) {
		init();
		menuScanner = new Scanner(System.in);
		while(isRunning) {
			displayMenu();
			runMenu();
			if(isRunning) {
				System.out.println("\n");
			}
		}
		menuScanner.close();
		System.exit(0);

	}
}
