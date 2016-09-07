package leetCode.eight.twentyfive;

import java.util.ArrayList;
import java.util.List;

public class CountandSay_38 {

	public static void main(String[] args) {
		System.out.println(countAndSay_gai(3));
	}
	public static String countAndSay(int n) {//自己写的 7ms
		StringBuilder str = new StringBuilder("1");
        StringBuilder tem = new StringBuilder();
        StringBuilder strtem;
        if(n==1) return str.toString();
        long index = 1;
        for(int i=2;i<=n;i++){
        	 int j = 0;
             while(j<str.length()){
            	 index = 1;
            	 while(j+1<str.length()&&str.charAt(j)==str.charAt(j+1)){
            		 j++;
            		 index++;
            	 }
            	 tem.append(index);tem.append(str.charAt(j));
            	 j++;
             }
             strtem = tem;
             tem = str.delete(0,str.length());
             str = strtem;
        }
		return str.toString();
    }
	public static String countAndSay_new(int n) {//找的 5ms
		if (n <= 0)
			return null;
		String result = "1";
		int i = 1;
		while (i < n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
	 
		return result;
	}
	public static String countAndSay_gai(int n) {//自己写的 7ms
		String res = "1";
        if(n==1) return res;
        int count = 1,i=1;
        while(i<n){
         StringBuilder tem = new StringBuilder();
         int j = 0;
    	 while(j<res.length()){
    		 if(j+1<res.length()&&res.charAt(j)==res.charAt(j+1)){
    			 count++; 
    		 }else{
    			 tem.append(count);
    			 tem.append(res.charAt(j));
    			 count = 1;
    		 }
    		 j++;
    	 }
    	 res = tem.toString();
    	 i++;
        }
		return res;
    }
}
