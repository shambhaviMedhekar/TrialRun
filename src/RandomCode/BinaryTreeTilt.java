package RandomCode;


public class BinaryTreeTilt {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=null;
		root.right.left=new TreeNode(5);
		root.right.right=null;
		int value=findTilt(root);

	}
	static int tilt=0;
    public static int findTilt(TreeNode root) {
        totalValue(root);
        return tilt;
    }
    public static int totalValue(TreeNode root){
        if (root == null )
            return 0;
        int left = totalValue(root.left);
        int right = totalValue(root.right);
        tilt += Math.abs(left-right);
        return left + right + root.val;
    }
}
