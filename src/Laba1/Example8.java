package Laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String day = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input day: ");
        int num = in.nextInt();

        System.out.println("Today is: " + day + " " + num + " " + month);

        in.close();

    }
}
