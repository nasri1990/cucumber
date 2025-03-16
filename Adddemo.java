package com.Package1;

public class Adddemo {

	public static void main(String[] args) {
		/*
		 * trying ti access the add class variable / method that has default access modifier from same package 
		 * */
		Addition ad = new Addition();
		ad.addTowNumbers(10, 10);
		System.out.println(ad.schoolname);

	}

}
