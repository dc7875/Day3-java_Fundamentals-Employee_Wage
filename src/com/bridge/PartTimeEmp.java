package com.bridge;

public class PartTimeEmp {
    public static void main(String[] args) {
//        int IS_FULL_TIME = 2;
//        int IS_PART_TIME = 1;
//        int EMPLOYEE_RATE_PER_HOUR = 20;
//        int empHrs = 0;
//        int empWage = 0;
//
//        double empCheck = Math.floor(Math.random() * 10) % 2;
//        if ( empCheck == IS_FULL_TIME )
//            empHrs = 8;
//        else
//            empHrs = 0;
//
//        empWage = empHrs * EMPLOYEE_RATE_PER_HOUR;
//        System.out.println("Employee FullTime Wage " + empWage );
//
//        if( empCheck == IS_PART_TIME )
//            empHrs = 8;
//        else
//            empHrs = 0;
//
//        empWage = empHrs * EMPLOYEE_RATE_PER_HOUR;
//        System.out.println("Employee PartTime Wage " + empWage );

        final int PRESENT_NUMBER_RANGE = 3;
        final int PRESENT = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_HOUR = 8;

        int isPresent = (int) (Math.random() * PRESENT_NUMBER_RANGE);

        int empWage;
        if (isPresent == PRESENT) {
            System.out.println("Employee is present");
            empWage = WAGE_PER_HOUR * WORKING_HOUR;
        } else if (isPresent == PART_TIME) {
            System.out.println("Employee is working part time");
            empWage = WAGE_PER_HOUR * (WORKING_HOUR / 2);
        } else {
            System.out.println("Employee is absent");
            empWage = 0;
        }
        System.out.println("Emp wage : $" + empWage + " USD");

    }
}
