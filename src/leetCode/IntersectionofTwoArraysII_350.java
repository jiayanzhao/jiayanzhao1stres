package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII_350 {

	public static void main(String[] args) {
		IntersectionofTwoArraysII_350 i5 = new IntersectionofTwoArraysII_350();
		int[] result = i5.intersect_twopoint_best(new int[]{1,2,2,1}, new int[]{2,2});
		System.out.println(Arrays.toString(result));
	}
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        Map<Integer,Integer> map3 = new HashMap<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1==0 || len2==0) return new int[]{};
        for(int i=0;i<len1;i++){
        	int num1 = nums1[i];
        	if(map1.containsKey(num1)){
        		map1.put(num1, map1.get(num1)+1);
        	}else{
        		map1.put(num1, 1);
        	}
        }
        for(int i=0;i<len2;i++){
        	int num2 = nums2[i];
        	if(map2.containsKey(num2)){
        		map2.put(num2, map2.get(num2)+1);
        	}else{
        		map2.put(num2, 1);
        	}
        }
        int size = 0;
        for (Map.Entry<Integer,Integer> entry : map1.entrySet()) {
        	int key1 = entry.getKey();
        	if(map2.containsKey(key1)){
        	   if(map2.get(key1)>entry.getValue()){
        		   map3.put(key1,entry.getValue());
        		   size += entry.getValue();
        	   }else{
        		   map3.put(key1,map2.get(key1));
        		   size += map2.get(key1);
        	   }
        	}
        }
        int[] res = new int[size];
        int index=0;
        for(Map.Entry<Integer,Integer> entry : map3.entrySet()){
        	for(int i=0;i<entry.getValue();i++){
        		res[index++] = entry.getKey();
        	}
        }
        return res;
        
    }
    public int[] intersect_twopoint_best(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int len1 = nums1.length;
    	int len2 = nums2.length;
    	List<Integer> list = new ArrayList<>();
    	for(int i=0,j=0;i<len1 && j<len2;){
    		if(nums1[i]==nums2[j]){
    			list.add(nums1[i]);
    			i++;
    			j++;
    		}else if(nums1[i]<nums2[i]){
    			i++;
    		}else{
    			j++;
    		}
    	}
    	int[] result = new int[list.size()];
    	for(int i=0;i<list.size();i++){
    		result[i] = list.get(i);
    	}
    	return result;
    }
    
    /**
     * 解法一（类似于I）：
       leetcode上用时8ms，时间复杂度O(k*maxl);空间复杂度最大为O(m+n)。
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect_1(int[] nums1, int[] nums2) {  //类似自己作的，一定要看。
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0)  
            return new int[]{};  
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();  
        List<Integer> list=new ArrayList<Integer>();  
          
        for(int i=0;i<nums1.length;i++){  
            if(map.containsKey(nums1[i])){//containsKey时间复杂度最差为O(map.size());  
                map.put(nums1[i], map.get(nums1[i])+1);  
            }else{  
                map.put(nums1[i], 1);  
            }  
        }  
        for(int i=0;i<nums2.length;i++){  
            if(map.containsKey(nums2[i])){  
                list.add(nums2[i]);  
                if(map.get(nums2[i])-1 <= 0){  
                    map.remove(nums2[i]);  
                }else{  
                    map.put(nums2[i], map.get(nums2[i])-1);  
                }  
            }  
        }  
        int[]res=new int[list.size()];  
        for(int i=0;i<res.length;i++){  
            res[i]=list.get(i);  
        }  
        return res;  
    }  
    
    /**
     * 解法二（直接使用List）：
                     用时16ms，时间复杂度高O(mn)，空间复杂度最大为O(m+n)。最不合适的方法
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect_2(int[] nums1, int[] nums2) {  //用时最长
        List<Integer> temp=new ArrayList<Integer>();  
        List<Integer> list=new ArrayList<Integer>();  
          
        for(int x:nums1){  
            temp.add(x);  
        }  
        for(int x:nums2){  
            if(temp.contains(x)){//看源码可知contains的复杂度是O(temp.size())  
                list.add(x);  
                temp.remove((Integer)x);  
            }  
        }  
        int[]res=new int[list.size()];  
        for(int i=0;i<res.length;i++){  
            res[i]=list.get(i);  
        }  
        return res;  
    }  
}
