package leetCode.eight.twentynine;

import java.util.Arrays;

/**
 * 
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 * @author Administrator
 *
 */
public class CountingBits_338 {
    public static void main(String[] args) {
    	System.out.println(3^0);
    	System.out.println(4^0);
    	/*int n = 3;
    	while(n>0){
    		System.out.println(n&1);
    		n = n>>1;
    	}*/
		System.out.println(Arrays.toString(countBits_new(18)));
		System.out.println(Arrays.toString(countBits(1)));
	}
	public static int[] countBits(int num) {//beat 5  best 自己作的
		  int[] res = new int[num+1];
		  if(num==0) return res;
	      res[1] = 1;
	      int mi = 1;
	      int index = 1;
	      for(int i=2;i<=num;i++){
	    	  if((i%2==0 && i/index==2)) {
	    		  mi *= 2;
	    		  res[i]=1;
	    		  index = i;
	    	  }else res[i] = 1+res[i-mi];
	      }
	      return res;
    }
	
	public static boolean iftwopowor(int num){
		int count = 0;
		while(num>0){
		     if((num&1)==1)count++;
		     num = num>>1;
		}
		if(count==1)return true;
		return false;
	}
	
	
	
	
	
	
	
	
	public static int[] countBits_new(int num) {
		if(num==0) return new int[]{0};
	    int[] res = new int[num+1];
	    for(int i=1;i<=num;i++){
	    	if((i-1)%2==0) res[i] = res[i-1]+1;//i位最后一位是1
	    	else{//i位最后一位是0
	    		if(iftwopowor(i))res[i]=1;
	    		else res[i]=res[i-1];
	    	}
	    }
	    return res;
	}
}
