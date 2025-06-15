package dsa;

public class LowercaseUpperCaseString {

	public static void main(String[] args) {
		String s="heLLo";
		System.out.println(solve(s));
	}
	    public static String solve(String A) {
	         char[]arr = A.toCharArray();
	        
	        for(int i=0; i < arr.length;i++) {
	            if(arr[i] >= 'A' && arr[i] <= 'Z') {
	                arr[i] = (char)(arr[i] + 32);
	            } 
	            else {
	                arr[i] = (char)(arr[i] - 32);
	            }
	        }
	        
	        return new String(arr);
	}


}
