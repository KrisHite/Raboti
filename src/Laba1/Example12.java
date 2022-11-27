package Laba1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?:");
        int age = in.nextInt();
        int year = 2022 - age;
        System.out.println("You were born in " + year);
        in.close();
    }
}
