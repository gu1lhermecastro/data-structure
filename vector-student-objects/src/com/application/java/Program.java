package com.application.java;

import java.util.Scanner;

import com.entities.java.Student;
import com.entities.java.StudentClass;

public class Program {
	final static int MAX_STUDENT = 3; 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentClass studentClass = new StudentClass();
		
		for(int i=0; i<MAX_STUDENT; i++) {
			Student student = new Student();
			System.out.print("\nEnter name student: ");
			student.name = scanner.next();
			System.out.print("Enter registration student: ");
			student.registration = scanner.next();
			
			studentClass.studentList[i] = student;
		}
		
		for(int i=0; i<MAX_STUDENT; i++) {
			System.out.print("\nName: "
					+ studentClass.studentList[i].name);
			System.out.print(", Registration: "
					+ studentClass.studentList[i].registration);
		}
	}
}
