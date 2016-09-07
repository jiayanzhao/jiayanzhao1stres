package nine.two;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    //["a","b","c"] def
	public static void main(String[] args) {
		List<String> res = letterCombinations("12412536");
		System.out.println(res.toString());
	}
	public static List<String> letterCombinations(String digits) {
       List<String> res = new ArrayList<>(),res_tem = new ArrayList<>();
       String[] str = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       String tem ,tem1;
       for(int i=0;i<digits.length();i++){
    	   tem = str[digits.charAt(i)-'0'];
    	   for(int j=0;j<tem.length();j++){
    		   if(res.size()==0){
    			   res_tem.add(tem.charAt(j)+"");
    		   }else{
    			   for(int k=0;k<res.size();k++){
        			   tem1 = res.get(k)+tem.charAt(j);
        			   res_tem.add(tem1);
        		   }
    		   }
    		   
    	   }
    	   List tem2 = res;
    	   res = res_tem;
    	   res_tem = tem2;
    	   res_tem.clear();
       }
       return res;
    }
}
