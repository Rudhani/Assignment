package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Anirudh");
	}
	
	public void studentDept() {
		System.out.println("Mech");
}
	public void studentId() {
		System.out.println("301");
	}
	public static void main(String[] args) {
		Student st=new Student();
		
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.studentDept();
		st.studentId();
		st.studentName();
		st.deptName();
	}
}
