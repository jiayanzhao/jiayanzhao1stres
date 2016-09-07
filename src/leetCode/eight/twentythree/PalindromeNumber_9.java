package leetCode.eight.twentythree;

public class PalindromeNumber_9 {

	public static void main(String[] args) {
		PalindromeNumber_9  p9 = new PalindromeNumber_9();
		System.out.println(p9.isPalindrome_new(10255201));
	}
    public boolean isPalindrome(int x) {//不让用额外的空间，pass
       boolean res = true;
       String sx = x+"";
       char[] chars = sx.toCharArray();
       int len = chars.length;
       if(len==0 || len==1) return true;
       for(int i=0,j=len-1;i<j;i++,j--){
    	   if(chars[i]!=chars[j]){
    		   return res=false;
    	   }
       }
       return res;
    }
    
    public boolean isPalindrome_new(int x) {
    	if(x<0) return false;
        boolean res = true;
        int i = 1;
        while(x/i>9)i *= 10;
        
        int j = 10;
        while(j<=i){
        	int left = x/i;
        	int right = x%j;
        	if(left!=right)return false;
        	
        	x = (x%i)/j;
       // 	j*=10;
        	i/=100;
        	
        }
        return res;
     }
}
