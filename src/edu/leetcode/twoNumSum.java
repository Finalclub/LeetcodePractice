package edu.common.leetcode;

import java.util.HashMap;

public class twoNumSum {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 16};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }
    static int[] twoSum(int array[], int target)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int lenOfArray = array.length;
        for (int i = 0; i < lenOfArray; i++) {
            if (map.containsKey(array[i]))
            {
                return new int[]{map.get(array[i]), i};
            }else{
                map.put(target - array[i], i);
            }
        }
        return new int[]{};
    }
}
