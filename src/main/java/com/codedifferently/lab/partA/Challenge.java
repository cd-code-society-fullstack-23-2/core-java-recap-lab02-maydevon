package com.codedifferently.lab.partA;

public class Challenge {

    public int[] multiplesOfTens(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                nums[i] *= 10;
            }
        }
        return nums;
    }
}
