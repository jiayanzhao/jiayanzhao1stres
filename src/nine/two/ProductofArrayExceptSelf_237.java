package nine.two;

import java.util.Arrays;

public class ProductofArrayExceptSelf_237 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[]{5,6,7,8,9})));
	}

	public static int[] productExceptSelf(int[] nums) {
          int[] res = new int[nums.length];
          res[nums.length-1] = 1;
          for(int i=nums.length-2;i>=0;i--){
        	  res[i] = nums[i+1] * res[i+1];
          }
          int left = 1;
          for(int i=0;i<nums.length;i++){
               res[i] *= left;
               left *= nums[i];
          }
          return res;
    }
}
