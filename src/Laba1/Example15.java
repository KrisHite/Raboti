package Laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = in.nextInt();
        System.out.println("Input first number:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + diff);
        in.close();
    }
}
