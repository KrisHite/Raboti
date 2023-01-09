package timus.timus_1910;

import java.io.*;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/timus_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int mAndL = 2;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        int[] intsAfter = new int[size - 2];
        for(int i = 0; i < intsAfter.length; i++){
            intsAfter[i] = Integer.parseInt(strings[i]) + Integer.parseInt(strings[i+1]) +
                    Integer.parseInt(strings[i+2]);

        }
        int[] ints = Arrays.copyOf(intsAfter, intsAfter.length);
        Arrays.sort(intsAfter);

        int first = intsAfter[intsAfter.length - 1];

        for(int i = 0; i < intsAfter.length; i++){
            if(ints[i] == first){
                out.println(first + " " + (i + 2));
                break;
            }

        }
out.flush();
    }
}
