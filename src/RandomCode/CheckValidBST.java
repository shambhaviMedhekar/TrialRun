package RandomCode;


public class CheckValidBST {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(1);
		root.right=new TreeNode(3);
		boolean result=isValidBST(root) ;
	}
	public static boolean isValidBST(TreeNode root) {
        return isValid(root);
    }
    public static boolean isValid(TreeNode curr){
        if(curr==null){
            return true;
        }
        TreeNode left=curr.left;
        TreeNode right=curr.right;
        isValid(left);
        isValid(right);
        
        if(left.val<=curr.val && curr.val<=right.val){
            return true;
        }
        else{
            return false;
        }
    
    }

}
