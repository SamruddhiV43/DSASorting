package com.demo.test;

import com.demo.stacks.StackLinkedlist;

public class TestStackLinkedList {

	public static void main(String[] args) {
	StackLinkedlist<Integer> SlinkedList = new StackLinkedlist<>();
	SlinkedList.push(100);
	SlinkedList.push(31);
	SlinkedList.push(51);
	SlinkedList.push(61);
	SlinkedList.DisplayStack();
	System.out.println(SlinkedList.pop());
	System.out.println(SlinkedList.pop());
	System.out.println(SlinkedList.pop());
	//System.out.println(SlinkedList.pop());
	//SlinkedList.DisplayStack();
	System.out.println(SlinkedList.pop());
	
	}

}
