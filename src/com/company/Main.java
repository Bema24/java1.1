package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String something;
	final int NUM = 24;
	String word = "read number ";
	something = word + NUM;
		System.out.println(something);
		if (NUM < 0){
			System.out.println("You have saved a negative number");
		}else if (NUM > 0){
			System.out.println("You have saved a positive number");
		}else{
			System.out.println("You have saved zero");
		}


        String name = "What's your name?";
		Scanner scan = new Scanner(System.in);
		String x1 = scan.nextLine();
		System.out.println("Hello " + x1 + "!");


    }
}
