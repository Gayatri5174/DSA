package Demo;

import java.util.Scanner;

class Queue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    
    public Queue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot perform enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;  // Circular increment
        queueArray[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot perform dequeue.");
            return -1;
        }
        int item = queueArray[front];
        front = (front + 1) % capacity; 
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queueArray[front];
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

   
    public boolean isFull() {
        return size == capacity;
    }

 
    public int getSize() {
        return size;
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int capacity = sc.nextInt();

        Queue queue = new Queue(capacity);

        while (true) {
           
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Get Size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number to enqueue: ");
                int item = sc.nextInt();
                queue.enqueue(item);

            } else if (choice == 2) {
                queue.dequeue();

            } else if (choice == 3) {
                int frontElement = queue.peek();
                if (frontElement != -1) {
                    System.out.println("Front element is: " + frontElement);
                }

            } else if (choice == 4) {
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    System.out.println("The queue is not empty.");
                }

            } else if (choice == 5) {
                System.out.println("Current size of the queue: " + queue.getSize());

            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
