package Laba6.Example52;

public class myClass {
   public static Integer[] charToInt(char[] charArray){
       Integer[] result = new Integer[charArray.length];
       for(int i = 0; i < result.length; i++){
           result[i] = (int)charArray[i];
       }
       return result;
   }
}
