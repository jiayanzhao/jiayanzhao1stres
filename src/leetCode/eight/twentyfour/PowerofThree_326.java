package leetCode.eight.twentyfour;

public class PowerofThree_326 {

	public static void main(String[] args) {
		PowerofThree_326 p3 = new PowerofThree_326();
		System.out.println(p3.isPowerOfThree(21));
	}
   public boolean isPowerOfThree(int n) {
	   if(n==1) return true;
        if(n%3==0&&((n%10==3||n%10==7)&&n%4==3||(n%10==9||n%10==1)&&n%4==1))return true;else return false;
    }
}
