package linkedList;

public class LinkedList<T>{
    
	private Node<T> head= null;
	
	public void insertAtBeg(T t) {
		Node<T> node = new Node<>();
		node.val= t;
		node.next= head;
		head= node;
	}
	
	public void insertAtLast(T t) {
		Node<T> temp= head;
		Node<T> node = new Node<>();
		node.val= t;
		
		if(head== null) {
			head= node;
			return;
		}
		
		while(temp.next != null) {
			temp= temp.next;
		}
		temp.next= node;
		
		
	}
	
	public T deleteAtLast() {
		 Node<T> temp = head;
		 if(head==null) {
			 return null;
		 }
		 else if(head.next==null){
			 head= null;
			 return temp.val;
		 }
		 while( temp.next.next!= null) {
			 temp= temp.next;
		 }
		 temp.next= null;
		 return temp.val;
		 
	}
	
	public T deleteAtBeg() {
		Node<T> temp = head;
		if(head == null) {
			return null;
		}
		else {
			head= head.next;
		    return	temp.val;
		}
	}

	public void print() {
		
		Node<T> temp= head;
		while(temp!= null) {
			System.out.println(temp.val);
			temp= temp.next;
		}

    }
	
	public boolean hasNext() {
		
	}
	
}	
