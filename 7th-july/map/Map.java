package map;

public interface Map<K, V> {
     
	V get(K k);
	void add(K k, V v);
	V delete(K k);
	
}
