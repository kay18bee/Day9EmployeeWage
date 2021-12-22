package com.bridgelabz.employeewageday9;

public class EmployeeWageUC7 {

	private String company;
    private int empRatePerHr;
    private int numOfWorkingDays;
    private int maxHrsPerMonth;
    
    void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
        System.out.println("For " + company);
        totalEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth);
    }
    
    
	 void totalEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
	        int totalWorkingDay = 1;
	        int totalWorkingHours = 0;
	        int regularity = 0;

	        int day = 1;
	        while (totalWorkingDay <= numOfWorkingDays && totalWorkingHours < maxHrsPerMonth) {
	            EmployeeWageUC3 wageBuilder = new EmployeeWageUC3();
	            int empHours = wageBuilder.employeeTypeChecker();
	            if (empHours > 0){
	                totalWorkingDay++;
	    			totalWorkingHours = totalWorkingHours + empHours;
	            }
	        }
	        System.out.println("Total Employee Hours are " + totalWorkingHours);
	        int totalWage =  totalWorkingHours * empRatePerHr ;
	        System.out.println("Total Wage for " + company + " is " + totalWage + "\n");
	    }
	
}
