package leetCode.eight.twentysix;

public class ClimbingStairs_70 {

	public static void main(String[] args){
		System.out.println(climbStairs(44));
	}
	   public static int climbStairs(int n) {
	        if(n==1)return 1;
	        if(n==2)return 2;
	        return climbStairs(n-1)+climbStairs(n-2);
	   }
}
