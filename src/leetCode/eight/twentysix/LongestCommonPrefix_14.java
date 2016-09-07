package leetCode.eight.twentysix;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {
		String test = "abcdefg";
		System.out.println(test.substring(0,0));
		System.out.println(longestCommonPrefix(new String[]{"ac","acb","acc"}));
	}
    public static  String longestCommonPrefix(String[] strs) {//3ms
    	if(strs.length==0) return "";if(strs.length==1) return strs[0];
    	String res = "", tem="";
    	for(int i=0;i<strs[0].length();i++){
            tem += strs[0].charAt(i);//strs[0].substring(0,i+1);
    		for(int j=1;j<strs.length;j++)if(!strs[j].startsWith(tem)) return res;
    		res = tem;
    	}
    	return res;
    }
    
    public static  String longestCommonPrefix_new(String[] strs) {//6ms
    	int len = strs.length,m ;
    	if(len==0) return "";if(len==1) return strs[0];
    	String res = "",tem;
    	for(int i=strs[0].length();i>0;i--){
            tem = strs[0].substring(0,i);
            m = 0;
    		for(int j=1;j<len;j++){
    				if(!strs[j].startsWith(tem)) {
    					m = 1;
    					break;
    				}
    	    }
    		if(m==0)return tem;
    	}
    	return res;
    }
}
