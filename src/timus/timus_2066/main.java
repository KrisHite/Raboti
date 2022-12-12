package timus.timus_2066;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result;
        result = Math.min(a - b - c, Math.min(a - b * c, a * b - c));
        System.out.println(result);
    }
}
