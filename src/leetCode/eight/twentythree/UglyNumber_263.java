package leetCode.eight.twentythree;

public class UglyNumber_263 {

	public static void main(String[] args) {
		UglyNumber_263 u2 = new UglyNumber_263();
		System.out.println(u2.isUgly(1341));
	}
	public boolean isUgly(int num) {
      if(num==0) return false;
      if(num==1) return true;
      
      while(num>=2 && num%2==0) num/=num;
      while(num>=3 && num%3==0) num/=num;
      while(num>=5 && num%5==0) num/=num;
      return 1==num;
   }
}
