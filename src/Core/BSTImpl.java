package Core;

import Test.TreeNode;

public class BSTImpl {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(8);
		root.left = new TreeNode(3); 
		root.right = new TreeNode(10); 
		root.left.left = new TreeNode(1); 
		root.left.right = new TreeNode(6);
		root.left.right.left = new TreeNode(4);
		root.left.right.right = new TreeNode(7);
		root.right.right = new TreeNode(14);
		root.right.right.left = new TreeNode(13);
		boolean present=findNode(root,14);
		System.out.println(present);
		
		insertNode(root,12);
		BinaryTree tree_level = new BinaryTree();
		tree_level.root=root;
		System.out.println("BFS Inorder traversal of binary tree is - "); 
		tree_level.printBFS();
		System.out.println();
		DFSTreeTraversalImpl dfs=new DFSTreeTraversalImpl();
		System.out.println("DFS Inorder traversal of binary tree is - "); 
		dfs.printInorder(root);
		System.out.println();
		System.out.println("DFS Preorder traversal of binary tree is - ");
		dfs.printPreorder(root);
		System.out.println();
		System.out.println("DFS Postorder traversal of binary tree is - ");
		dfs.printPostorder(root);
	}

	private static boolean insertNode(TreeNode node, int i) {
		if(node==null) {
			return true;
		}
		boolean endFound;
		if(node.val>i) {
			endFound=insertNode(node.left,i);
			if(endFound) {
				node.left=new TreeNode(i);
			}
		}
		else {
			endFound=insertNode(node.right,i);
			if(endFound) {
				node.right=new TreeNode(i);
			}
		}
		return false;
	}

	private static boolean findNode(TreeNode node, int i) {
		if(node==null) {
			return false;
		}
		if(node.val==i) {
			return true;
		}
		boolean found;
		if(i>node.val) {
			found=findNode(node.right,i);
		}
		else {
			found=findNode(node.left,i);
		}
		return found;
	}

}
