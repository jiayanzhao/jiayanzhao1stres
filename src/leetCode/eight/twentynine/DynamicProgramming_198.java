package leetCode.eight.twentynine;

public class DynamicProgramming_198 {

    public int rob(int[] nums) {
        int index0 = 0,index1 = 0,tem;
        for(int i=0;i<nums.length;i++){
        	tem = index0;
            index0 = Math.max(index0,index1);//\
            index1 = tem+nums[i];
            tem = 0;
        }
        return Math.max(index0, index1);
    }
}
