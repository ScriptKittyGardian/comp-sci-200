//William Capon, Intro to Computer Science II

package assignment1;
import java.util.*;


/**
 * Base problem class.
 * Extends all other problem classes.
 */
public class BaseProblem { //Problem base class
	private String name;
	protected Scanner problemScanner;

	public BaseProblem(String tempname) { //Super constructor to set name
		this.name = tempname;
	}
	
	public String GetName() { //Return the name 
		return this.name;
	}
	public void Execute() {
		System.out.println("You shouldn't see this."); //inform error
	}
}
