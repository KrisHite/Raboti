package Laba6.Example51;

public class myClass {
    public static Integer[] Arr(Integer[] arr, int num){

        if(num > arr.length){
            Integer[] result = arr.clone();
            return result;
        }else {
            Integer[] newArr = new Integer[num];
            for(int i = 0; i < newArr.length; i++){
                newArr[i] = arr[i];
            }
            Integer[] result = newArr.clone();
            return result;
        }
    }
}
