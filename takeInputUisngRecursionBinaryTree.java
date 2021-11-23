package TreeDataStructure;

import java.util.Scanner;

public class takeInputUisngRecursionBinaryTree {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		binaryTreeNode<Integer>root=takeInputUsingRecursion();
		printBinaryTree1(root);

	}
	private static void printBinaryTree1(binaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		System.out.print(root.data+":");
		if(root.leftChild!=null) {
			System.out.print("L"+root.leftChild.data+",");
		}
		if(root.rightChild!=null) {
			System.out.print("R"+root.rightChild.data);
		}
		System.out.println();
		printBinaryTree1(root.leftChild);
		printBinaryTree1(root.rightChild);
		
	}

	@SuppressWarnings({ "unused", "resource" })
	public static binaryTreeNode<Integer> takeInputUsingRecursion() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter root data ");
		int rootdata=scn.nextInt();
		
		if(rootdata==-1) {
			return null;
		}
		binaryTreeNode<Integer>root=new binaryTreeNode<>(rootdata);
		binaryTreeNode<Integer>leftChildNode=takeInputUsingRecursion();
		binaryTreeNode<Integer>rightChildNode=takeInputUsingRecursion();
		root.leftChild=leftChildNode;
		root.rightChild=rightChildNode;
		
		return root;
	}

}
