package leetCode.eight.twentytwo;

public class ReverseVowelsofaString_345 {

	public static void main(String[] args) {
		ReverseVowelsofaString_345 rs3 = new ReverseVowelsofaString_345();
		System.out.println(rs3.reverseVowels("Ui"));
	}
    public String reverseVowels(String s) {
        int len = s.length();
        if(len==0 || len==1) return s;
        char[] chars = s.toCharArray();
        for(int i=0,j=len-1;i<j;i++,j--){
        	while(i<j&&chars[i]!='a'&&chars[i]!='e'&&chars[i]!='i'&&chars[i]!='o'&&chars[i]!='u'&&chars[i]!='A'&&chars[i]!='E'&&chars[i]!='I'&&chars[i]!='O'&&chars[i]!='U'){
        		i++;
        	}
        	while(i<j&&chars[j]!='a'&&chars[j]!='e'&&chars[j]!='i'&&chars[j]!='o'&&chars[j]!='u'&&chars[j]!='A'&&chars[j]!='E'&&chars[j]!='I'&&chars[j]!='O'&&chars[j]!='U'){
        		j--;
        	}
        	if(i<j){
        		char tem = chars[j];
        		chars[j] = chars[i];
        		chars[i] = tem;
        	}
        }
        return new String(chars);
    }
}
