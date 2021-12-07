package TreeDataStructure;

public class BinaryTreeMirrorImage {

	public BinaryTreeMirrorImage() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "static-access", "unused", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeBetterInput obj=new BinaryTreeBetterInput(0);
		BinaryTreeBetterInput root=obj.takeInput(true, 0, true);
		System.out.println("display tree");
		obj.print(root);
		System.out.println();
		BinaryTreeBetterInput newroot=MirrorImage(root);
		System.out.println("display mirror image of binary tree");
		BinaryTreeBetterInput obj1=new BinaryTreeBetterInput<>(0);
		obj1.print(root);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static BinaryTreeBetterInput MirrorImage(BinaryTreeBetterInput root) {
		if(root==null) {
			return null;
		}
		BinaryTreeBetterInput temp=MirrorImage(root.left);
		root.left=MirrorImage(root.right);
		root.right=MirrorImage(temp);
		return root;
		
		
	}

}
