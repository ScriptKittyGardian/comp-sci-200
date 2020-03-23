package Project2;

public class Stack<E> {

	private Node<E> head;
	
	
	public Node<E> pop() {
		Node<E> toReturn = head;
		if(head != null) {
			head = head.getNext();
		}
		return toReturn;
	}
	
	public void push(E data) {
		Node<E> n = new Node<E>(data);
		n.setNext(head);
		head = n;
	}
	
	public Node<E> peek() {
		return head;
	}
	
}
