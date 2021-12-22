package com.bridgelabz.employeewageday9;

public class EmployeeWageUC4 {

	int empWageUsingSwitch() {
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int workHours = 0;
		while(totalWorkingDays <= 20 && totalWorkingHours <= 100) {
			EmployeeWageUC3 empHours = new EmployeeWageUC3();
			int wageBuilder = empHours.employeeTypeChecker();
			totalWorkingDays++;
			totalWorkingHours = totalWorkingHours + wageBuilder;
		}
		
		return totalWorkingHours;
	}
}
