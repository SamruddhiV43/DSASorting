package com.demo.service;

import java.util.Scanner;

public class HeapSortServices {

	public static void accepdetails(int[] arr) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter elements in array");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displaydetails(int[] arr) {
     System.out.println("elements in arr are");
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
		
	}
         
	public static void heapsort(int[] arr) {
	   int n=arr.length;//size of arr
	   //checking for last parent node
	   for(int i=(n/2)-1;i>=0;i--)
	   {//make it max heap
	     heapify(arr,n,i);   
	   }
		
	
	for(int i=n-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
	
		heapify(arr,i,0);
		}
	}
	//find largest from left and right node
	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int left =2*i+1;//left node
		int right=2*i+2;//right node
		//checking for left node
		if(left<n && arr[left]>arr[largest])
		{
			largest=left;
		}
		//checking for right node
		if(right<n && arr[right]>arr[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
	}

}
