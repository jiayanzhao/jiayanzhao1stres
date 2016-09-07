package leetCode.eight.twentyfour;

public class ReverseInteger_7 {

	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);//int型是32位，最前边是符号为，表示范围时-(2^31-1)~(2^31-1),共2^32个数
		//System.out.println((-1010)%11);
		System.out.println(reverse_best(-5056));
	}
   public static int reverse(int x) {
        char[] cs = String.valueOf(x).toCharArray();
     //   char[] cs = Integer.toString(x).toCharArray();
        if(cs.length==1) return x;
        int bg;
        char tem;
        if(cs[0]=='-')bg=1;else bg=0;
        for(int j=cs.length-1;bg<j;j--){
        	tem = cs[bg];
            cs[bg] = cs[j];
            cs[j] = tem;
            bg++;
        }
        try{
        	return Integer.valueOf(String.valueOf(cs));
        }catch(NumberFormatException e){
        	return 0;
        }
    }
    public static int reverse_new(int x) {
    	int j = x>=0?0:1;
    	x = Math.abs(x);
    	int i = 1;
        while(x/i>9){
        	i*=10;
        }
        StringBuilder res = new StringBuilder();
        if(j==1)res.append("-");
        for(;i>0;){
        	res.append(x%10);
        	x = x/10;
        	i /= 10;
        }
        try{
        	
        	return Integer.valueOf(String.valueOf(res));
        }catch(NumberFormatException e){
        	return 0;
        }
    }
   public static int reverse_best(int x) {
	   long result = 0;

       while (x!=0) {
           result = result * 10 + x % 10;
           x /= 10;
       }
       
       return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int)result;
   }
   public static int reverse_best_duo(int x){
	   
       if (x == 0) {
           return 0;
       }

       //先转换为正整数计算
       boolean sign = x > 0 ? true : false;
       x = sign ? x : x * (-1);
       
       //使用长整型类型计算结果，防止溢出错误
       long result = 0L;
       while (true)
       {
           result += x % 10;
           x /= 10;
           
           if (x != 0) {
               result *= 10;
           } else {
               break;
           }
       }
       
       //得出结果，比较是否超出整型最大/最小值
       result = sign ? result : result * (-1);
       if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
           return 0;
       } else {
           return (int)result;
       }
   }
   }
