package leetCode.eight.twentyfive;

import java.util.Arrays;

public class RansomNote_383 {
public static void main(String[] args) {
	System.out.println(canConstruct_best("aaaa", "bafaraaffafa"));
}
    public static  boolean canConstruct(String ransomNote, String magazine) {//失败
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        Arrays.sort(ran);
        Arrays.sort(mag);
        int lenr = ran.length;
        int lenm = mag.length;
        if(lenm<lenr) return false;
        if(ran[0]!=mag[0])return false;
        int i = 0;
        int j = 0;
        int eage = 0;
        for(;i<lenr-1;i++){
        	
        	while(i<lenr-1 && ran[i]==ran[i+1])i++;
        	while(j<lenm-1 && mag[j]==mag[j+1])j++;
        	if(j-i<eage)return false;else{
        		eage += j-i;
        	}
        	j++;
        }
        return true;
    }
    
    public static  boolean canConstruct_best(String ransomNote, String magazine) {
    	int res[] = new int[26];
    	for(int i=0;i<magazine.length();i++){
    		res[magazine.charAt(i)-'a']++;
    	}
    	for(int i=0;i<ransomNote.length();i++){
    		if(--res[ransomNote.charAt(i)-'a']<0)return false;
    	}
    	return true;
    }
}
