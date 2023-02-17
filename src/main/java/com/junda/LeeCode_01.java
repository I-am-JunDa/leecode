package com.junda;

import java.util.HashMap;
import java.util.Map;

public class LeeCode_01 {


    public static void main(String[] args) {
        int[] arrayNum = new int[]{1, 2, 3, 4, 5, 6};
        int target = 10;
        for (int anInt : twoSum(arrayNum, target)) {
            System.out.println("twoSum = " + anInt);
        }
        for (int anInt : twoSumPlus(arrayNum, target)) {
            System.out.println("twoSumPlus = " + anInt);
        }
    }

    /**
     * 我写的
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{i, numMap.get(target - nums[i])};
            }
        }
        return new int[0];
    }

    /**
     * 官方优化版本
     */
    public static int[] twoSumPlus(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

}
