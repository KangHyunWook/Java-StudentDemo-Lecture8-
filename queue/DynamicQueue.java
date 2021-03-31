package queue;

public class DynamicQueue implements InterQueue {
	int capacity;
	char []queue;
	int size;
	int first;
	int last;
	
	public DynamicQueue(int capacity) {
		this.capacity = capacity;
		queue = new char[capacity];
		size = 0;
		first = 0;
	}				
	
	public void enqueue(char item) {
		if(isFull()) {
			System.out.println("Queue is full and resizing");
			char []tempQueue =queue;
			queue = new char[capacity*2];
			for(int i=0; i<capacity; i++) {
				queue[i] =tempQueue[i];
			}
			capacity*=2;
		}
		queue[size]=item;
		size++;
		System.out.println(item+" has been succesfully inserted");
	}
	
	public char dequeue() {
		size--;
		first++;
		return queue[first-1];
	}
	
	boolean isFull() {
		if(size==capacity)
			return true;
		else 
			return false;
	}
}	













