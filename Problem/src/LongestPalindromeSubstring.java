public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		LongestPalindromeSubstring lps= new LongestPalindromeSubstring();
		System.out.println(lps.findLongestPalindromeSubstring("otto"));
		System.out.println(lps.findLongestPalindromeSubstring("cotto"));
		System.out.println(lps.findLongestPalindromeSubstring("mamt"));
		System.out.println(lps.findLongestPalindromeSubstring("ciolonissimo"));
		System.out.println(lps.findLongestPalindromeSubstring("substring method of String class is used to find substring. JavaJ .code to print substrings of a string is given below"));
		
	}
	
	private String findLongestPalindromeSubstring(String s){
		for(int i = 1;i<s.length();i++){
			for(int j = 0; j<i;j++){
				if(isPalindrome(s.substring(j,s.length()-i+j+1).toCharArray())){
					return s.substring(j,s.length()-i+j+1);
				}
			}
		}
		return null;
	}
	
	private boolean isPalindrome(char[] cArr){
		for(int i=0, j=cArr.length-1; i<cArr.length/2; i++,j--){
			if(cArr[i]!=cArr[j]){
				return false;
			}
		}
		return true;
	}


}
