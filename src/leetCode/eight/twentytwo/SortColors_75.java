package leetCode.eight.twentytwo;

import java.util.Arrays;
import java.util.Date;

public class SortColors_75 {

	public static void main(String[] args) {
		SortColors_75 s7 = new SortColors_75();
		Long bg = new Date().getTime();
		s7.sortColors_new(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,2,2,0,0,2,1,2,0,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,1,1,2,0,0,0,1,2,0,1,2,1,2,0,0,1,2,2,1,1,0,0,0,2,0,2,1,1,0,0,2,1,1,2,0,0,1,0,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2});
		Long end = new Date().getTime();
		System.out.println("共耗时"+(end-bg)+"ms");
	}
	public void sortColors(int[] nums) {//错的，只分类了，没排序
        int len = nums.length;
        //int i = 0;//i永远指向排好序的最后一个
        int j;
        int tem;
        for(int i=0;i<len-1;i++){
        	while(i<len-1&&nums[i]==nums[i+1])i++;
        	j = i+1;
        	while(j<len){
        		if(nums[i]==nums[j]){
        		i = i+1;
        		tem = nums[i];
        		nums[i] = nums[j];
        		nums[j] = tem;
        		}
        		j++;
        	}
        }
        System.out.println(Arrays.toString(nums));
    }
	
	public void sortColors_new(int[] nums) {//应该是三指针；把while注掉比不注掉快很多
		int len = nums.length;
		if(len==0 || len ==1) return;
        int i = 0;//指向第一个不为0的数
        int j = len-1;//从后边数，指向第一个不为2的数
        int k = 1;
        int tem;
 //       while(i<len && nums[i]==0)i++;
 //       while(j>=0 && nums[j]==2)j--;
        k = i;
        while(k<=j){
        	while(i<len && nums[i]==0){
        		i++;k++;
        	}
        	while(j>=0 && nums[j]==2)j--;
        	if(nums[k]==0){
        		tem = nums[i];
        		nums[i] = nums[k];
        		nums[k] = tem;
        		i++;
        	}
        	if(nums[k]==2){
        		tem = nums[j];
        		nums[j] = nums[k];
        		nums[k] = tem;
        		j--;
        	}else{
        		k++;
        	}
        	
        }
        System.out.println(Arrays.toString(nums));
    }
}
