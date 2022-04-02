package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
	
	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList();
		
		list1.add("A");
		list1.add(12);
		list1.add('w');
		list1.add(0.7);
		list1.add(new Person("Karen", 22));
		list1.add("A");
		
		System.out.println(list1);
		
		list1.addFirst("ZZZ");
		System.out.println(list1);
		list1.addLast("ZZZ");
		System.out.println(list1);
		list1.offer("000"); 		// = add
		System.out.println(list1);
		
		list1.poll(); 		// = remove first element
		System.out.println(list1);
		
		System.out.println("remove and retrieve the first element " + list1.pop()); 		
		System.out.println(list1);
		
		
	}

}
