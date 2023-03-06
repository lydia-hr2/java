package com.kbstar.frame;

public interface DAO<K, V> {
	public void register(V v);

	public void delete(K k);

	public void update(V v);

	public void insert(V v);

}
