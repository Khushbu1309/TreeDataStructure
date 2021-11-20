package TreeDataStructure;

import java.util.Scanner;

public class CreateTree {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		TreeNode<Integer> root=TakeInput(scn);
		print(root);
//		TreeNode<Integer> root=new TreeNode<Integer>(5);
//		TreeNode<Integer> node=new TreeNode<Integer>(6);
//		TreeNode<Integer> node1=new TreeNode<Integer>(7);
//		TreeNode<Integer> node2=new TreeNode<Integer>(8);
//		TreeNode<Integer> node4=new TreeNode<Integer>(9);
//		root.children.add(node);
//		root.children.add(node1);
//		node1.children.add(node4);
//		System.out.println(root);

	}

	public static void print(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s+=root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
		
		
		
	}

	@SuppressWarnings("unused")
	public static TreeNode<Integer> TakeInput(Scanner scn) {
		// TODO Auto-generated method stub
		
		System.out.println("enter rootnode:");
		int n=scn.nextInt();
		TreeNode<Integer> root=new TreeNode<>(n);
		System.out.println("Enter chid:");
		int rootChild=scn.nextInt();
		for(int i=0;i<rootChild;i++) {
			@SuppressWarnings("unused")
			TreeNode<Integer> child=TakeInput(scn);
			root.children.add(child);
		}
		
		return root;
	}

}
