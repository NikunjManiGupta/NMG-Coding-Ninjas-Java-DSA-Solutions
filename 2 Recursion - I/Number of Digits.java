// Given the number 'n', find out and return the number of digits present in a number recursively.
// Input Format :
// Integer n
// Output Format :
// Count of digits
// Constraints :
// 1 <= n <= 10^6
// Sample Input 1 :
//  156
// Sample Output 1 :
// 3
// Sample Input 2 :
//  7
// Sample Output 2 :
// 1


public class Solution {
	static int countn=0;
	public static int count(int n){
		//Write your code here
		if(n==0){
            return 0;
        }
        countn++;
        n=n/10;
        count(n);
        return countn;
    }
}
