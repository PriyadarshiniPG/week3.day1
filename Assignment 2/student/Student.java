package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Priya PG");
	}

	public void studentDept() {
		System.out.println("EEE");
	}

	public void studentId() {
		System.out.println(123);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
