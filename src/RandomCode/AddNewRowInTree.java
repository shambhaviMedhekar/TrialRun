package RandomCode;



import java.util.Stack;

public class AddNewRowInTree {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(8);
		root.right=new TreeNode(9);
		root.left.left=new TreeNode(2);
		root.left.right=new TreeNode(7);
		root.left.left.left=new TreeNode(8);
		root.left.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(3);
		int v=1;
		int d=3;
		//TreeNode newRoot=addOneRow(root, v, d);
		System.out.println(isHappy(19));
		

	}
	 public static TreeNode addOneRow(TreeNode root, int v, int d) {
	        if(d==1){
	            TreeNode newRoot=new TreeNode(v);
	            newRoot.left=root;
	            return newRoot;
	        }
	        Stack<TreeNode> values=new Stack();
	        values.add(root);
	        getTargetNode(root,null,0,d,v);
	        int currentLevel=1;
	        while(currentLevel!=d) {
	        	TreeNode curr=values.peek() ;
	        	if(curr.left!=null) {
	        		values.add(curr.left);
	        	}
	        	if(curr.right!=null) {
	        		values.add(curr.right);
	        	}
	        	currentLevel++;
	        			
	        }
	        getTarget(root,values,d,v,0);
	        return root;
	    }
	    private static void getTarget(TreeNode root, Stack<TreeNode> values, int d, int v, int current) {
	    	
		
	}
		public static void getTargetNode(TreeNode node,TreeNode prev,int currentLevel,int d,int v){
	       
	    	 if(node==null){
	             return;
	         }
	          if(currentLevel==(d-1)){
	 	            TreeNode newNodeLeft=new TreeNode(v);
	 	            TreeNode newNodeRight=new TreeNode(v);
	 	            newNodeLeft.left=prev.left;
	 	            newNodeRight.right=prev.right;
	 	            prev.left=newNodeLeft;
	 	            prev.right=newNodeRight;
	 	            
	 	        }
	 	        else {
	 	        currentLevel++;
	 	        getTargetNode(node.left,node,currentLevel,d,v);
	 	        getTargetNode(node.right,node,currentLevel,d,v);
	 	        }
	        
	    }
		 public static boolean isHappy(int n) {
		        int sum=0;
		        while(sum!=1){
		            sum=0;
		            while(n>0){
		                int x=n%10;
		                n=n/10;
		                sum+=x*x;
		            }
		            if(sum==1){
		                break;
		            }
		            n=sum;
		        }
		        return true;
		    }
}
