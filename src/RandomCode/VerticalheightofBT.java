package RandomCode;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Core.BinaryTree;
import Test.TreeNode;

public class VerticalheightofBT {

	public static void main(String[] args) {
		BinaryTree tree_level = new BinaryTree();
		tree_level.root=new TreeNode(4);
		tree_level.root.left=new TreeNode(2);
		tree_level.root.left.left=new TreeNode(1);
		tree_level.root.left.right=new TreeNode(3);
		tree_level.root.right=new TreeNode(6);
		tree_level.root.right.left=new TreeNode(5);
		tree_level.root.right.right=new TreeNode(7);
		HashMap map = new HashMap(); 
		int index=0;
		findMaxHeight(tree_level.root,map,index);
		System.out.println("Height is");
		int maxVal=0;
		Iterator it = map.entrySet().iterator();
		Iterator it2=map.keySet().iterator();
	    while (it.hasNext()) {
	    	String value=(String) it2.next();
	        Map.Entry pair = (Map.Entry)it.next();
	        if((int)pair.getValue()>maxVal) {
	        	maxVal=(int)pair.getValue();
	        }
	    }
	    System.out.println(maxVal);
	}

	private static void findMaxHeight(TreeNode node, HashMap map, int index) {
		if(node==null) {
			return ;
		}
		findMaxHeight(node.left,map,index-1);
		findMaxHeight(node.right,map,index+1);
		if(map.get(index)==null) {
			map.put(index, node.val);
		}
		else {
			map.put(index,(int)map.get(index)+node.val);
		}
		
	}

}
