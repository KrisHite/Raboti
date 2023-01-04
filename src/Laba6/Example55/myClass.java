package Laba6.Example55;

import java.util.Arrays;

public class myClass {

    public static int[] TwoNums(int... nums){
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int[] minMax = new int[2];
        minMax[0] = nums[0];
        minMax[1] = nums[nums.length - 1];
        return minMax;
    }
}
