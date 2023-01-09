package timus.timus_1877;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int codeOne = in.nextInt();
        int codeTwo = in.nextInt();
        if(codeOne%2 == 0 || codeTwo%2 != 0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
