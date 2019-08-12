package RandomCode;


public class FlatteTree {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(5);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(4);;
		root.right.right=new TreeNode(6);
		flatten(root);
	}

	private static void flatten(TreeNode root) {
		TreeNode newRoot=new TreeNode(root.val);
        findNewTree(newRoot,root);
        root=newRoot;
	}

	private static void findNewTree(TreeNode current, TreeNode node) {
		if(node==null){
	        return;
	    }
	    findNewTree(current,node.left);
	    findNewTree(current,node.right);
	        if(node.left!=null){
	            current.right=new TreeNode(node.left.val);
	            current=current.right;
	        }
	        if(node.right!=null){
	            current.right=new TreeNode(node.right.val);
	                current=current.right;
	        }
	    
	        
		
	}

}
