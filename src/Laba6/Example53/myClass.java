package Laba6.Example53;

public class myClass {
    public static float MidNumber(int[] nums){
        float result = 0;
        for(int i = 0; i < nums.length; i++){
            result += nums[i];
        }
        result /= nums.length;
        return result;
    }
}
