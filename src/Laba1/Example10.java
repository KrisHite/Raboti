package Laba1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Year of birth:");
        int year = in.nextInt();
        int age = 2022 - year;
        System.out.println("You are "+ age + " years old.");
        in.close();
    }
}
