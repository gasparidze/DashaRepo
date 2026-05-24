package org.example.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
//        int[] nums = new int[4];
//        nums[0] = 2;
//        nums[1] = 7;
//        nums[2] = 11;
//        nums[3] = 15;

        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;

        System.out.println(Arrays.toString(twoSum(nums, 6))); // 1 2
    }

    private static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2){
            return null;
        }

        // значение массива -> индекс
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            /**
             * nums[i] + dop = target
             * 2 + 7 = 9
             * dop = target - nums[i]
             * dop = 2
             */
            int dop = target - nums[i];
            if (map.containsKey(dop)){
                return new int[]{map.get(dop), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
