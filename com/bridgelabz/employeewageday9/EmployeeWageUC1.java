package com.bridgelabz.employeewageday9;

import java.util.Random;
	
	public class EmployeeWageUC1 {
		
		int presenceOfEmployee() {
			Random random = new Random();
			int attendance = random.nextInt(2);
			return attendance;
		}
}
