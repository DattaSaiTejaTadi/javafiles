package com.SpringDemo.practice;

public class Bean1 {
	private String ename;
	private String esalary;
	private String ejobDescription;
	public Bean1() {

	}
	public Bean1(String ename, String esalary, String ejobDescription) {
		this.ename = ename;
		this.esalary = esalary;
		this.ejobDescription = ejobDescription;
	}

	@Override
	public String toString() {
		return "Bean1 [ename=" + ename + ", esalary=" + esalary + ", ejobDescription=" + ejobDescription + "]";
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsalary() {
		return esalary;
	}
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}
	public String getEjobDescription() {
		return ejobDescription;
	}
	public void setEjobDescription(String ejobDescription) {
		this.ejobDescription = ejobDescription;
	}


}
