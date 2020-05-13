
public class BinarySearchTree {
public TreeNode root;
public void insert(int data) {
	if(root == null) {
		root = new TreeNode(data);
	}
	else {
		root.insert(data);
	}
}
public TreeNode find(int data) {
if(root != null) {
	return root.find(data);
}
	return null;
}
public void delete(int data) {
	TreeNode current = this.root;
	TreeNode parent = root;
	
	if(current == null) return;
	
	while(current != null && current.getData() != data) {
		parent = current;
		if(data< current.getData()) {
			current = current.getLeftChild();
		}
		else {
			current = current.getRightChild();
		}
	}
	
	if(current == null) {
		return;
	}
	if(current.getLeftChild() == null && current.getRightChild() == null) {
		if(current == root) {
			this.root = null;
		}
		else if(current.getData()<parent.getData()) {
			parent.setLeftChild(null);
		}
		else {
			parent.setRightChild(null);
		}
		
	}
	//if there is one child
	else if(current.getRightChild() == null) {
		if(current == root) {
			root = current.getLeftChild();
		}
		else if(current.getData()<parent.getData()) {
			parent.setLeftChild(current.getLeftChild());
		}
		else {
			parent.setRightChild(current.getLeftChild());
		}
	}
	else if(current.getLeftChild() == null) {
		if(current == root) {
			root = current.getRightChild();
		}
		else if(current.getData()<parent.getData()) {
			parent.setLeftChild(current.getRightChild());
		}
			
		else {
			parent.setRightChild(current.getRightChild());
		}
	}
	//if there are 2 children
	else if(current.getLeftChild() != null && current.getRightChild() != null) {
		TreeNode successor = current.getRightChild();
		TreeNode s_parent = current;
		while(successor.getData() > current.getData() && successor.getLeftChild()!=null) {
			s_parent = successor;
			successor = successor.getLeftChild();
			
		}
//		System.out.println("Successor: " + successor.getData());
		if( current.getData() < parent.getData()) {
		parent.setLeftChild(successor);
		successor.setRightChild(current.getRightChild());
		successor.setLeftChild(current.getLeftChild());
		s_parent.setLeftChild(null);
		
		
	}
	}
}
public void soft_delete(int data) {
	this.find(data).soft_delete();

}

public TreeNode find_smallest() {
	TreeNode smallest = root;
	while(smallest.getLeftChild() != null) {
		smallest = smallest.getLeftChild();
	}
	
	return smallest;
}
public TreeNode find_biggest() {
	TreeNode biggest = root;
	while(biggest.getRightChild() != null) {
		biggest = biggest.getRightChild();
	}
	return biggest;
}
public void in_order_traverse(TreeNode node) {
	if(node == null) {
		return;
	}
	in_order_traverse(node.getLeftChild());
	System.out.print(node.getData() + ", ");
	in_order_traverse(node.getRightChild());
}
public void pre_order_traverse(TreeNode node) {
	if(node == null) {
		return;
	}
	System.out.print(node.getData()+ ", ");
	pre_order_traverse(node.getLeftChild());
	pre_order_traverse(node.getRightChild());
}
public void post_order_traverse(TreeNode node) {
	if(node ==null) {
		return;
	}
	post_order_traverse(node.getLeftChild());
	post_order_traverse(node.getRightChild());
	System.out.print(node.getData() + ", ");
	
}
@Override
public String toString() {
	return root.toString();
}
}
