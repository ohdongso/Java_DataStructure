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
			return newNode;
		} else if(newNode.data < p.data) {
			p.left = insertKey(p.left, x);
			return p;
		} else if(newNode.data > p.data) {
			p.right = insertKey(p.right, x);
			return p;
		} else {
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

	public TreeNode1 getRoot() {
		return root;
	}

}

public class _002_Ex9_2_383Page {
	
	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		bsT.insertBST('G');
		// bsT.insertBST('I');
		// bsT.insertBST('H');
		
		// bsT.insertBST('D');
		
		System.out.println("------------------------------------------------");
		System.out.println("bsT.getRoot().data : " + bsT.getRoot().data);
		System.out.println("bsT.getRoot().left : " + bsT.getRoot().left);
		// System.out.println("bsT.getRoot().left : " + bsT.getRoot().right); ==> 저장된 노드 위치(G)
		System.out.println("bsT.getRoot().right.data : " + bsT.getRoot().right.data);
		
		
		
		System.out.println("------------------------------------------------");
		System.out.println("bsT.getRoot().data : " + bsT.getRoot().data);
		System.out.println("bsT.getRoot().left : " + bsT.getRoot().left);
		System.out.println("bsT.getRoot().right.data : " + bsT.getRoot().right.data);
		// System.out.println("bsT.getRoot().right.right : " + bsT.getRoot().right.right); ==> 저장된 노드 위치(I)
		System.out.println("bsT.getRoot().right.right.data : " + bsT.getRoot().right.right.data);
		
		/*
		System.out.println("------------------------------------------------");
		System.out.println("bsT.getRoot().data : " + bsT.getRoot().data);
		System.out.println("bsT.getRoot().left : " + bsT.getRoot().left);
		System.out.println("bsT.getRoot().right.data : " + bsT.getRoot().right.data);
		System.out.println("bsT.getRoot().right.right.data : " + bsT.getRoot().right.right.data);
		// System.out.println("bsT.getRoot().right.right.data : " + bsT.getRoot().right.right.left); ==> 저장된 노드 위치(H)
		System.out.println("bsT.getRoot().right.right.data : " + bsT.getRoot().right.right.left.data);
		*/
		
		/*
		System.out.println("bsT.getRoot().right.right : " + bsT.getRoot().right.left);
		System.out.println("bsT.getRoot().right.right : " + bsT.getRoot().right.left.data);
		System.out.println("bsT.getRoot().right.right.data : " + bsT.getRoot().right.right.data);
		*/
		
		
		
		
		
		
		// System.out.printf("\nBinary Tree >>> ");
		// bsT.printBST();

	}	
}










