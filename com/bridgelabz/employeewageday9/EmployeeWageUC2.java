package com.bridgelabz.employeewageday9;

public class EmployeeWageUC2 {
	
	int dailyWage() {
		int attendance;
		EmployeeWageUC1 attendanceCheck = new EmployeeWageUC1();
		int presence = attendanceCheck.presenceOfEmployee();
		if(presence == 1) {
			attendance = 1;
		}else {
			attendance = 0;
		}
		return attendance;
	}
}
