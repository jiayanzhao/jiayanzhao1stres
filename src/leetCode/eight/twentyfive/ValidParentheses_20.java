package leetCode.eight.twentyfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses_20 {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
    public static boolean isValid(String s) {
    	int len = s.length();
    	if(len<1||len%2==1) return false;
    	Stack<Character> sk = new Stack<>();
    	for(int i=0;i<len;i++){
    		if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')sk.push(s.charAt(i));
    		else if(s.charAt(i)==')'){
    			if(sk.size()==0 || sk.pop()!='(') return false;
    		}
    		else{
    			if(sk.size()==0 || sk.pop()-0!=s.charAt(i)-2)return false;
    		}
    	}
    	if(sk.size()==0)return true;else return false;
    }
}
