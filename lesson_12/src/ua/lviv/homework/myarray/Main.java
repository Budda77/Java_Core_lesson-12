

package ua.lviv.homework.myarray;


public class Main {
	public static void main(String[] args) {
		
		MyArrayList <Integer> array = new MyArrayList<>();
		
		int randomSize = 5 + (int)(Math.random() * 50);
		
		for (int i = 0; i < randomSize; i++) {
			array.add(5 + (int)(Math.random() * 100));
		}
		
		System.out.println("initial size: " + array.size());
		System.out.println(array);
	
		array.add(25);
		array.add(38);
		array.add(47);
		array.add(16);
		
	System.out.println("Size after added: " + array.size());
	System.out.println(array);

	
	System.out.println();
	array.remove(20);
	
	System.out.println(array);
	System.out.println("size after remove: " + array.size());
	
	System.out.println();
	System.out.println("Creation of String array\n");
	
	MyArrayList <String> array2 = new MyArrayList<>();
		
	array2.add("11a");
	array2.add("12b");
	array2.add("13v");
	array2.add("14c");
	array2.add("15s");
	array2.add("16e");
	array2.add("17t");
	array2.add("18w");
	array2.add("15r");
	array2.add("16q");
	array2.add("17n");
	array2.add("18l");
	
	System.out.println("Size of array 2 is: " + array2.size());
	System.out.println(array2);

	System.out.println("Creation of Double array\n");
	MyArrayList <Double> array3 = new MyArrayList<>();
	
	array3.add(2.5);
	array3.add(35.58);
	array3.add(46.3);
	array3.add(27.1);
	array3.add(17.2);
	array3.add(94.7);
	array3.add(36.9);
	array3.add(43.7);
	array3.add(23.2);
	array3.add(87.1);
	array3.add(69.5);
	array3.add(14.7);
	
	System.out.println("Size of array 3 is: " + array3.size());
	System.out.println(array3);

	
	
	}

}
