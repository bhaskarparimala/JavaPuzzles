package BinaryTree;

class TreeNode {
	private int val;
	private TreeNode left;
	private TreeNode right;
	TreeNode(){};
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	TreeNode(int val){
		this.val=val;
	}
	TreeNode(int val,TreeNode left , TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}
public class MaxDepth {

	public int maxDepth(TreeNode root) {
		//int depth=0;
		if(root==null) return 0;
		if(root.getLeft()==null || root.getRight()==null) return 1;
		int leftDepth=maxDepth(root.getLeft());
		int rightDepth=maxDepth(root.getRight());
		return Math.max(leftDepth,rightDepth) + 1;
		
		
	}
	
	public static void main(String args[]) {
		TreeNode node = new TreeNode();
	}
}
