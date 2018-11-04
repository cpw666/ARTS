/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
import java.util.*;
class Solution {
public static int[] twoSum(int[] nums, int target) {
	    
	    Scanner input = new Scanner(System.in);
	    int indice1, indice2;
	    
	    for(int i = 0; i < nums.length-1; i++){
	        
	        for(int j = 0; i < nums.length-1 ; i++){
	            
	            if(i == j)
	                continue;
	            
	            if((nums[i] + nums[j] == target)){
	                indice1 = i;
	                indice2 = j;
	            }    
	            
	        }
	        
	    }
	    
	    return (indice1 + indice2);
	    
	}
}

public class TwoSum {
	public static void main(String[] args) {
		int[] array = {1,4};
		Solution.twoSum(array, 2);
	}
}