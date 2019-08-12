package Test;
public class BST {

	public static void main(String[] args) {
		int[] preorder= {4,5,14,20};
		TreeNode root=bstFromPreorder(preorder);
	}
	public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root =new TreeNode(preorder[0]);
        TreeNode currentRoot=root;
        TreeNode prevRoot=root;
        boolean changedSide=false;
        boolean onRightSide=false;
        for(int i=1;i<preorder.length;i++){
            int value=preorder[i];
            if(value>root.val && !changedSide){
                changedSide=true;
                currentRoot=root;
                prevRoot=root;
            }
            else if(value>currentRoot.val && prevRoot!=root && !onRightSide){
                currentRoot=prevRoot;
            }
            onRightSide=false;
            if(currentRoot.val>value){
                prevRoot=currentRoot;
                currentRoot.left=new TreeNode(value);
                currentRoot=currentRoot.left;
            }
            else if(currentRoot.val<value){
                prevRoot=currentRoot;
                currentRoot.right=new TreeNode(value);
                currentRoot=currentRoot.right;
                onRightSide=true;
            }
            
        }
        return root;
    }
}
