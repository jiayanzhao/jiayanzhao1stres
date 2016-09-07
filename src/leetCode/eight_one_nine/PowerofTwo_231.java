package leetCode.eight_one_nine;

import java.util.Date;

public class PowerofTwo_231 {

public static void main(String[] args) {
	PowerofTwo_231 p2 = new PowerofTwo_231();
	Long bg = new Date().getTime();
	boolean res = p2.isPowerOfTwo(1073741825);//1073741824
	Long end = new Date().getTime();
	System.out.println("耗时"+(end-bg)+"ms");
	System.out.println(res);
}
    public boolean isPowerOfTwo(int n) {
    	if(n==1)return true;
    	int tem = 1;
         while(tem<n){
        	 tem = tem*2;
        	 System.out.println(tem);
        	 if(tem==n)return true;
         }
         return false;
    }
}
