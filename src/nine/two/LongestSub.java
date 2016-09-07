package nine.two;

public class LongestSub {
 public static void main(String[] args) {
	System.out.println(getLongestSub(new int[]{1,-1,-1,-1,-1,-1,1,-1}));
}
	static int getLongestSub(int[] nums){
		int total = 0;
		for(int i=0;i<nums.length;i++){
			total+=nums[i];
		}
		if(total==0)return nums.length;
		int bg=0,end=nums.length-1;
		while(bg<end){
			if(total<0){
				if(bg<end && nums[bg]==-1){
					total = total-nums[bg];
					bg++;
				}
				if(bg<end && nums[end]==-1){
					total = total-nums[end];
					end--;
				
				}
			}else if(total>0){
				if(bg<end && nums[bg]==1){
					total = total-nums[bg];
					bg++;
				}
				if(bg<end && nums[end]==1){
					total = total-nums[end];
					end--;
				}
			}else{
				return end-bg+1;
			}
		}
		return end-bg+1;
		
	}
}
