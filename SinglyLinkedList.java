package Demo;

class Node{
	int data;
	Node next;
	
}
class LinkedList{
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
			}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
		}
	public void insertAtStart(int data) {
		Node node= new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head= node;
	}
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index == 0) {
			insertAtStart(data);
		}
		else {
			Node n = head;
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	public void removeAt(int index, int data){
		if(index == 0) {
			head = head.next;
		}
		else {
			Node n = head;
			Node n1 = null;
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1=null;
		}
	}
	public void show() {
		Node node = head;
		while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
		
	}
}
public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst = new LinkedList();
		lst.insert(10);
		lst.insert(20);
		lst.insert(30);
		lst.insertAt(2, 40);
		lst.insertAtStart(100);
		lst.removeAt(1, 10);
		lst.show();

	}

}
