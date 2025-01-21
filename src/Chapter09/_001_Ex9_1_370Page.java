package Chapter09;

class TreeNode {
	Object data;
	TreeNode left;
	TreeNode right;
}

class LinkedTree {
private TreeNode root;
	
	public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		return root;
	}
	
	public void preorder(TreeNode root) {
		if(root != null) {
			System.out.printf("%c", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.printf("%c", root.data);
		}
	}
	
	public void postorder(TreeNode root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.printf("%c", root.data);
		}
	}
}

public class _001_Ex9_1_370Page {
	
	public static void main(String[] args) {
		LinkedTree T = new LinkedTree();
		
		TreeNode n7 = T.makeBT(null, 'D', null);
		
	}
}