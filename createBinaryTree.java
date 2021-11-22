package TreeDataStructure;
public class createBinaryTree {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		binaryTreeNode<Integer> root=new binaryTreeNode<>(1);
		binaryTreeNode<Integer> rootRightChild=new binaryTreeNode<>(4);
		binaryTreeNode<Integer> rootLeftChild=new binaryTreeNode<>(5);
		root.rightChild=rootRightChild;
		root.leftChild=rootLeftChild;
		binaryTreeNode<Integer> child1=new binaryTreeNode<>(6);
		binaryTreeNode<Integer> child2=new binaryTreeNode<>(7);
		binaryTreeNode<Integer> child3=new binaryTreeNode<>(8);
		binaryTreeNode<Integer> child4=new binaryTreeNode<>(9);
		rootRightChild.rightChild=child1;
		rootRightChild.leftChild=child3;
		rootLeftChild.rightChild=child4;
		rootLeftChild.leftChild=child2;
		printBinaryTree(root);
	}
	@SuppressWarnings("rawtypes")
	public static void printBinaryTree(binaryTreeNode root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data);
		printBinaryTree(root.leftChild);
		printBinaryTree(root.rightChild);
	}
}
