package com.Department.Main;

import com.Department.model.AdminDepartment;
import com.Department.model.HRDepartment;
import com.Department.model.TechDepartment;

public class Main {
	public static void main(String args[]) {
		AdminDepartment ad=new AdminDepartment();
		System.out.println("Welcome to "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		HRDepartment hr=new HRDepartment();
		System.out.println("\n"+"Welcome to "+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		
		
		TechDepartment tecdep= new TechDepartment();
		System.out.println("\n\n"+"Welcome to "+ tecdep.departmentName());
		System.out.println(tecdep.getTodaysWork());
		System.out.println(tecdep.getWorkDeadline());
		System.out.println(tecdep.getTechStackInformation());
		System.out.println(tecdep.isTodayAHoliday());
	}
}
