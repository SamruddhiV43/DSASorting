package com.demo.test;

import java.util.Scanner;

import com.demo.service.HeapSortServices;

public class TestHeapSort {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Size of element");
	int n =sc.nextInt();
	int [] arr=new int[n];
	HeapSortServices.accepdetails(arr);
	HeapSortServices.displaydetails(arr);
	HeapSortServices.heapsort(arr);
	HeapSortServices.displaydetails(arr);

	}

}
