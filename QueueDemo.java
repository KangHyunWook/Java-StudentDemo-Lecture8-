/*
	Date: 2021.Mar.31
	Programmer: HYUN WOOK KANG
	Description: This program shows an example of Polymorphism
				by implementing two different Queue Data Structures
				that implement the same interface InterQueue, which 
				are LinearQueue and DynamicQueue.
*/

package main;

import queue.*;
class QueueDemo {
	public static void main(String[] args) {
		InterQueue q;
		
		q = new FixedQueue(5);
		System.out.println("========Linear Queue Demo========");
		//LinearQueue enqueue
		for(int i=0; i<6; i++) {
			char item = (char)('A'+i);
			q.enqueue(item);
		}
		//LinearQueue dequeue	
		System.out.println("Output");
		for(int i=0; i<6; i++)	{
			char item = q.dequeue();
			if(item!=' ')
				System.out.print(item+" ");
			else 
				System.out.println("Queue is empty!");
		}
		System.out.println();
		
		q = new DynamicQueue(5);
		System.out.println("========Dynamic Queue Demo========");
		//Dynamic Queue enqueue
		for(int i=0; i<6; i++) {
			char item = (char)('A'+i);
			q.enqueue(item);
		}
		//Dynamic Queue dequeue	
		System.out.println("Output");
		for(int i=0; i<6; i++) {
			char item = q.dequeue();
			if(item!=' ')
				System.out.print(item+" ");
			else 
				System.out.println("Queue is empty!");
		}
		System.out.println();
	}
}