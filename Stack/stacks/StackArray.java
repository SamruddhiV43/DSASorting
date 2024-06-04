package com.demo.stacks;

public class StackArray {
          int[] arr;
          int top;
		public StackArray(int size) {
			super();
			this.arr = new int[size];
			top=-1;
		}
      public boolean isFull()
      {
    	if(top==arr.length-1)
    	{
    		System.out.println("Stack is overflow");
    	}
		return top==arr.length-1;
      }
      public boolean isEmpty()
      {
    	  if(top==-1)
    	  {
    		  System.out.println("Stack is Empty");
    	  }
    	  return top==-1;
      }
      public void push(int val)
      {
    	  if(!isFull())
    	  {
    		  top++;
    		  arr[top]=val;
    	  }
      }
		public int pop()
		{
			if(!isEmpty())
			{
				int x=arr[top];
				top--;
				return x;
			}
			return -1;
	
		}
		public void displayStack()
		{
			for(int i=0;i<arr.length-1;i++)
			{
				System.out.println(i+1+" pos is "+arr[i]);
			}
			//System.out.println("\n");
		}
		
		
        
}
