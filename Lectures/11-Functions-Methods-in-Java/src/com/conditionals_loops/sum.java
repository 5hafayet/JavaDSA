package com.conditionals_loops;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is "+sum);
    }
}
