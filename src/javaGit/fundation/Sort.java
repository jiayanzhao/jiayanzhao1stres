package javaGit.fundation;

import java.util.Arrays;

public class Sort {
////http://blog.csdn.net/zgrjkflmkyc/article/details/11639091   zongj
	public static void main(String[] args) {
		//int res[] = hillSort(new int[]{1,5,8,4,1,9,8,7,3,6,8,10,15});
		/*int res[] = */quickSort(new int[]{6,4,6,9,8,7,4,1,5,7,7,8,5},0,12);
		//System.out.println(Arrays.toString(res));
		//quickSort(new int[]{9,2,3,4,5,6,7,1,5,7,7,8,1},0,12);
	}
	//冒泡排序
	public static int[] soapSort(int[] nums){
		for(int i=nums.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(nums[j]>nums[j+1]){
					int tem = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tem;
				}
			}
		}
		return nums;
	}
	
	//插入排序
	//从数组的第二个元素开始，取得当前待处理的元素，插入到当前元素之前 的前面已排序好 的子数组里面，直到数组的末尾。
	public static int[] insertSort(int[] nums){
		if(nums.length<2) return nums;
		for(int i=1;i<nums.length;i++){
			int tem = nums[i],j=i-1;
			for(;j>=0;j--){
				if(tem<nums[j]) nums[j+1] = nums[j];
				else break;
			}
			nums[j+1] = tem;
		}
		return nums;
	}
	
	//希尔排序
	public static int[] hillSort(int[] arr){
		int j;
		int len = arr.length;
		for(int val=len/2; val>0; val/=2) {
			for(int i=val; i<len; i++) {
				int temp = arr[i];
				for(j=i; j>=val&&temp<arr[j-val]; j-=val) {
					arr[j] = arr[j-val];
					System.out.println(Arrays.toString(arr));
				}
				arr[j] = temp;
			}
		}
		return arr;
		/*
		 * 为什么每次都用temp比较呢？
		 * 因为直接插入就是找到temp的合适位置。
		 * 为什么temp<arr[j-val]这个条件可以放在for内呢？
		 * 因为原来的组内数据已经有序，找到位置就停止便是。
		 * 不甚理解的去看直接插入排序吧。
		 */
		/*
		 * 为什么是arr[j-val]不是arr[j]呢？
		 * 因为j=i开始的，而且条件是j>=val&&temp<arr[j-val]
		 */
		/*
		 * 注意不是arr[i] = temp
		 * 直接插入排序也是这样的。
		 * 为什么呢？
		 * 因为j是位置，i是待插入元素
		 */
	}
	
	
	
	
	
	
	
	
	
	
	public static int[] shellSort(int[] nums){
		int len = nums.length,j;
		if(len<2)return nums;
		for(int incr=len/2;incr>0;incr/=2){
			for(int i=incr;i<len;i++){
				int tem = nums[i];
				for(j=i;j>=incr;j-=incr){
					if(tem<nums[j-incr]){
						nums[j] = nums[j-incr];
					}else break;
				}
				nums[j]=tem;
			}
		}
		return nums;
	}
	
	//快速排序_从网上找的代码
	static int[] quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
        return n;
    }
 
    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot) right--;
            if (left < right)                         n[left++] = n[right];
            while (left < right && n[left] <= pivot)  left++;
            if (left < right)                         n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    
    
  //快速排序_自己写的代码
   public static void quickSort(int[] nums,int left,int right){
	   int mid;
	   if(left<right){
		   mid = findpostion(nums,left,right);
		   quickSort(nums, left, mid-1);
		   quickSort(nums,mid+1,right);
	   }
	   System.out.println(Arrays.toString(nums));
   }
   
   public static int findpostion(int[] nums,int left,int right){
	   int target = nums[left];
	   while(left<right){
		   while(left<right && nums[right]>=target)    right--;
		   if(left<right)                              nums[left++]=nums[right];
		   while(left<right && nums[left]<=target)     left++;
		   if(left<right)                              nums[right--] = nums[left];
	   }
	   nums[left] = target;
	   return left;
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

