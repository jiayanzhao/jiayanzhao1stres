package javaGit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FourSum {
	
	public static void main(String[] args) {
		FourSum fs = new FourSum();
		Long start  = new Date().getTime();
		List<List<Integer>> list = fs.fourSum(new int[]{}, 1);
		Long end = new Date().getTime();
		System.out.println("运行共耗时"+(end-start)+"ms");
		System.out.println(list.toString());
	}

	  public List<List<Integer>> fourSum(int[] nums, int target) {
		   List<List<Integer>> results = new ArrayList<>();
		     int len = nums.length;
		     if(nums == null || len<4)return results;
		     Arrays.sort(nums);
		     for(int i=0;i<len-3;i++){
		    	 if(i>0 && nums[i]==nums[i-1])continue;
		     	for(int j=i+1;j<len-2;j++){
		     		if(j>i+1 && nums[j]==nums[j-1])continue;
		     		int bg=j+1,end=len-1;
		     		while(bg<end){
		     			int sumtem = nums[i]+nums[j]+nums[bg]+nums[end];
		     			if(sumtem-target==0){
		     				List<Integer> result = new ArrayList<Integer>();
		     				result.add(nums[i]);
		     				result.add(nums[j]);
		     				result.add(nums[bg]);
		     				result.add(nums[end]);
		     				results.add(result);
		     				while(bg<end && nums[bg]==nums[bg+1])bg++;
		     				while(bg<end && nums[end]==nums[end-1])end--;
		     				bg++;end--;
		     			}else if(sumtem-target>0){
		     				end--;
		     			}else if(sumtem-target<0){
		                    bg++;
		     			}
		     		}
		     	}
		     }
		     
		     return results;
		    }
}
