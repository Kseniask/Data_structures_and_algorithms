
public class DoublyLinkedList {
private DoublyLinkedNode head;

public void insertAtHead(int data) {
	DoublyLinkedNode newNode = new DoublyLinkedNode(data);
	newNode.setNextNode(this.getHead());
	
	if(this.getHead() !=null) {
		this.getHead().setPrevNode(newNode);
	}
	this.setHead(newNode);
}

public int length() {
	int length =0;
	if(this.getHead() == null) {
		return 0;
	}
	else {
		DoublyLinkedNode current = this.getHead();
		length++;
		while(current != null) {
			current = current.getNextNode();
			length++;
		}
		return length;
	}
	
}


@Override 
public String toString() {
	String result = "{";
	DoublyLinkedNode current = this.getHead();
	while(current  !=null) {
		result += current.getData() + ", ";
		current= current.getNextNode();
	}
	result +="}";
	return result;
}

public void sortList(int length) {
	DoublyLinkedNode green, black, prevbl,nextbl, prevgreen;
	black = this.head.getNextNode();
	green = this.head;
	
	for(int i =0; i<length-2; i++) {
		
		if(black.getNextNode() != null) {
			nextbl = black.getNextNode();
		}
		else {
			nextbl = null;
		}
		prevbl = black.getPrevNode();
		while(black.getData() < green.getData()  && green.getPrevNode() != null && black.getData() < green.getPrevNode().getData()) {
			green = green.getPrevNode();
		}	
		if(black.getData() > green.getData()) {
			if(black.getNextNode()!=null) {
				black = black.getNextNode();
				green = black.getPrevNode();
			}
			else {
				green = black;
			}
		}
		else{
			
			prevgreen = green.getPrevNode();
			black.setPrevNode(green.getPrevNode());
			black.setNextNode(green);
			green.setPrevNode(black);
			prevbl.setNextNode(nextbl);
			if(black.getPrevNode() == null) {
				this.head = black;
			}
			else {
				prevgreen.setNextNode(black);
			}
//			
//			System.out.println("black:" + black.getData() + "|green:" +green + "|next:" + green.getNextNode()+ " |prevBl:" + black.getPrevNode() + "|nextBlack: " + black.getNextNode());
//			System.out.println(this.toString());
			if(nextbl !=null) {
			black = nextbl;
			nextbl.setPrevNode(prevbl);
			}
			green = black.getPrevNode();
		}
			
			
	}
}
public DoublyLinkedNode getHead() {
	return head;
}

public void setHead(DoublyLinkedNode head) {
	this.head = head;
}
}
