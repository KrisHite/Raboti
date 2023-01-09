package timus.timus_1787;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int l = 0;
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            l += x - k;
            if(l < 0){
                l = 0;
            }
        }
        System.out.println(l);

    }
}
