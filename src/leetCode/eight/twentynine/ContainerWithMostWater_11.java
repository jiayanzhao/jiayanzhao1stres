package leetCode.eight.twentynine;

public class ContainerWithMostWater_11 {

	public static void main(String[] args) {
		System.out.println(maxArea_new(new int[]{15,14,13,12,11,10,9,8,7,6,5,4,3,2,1}));
	}
    public static int maxArea(int[] height) {
           int len = height.length;
           int max = 0;
           int mianji = 0;
           for(int i=0;i<len-1;i++){
        	   for(int j=i+1;j<len;j++){
        		   mianji = (j-i)*(Math.min(height[i], height[j]));
        	       max = mianji>max?mianji:max;
        	   }
           }
           return max;
    }
    
    public static int maxArea_new(int[] height) {
    	int len = height.length;
    	int left = 0;
    	int right = len-1;
    	int max=0,minheight,tem;
    	while(left<right){
    		minheight = Math.min(height[left], height[right]);
    		tem = (right-left)*minheight;
    		max = max>tem?max:tem;
    		if(height[left]<height[right]){
    			left++;
    		}else{
    			right--;
    		}
    		
    	}
    	return max;
    }
    public int maxArea_new_best(int[] height) {
        int len = height.length;
        	int left = 0;
        	int right = len-1;
        	int max = (right-left)*(Math.min(height[left], height[right]));
        	while(left<right){
        		int minheight = Math.min(height[left], height[right]);
        		int tem = (right-left)*minheight;
        		max = max>tem?max:tem;
        		if(height[left]<height[right]){
        			left++;
        		}else{
        			right--;
        		}
        		
        	}
        	return max;
        }
}
