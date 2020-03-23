package Project2;

import java.util.ArrayList;

public class Calculator {

	CalcUtil util;
	
	public Calculator() {
		util = new CalcUtil();
	}
	
	
	public Float processEquation(String equ) {
		
		
		char[] toProcess = equ.toCharArray();
		ArrayList<Character> enqueue = new ArrayList<Character>();
		Stack<Character> operators = new Stack<Character>();
		
		
		for(int i = 0;i < equ.length();i++) {
			char c = toProcess[i];
			if(util.isOperator(c)) {
				
			}
			
			
			
			operators.push(toProcess[i]);
		}
		
		
		return null;
	}
}
