package Core;

import Test.TreeNode;

public class DFSTreeTraversalImpl {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left = new TreeNode(2); 
		root.right = new TreeNode(3); 
		root.left.left = new TreeNode(4); 
		root.left.right = new TreeNode(5);

		System.out.println("DFS Inorder traversal of binary tree is - "); 
		printInorder(root);
		System.out.println();
		System.out.println("DFS Preorder traversal of binary tree is - ");
		printPreorder(root);
		System.out.println();
		System.out.println("DFS Postorder traversal of binary tree is - ");
		printPostorder(root);

	}

	public static void printPostorder(TreeNode root) {
		if(root==null) {
			return;
		}

		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.val+" ");

	}

	public static void printPreorder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" ");
		printPreorder(root.left);
		printPreorder(root.right);

	}

	public static void printInorder(TreeNode root) {
		if(root==null) {
			return;
		}
		printInorder(root.left);
		System.out.print(root.val+" ");
		printInorder(root.right);
	}

}
