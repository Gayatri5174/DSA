package Demo;

class Queue{
	private int[] queueArray;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.queueArray = new int[capacity];
		this.front = 0;
		this.size = 0;
		this.rear = -1;
	}
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full. Cannot perform enqueue.");
			return;
		}
		rear = (rear +1) % capacity;
		queueArray[rear] = item;
		size ++;
		System.out.println("Enqueued:"+item);
		
	}
	public int dequeue() {
		if(isFull()) {
			System.out.println("Queue is empty. Cannot perform dequeue.");
			return -1;
		}
		int item = queueArray[front];
		front = (front +1) % capacity;
		size --;
		System.out.println("Dequeued: "+item);
		return item;
	}
	public int peek() {
		if(isFull()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return queueArray[front];
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	private boolean isFull() {
		return size == capacity;	
	}
	public int getSize() {
		return size;
	}
}
public class CircularQueueDemo {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println("Front element is: "+queue.peek());
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println("Front element is: "+queue.peek());
		System.out.println("Is the queue empty?: "+queue.isEmpty());
		
		queue.dequeue();
		queue.dequeue();
		
		
		
	}

}
