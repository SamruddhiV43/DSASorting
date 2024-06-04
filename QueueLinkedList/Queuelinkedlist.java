package com.demo.queue;
//Queue works on first in first out
public class Queuelinkedlist {
	Node front =null;
	Node rear=null;
	public class Node{
	int data;
	Node next;
	public Node(int val) {
		super();
		data = val;
		next = null;
	}
	
	}
	public boolean isEmpty()
	{//if there is not a single node is present i.e.even front is not there (front==null)
		if(front==null)
		{
			System.out.println( "Queue is empty");
			return false;
		}
		return true;
	}
	//adding node into queue
	public void enqueue(int val)
	{
		Node newnode=new Node(val);
		if(!isEmpty())
		{  //adding only 1 node i.e.front=rear
			front=newnode;
			rear=newnode;
		}
		else {
			//add after rear node
			rear.next=newnode;
			rear=newnode;
			
		}
	}
	//deleting node from queue
	public int dequeue()
	{
		int x=front.data;
		{//delete if only one node is there i.e.front==rear
		if(front==rear) {
			front=null;
			rear=null;
			
		}
		else {
			
			Node temp=front;
			front=temp.next;
			temp.next=null;
			temp=null;
			
		}
		return x;		
	}
	}


	public void displayQueue()
	{
		for(Node temp=front;temp!=null;temp=temp.next)
		{
			System.out.print(temp.data+",");
		}
		System.out.println("\n------------------\n");
	}
	
	}


