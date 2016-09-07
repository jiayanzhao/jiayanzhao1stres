package leetCode.eight.twentyfive;

public class LengthofLastWord_58 {

	public static void main(String[] args) {
		String test = "   ";
		System.out.println(lengthOfLastWord_new(test));
		System.out.println(lengthOfLastWord_new_nwe(test));
	}
    public static  int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if(str.length==0)return 0;
        return str[str.length-1].length();
    }
    
    public static  int lengthOfLastWord_new(String s){
    	char[] tem = s.toCharArray();
    	int len = tem.length;
    	while(len>0 && tem[len-1]==' ')len--;
    	if(len==0)return 0;
        for(int i=len-1;i>=0;i--)if(tem[i]==' ')return len-i-1;
        return len;
    }
    
    public static  int lengthOfLastWord_new_nwe(String s){
    	int len = s.length();
    	int index = 0;
    	for(int i=len-1;i>=0;i--){
    		if(s.charAt(i)==' '&&index==0)continue;else if(s.charAt(i)==' '&&index!=0){
    			return index;
    		}else{
    			index++;
    		}
    	}
    	return index;
    }
}
