package functionArray;

import java.util.Arrays;

public class funcArray {

	public static boolean arraysEqual(int arr1[], int arr2[]){ 
		int n = arr1.length; 
		System.out.println("BANYAKNYA ARRAY 1 :"+n);
		int m = arr2.length; 
		System.out.println("BANYAKNYA ARRAY 2 :"+m);

		// If lengths of array are not equal means 
		// array are not equal 
		if (n != m) {
			return false; 
		}

		System.out.println("ARRAY SEBELUM SORT 1:"+Arrays.toString(arr1));
		System.out.println("ARRAY SEBELUM SORT 2:"+Arrays.toString(arr2));

		// Sort both arrays 
		Arrays.sort(arr1); 
		System.out.println("ARRAY SETELAH SORT 1:"+Arrays.toString(arr1));
		Arrays.sort(arr2); 
		System.out.println("ARRAY SETELAH SORT 2:"+Arrays.toString(arr2));

		// Linearly compare elements 
		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				return false; 
			}	
		}

		// If all elements were same. 
		return true; 
	} 

	public static void main (String[] args) {

		int array1[] = {4, 2, 3}; 
		int array2[] = {2, 4, 3}; 


		if (arraysEqual(array1, array2)){
			System.out.println("Same"); 
		}else{
			System.out.println("Not same");
		}
	} 

}