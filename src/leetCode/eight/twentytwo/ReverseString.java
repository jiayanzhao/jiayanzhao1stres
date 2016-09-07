package leetCode.eight.twentytwo;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString  rs = new ReverseString();
		System.out.println(rs.reverseString("china"));
	}
    public String reverseString(String s) {
        int len = s.length();
        if(len==0 || len==1) return s;
        char tem;
        char[] chars = s.toCharArray();
        for(int i=0,j=s.length()-1;i<j;j--,i++){
        	 tem = chars[j];
        	 chars[j] = chars[i];
        	 chars[i] = tem;
        }
       //String res = String.valueOf(chars);
       // System.out.println(res);
       // return String.valueOf(chars);
        return new String(chars); 
    }
}
