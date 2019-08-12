package Core;

import java.util.LinkedList;
import java.util.Queue;

import Test.TreeNode;

public class BFSTreeTraversalImpl {

	public static void main(String[] args) {
		 BinaryTree tree_level = new BinaryTree(); 
	        tree_level.root = new TreeNode(1); 
	        tree_level.root.left = new TreeNode(2); 
	        tree_level.root.right = new TreeNode(3); 
	        tree_level.root.left.left = new TreeNode(4); 
	        tree_level.root.left.right = new TreeNode(5); 
	  
	        System.out.println("BFS traversal of binary tree is - "); 
	        tree_level.printBFS();
	        
	        
	}

}
