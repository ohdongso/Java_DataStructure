package Chapter09;

class TreeNode1 {
	char data;
	TreeNode1 left;
	TreeNode1 right;
}

class BinarySearchTree {
	private TreeNode1 root = new TreeNode1();
	
	public TreeNode1 insertKey(TreeNode1 root, char x) {
		TreeNode1 p = root;
		
		TreeNode1 newNode = new TreeNode1();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		if(p == null) {
			System.out.println("확인1");
			return newNode;
		} else if(newNode.data < p.data) {
			System.out.println("확인2");
			p.left = insertKey(p.left, x);
			return p;
		} else if(newNode.data > p.data) {
			System.out.println("확인3");
			System.out.println("newNode.data : " + newNode.data);
			System.out.println("p.data : " + p.data);
			p.right = insertKey(p.right, x);
			return p;
		} else {
			System.out.println("확인4");
			return p;
		}
	}
	
	public void insertBST(char x) {
		root = insertKey(root, x);
	}
	
	public TreeNode1 searchBST(char x) {
		TreeNode1 p = root;
		while(p != null) {
			if(x < p.data) {
				p = p.left;
			} else if(x > p.data) {
				p = p.right;
			} else {
				return p;
			}
		}
		return p;
	}
	
	public void inorder(TreeNode1 root) {
		if(root != null) {
			inorder(root.left);
			System.out.printf(" %C", root.data);
			inorder(root.right);
		}
	}
	
	public void printBST() {
		inorder(root);
		System.out.println();
	}
	
}

public class _002_Ex9_2_383Page {
	
	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		bsT.insertBST('G');
//		bsT.insertBST('I');
		
		
		
	}	
}







