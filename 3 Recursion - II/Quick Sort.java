// Sort an array A using Quick Sort.
// Change in the input array itself. So no need to return or print anything.


// Input format :
// Line 1 : Integer n i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)
// Constraints :
// 1 <= n <= 10^3
// Sample Input 1 :
// 6 
// 2 6 8 5 4 3
// Sample Output 1 :
// 2 3 4 5 6 8
// Sample Input 2 :
// 5
// 1 5 2 7 3
// Sample Output 2 :
// 1 2 3 5 7 



public class Solution {
    
    public static void quickHelp(int[] input, int si, int ei){
        if(si>=ei){
            return;
        }
        int p=partition(input,si,ei);
        quickHelp(input ,si ,p-1);
        quickHelp(input, p+1 ,ei);
        
    }
    
    public static int partition(int [] input, int si , int ei){
        int count=0;
        int p=input[si];
        for(int i=si+1;i<=ei;i++){
            if(p>input[i]){
                count++;
            }
        }
        int temp=input[si+ count];
        input[si+count]=input[si];
        input[si]=temp;
         int i=si;
        int j=ei;
        while(i<j){
            if(input[i]<p){
                i++;
            }
            else if(input[j]>=p){
                j--;
            }
            else{
                temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }
        }
        return si + count;
    }
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		if(0>=input.length){
            return;
        }
        quickHelp(input ,0, input.length-1);
       
	}
	
}
