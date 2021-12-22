package com.bridgelabz.employeewageday9;

public class EmployeeWageUC5 {
	
	int monthlyWage() {
		int perDayWage = 0;
		int totalHours = 100;
		EmployeeWageUC4 wage = new EmployeeWageUC4();
		int empWorkHours = wage.empWageUsingSwitch();
		perDayWage = empWorkHours * 20;
		return empWorkHours*20;
	}
}
