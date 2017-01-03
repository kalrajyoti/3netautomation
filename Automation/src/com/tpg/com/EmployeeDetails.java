package com.tpg.com;

public class EmployeeDetails extends Object {

	private String empid;                       //declaration of class attributes//
	private String name;
	private String department;
	private Double salary;
	private String phoneNumber;
	private String address;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void print() 
	{
		System.out.println("EmpID is :" +empid);
	}
	//Override//
	public String toString() {
		return "EmployeeDetails [empid=" + empid + ", name=" + name
				+ ", department=" + department + ", salary=" + salary
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	public static void main (String[] args) 
	{
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmpid("50");
		emp.print();
		System.out.println(emp);   

	}

}




