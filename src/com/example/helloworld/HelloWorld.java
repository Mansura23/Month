package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("January");

        } else if (a == 2) {
            System.out.println("fevral");
        } else if (a == 3) {
            System.out.println("Mart");
        } else if (a == 4) {
            System.out.println("April");
        } else if (a == 5) {
            System.out.println("May");
        } else if (a == 6) {
            System.out.println("June");
        } else if (a == 7) {
            System.out.println("Jule");
        } else if (a == 8) {
            System.out.println("August");
        } else if (a == 9) {
            System.out.println("september");
        } else if (a == 10) {
            System.out.println("Oktember");
        } else if (a == 11) {
            System.out.println("November");
        } else if (a == 12) {
            System.out.println("December");
        } else {
            System.out.println("Nothing found");
        }


    }
}
