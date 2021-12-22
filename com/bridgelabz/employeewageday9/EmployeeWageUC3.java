package com.bridgelabz.employeewageday9;

import java.util.Random;

public class EmployeeWageUC3 {
	
	int employeeTypeChecker() {
		int empHours = 0;
		EmployeeWageUC2 fullTimeWage = new EmployeeWageUC2();
		int attendance = fullTimeWage.dailyWage();
		if(attendance == 1) {
			Random random = new Random();
			int empTypeChecker = random.nextInt(2);
			switch(empTypeChecker) {
			case 0: 
				empHours = 8;
				break;
			case 1:
				empHours = 4;
				break;
			}
		}else {
			empHours = 0;
		}
		return empHours;
	}
}
