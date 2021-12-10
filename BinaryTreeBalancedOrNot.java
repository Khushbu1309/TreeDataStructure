package BinaryTree;

public class BinaryTreeBalancedOrNot {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNodeClass obj=new BinaryTreeNodeClass(0);
		BinaryTreeNodeClass root=obj.BinaryTreeTakeInput(true,0,false);
		obj.BinaryTreePrint(root);
		System.out.println(IsTreebalanced(root));

	}

	private static boolean IsTreebalanced(BinaryTreeNodeClass root) {
		if(root==null) {
			return true;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		if(Math.abs(rh-lh)>1) {
			return false;
		}
		boolean lr=IsTreebalanced(root.left);
		boolean rr=IsTreebalanced(root.right);
		return lr && rr;
		
	}

	private static int height(BinaryTreeNodeClass root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		int l=height(root.left);
		int r=height(root.right);
		return 1+Math.max(l, r);
	}

}
