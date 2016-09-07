package leetCode.eight.twentynine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.transform.sax.TemplatesHandler;

/**
 * 
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?
 * 
 * 
 * */
public class LongestIncreasingSubsequence_300 {

	public static void main(String[] args) {
		System.out.println(lengOfLIS_find_rewrite(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
	}
    public static int lengthOfLIS(int[] nums) {
         Map<Integer,Integer> map = new HashMap<>();
         if(nums.length==0) return 0;
         if(nums.length==1) return nums[0];
         map.put(nums[0],1);
         for(int i=1;i<nums.length;i++){
        	 int index = 0;
        	 for(Entry<Integer, Integer> tem:map.entrySet()){
        		 if(tem.getKey() < nums[i]){
        			 int num = tem.getValue();
        			//tem.;
        			// map.put(nums[i],num+1);
        			 index++;
        		 }
        	 }
        	 if(index==0) map.put(nums[i], 1);
         }
         int res = 0;
         for(Entry<Integer, Integer> tem:map.entrySet()){
    		if(tem.getValue()>res) res = tem.getValue();
    	 }
         return res;
    }
    
    public static int lengOfLIS_find(int[] nums){
    	  // write your code here
    	 //[10, 2, 5, 3, 7],  
        if(nums==null || nums.length<1) return 0;  
          
        int [] d = new int[nums.length];  
        d[0] = 1;  
        System.out.println(Arrays.toString(d));
        int max = 1;  
        for(int i=1; i<nums.length; i++) {  
            d[i] = 1;  
            for(int j=0; j<i; j++) {  
                if(nums[i] > nums[j]) {  
                    d[i] = Math.max(d[i], d[j]+1);  
                    System.out.println(Arrays.toString(d));
                }  
            }  
            max = Math.max(max, d[i]);  
        }  
        return max;  
        //总结，这道题，
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int lengOfLIS_find_rewrite(int[] nums){
  	  // write your code here//
    	//假设dp[i]代表加入第i个数能构成的最长升序序列长度，我们就是要在dp[0]到dp[i-1]中找到一个最长的升序序列长度，又保证序列尾值nums[j]小于nums[i]
      if(nums==null || nums.length==0) return 0;
      int[] res = new int[nums.length];//用来记录前n个数的最大连续长度。和找左上到右下的最小权的思路一样，要找一个记录过程的！！！
      res[0] = 1;//先把第一个赋1，如果都不赋1，最后要加1。因为默认是0
      int max = 1;
      for(int i=1;i<nums.length;i++){//找到这个数的最大上升序列长度。
    	  res[i] = 1;
    	  for(int j=0;i<j;j++){//走过的每一个，都res都记录的最大的，只需直接跟它比就行//具体的找，跟前一个比就行
    		  if(nums[i]>nums[j]){//判断一下这个数是不是比上一个上升数组的最后一个数大
    			  res[i] = Math.max(res[i], res[j]+1);//前面可能有好几个比较大的，在这要比一下，要取最大的10，11,12,13,14,1,2,3,15
    		  }                                                                         //1, 2,  3, 4, 5,1,2,3, 6要比一下其实没循环一次，这都要变一下，不是一下变到六的 
    	  }
    	  max = Math.max(max, res[i]);//res可能会变小，所以要有一个记录最大的
      }
      return max;
    }
}
