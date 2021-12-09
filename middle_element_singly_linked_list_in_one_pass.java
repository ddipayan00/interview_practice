class Main {
    // SinglyLinkedList Node
	class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	// Head and Tail Pointer
	Node head = null;
	Node tail = null;
	// Middle Finder
	void printMiddle(){
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
		}
		System.out.println(slow.data);
		
	}
	// AddNode to List
	public void addNode(int data){
		Node node = new Node(data);
		if(head == null){
		    head = node;
		    tail = node;
		}
		else{
		     tail.next = node;
		     tail = node;
		}
	}
	// Print LinkedList
	public void printList()
	{
		Node curr = head;
		while (curr != null)
		{
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.println("NULL");
	}
    // Main Function
	public static void main(String [] args) {
	    // LinkedList 1 --------------------
		Main llist = new Main();
		int x = 10;
		for(int i=0;i<100;i++){
		    llist.addNode(x);
		    x+=10;
		}
		llist.printList();
		llist.printMiddle();
		
		
		// LinkedList 2 --------------------
		Main llist2 = new Main();
		x = 10;
		for(int i=0;i<6;i++){
		    llist2.addNode(x);
		    x+=10;
		}
		llist2.printList();
		llist2.printMiddle();
	}
}
