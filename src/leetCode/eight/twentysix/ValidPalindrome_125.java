package leetCode.eight.twentysix;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		System.out.println("11".toLowerCase());
		char s = 's';
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	public static boolean isPalindrome(String s) {//最好的
        if(s.length()==0 || s.length()==1) return true;
        int i=0,j=s.length()-1;
        while(i<j){
        	if(!(Character.isLetterOrDigit(s.charAt(i))))i++;
        	else if(!(Character.isLetterOrDigit(s.charAt(j))))j--;
        	else if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))return false;
        	else{i++;j--;}
        }
        return true;
    }
}
                                           