package TreeDataStructure;

@SuppressWarnings("hiding")
public class binaryTreeTraversal<Integer> {

	

	@SuppressWarnings({ "rawtypes", "static-access", "unchecked" })
	public static void main(String[] args) {
		BinaryTreeBetterInput obj=new BinaryTreeBetterInput(0);
		BinaryTreeBetterInput root =obj.takeInput(true, 0, true);
		obj.print(root);
		treePreorder(root);
		System.out.println();
		treePostorder(root);
		System.out.println();
		inOrder(root);
	}

	@SuppressWarnings("rawtypes")
	private static void treePostorder(BinaryTreeBetterInput root) {
		if(root==null) {
			return ;
		}
		treePostorder(root.left);
		treePostorder(root.right);
	
		System.out.print(root.data+" ");
	
		
		
	}

	@SuppressWarnings("rawtypes")
	private static void inOrder(BinaryTreeBetterInput root) {
		if(root==null) {
			return ;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}

	@SuppressWarnings("rawtypes")
	private static void treePreorder(BinaryTreeBetterInput root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		treePreorder(root.left);
		treePreorder(root.right);
		
	}

}
