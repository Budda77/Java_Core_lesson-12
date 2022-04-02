/**
 * Copyright (c) 2022. All rights reserved.
 * LOGOS It Academy Home Work for lesson 12
 * 
 * */


package ua.lviv.lgs.homeworkenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		
		/**
		 * @param input parameters is String and int
		 * @exception WrongInputConsoleParametersException
		 * 
		 * */
		
		
		/* The first option to initialize Enum in ArrayList*/
		
		//List <Month> mon = new ArrayList<>();
		//mon = Arrays.asList(Month.values());
		
		/* The secend option to initialize Enum in ArrayList*/
		List <Month> mon = Arrays.asList(Month.values());
		
		Scanner sc = new Scanner(System.in);
		String message = "The input data is wrong. Please, enter correct data.";
		
		boolean flag = false;
		
		menu();
		int inputNumber = sc.nextInt();
		
		switch(inputNumber) {
		
		case 1: {
			System.out.println("Please, enter month: ");
			String month = inputMonth(); 
			
			flag = arrayOfMonth(mon, month);
			
			if(!flag) {
				throw new WrongInputConsoleParametersException(message);
			}			
			break;
		}
		
		case 2:{
			System.out.println("Please, enter season: ");
			String season = inputMonth(); 
			
			for (Month month : mon) {
				
				if(month.getSeason().name().equals(season)) {
					System.out.println("The season " + month.getSeason() + " include " + month.name());	
					flag = true;
				}
			}
				if(!flag) {
				throw new WrongInputConsoleParametersException(message);
			}
			break;
		}
		
		case 3:{
			System.out.println("Please, enter number of days in a month: ");
			int numberOfDays = inputNumberOfDays();
			
			for (Month month : mon) {
				if(month.getNumOfDays() == numberOfDays) {
					System.out.println(month +" has following month: " + month.getNumOfDays());	
					
					flag = true;
				}
			}
			if(!flag) {
				System.out.println("Please, input correct number of days");
			}
			break;
		}
		
		case 4: {
			System.out.println("Please, enter number of days in a month: ");
			int numberOfDays = inputNumberOfDays();
						
			for(Month m: mon) {				
				if(m.getNumOfDays() > numberOfDays) {					
					System.out.println("The following month: " + m.name() + " " + m.numOfDays + " have more days then " + numberOfDays);
					flag = true;						
				} 
			}
			if(!flag) {			
				throw new WrongInputConsoleParametersException(message); 	
			}								
			break;
		}
		
		case 5: {
			
			System.out.println("Please, enter number of days in a month: ");
			int numberOfDays = inputNumberOfDays();

			for(Month m: mon) {
				if(m.getNumOfDays() < numberOfDays && 31 >= numberOfDays) {
					System.out.println("The following month: " + m.name() + " " + m.numOfDays + " have less days then " + numberOfDays);
					flag = true;
				} 
			}	
			if(!flag) {
				throw new WrongInputConsoleParametersException(message);
			}				
			break;
		}
		
		case 6:{
			System.out.println("Please, enter season: ");			
			String season = inputMonth(); 
			
			 flag = monthExist(mon, season);

			 if(flag) {
				 
				 /* method valueOf return value of Enum  */
				 Seasons seasons = Seasons.valueOf(season);
				 
				 /* method value create Enum to array  */
				 Seasons [] s = Seasons.values();
				 
				 /* return index of Enum*/
				 int ordinal = seasons.ordinal();
				 
				 if(ordinal == s.length-1) {
					 ordinal = 0;					 
					 System.out.println("The next season is " + s[ordinal]); 					 
				 }else {
					 
					 System.out.println("The next season is " + s[ordinal + 1]); 
				 }	
			 }		
				if(!flag) {					
					throw new WrongInputConsoleParametersException(message);
				}
				
			break;
		}
		
		case 7:{
			System.out.println("Please, enter season: ");
			
			String seasonData = inputMonth(); 		
			 flag = monthExist(mon, seasonData);

			 if(flag) {		 
				 Seasons season = Seasons.valueOf(seasonData);
				 Seasons [] s = Seasons.values();
				 
				 int ordinal = season.ordinal();
				 
				 if(ordinal == 0) {					 
					 ordinal = s.length-1;					 
					 System.out.println("The previous season is " + s[ordinal]); 
					 
				 }else {
					 
					 System.out.println("The previous season is " + s[ordinal - 1]); 
				 }	
			 }
				if(!flag) {
					
					throw new WrongInputConsoleParametersException(message);
					
				}
			break;
		}
		case 8: {
			System.out.println("The following months have pair number of days: ");

			for(Month m: mon) {			
				if(m.getNumOfDays() % 2 == 0) {					
					System.out.println( m.name() + " " + m.numOfDays);				
				} 
			}					
			break;
		}
		
		case 9: {
			System.out.println("The following months have odd number of days: ");

			for(Month m: mon) {			
				if(m.getNumOfDays() % 2 > 0) {				
					System.out.println( m.name() + " " + m.numOfDays);				
				} 
			}					
			break;
		}
		
		case 10: {
			
			System.out.println("Input month: ");		
			 flag = false;
			
			String month = inputMonth();

			for(Month m: mon) {		
				if(m.name().equals(month)) {				
					if(m.getNumOfDays() % 2 == 0) {						
						System.out.println("The months " + m.name() + " have pair number of days: " + m.numOfDays);
						flag = true;					
					} 
				else {					
						System.out.println("The months " + m.name() + " have odd number of days: " + m.numOfDays);
						flag = true;
					}						
				}					
			}	if(!flag) {
				
				throw new WrongInputConsoleParametersException(message);				
			}				
			break;
		}
				
		}					
	}
	
	private static String inputMonth() {
		
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();
		sc.close();
		return month;
	}	
	
	private static boolean arrayOfMonth(List<Month> mon, String data) {
		boolean flag = false;
		
		for(int i= 0; i < mon.size(); i++) {
			if(mon.get(i).name().equals(data)) {
				
				System.out.println("The inputed month: " + mon.get(i).name() + " is available.");
				
				flag = true;
			}
		}		
		return flag;				
	}
	
	private static int inputNumberOfDays() {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
	private static boolean monthExist(List<Month> mon, String data) {
		boolean flag = false;
		
		for(Month m: mon) {
			if(m.getSeason().name().equals(data)) {	
				flag = true;
			}
		}
		return flag;		
	}
	
	static void menu() {
		System.out.println("Press 1 to check if month is available");
		System.out.println("Press 2 to show all months of season");
		System.out.println("Press 3 to show all months with the same number of days");
		System.out.println("Press 4 to show all months with more days");
		System.out.println("Press 5 to show all months with less days");
		System.out.println("Press 6 to show next season");
		System.out.println("Press 7 to show previous season");
		System.out.println("Press 8 to show month with pair number of days");
		System.out.println("Press 9 to show month with odd number of days");
		System.out.println("Press 10 to show entered month with pair number of days");
	}

}


