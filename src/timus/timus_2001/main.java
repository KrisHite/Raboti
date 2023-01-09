package timus.timus_2001;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aOne = in.nextInt();
        int bOne = in.nextInt();
        int aTwo = in.nextInt();
        int bTwo = in.nextInt();
        int aThree = in.nextInt();
        int bThree = in.nextInt();
        int rasberryTwo = bOne - bTwo;
        int rasberryOne = bThree - rasberryTwo - bTwo;
        System.out.println(rasberryOne + " " + rasberryTwo);
    }
}
