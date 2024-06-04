package com.demo.test;

import com.demo.queue.Queuelinkedlist;

public class TestQueueLinkedlist {

	public static void main(String[] args) {
		Queuelinkedlist qlinkedl=new Queuelinkedlist();
		qlinkedl.enqueue(10);
		qlinkedl.enqueue(120);
		qlinkedl.enqueue(21);
		qlinkedl.enqueue(1);
		qlinkedl.enqueue(34);
		qlinkedl.displayQueue();
		System.out.println(qlinkedl.dequeue());
		System.out.println(qlinkedl.dequeue());
		System.out.println(qlinkedl.dequeue());
	}

}
