package com.greatLearning.GradedCoding.Assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Admin department
		AdminDepartment admin = new AdminDepartment();
		
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		admin.isTodayAHoliday();
		System.out.println();
		
		//Hr department
		HrDepartment hr = new HrDepartment();
		
		hr.departmentName();
		hr.doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		System.out.println();
		
		// Tech department
		TechDepartment tech = new TechDepartment();
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
		tech.isTodayAHoliday();
		System.out.println();
		
		
		
		
		
		

	}

}
