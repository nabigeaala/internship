package map;

import linkedList.LinkedList;

public class MapImp<K, V> implements Map<K, V>{
    
	//initial capacity is 20
	private final int SIZE= 30;
	private LinkedList<Node<K, V>> arr[];
	
	public MapImp(){
		
		//initialize the array of linkedlist
		for(int i=0; i<SIZE; i++) {
			arr[i]= new LinkedList<>();	
		}		
	}
	
	@Override
	public V get(K k) {
		// TODO Auto-generated method stub
		
		int bucketNumber= generateBucketNumberByHashCode(k);
		
		if(arr[bucketNumber]== null) {
			return null;
		}
		LinkedList<Node<K,V>> temp= arr[bucketNumber];
		
		while
		
		
	}

	@Override
	public void add(K k, V v) {
		// TODO Auto-generated method stub
		int bucketNuber= generateBucketNumberByHashCode(k);
		
		if(arr[bucketNumber]== null) {
			
		}
		
	}

	@Override
	public V delete(K k) {
		// TODO Auto-generated method stub
		return null;
	}
    
	public int generateBucketNumberByHashCode(K k) {
		return k.hashCode()% SIZE;
	}
	
}
