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
		Node root = new Node("+");
		root.left = new Node("*");
		root.right = new Node("-");
		root.left.left = new Node("3");
		root.left.right = new Node("5");
        root.right.left = new Node("2");
		root.right.right = new Node("/");
        root.right.right.left = new Node("8");
		root.right.right.right = new Node("4");
        				
		bttraversal treeOrder = new bttraversal();
		
		//PreOrder traversal
		System.out.print("PreOder: ");
		treeOrder.preOrder(root);
		System.out.println("");
		
		//InOrder traversal
		System.out.print("InOder: ");
		treeOrder.inOrder(root);
		System.out.println();
		
		//PostOrder traversal
		System.out.print("PostOder: ");
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
