package com.bridgelabz;

public class WageComputation {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee wage computation program");
		
		 double empWage = (int) Math.floor(Math.random() * 10) % 2;   
	        if (empWage == 1)
	        {
	            System.out.println("Employee is Present");
	        } 
	        else {
	            System.out.println("Employee is Absent");
	        }
	}

}
