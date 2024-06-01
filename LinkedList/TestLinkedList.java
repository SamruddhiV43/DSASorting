package com.demo.test;

import LinkedList.LinkedListServices;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
            LinkedListServices list=new LinkedListServices();
           //list.addNodebyposition(22,2);
        
            list.addNode(12);
            list.addNodebyposition(22,2);
            list.addNode(23);
          
            list.addNodebyposition(24,1);
          
            list.addNode(42);
           // list.displaydata();
            list.addNode(31);
            list.displaydata();
          int n=  list.deleteNodebyposition(2);
          System.out.println("element deleted is"+n);
            list.displaydata();
           list.deleteNode(24);
           
           list.displaydata();
           list.addNodebyposition(22,2);
           list.displaydata();
           list.displayevendata();
           list.displayodddata();
           list.displaydata();
           
	}

}
