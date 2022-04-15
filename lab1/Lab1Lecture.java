package edu.monmouth.lab1;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.monmouth.employee.*;

public class Lab1Lecture {
    public static void main(String[] args) {
	// direct standard out & err to Lab1Lecture.txt
		final String LOGFILENAME = "C:\\Users\\dlawr\\eclipse-workspace\\Cs-205L\\src\\edu\\monmouth\\lab1\\Lab1Lecture1.txt";
		
		try {    
	        PrintStream stout = new PrintStream(LOGFILENAME); 
	        System.setOut(stout); 
	        System.setErr(stout); 
		} catch(FileNotFoundException ioe) { 
	        System.err.println("Cannot redirect stderr and stdout " + ioe.getMessage()); 
	        ioe.printStackTrace(); 
	        System.exit(-1); 
	} 
	// declare a List that stores Employee objects in a LinkedList
	    List<Employee> employeelist = new LinkedList<Employee>();
	    
    	// construct a SalaryEmployee with a yearly salary of $30,000
    	SalaryEmployee salaryEmployee1 = new SalaryEmployee(30000);
    	
    	// construct a SalaryEmployee with a yearly salary of $35,000
    	SalaryEmployee salaryEmployee2 = new SalaryEmployee(35000);
    	
    	// construct a PieceEmployee that gets paid $60 per piece made
    	PieceEmployee pieceEmployee1 = new PieceEmployee(60);
    	// set the number of pieces made this month to 2,000
    	pieceEmployee1.setPiecesMade(2000);
    	
    	// construct a PieceEmployee that gets paid $40 per piece made
    	PieceEmployee pieceEmployee2 = new PieceEmployee(40);
    	// set the number of pieces made this month to 3,500
    	pieceEmployee2.setPiecesMade(3500);
    	
    	// construct a SalaryEmployee with a yearly salary of $100,000
    	SalaryEmployee salaryEmployee3 = new SalaryEmployee(100000);
    	
    	// construct a SalesEmployee with a yearly base of $60,000
    	SalesEmployee salesEmployee = new SalesEmployee(60000);
    	// set this month's commission to $30,000
    	salesEmployee.setCommission(30000);
    	
    	// add these Employees to the list
    	employeelist.add(salaryEmployee1);
    	employeelist.add(salaryEmployee2);
    	employeelist.add(pieceEmployee1);
    	employeelist.add(pieceEmployee2);
    	employeelist.add(salaryEmployee3);
    	employeelist.add(salesEmployee);
    	
	System.out.println("Iterating forward through list");
	// using an Iterator, iterate forward thru the list, printing each Employee's attributes
	
	
	
	Iterator<Employee> empIterator = employeelist.iterator();
	while(empIterator.hasNext()) {
		System.out.println(empIterator.next());
	}
	
	System.out.println("Iterating forward here is each monthlyPay");
	// using an Iterator, iterate thru the list, printing each Employee's monthly pay

	for(Employee val :employeelist) {
		System.out.println(val.getMonthlyPay());
	}
	// remove salaryEmployee1 from the list
	employeelist.remove(salaryEmployee1);
	System.out.println("Iterating forward after removal");
	// using an Iterator, iterate thru the list, printing each Employee's attributes
	for(Employee val :employeelist) {
		System.out.println(val);
	}
	// declare an array of references to Employee objects
	// sized to the number of Employee objects in the List
		Employee[] employArray = new Employee[employeelist.size()];
	// using a List method, transfer the List to the array
		employeelist.toArray(employArray);
		
		
	System.out.println("Contents of array");	
	// iterate thru the array, printing out each Employee's attributes
		for(Employee val :employArray) {
			System.out.println(val);
		}
	
    }

}
