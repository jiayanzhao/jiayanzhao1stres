package leetCode.eight.twentythree;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

	public static void main(String[] args) {
		HappyNumber_202 h2 = new HappyNumber_202();
		boolean res = h2.isHappy(1);
		System.out.println(res);
	}
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int tem = n;
        while(true){
        	tem = dealInt(tem);
        	if(tem==1) return true;
        	if(!set.add(tem))return false;
        }
    }
    
    public static int dealInt(int n){
    	int shi = (n/10);
		int ge = (n%10);
		if(shi>9){
			return (int) (dealInt(shi)+Math.pow(ge,2));
		}else{
			return (int) (Math.pow(shi,2)+Math.pow(ge,2));
		}
    }
}
