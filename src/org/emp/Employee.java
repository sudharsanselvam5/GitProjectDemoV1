package org.emp;

public class Employee {
	private void empId() {
		System.out.println("Employee Id is : 1475");
	}
    private void empName() {
System.out.println("Employee Name is : Ram");
	}
    private void empDob() {
    	System.out.println("Employee DOB is : 01/01/2000");
	}
    private void empPhone() {
    	System.out.println("Phone Number is:55655998874");
    }
    private void empEmail() {
		System.out.println("Email is:45678@gmail.com");

	}
    private void empAddress() {
	System.out.println("Address is OMR");

	}
    public static void main(String[] args) {
		Employee data = new Employee();
		data.empId();
		data.empName();
		data.empDob();
		data.empPhone();
		data.empEmail();
		data.empAddress();
	}
}
