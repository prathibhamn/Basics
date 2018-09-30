package java.sample;


import java.lang.String;
import java.lang.System;

public class StringSwitchDemoLang {
	
	com.basics.unit2.Basics1 lBasics1= new com.basics.unit2.Basics1();
	
	/**
	 * 
	 * @param month
	 * @return
	 */
	public static int getMonthNumber(String month) {

    int monthNumber = 0;

    if (month == null) {
        return monthNumber;
    }

    switch (month) {
        case "january":
            monthNumber = 1;
            break;
        case "february":
            monthNumber = 2;
            break;
        case "march":
            monthNumber = 3;
            break;
        case "april":
            monthNumber = 4;
            break;
        case "may":
            monthNumber = 5;
            break;
        case "june":
            monthNumber = 6;
            break;
        case "july":
            monthNumber = 7;
            break;
        case "august":
            monthNumber = 8;
            break;
        case "september":
            monthNumber = 9;
            break;
        case "october":
            monthNumber = 10;
            break;
        case "november":
            monthNumber = 11;
            break;
        case "december":
            monthNumber = 12;
            break;
        default: 
            monthNumber = 0;
            break;
    }

    return monthNumber;
}

public static void main(String[] args) {

    String month = "August";

    int returnedMonthNumber =
        StringSwitchDemoLang.getMonthNumber(month);

    if (returnedMonthNumber == 0) {
        System.out.println("Invalid month");
    } else {
        System.out.println(returnedMonthNumber);
    }
}

}
