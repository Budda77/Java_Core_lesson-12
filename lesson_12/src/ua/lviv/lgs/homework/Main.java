/*
 * LOGOS It Academy test file
 * 
 * */

package ua.lviv.lgs.homework;

/**
 * @since java 1.8
 * @author Oleksandr
 * @version 1.1
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @param input parameters is Object
		 * @exception no one
		 * */
		
		List <Auto> list = new ArrayList<>();
		
		
		
		for(int i = 0; i < getRandomValue(5,100); i++ ) {
			
			list.add(new Auto(getRandomValue(60,125), getRandomValue(1954,2022), new Engine(getRandomCylinders(4,12)), 
					new Wheels(getRandomValue(13, 15), getRandomFabricWheel(getRandomValue(0,4)))));
		}
		System.out.println(list.size());
		for (Auto auto : list) {
			System.out.println(auto);
		}
		
	}
	


	/** Methods of generating random values */
	
	public static int getRandomValue(int min, int max) {
		
		if(min >= max) {
			throw new IllegalArgumentException("min value must be smaler then max value");
		}
		
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
	
public static int getRandomCylinders(int min, int max) {
		
		if(min >= max) {
			throw new IllegalArgumentException("min value must be smaler then max value");
		}
		
		Random r = new Random();
		int tmp = r.nextInt(max - min + 1) + min;
		
		if(tmp % 2 == 0) {
			return r.nextInt(max - min + 1) + min;
		} else {
			return getRandomCylinders(min, max);
		}
	}


	public static String getRandomFabricWheel(int id) {
		
		String [] fabric = {"thermovinyl", "alcantara", "leather", "wood", "imitation leather"};
		
		String material = fabric[id];
		
		return material;
	}
	
	

}
