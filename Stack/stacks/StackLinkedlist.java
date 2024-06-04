package com.demo.stacks;

public class StackLinkedlist<T> {
	
	//Stack works on Last in First Out 
    
	Node Top=null;
	public class Node{
		 T data;
		Node Next;
	
		public Node(T val) {
			super();
			data = val;
			Next= null;
		 }
		
	}
	//if stack is empty 
    public boolean isEmpty()
    {
            return Top==null;	
		
    }
    //adding val into stack
    public void push(T val)
    {
    	Node newNode =new Node(val);
    	//adding if not a single node is present ie top==null
    	if(Top==null)
    	{
    		Top=newNode;
    		
     	}
    	//adding after first node ie after top
    	else
    	{
    		newNode.Next=Top;
    		Top=newNode;
    	
    	}
    	
    }
    //deleting from pop
    public T pop()
    {
    	if(!isEmpty()) 
    	{
    		
    		T n=Top.data;
    		Node temp=Top;
    		Top=temp.Next;
    		temp.Next=null;
    		temp=null;
    		return n;
    		
    	}
    	else
    	{
    		System.out.println("STACK is empty");
    		return null;
    	}
    	
    	
    }
    public void DisplayStack()
    {  
    	for(Node temp=Top;temp!=null;temp=temp.Next)
    		
    	{
    		System.out.print(temp.data+" ,");
    		
    	}
    	System.out.println("\n--------------\n");
    }
    
}
