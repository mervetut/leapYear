package com.company;

public class Main {

    public static void main(String[] args) {
	final int year = 4;
	boolean leap = false;

	if (year % 4 == 0)
	    leap = true;
	if (year % 100 == 0)
	    leap = false;
    if (year % 400 == 0)
        leap = true;

    // single if statement version:
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
    	leap = true;

        System.out.println(leap);
    }
}
