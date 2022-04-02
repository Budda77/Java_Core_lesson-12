package ua.lviv.homework.myarray;

import java.util.Arrays;

public class MyArrayList <T>{
	
	private static final int CAPACITY = 16;
	private int size =0;
	private Object [] elements;
	
	public MyArrayList() {
		super();
		elements = new Object [CAPACITY];
	}
	
	public MyArrayList(int size) {
		super();
		elements = new Object[size];
	}
	
	public void add(T item) {
		
		if(size == elements.length -1) {
			
			resize(elements.length * 2);
					   
		}
		elements [size++] = item;
	}
	
	public void remove(int id) {
		if(size >= id) {
		int pointer = size;
		
			for(int i = id; id < pointer; i++) {	

				elements[i] = elements[i+1];	
				
				pointer--;
			}
			size--;
		} else {
			throw new IllegalArgumentException("The index value must be smaler then array length.");
		}
			if(elements.length > CAPACITY && size < elements.length / 2) {
				resize(elements.length / 2);
			}
	}
	
	private void resize(int newLength) {
		
		Object [] array = new Object[newLength];
		
		System.arraycopy(elements, 0, array, 0, size);
		
		elements = array;		   
		
	}
	
	
	  public int size() {
	      return size;
	   }

	@Override
	public String toString() {
		return "MyArrayList [elements=" + Arrays.toString(elements) + "]";
	}
	  
	  
	  

}
