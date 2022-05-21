package com.employee.Api;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table
public class Employee {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name="E_NAME")
	private String eName;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="DOB")
	private LocalDate dob;
	
	@Column(name="SALARY")
	private Integer salary;
	
	@Column(name="PAYROLLTYPE")
	private String payrollType;
	
	@Column(name="IMAGE")
	private byte[] image;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getPayrollType() {
		return payrollType;
	}

	public void setPayrollType(String payrollType) {
		this.payrollType = payrollType;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	

}
