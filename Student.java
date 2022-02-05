package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	public void studentName() {
		System.out.println("Student name is: T.Sushmitha");
	}
	public void studentDept() {
		System.out.println("Student Dept name is: ECE");
	}
	public void studentId() {
		System.out.println("Student Id is: 245");
	}
	public static void main(String[]args) {
		College coll = new College();
		Department dept = new Department();
		Student stud = new Student();
		coll.collegeCode();
		coll.collegeName();
		coll.collegeRank();
		dept.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}

}
