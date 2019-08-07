
/*
Validate IPv4 address
*/

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Solution {
	public boolean isValidIP(String s){
	   //Write your code here
	    String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";

    return s.matches(PATTERN);
	}
}
