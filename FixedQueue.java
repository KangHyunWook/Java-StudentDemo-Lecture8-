package queue;

public class FixedQueue implements InterQueue{
	int capacity;
	char []queue;
	int first;
	int last;
	
	public FixedQueue(int capacity) {
		this.capacity = capacity;
		queue = new char[capacity];
	}		
	
	public void enqueue(char item) {
		if(isFull()) {
			System.out.println("Queue is full!");
		}
		else {
			queue[last] = item;
			last++;
			System.out.println(item+ " has been inserted successfully!");
		}
	}	
	
	public char dequeue() {
		if(isEmpty())
			return ' ';
		else {
			first++;
			return queue[first-1];
			
		}
	}
	
	boolean isEmpty() {
		if(first == last) 
			return true;
		else 
			return false;
	}
	
	boolean isFull() {
		if(last==capacity)
			return true;
		return false;
	}
}






