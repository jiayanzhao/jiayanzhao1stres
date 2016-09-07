package leetCode.eight_one_nine;

public class AddDigits_258 {
//http://blog.csdn.net/lyy_hit/article/details/47701947
//写的很好！
	public static void main(String[] args) {
		AddDigits_258 a2 = new AddDigits_258();
		int result = a2.addDigits_new(1998);
	    System.out.println(result);
	}
	
    public int addDigits(int num) {
        return ((num-1)%9+1);
    }
    
    public int addDigits_new(int num) {
        int result = sumDigit(num);
        if(result<=9){
        	return result;
        }else{
        	int tem = addDigits_new(result);
        	return tem;
        }
        
    }
    
    public static int sumDigit(int num){
    	if(num<=9){
    		return num;
    	}else{
    		return (num/10)+(num%10);
    	}
    }
}
