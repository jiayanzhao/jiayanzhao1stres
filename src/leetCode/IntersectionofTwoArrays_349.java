package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArrays_349 {

	public static void main(String[] args) {
		IntersectionofTwoArrays_349 i3 = new IntersectionofTwoArrays_349();
		int[] re = i3.intersection_twopoint(new int[]{1,2,2,1}, new int[]{2});
		System.out.println(Arrays.toString(re));
	}
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length,len2 = nums2.length;
        if(len1==0 || len2==0) return new int[]{};
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<Integer>();
        for(int i=0;i<len1;i++){
        	set.add(nums1[i]);
        }
        for(int i=0;i<len2;i++){
        	if(set.contains(nums2[i])){
        		result.add(nums2[i]);
        	}
        }
        int[] res = new int[result.size()];
        int index = 0;
        for(Integer tem:result){
        	res[index++] = tem;
        }
        return res;
    }
    public int[] intersection_twopoint(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int len1 = nums1.length;
    	int len2 = nums2.length;
    	List<Integer> list = new ArrayList<>();
    	for(int i=0,j=0;i<len1 && j<len2;){
    		while(i+1<len1 && nums1[i]==nums1[i+1]){
    			i++;
    		}
    		while(j+1<len2 && nums2[j]==nums2[j+1]){
    			j++;
    		}
    		if(nums1[i]==nums2[j]){
    			list.add(nums1[i]);
    			i++;
    			j++;
    		}else if(nums1[i]<nums2[j]){
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
}
