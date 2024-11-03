package Demo;


class Node1 {
    int data;
    Node1 next, prev;

    public Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinked1 {
    Node1 head;

   
    public void insert(int data) {
        Node1 node = new Node1(data);
        if (head == null) {
            head = node;
            return;
        }
        Node1 n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
        node.prev = n; 
    }

   
    public void insertAtStart(int data) {
        Node1 node = new Node1(data);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

   
    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node1 node = new Node1(data);
        Node1 n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }

        node.next = n.next;
        if (n.next != null) {
            n.next.prev = node;
        }
        n.next = node;
        node.prev = n;
    }

  
    public void removeAt(int key) {
        if (head == null) return;

        
        if (head.data == key) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node1 n = head;
        while (n != null && n.data != key) {
            n = n.next;
        }

        if (n != null) {
            if (n.prev != null) {
                n.prev.next = n.next;
            }
            if (n.next != null) {
                n.next.prev = n.prev;
            }
        }
    }

    
    public void show() {
    	
        Node1 node = head;
        
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("null");
    }
}


public class DoublyLinked {
    public static void main(String[] args) {
        DoublyLinked1 lst = new DoublyLinked1();

        System.out.print("Inserting  elemnets in Doubly Linked List: ");
        lst.insert(10);
        lst.insert(20);
        lst.insert(30);
        lst.show();
        System.out.println("=========================================================================");
        System.out.print("Inserting elemnets at index 2 in Doubly Linked List: ");
        lst.insertAt(2, 40);
        lst.show();
        System.out.println("=========================================================================");
        System.out.print("Inserting elemnets at start in Doubly Linked List: ");
        lst.insertAtStart(100);
        lst.show();
        System.out.println("=========================================================================");
        System.out.print("Removind elemnet 20 from Doubly Linked List: ");
        lst.removeAt(20);
        lst.show(); 
    }
}
