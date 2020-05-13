
public class DoublyLinkedDemo {
public static void main(String[] args) {
	DoublyLinkedList integers = new DoublyLinkedList();
	
	integers.insertAtHead(1);
	integers.insertAtHead(20);
	integers.insertAtHead(11);
	integers.insertAtHead(7);
	integers.insertAtHead(22);
	
	System.out.println(integers);
	integers.sortList(integers.length());
	System.out.println(integers);
}
}
