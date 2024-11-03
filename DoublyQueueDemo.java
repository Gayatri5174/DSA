package Demo;

import java.util.Scanner;

class Node5 {
    int data;
    Node5 next;
    Node5 prev;

    public Node5(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyQueue {
    private Node5 front;
    private Node5 rear;
    private int size;

   
    public DoublyQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

 
    public void enqueue(int item) {
        Node5 newNode = new Node5(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot perform dequeue.");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null; 
        }
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

 
    public boolean isEmpty() {
        return front == null;
    }

   
    public int getSize() {
        return size;
    }
}

public class DoublyQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyQueue queue = new DoublyQueue();

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
