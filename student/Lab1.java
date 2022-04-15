package edu.monmouth.student;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1 {

	public static void main(String[] args) {
		try {
			PrintStream newIO = new PrintStream(Lab1Constants.LOGFILENAME);
			System.setOut(newIO);
			System.setErr(newIO);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(Lab1Constants.REDIRECTFAILURE);
		}

		Student students[] = new Student[]{
				new Student(100,18,"John"), 
				new Student(101,19,"Jane"),
				new Student(102,20,"Larry"),
				new Student(103,20,"Karen"),
				new Student(104,21,"Karl")};
		
		//length of the array
		System.out.println("The number of elements in the array students = " + students.length);
		System.out.println();
		
		
		//iterates through the array
		System.out.println("Students array: ");
		for(Student stu: students) {
			System.out.println(stu);
		}
		
		System.out.println();
		
		//finds the youngest and oldest student
		Student youngest = students[0];
		Student oldest = students[0];
		for(Student stu: students) {
			if(stu.getAge()< youngest.getAge())
			{
				youngest = stu;
			}else if(stu.getAge()> youngest.getAge())
			{
				oldest = stu;
			}
		}
		System.out.println("The youngest student= " + youngest);
		System.out.println("The oldest student= "+ oldest);
		System.out.println();
		
		
		
		//changes larry age to 21

		students[2].setAge(21);
		
		// prints students that are less then 20
		System.out.println("Students less then 20: ");
		for(Student stu: students) {
			if(stu.getAge()<20) {
				System.out.println(stu);
			}
		}
		System.out.println();
		
		//creates new array
		Student newStudents[] = new Student[Lab1Constants.ARRAYSIZE];
		
		System.arraycopy(students, 2, newStudents, 0, Lab1Constants.ARRAYSIZE);
		
		System.out.println("newStudents array:");
		for(Student stud: newStudents) {
			System.out.println(stud);
		}
	}

}
