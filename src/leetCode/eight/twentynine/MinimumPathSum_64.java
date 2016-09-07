package leetCode.eight.twentynine;

import java.util.Arrays;

public class MinimumPathSum_64 {
	//思路：path_sum[i, j] =  min(path_sum[i-1][j], path_sum[i][j-1]) + matrix[m][n]
	//http://www.cnblogs.com/thoupin/p/4777960.html
	//http://blog.csdn.net/martinmateng/article/details/50727195
	public static void main(String[] args) {
		System.out.println(minPathSum(new int[][]{{1,2,3,4},{2,3,5,4},{3,2,1,4}}));
	}
    
    /*
     * 思路:本题就是一个普通的动态规划题目，因为只能往下或者往右走，递推式是dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];,根据此递推式可以得出算法
     * */
    public static int minPathSum_new(int[][] grid) {
    	int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=1;i<m;i++)dp[i][0]=dp[i-1][0]+grid[i][0];
        for(int i=1;i<n;i++)dp[0][i]=dp[0][i-1]+grid[0][i];
        for(int i=1;i<m;i++) {
	        for(int j=1;j<n;j++) {
	        dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
	        }
        }
        return dp[m-1][n-1];	
    }
    
    public static int minPathSum(int[][] grid) {//跟上边要一样，自己写一遍
    	int hang = grid.length;
    	int lie = grid[0].length;
    	int[][] dp = new int[hang][lie];
    	
    	dp[0][0] = grid[0][0];
    	for(int i=1;i<lie;i++)   dp[0][i]  = dp[0][i-1]+grid[0][i];
    	for(int i=1;i<hang;i++)  dp[i][0] = dp[i-1][0] +grid[i][0];
        for(int i=1;i<hang;i++){
        	for(int j=1;j<lie;j++){
        		dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
        	}
        }
        return dp[hang-1][lie-1];
    }
    
}
















