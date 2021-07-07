package ds;

import deque.DequeImp;

public class Main {

	public static void main(String[] args) {
		
		DequeImp<Integer> q= new DequeImp<>();
		
		//q.insertFront(5);
		q.print();
		q.deleteBack();
		q.print();
		/*
		 * System.out.println(); q.insertFront(6); q.print(); System.out.println();
		 * q.insertBack(9); q.print(); System.out.println(); q.deleteBack(); q.print();
		 * System.out.println(); q.deleteFront(); q.print();
		 */
		
	}

}

