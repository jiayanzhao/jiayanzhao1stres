package leetCode.eight.twentynine;

public class IntegerBreak_343 {

	public static void main(String[] args) {
		System.out.println(integerBreak(57));
		System.out.println(Integer.MAX_VALUE);
	}
	public static int integerBreak(int n) {
        //先找状态和状态转移方程
		//Numn = numn-1(最小的数+1)
		if(n==2) return 1;
		if(n==3) return 2;
        int product = 2;
		for(int i=3;i<=n;i++){
			product = product%2==0?(product/2)*3:(product/3)*4;
		//	if(product%2==0)product = (product/2)*3;
		//	else if(product%3==0) ;
		}
		return product;
    }
}
