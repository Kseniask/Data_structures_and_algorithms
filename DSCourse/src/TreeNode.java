
public class TreeNode {
private int data;
private TreeNode leftChild;
private TreeNode rightChild;
public String traverse_result = "";
//for soft delete
private boolean isDeleted = false;
public TreeNode(int data) {
	this.data = data;
}
public TreeNode getLeftChild() {
	return leftChild;
}
public void setLeftChild(TreeNode leftChild) {
	this.leftChild = leftChild;
}
public TreeNode getRightChild() {
	return rightChild;
}
public void setRightChild(TreeNode rightChild) {
	this.rightChild = rightChild;
}
public int getData() {
	return data;
}

public TreeNode find(int data) {
	if(this.data == data && !isDeleted) {
		return this;
	}
	else if(data < this.data && leftChild != null) {
		return leftChild.find(data);
	}
	else if(data > this.data && rightChild != null){
		return rightChild.find(data);
	}
	else {
	return null;	
	}
	
}

public void insert(int data) {
	TreeNode newNode;
	if(data<this.data) {
		if(leftChild != null) {
		leftChild.insert(data);
		}
		else {
			newNode = new TreeNode(data);
			this.leftChild =newNode;
		}
	}
	else if(data>this.data) {
		if(rightChild != null) {
			rightChild.insert(data);
			}
			else {
				newNode = new TreeNode(data);
				this.rightChild =newNode;
			}
	}
	
}
//for soft delete
public void soft_delete() {
	this.isDeleted = true;
}
//recursive smallest

public int smallest() {
	if(this.getLeftChild() != null) {
		return this.getLeftChild().smallest();
	}
	else {
		return this.getData();
	}
}

@Override
public String toString() {
	return "Node: " + data + "|Left child: "+ leftChild + " |Right child: "+ rightChild + "\n";
}
}