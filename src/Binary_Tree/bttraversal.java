package Binary_Tree;

public class bttraversal {
    public void preOrder(Node root) {
        if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void main(String args[]) {
		Node root = new Node("a");
		root.left = new Node("b");
		root.right = new Node("c");
		root.left.left = new Node("d");
		root.left.right = new Node("e");
        root.right.left = new Node("f");
        root.left.left.left = new Node("g");
        root.left.left.right = new Node("h");
        root.left.right.right = new Node("i");
        root.right.left.right = new Node("j");
				
		bttraversal treeOrder = new bttraversal();
		
		//PreOrder traversal
		treeOrder.preOrder(root);
		System.out.println("");
		
		//InOrder traversal
		treeOrder.inOrder(root);
		System.out.println();
		
		//PostOrder traversal
		treeOrder.postOrder(root);
		System.out.println();
	}
}

class Node {
	String data;
	Node left;
	Node right;
	
	Node(String string) {
		data = string;
		left = right = null;
	}
}
