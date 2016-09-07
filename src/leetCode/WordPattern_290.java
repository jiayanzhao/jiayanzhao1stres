package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern_290 {

	/**
	 * pattern = "abba", str = "dog cat cat dog" should return true.
       pattern = "abba", str = "dog cat cat fish" should return false.
       pattern = "aaaa", str = "dog cat cat dog" should return false.
       pattern = "abba", str = "dog dog dog dog" should return false.
	 * @param pattern
	 * @param str
	 * @return77 8 76*6= 456%8=
	 */
	public static void main(String[] args) {
		WordPattern_290 w2 = new WordPattern_290();
		boolean result = w2.wordPattern("abba", "dog cat cat dog");
		System.out.println(result);
	}
    public boolean wordPattern(String pattern, String str) {
        String[] str1 = str.split(" ");
        Map<Character,String> map = new HashMap<>();
        int len = pattern.length();
        char tem;
        String tems;
        if(str1.length!=len) return false;
        for(int i=0;i<len;i++){
        	tem = pattern.charAt(i);
        	tems = str1[i];
        	if(map.containsKey(tem)){
        		if(!map.get(tem).equals(tems))return false;
        	}else{
        		if(map.containsValue(tems)) return false;
        		else map.put(tem,tems);
        	}
        }
        return true;
    }
}
