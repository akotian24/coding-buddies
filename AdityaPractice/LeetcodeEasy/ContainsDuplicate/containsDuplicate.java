package AdityaPractice.LeetcodeEasy.ContainsDuplicate;

import java.util.*;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.
 */

public class containsDuplicate {

    public static void main(String[] args) {

        System.out.println(containsNewDuplicate(new int[]{1, 2, 3, 1}));
     }

    public static boolean containsNewDuplicate(int[] nums) {
        
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num : nums){
            if(countMap.containsKey(num)){
                return true;
            }
            countMap.put(num, 1);
        }
        return false;
    }
    
}


