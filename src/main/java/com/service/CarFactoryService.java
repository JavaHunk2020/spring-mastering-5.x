package com.service;

public class CarFactoryService {

	private String name;
	private String address;
	private Car car; // car is reference of Car type
	private Employee employee; // employee is reference of Employee

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CarFactoryService [name=" + name + ", address=" + address + ", car=" + car + ", employee=" + employee
				+ "]";
	}

}
