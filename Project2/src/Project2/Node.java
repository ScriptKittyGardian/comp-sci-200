package Project2;
public class Node<E> {
	
	E data;
	Node<E> next;
	
	public Node(E data) {
		this.data = data;
	}
	public Node<E> getNext() {
		return next;
	}
	
	public void setNext(Node<E> n) {
		next = n;
	}
	
	public E getData() {
		return data;
	}
	
	public void setData(E d) {
		data = d;
	}
	
	public String toString() {
		return data.toString();
	}
	
}
