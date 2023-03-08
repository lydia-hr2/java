package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.UserDTO;

public interface DAO<K,V> {
	// CRUD(Create, Read, Update, Delete)
	public void insert(V v) throws Exception;
	public UserDTO update(UserDTO user) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception;
	public List<V> select() throws Exception;
	public UserDTO update(String id);
}
