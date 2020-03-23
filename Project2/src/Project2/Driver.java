package Project2;

public class Driver {

	
	public static void main(String[] args) {
		Stack<Integer> input =  new Stack<Integer>();
		input.push(200000);
		input.push(2);
		input.push(4);
		input.push(1);
		input.push(100);
		input.push(0);
		input.push(-2);
		input.push(2000);
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Node<Integer> next;
		while(input.peek() != null) {
			next = input.pop();
				while(s2.peek() != null) {
					if(next.getData() > s2.peek().getData()) {
						s1.push(s2.pop().getData());
					} else {
						break;
					}
				}
				s2.push(next.getData());
				while(s1.peek() != null) {
					s2.push(s1.pop().getData());
				}
		}
		
		while(s2.peek() != null) {
			System.out.println(s2.pop().toString());
		}
	}
}
