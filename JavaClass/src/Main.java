import java.util.Scanner;
package com.company;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Scanner inputTxt = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		Scanner inputDouble = new Scanner(System.in);
		
		s1.setName(inputTxt.nextLine());
		s1.setGradYear(inputNum.nextInt());
		s1.setGPA(inputDouble.nextDouble());
		
		System.out.println(s1.getName() + " " + s1.getGradYear() + " " + s1.getGPA());
	}

}
