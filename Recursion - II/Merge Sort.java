// Sort an array A using Merge Sort.
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
// 2 1 5 2 3
// Sample Output 2 :
// 1 2 2 3 5 




public class solution {
    
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        if(i<a.length){
            while(i<a.length){
                c[k]=a[i];
                k++;
                i++;
            }
        }
        if(j<b.length){
            while(j<b.length){
                c[k]=b[j];
                k++;
                j++;
            }
        }
    }

	public static void mergeSort(int[] input){
		if(input.length<=1){
           return; 
        }
		int[] a=new int[input.length/2];
        int[] b=new int[input.length-a.length];
        for(int i=0;i<input.length/2;i++){
            a[i]=input[i];
        }
        for(int i=input.length/2;i<input.length;i++){
            b[i-input.length/2]=input[i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,input);
	}
}
