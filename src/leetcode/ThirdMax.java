package leetcode;

import java.util.Arrays;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-3];
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};

        int a = new ThirdMax().thirdMax(nums);
        System.out.println(a);
    }
}

