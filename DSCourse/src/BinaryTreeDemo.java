
public class BinaryTreeDemo {
public static void main(String[] args) {
	BinarySearchTree binary_tree = new BinarySearchTree();
	binary_tree.insert(52);
	binary_tree.insert(33);
	binary_tree.insert(25);
	binary_tree.insert(39);
	binary_tree.insert(12);
	binary_tree.insert(27);
	binary_tree.insert(34);
	binary_tree.insert(48);
	binary_tree.insert(65);
	binary_tree.insert(60);
	binary_tree.insert(78);
	binary_tree.insert(72);
	binary_tree.insert(90);
	binary_tree.insert(70);
//	System.out.println(binary_tree.find(25));
//	binary_tree.delete(33);
//	System.out.println(binary_tree.find_biggest().getData());
//	System.out.println(binary_tree.root.smallest());
	binary_tree.in_order_traverse(binary_tree.root);
	System.out.println();
	binary_tree.pre_order_traverse(binary_tree.root);
	System.out.println();
	binary_tree.post_order_traverse(binary_tree.root);

	

	
}
}
