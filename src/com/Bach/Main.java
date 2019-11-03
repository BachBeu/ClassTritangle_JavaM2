package com.Bach;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the side2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter the side3: ");
        double side3 = sc.nextDouble();

        Tritangle tritangle = new Tritangle(side1, side2, side3);
        System.out.println(tritangle);
    }
}
