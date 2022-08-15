package com.bridgelabz;

public class WageComputation {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee wage computation program");
		
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HRS= 20;
		int empHrs = 0;
		int empRate = 0;
		
		 double empWage = (int) Math.floor(Math.random() * 10) % 2;   
	        if (empWage == IS_FULL_TIME)
	        	empHrs = 8;
	        else
	        	empHrs = 0;
	        empRate = empHrs * EMP_RATE_PER_HRS;
	        System.out.println("Emp wage " + empRate);
	}

}
