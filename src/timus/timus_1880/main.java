package timus.timus_1880;

import java.io.*;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/timus_1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int mAndL = 2;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        int sizeOne = Integer.parseInt(bufferedReader.readLine());
        String[] stringOne = bufferedReader.readLine().split(" ");
        int sizeTwo = Integer.parseInt(bufferedReader.readLine());
        String[] stringTwo = bufferedReader.readLine().split(" ");
        int sizeThree = Integer.parseInt(bufferedReader.readLine());
        String[] stringThree = bufferedReader.readLine().split(" ");

        int allSize = sizeOne + sizeTwo + sizeThree;
        String[] strings = new String[allSize];

        for(int i = 0, x = 0, y = 0; i < allSize; i++){
            if(i < sizeOne){
                strings[i] = stringOne[i];
                continue;
            }
            if(i < sizeOne + sizeTwo){
                strings[i] = stringTwo[x];
                x++;
                continue;
            }
            strings[i] = stringThree[y];
            y++;
        }
        Arrays.sort(strings);

        int count = 0;

        for (int i = 1; i < strings.length - 1; i++){
            if(strings[i-1].equals(strings[i]) && strings[i].equals(strings[i+1])){
                count++;
            }
        }
        System.out.println(count);


    }
}
