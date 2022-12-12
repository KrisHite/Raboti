package timus.timus_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) {
        String inputFileName = "src/timus_2100/Input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int mAndL = 2;
        try{
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numFriends = 0;
            int numPairs = 0;

            while((readLine = bufferedReader.readLine()) != null){
                if(numFriends == 0){
                    numFriends = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+")){
                    numPairs++;
                }
            }
            int result;
            int guests = mAndL + numFriends + numPairs;
            if(guests == 13){
                result = (guests * 100) + 100;
            }
            else {
                result = guests * 100;
            }

            System.out.println(result);
        } catch (IOException exception){
            exception.printStackTrace();
        }

    }
}

//        Исходные данные
//        В первой строке вводится одно целое число n — количество друзей Маршалла и Лили,
//        которым они отослали приглашение (1 ≤ n ≤ 20).
//        Затем в n строках описываются ответы на приглашения.
//        Каждый ответ имеет вид name[+one]. Это имя приглашённого друга и +one, если друг отметил этот вариант.
//        Гарантируется, что длина каждого имени не превосходит 20,
//        и каждое имя состоит только из букв латинского алфавита.

//        Результат
//        Выведите одно целое число — стоимость обеда в долларах.