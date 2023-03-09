package com.kbstar.dto;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItemDTO implements List<ItemDTO> {
	private int id;
	private String name;
	private double price;
	private int qt;
	public ItemDTO() {
		
	}
	public ItemDTO(int id, String name, double price, int qt) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qt = qt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", qt=" + qt + "]";
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<ItemDTO> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(ItemDTO e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends ItemDTO> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends ItemDTO> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ItemDTO get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ItemDTO set(int index, ItemDTO element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, ItemDTO element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ItemDTO remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<ItemDTO> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<ItemDTO> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ItemDTO> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
