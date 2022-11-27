package Laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month:");
        String month = in.nextLine();
        System.out.println("Input number of day in a month:");
        int day = in.nextInt();
        System.out.println("In " + month + " " + day + " day.");
        in.close();
    }
}
