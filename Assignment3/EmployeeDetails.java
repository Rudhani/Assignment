package Assignment3;

public class EmployeeDetails {
public void EmployeeName(String empName, int empId) {
	System.out.println("Name"+": "+empName);
	
	System.out.println("Emp ID"+": "+empId);
}
public void EmployeeAddress(String empAddress) {
	System.out.println("Address"+": "+empAddress);
}
public void EmployeeMobileNumber(long empNumber) {
	System.out.println("Phone number"+": "+empNumber);
}
public void EmployeeSalary(double empSalary) {
	System.out.println("Salary"+": "+empSalary);
}
public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.EmployeeName("Raj", 1);
	emp.EmployeeAddress("chennai");
	emp.EmployeeMobileNumber(123456789);
	emp.EmployeeSalary(25000);
}
}
