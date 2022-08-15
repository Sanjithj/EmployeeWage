package com.bridgelabz;

public class WageComputation {
 	public static final int IS_PART_TIME = 1;
   	public static final int IS_FULL_TIME = 2;
   	public static final int EMP_RATE_PER_HRS= 20;
   	public static final int NUM_WORKING= 2;
	public static final int MAX_HRS_MONTH = 10;
   	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee wage computation program");
		
		int empHrs = 0;
		int totalempHrs = 0;
		int totalDays = 0;
		
		while(totalempHrs <= MAX_HRS_MONTH && totalDays < NUM_WORKING) {
			totalDays++;
		int empWage = (int) Math.floor(Math.random() * 10) % 2;   
	       switch (empWage) {
	       case IS_PART_TIME:
	    	   empHrs = 4;
	       break;
	       case IS_FULL_TIME:
	        	empHrs = 8;
	       break;
	       default:
	        	empHrs = 0;
	       }
	       
	        totalempHrs += empHrs;
	        System.out.println("days " + totalDays + "emp hrs" + empHrs);
	}		
		int totalempRate = totalempHrs * EMP_RATE_PER_HRS;
			System.out.println("total emp wage" + totalempRate);
}
}
