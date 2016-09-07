package leetCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;

public class BestTimetoBuyandSellStock_121 {

	public static void main(String[] args) throws IOException {
		//new int[];
		Long bg = new Date().getTime();
		int[] source = new int[30000];
		try {
			InputStream in = new FileInputStream(new File("E://profit.txt"));
			String str="";
			int size=in.available();
			byte[] buffer=new byte[size];
				in.read(buffer);
		        in.close();
		        str=new String(buffer,"GB2312");
			System.out.println(str);

			String[] temStr = str.split(",");
			System.out.println("temStr的个数为"+temStr.length);
			 for(int i = 0;i<temStr.length;i++){
				 source[i] = Integer.parseInt(temStr[i]);
			 }
			 System.out.println("source的个数为"+source.length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BestTimetoBuyandSellStock_121 btb = new BestTimetoBuyandSellStock_121();
		
		int result = btb.maxProfit(source);
		Long end = new Date().getTime();
		System.out.println("共耗时"+(end-bg)+"ms");
		System.out.println(result);
	}
    public int maxProfit(int[] prices) {
    	int maxProfit = 0;
    	int len = prices.length;
    	if(len<2) return maxProfit;
    	int minPrice = prices[0];//215
    	int price;
    	for(int i=0;i<len;i++){
    		price = prices[i];
    		if(price<minPrice) minPrice = price;
    		if(price-minPrice>maxProfit) maxProfit = price-minPrice;
    	}
    	return maxProfit;
    }
}
