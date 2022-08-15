package com.bridgelabz;

public class WageComputation {
 	public static final int IS_PART_TIME = 1;
   	public static final int IS_FULL_TIME = 2;
   	public static final int EMP_RATE_PER_HRS= 20;
   	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee wage computation program");
		
		int empHrs = 0;
		int empRate = 0;
		
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
	        empRate = empHrs * EMP_RATE_PER_HRS;
	        System.out.println("Emp wage " + empRate);
	}

}
