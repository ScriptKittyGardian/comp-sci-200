package Project2;

public class Operator implements EquationPart, Comparable<Operator> {

	private char op;
	
	public Operator(char c) {
		op = c;
	}
	
	public int performOperation(int num1,int num2) {
		switch(op) {
		
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		case '%':
			return num1 % num2;
		case '^':
			return num1 ^ num2;
		}
			
		
		return 0;
	}
	
	public int getPriority() {
		if(op == '+' || op == '-') {
			return 0;
		}
		
		if(op == '/' || op == '*' || op == '%') {
			return 1;
		}
		if(op == '^') {
			return 2;
		}
		return -1;
	}
	
	public char getOp() {
		return op;
	}
	
	@Override
	public int compareTo(Operator o) {
		char otherOp = o.getOp();
		
		if(getPriority() == o.getPriority()) {
			if(op == '/' || op == '-' || op == '%' || op == '^') {
				return 1;
			} else {
				return -1;
			}
		}
		
		if(getPriority() < o.getPriority()) {
			return -1;
		} else {
			return 1;
		}
		
	}

	
	
	
}
