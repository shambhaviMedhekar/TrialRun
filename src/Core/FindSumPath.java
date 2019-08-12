package Core;
/* Class containing left and right child of current 
node and key value*/
class Node1 { 

	int data; 
	Node1 left, right; 

	public Node1(int item) { 
		data = item; 
		left = right = null; 
	} 
} 

// An object of Res is passed around so that the 
// same value can be used by multiple recursive calls. 
class Res { 
	public int val; 
} 

class FindSumPath { 

	// Root of the Binary Tree 
	Node1 root; 

	// This function returns overall maximum path sum in 'res' 
	// And returns max path sum going through root. 
	int findMaxUtil(Node1 node, Res res) 
	{ 

		// Base Case 
		if (node == null) 
			return 0; 

		// l and r store maximum path sum going through left and 
		// right child of root respectively 
		int l = findMaxUtil(node.left, res); 
		int r = findMaxUtil(node.right, res); 

		// Max path for parent call of root. This path must 
		// include at-most one child of root 
		int max_single = Math.max(Math.max(l, r) + node.data, 
								node.data); 


		// Max Top represents the sum when the Node under 
		// consideration is the root of the maxsum path and no 
		// ancestors of root are there in max sum path 
		int max_top = Math.max(max_single, l + r + node.data); 

		// Store the Maximum Result. 
		res.val = Math.max(res.val, max_top); 

		return max_single; 
	} 

	int findMaxSum() { 
		return findMaxSum(root); 
	} 

	// Returns maximum path sum in tree with given root 
	int findMaxSum(Node1 node) { 

		// Initialize result 
		// int res2 = Integer.MIN_VALUE; 
		Res res = new Res(); 
		res.val = Integer.MIN_VALUE; 

		// Compute and return result 
		findMaxUtil(node, res); 
		return res.val; 
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) { 
		FindSumPath tree = new FindSumPath(); 
		tree.root = new Node1(10); 
		tree.root.left = new Node1(2); 
		tree.root.right = new Node1(10); 
		tree.root.left.left = new Node1(20); 
		tree.root.left.right = new Node1(1); 
		tree.root.right.right = new Node1(-25); 
		tree.root.right.right.left = new Node1(3); 
		tree.root.right.right.right = new Node1(4); 
		System.out.println("maximum path sum is : " + 
							tree.findMaxSum()); 
	} 
} 
