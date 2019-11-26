package com.application.java;

import java.util.Scanner;

import com.entities.java.Student;
import com.entities.java.StudentList;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StudentList list = new StudentList();
		
		for(int i=0; i<3; i++) {
			Student student = new Student();
			System.out.print("Enter name: ");
			student.name = scanner.next();
			System.out.print("Enter registration: ");
			student.registration = scanner.next();

			list.studentList.add(student);
		}
		
		for(Student x: list.studentList) {
			System.out.print("\n" + x.name);
			System.out.print(", " + x.registration);
		}
	}
}
