package Laba3;

public class Example27 {
    public static void main(String[] args) {
        int sizeArr = 10;// Переменная задающая размер массива
        int[] ABC = new int[sizeArr];
        ABC[0] = 97;
        for(int k = 1; k < ABC.length; k++){
            ABC[k] = ABC[k-1] + 2;
        }
        for(int k = 0; k < ABC.length; k++){
            System.out.print((char)ABC[k] + " ");
        }
        System.out.println("");
        for(int k = (ABC.length - 1); k >= 0; k--){
            System.out.print((char)ABC[k] + " ");
        }
    }
}
//        7. Напишите программу, в которой создается одномерный
//        символьный массив из 10 элементов. Массив заполняется буквами «через
//        одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//        ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//        порядке. Размер массива задается переменной.