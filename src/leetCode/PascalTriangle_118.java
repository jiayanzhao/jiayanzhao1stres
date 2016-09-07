package leetCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PascalTriangle_118 {
	public static void main(String[] args) {
		PascalTriangle_118 p1 = new PascalTriangle_118();
		Long bg = new Date().getTime();
		List<List<Integer>> result = p1.generate(15);
		Long end = new Date().getTime();
		System.out.println("共耗时"+(end-bg)+"ms");
		System.out.println(result.toString());
	}
	 public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            	List<Integer> list = new ArrayList<>();
            	for(int j=0;j<i;j++){
                	if(j==0){
                		list.add(1);
                	}else if(j==i-1){
                		list.add(1);
                	}else{
                		list.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
                	}
            	}
            	result.add(list);
            
        }
        return result;
    }
}