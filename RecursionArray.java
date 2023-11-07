package com.uno;

public class RecursionArray {

	static int arr[] = { 10, 20,-30, 40, 5,6 }; 
	  
       static int findSum(int A[], int N) 
    { 
        if (N == 0) 
            return 0; 
        return (findSum(A, N - 1) + A[N - 1]); 
    }//if 
  
    
    public static void main(String[] args) 
    { 
        System.out.println(findSum(arr, arr.length)); 
    } 
} 