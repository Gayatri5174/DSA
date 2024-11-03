package Demo;

public class CircularLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class CircularLinkedList1 {
        Node head;

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {        
                head = newNode;
                newNode.next = head;   
            } else {
                Node temp = head;
                while (temp.next != head) {   
                    temp = temp.next;
                }
                temp.next = newNode;    
                newNode.next = head;    
            }
        }

     
        public void display() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = head;
            System.out.print("Circular Linked List: ");
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println(head.data);
        }

       
        public void remove(int key) {
            if (head == null) return;  

            Node temp = head;
            Node prev = null;

           
            if (temp.data == key) {
                if (temp.next == head) {  
                    head = null;
                } else {
                    while (temp.next != head) {  
                        temp = temp.next;
                    }
                    temp.next = head.next;   
                    head = head.next;        
                }
                return;
            }

           
            while (temp.next != head && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

           
            if (temp.data == key) {
                prev.next = temp.next;   
            } else {
                System.out.println("Key not found: " + key);
            }
        }
    }

    
    public static void main(String[] args) {
        CircularLinkedList outer = new CircularLinkedList();
        CircularLinkedList1 cll = outer.new CircularLinkedList1();
        
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.display();
        cll.remove(20);
        cll.display();
        cll.remove(50);
        cll.remove(10);
        cll.display();
    }
}
