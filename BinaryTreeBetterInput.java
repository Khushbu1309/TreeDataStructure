package TreeDataStructure;

import java.util.Scanner;

@SuppressWarnings("hiding")
public class BinaryTreeBetterInput<Integer> {
	public int data;
	@SuppressWarnings("rawtypes")
	public BinaryTreeBetterInput<Integer> left;
	@SuppressWarnings("rawtypes")
	public BinaryTreeBetterInput<Integer> right;

	public BinaryTreeBetterInput(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		BinaryTreeBetterInput root =takeInput(true, 0, true);
		print(root);

	}

	@SuppressWarnings("rawtypes")
	private static void print(BinaryTreeBetterInput root) {
		
			if(root==null) {
				return ;
			}
			System.out.print(root.data+":");
			if(root.left!=null) {
				System.out.print("L"+root.left.data+",");
			}
			if(root.right!=null) {
				System.out.print("R"+root.right.data);
			}
			System.out.println();
			print(root.left);
			print(root.right);
			
	}

	@SuppressWarnings({ "rawtypes", "unused", "resource", "unchecked" })
	private static BinaryTreeBetterInput takeInput(boolean isRoot,int parentData,boolean isLeft) {
		// TODO Auto-generated method stub
		if(isRoot) {
			System.out.println("Enter root data "+ parentData);
		}
		else {
			if(isLeft) {
				System.out.println("Enter left child "+ parentData);
			}
			else {
				System.out.println("Enter right child "+ parentData);
			}
		}
		Scanner scn=new Scanner(System.in);
		int rootVal=scn.nextInt();
		if(rootVal==-1) {
			return null;
		}
		BinaryTreeBetterInput rootNode=new BinaryTreeBetterInput<>(rootVal);
		BinaryTreeBetterInput leftchild=takeInput(false, rootVal, true);
		BinaryTreeBetterInput rightchild=takeInput(false, rootVal, false);
		rootNode.left=leftchild;
		rootNode.right=rightchild;
		return rootNode;
	}

}
