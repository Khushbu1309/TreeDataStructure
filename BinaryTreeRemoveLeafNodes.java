package TreeDataStructure;

import java.util.Scanner;

@SuppressWarnings("hiding")
public class BinaryTreeRemoveLeafNodes{
	@SuppressWarnings("rawtypes")
	public BinaryTreeRemoveLeafNodes left;
	@SuppressWarnings("rawtypes")
	public BinaryTreeRemoveLeafNodes right;
	public int data;

	public BinaryTreeRemoveLeafNodes(int data) {
		this.data=data;
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		BinaryTreeRemoveLeafNodes root=TakeInput();
		BinaryTreeDisplay(root );
		System.out.println();
		System.out.println("LESF NODES ARE :");
		BinaryTreeLeafNodesDisplay(root);
		BinaryTreeRemoveLeafNodes RootAfterRemovingLeag=RemoveLeafNodes(root);
		System.out.println();
		System.out.println("AFTER REMOVE LEAF NODES ");
		BinaryTreeDisplay(root );
	}

	private static BinaryTreeRemoveLeafNodes RemoveLeafNodes(BinaryTreeRemoveLeafNodes root) {
		
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			return  null;
		}
		root.left=RemoveLeafNodes(root.left);
		 root.right=RemoveLeafNodes(root.right);
		 return root;
	}

	private static void BinaryTreeLeafNodesDisplay(BinaryTreeRemoveLeafNodes root) {
		if(root==null) {
			return ;
		
		}
		if(root.left==null && root.right==null) {
			System.out.print(root.data+" ");
		}
		BinaryTreeLeafNodesDisplay(root.left);
		BinaryTreeLeafNodesDisplay(root.right);
		
	}

	@SuppressWarnings("rawtypes")
	private static void BinaryTreeDisplay(BinaryTreeRemoveLeafNodes root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		BinaryTreeDisplay(root.left);
		BinaryTreeDisplay(root.right);
		
		
		
	}

	@SuppressWarnings({ "rawtypes", "unused", "resource", "unchecked" })
	private static BinaryTreeRemoveLeafNodes TakeInput() {
		Scanner scn=new Scanner(System.in);
		System.out.println("	Entere root data ");
	
		int rootdata=scn.nextInt();
		
		if(rootdata==-1) {
			return null;
		}
		BinaryTreeRemoveLeafNodes rootNode=new BinaryTreeRemoveLeafNodes(rootdata);
		rootNode.left=TakeInput();
		rootNode.right=TakeInput();
		rootNode.left=rootNode.left;
		rootNode.right=rootNode.right;
		return rootNode;
	}

}
