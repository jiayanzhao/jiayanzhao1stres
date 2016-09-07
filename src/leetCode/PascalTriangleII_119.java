package leetCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PascalTriangleII_119 {
	/*[
      [1],          0
                         [1,1],         1
    [1,2,1],        2
                       [1,3,3,1],       3
  [1,4,6,4,1]       4
                     [1,5,10,10,5,1]    5
[1,6,15,20,15,6,1]  6     
                   [1,7,21,35,35,21,7,1] 7     
                   
                [1,9,36,84,126,126,84,36,9,1] 9                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
 
]*/
	public static void main(String[] args) {
		PascalTriangleII_119 p1 = new PascalTriangleII_119();
		Long bg = new Date().getTime();
		List<Integer> result = p1.getRow_beat70(80);
		Long end = new Date().getTime();
		System.out.println("共耗时"+(end-bg)+"ms");
		System.out.println(result.toString());
	}
	public List<Integer> getRow(int rowIndex) {
	       List<Integer> result = new ArrayList<>();
	       if(rowIndex==0){
	    	   result.add(1);
	    	   return result;
	       }else if(rowIndex==1){
	    	   result.add(1);
	    	   result.add(1);
	    	   return result;
	       }
	       result.add(1);
    	   result.add(1);
	       for(int i=1;i<rowIndex;i++){
	    	   result.add(i,result.get(i)+result.get(i-1));
	    	   for(int j=i-1;j>0;j--){
	    		   result.set(j, result.get(j)+result.get(j-1));
	    	   }
	       }
	        return result;   
	    }
	public List<Integer> getRow_beat70(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();
	 
		if (rowIndex < 0)
			return result;
	 
		result.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = result.size() - 2; j >= 0; j--) {
				result.set(j + 1, result.get(j) + result.get(j + 1));
			}
			result.add(1);
		}
		return result;
	}
}
