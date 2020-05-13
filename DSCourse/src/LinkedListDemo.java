
public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.insertNode(5);
	list.insertNode(10);
	list.insertNode(12);
	list.insertNode(1);

	list.deleteHead();
System.out.println(list);
System.out.println("Length: " + list.length());
System.out.println("Found: " + list.find(12));
}
}
