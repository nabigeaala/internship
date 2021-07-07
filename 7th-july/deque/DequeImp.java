package deque;

import linkedList.LinkedList;

public class DequeImp<T>  implements Deque<T> {

	LinkedList<T> list = new LinkedList<>();

	@Override
	public void insertFront(T t) {
		
		list.insertAtBeg(t);
	}

	@Override
	public void insertBack(T t) {
		
		list.insertAtLast( t);
		
	}

	@Override
	public T deleteFront() {
		return list.deleteAtBeg();
	}

	@Override
	public T deleteBack() {
		return list.deleteAtLast();
	}

	@Override
	public void print() {
	    
	   list.print();
		
	}
	
	

}
