package leetCode.eight.twentytwo;

import java.util.Arrays;

public class TwoSumII_Inputarrayissorted_167 {

	public static void main(String[] args) {
		TwoSumII_Inputarrayissorted_167 ti1 = new TwoSumII_Inputarrayissorted_167();
		int[] res = ti1.twoSum(new int[]{0,0,3,4},0);
		System.out.println(Arrays.toString(res));
	}
    public int[] twoSum(int[] numbers, int target) {
    	 int[] res = new int[2];
         if(numbers.length<2) return null;
         int ni,nj;
         for(int i=0,j=numbers.length-1;i<j;){
         	ni = numbers[i];
         	nj = numbers[j];
         	if(ni+nj==target){
         		res[0] = i+1;
         		res[1] = j+1;
         		break;
         	}else if(ni+nj>target){
         	//	j--;
         		while(i<j && numbers[j]==numbers[j-1]) j--;//验证过不行的数，才可以放心大胆的 跳过
         		j--;
         	}else{
         	//	i++;
         		while(i<j && numbers[i]==numbers[i+1]) i++;
         		i++;
         	}
         	//while(i<j && numbers[i]==numbers[i+1]) i++;
         }
         return res;
        
    }
}
