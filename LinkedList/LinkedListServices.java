package LinkedList;



public class LinkedListServices {
	public Node head;
	class Node
	{
		int data;
		Node next;
		public Node()
		{
			data=0;
			next=null;
		}
		public Node(int val) {
			data=val;
			next=null;
		}

}
//add by value
public void addNode(int val) {
	Node newNode=new Node(val);
	
	if(head==null) {//list is empty
		head=newNode;
	}else { //add at the end
		Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
}
//add by position
public void addNodebyposition(int val,int pos) {
	//check list is empty or not
	if(head==null) {
		System.out.println("list is empty");
	}else {
		//create a new node
		Node newNode=new Node(val);
		//add at first position
		if(pos==1) {
			newNode.next=head;
			head=newNode;
		}else {
			//otherwise add at the given position
			Node temp=head;               
			for(int i=0;temp!=null && i<pos-2;i++) {
				temp=temp.next;
			}
			//adding the node in between
		       if(temp!=null) {
			   newNode.next=temp.next;
			   temp.next=newNode;
			}
		}
	}
}
//delete by pos
public int deleteNodebyposition(int pos) {
	int n = 0;
	if(head==null) {
		System.out.println("list is empty");
		return 1;
		
	}else
	{
	// delete at first pos
		if(pos==1)
		{
			Node temp=head;
			head=head.next;
			temp.next=null;
			temp=null;
		}
		//delete in b/w 
		else {
            Node temp= head;
            Node prev=null;
            for( int i=0;temp!=null && i<pos-1;i++)
            {
            	prev=temp;
            	temp=temp.next;
            	
            }
            prev.next=temp.next;
             n= temp.data;
            temp.next=null;
            temp=null;
		}
	
	return n;
	
	}
}
//delete by node
public void deleteNode(int val)
{ // check whether list is empty or not
	if(head==null)
	{
		System.out.println("list is empty");
	}
	else {
		 Node prev=null;
		Node temp=head;
		//delete head val i.e 1st value
		if(head.data==val)
		{
			head=head.next;
			temp.next=null;
			temp=null;
			
		}
		else {
			while(temp!=null && temp.data==val)
			{
				prev =temp;
				temp=temp.next;
			}
			if(temp!=null)
			{
				prev.next=temp.next;
				
				temp.next=null;
				temp=null;
			}
			else {
				System.out.println("value not found");
			}
		}
		
		
	}
	
}

            public void displaydata() 
            {
	        if(head==null) 
	        {
		     System.out.println("list is empty");
	        }
	         for(Node temp=head;temp!=null;temp=temp.next) {
	              	System.out.print(temp.data+",");
	             }
	         System.out.print("\n");
}
            //display even data 
public void displayevendata()
{  
	if(head==null)
	{
		System.out.println("LISt is EMpty");
	}
	else {
		for(Node temp=head;temp!=null;temp=temp.next)
		{   
		    int n=8;
			int [] arr = new int[n];
			if(temp.data%2==0)
			{  
				int i=0;
					arr[i]=temp.data;		
				
				
					System.out.println(arr[i]);	
					i++;
				}
				//System.out.println("even data is "+temp.data);
			}
//			for(int i=0;i<n;i++) {
//				System.out.println(arr[i]);		
//			}
			
		}
	
	
}
//display odd data
public void displayodddata()
{
	if(head==null)
	{
		System.out.println("LISt is EMpty");
	}
	else {
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			if(temp.data%2==1)
			{
				System.out.println("odd data is "+temp.data);
			}
			
		}
	}
	
}
}