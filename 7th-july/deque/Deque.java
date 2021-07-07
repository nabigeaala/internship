package deque;

public interface Deque<T> {
    
	
	void insertBack(T t);
	T deleteFront();
	T deleteBack();
	void insertFront(T t);
	void print();
	
	
}
