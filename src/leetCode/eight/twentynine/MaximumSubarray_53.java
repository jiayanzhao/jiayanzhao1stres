package leetCode.eight.twentynine;

public class MaximumSubarray_53 {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{-2}));
	}
    public static int maxSubArray(int[] nums) {
    	   int sum = Integer.MIN_VALUE;//负责保存前n 个数的和
    	   int max = Integer.MIN_VALUE;//负责保存最大的
    	   
    	   for(int i=0;i<nums.length;i++){
    		   sum = sum<0?nums[i]:sum+nums[i];//已知前n个，算第n+1个
    		   if(sum>max) max = sum;
    	   }
    	   return max;
    }
    /*利用动态规划的思想完成，时间复杂度为O(n)。已知0,..,k的最大和以后，0,...k+1的最大和为：
1）若sum[k]>=0,sum[k+1]=sum[k]+A[k+1]。
2）若sum[k]<0,sum[k+1]=A[k+1]。*/
}
