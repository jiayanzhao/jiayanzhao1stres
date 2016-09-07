package leetCode.nine.one;

import java.util.Arrays;

public class NoOneWeek {

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[]{1,1,1,2,2,2,2,3,3,3,3,3,4,4,6}));
	}
/*80. Remove Duplicates from Sorted Array II  QuestionEditorial Solution  My Submissions
Total Accepted: 86275
Total Submissions: 254451
Difficulty: Medium
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.*/
    public static int removeDuplicates(int[] nums) {
    	if (nums.length <= 2)
			return nums.length;
 
		int prev = 1; // point to previous
		int curr = 2; // point to current
 
		while (curr < nums.length) {
			if (nums[curr] == nums[prev] && nums[curr] == nums[prev - 1]) {
				curr++;
			} else {
				prev++;
				nums[prev] = nums[curr];
				curr++;
			}
		}
   //     System.out.println(Arrays.toString(nums));
		return prev + 1;
    	
    }

}
