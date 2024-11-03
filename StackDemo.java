package Demo;
import java.util.Scanner;

class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

   
    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot perform push.");
            return;
        }
        stackArray[++top] = item;
        System.out.println("Pushed: " + item);
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot perform pop.");
            return -1;
        }
        int item = stackArray[top--];
        System.out.println("Popped: " + item);
        return item;
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

 
    public boolean isEmpty() {
        return top == -1;
    }

   
    public boolean isFull() {
        return top == capacity - 1;
    }

   
    public int getSize() {
        return top + 1;
    }
}


public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the stack: ");
        int capacity = sc.nextInt();

        Stack stack = new Stack(capacity);

        while (true) {
         
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Get Size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number to push: ");
                int item = sc.nextInt();
                stack.push(item);

            } else if (choice == 2) {
                stack.pop();

            } else if (choice == 3) {
                int topElement = stack.peek();
                if (topElement != -1) {
                    System.out.println("Top element is: " + topElement);
                }

            } else if (choice == 4) {
                if (stack.isEmpty()) {
                    System.out.println("The stack is empty.");
                } else {
                    System.out.println("The stack is not empty.");
                }

            } else if (choice == 5) {
                System.out.println("Current size of the stack: " + stack.getSize());

            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

       
    }
}
