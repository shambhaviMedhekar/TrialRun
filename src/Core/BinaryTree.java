package Core;

import java.util.LinkedList;
import java.util.Queue;

import Test.TreeNode;

public class BinaryTree{
	public TreeNode root;
	void printBFS() {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode temp=queue.poll();
			System.out.print(temp.val+" ");
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
	}
	
}