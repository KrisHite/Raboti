package Laba1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name:");
        String name = in.nextLine();
        System.out.println("Input year of birth:");
        int year = in.nextInt();
        int age = 2022 - year;
        System.out.println(name + " " + age + " age.S");
        in.close();
    }
}
