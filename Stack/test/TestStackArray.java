package com.demo.test;

import com.demo.stacks.StackArray;

public class TestStackArray {

	public static void main(String[] args) {
	    StackArray Sarray=new StackArray(5);
	    int[] arr=new int[5];
	    Sarray.isFull();
	    Sarray.isEmpty();
	    Sarray.push(7);
	    Sarray.push(12);
	    Sarray.push(21);
	    Sarray.push(10);
	    Sarray.push(2);
	    Sarray.displayStack();
	    Sarray.pop();
	    Sarray.displayStack();
	    Sarray.push(3);
	    Sarray.push(11);
	    Sarray.displayStack();
	}

}
