package TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class takeInputLevelWise {

	public static TreeNode<Integer> TakeInput(){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter root node ");
		int rootdata=scn.nextInt();
		TreeNode<Integer>root=new TreeNode<>(rootdata);
		Queue<TreeNode<Integer>> nodes=new LinkedList<>();
		nodes.add(root);
		while(!nodes.isEmpty()) {
			TreeNode<Integer>frontNode=nodes.poll();
			System.out.println("Enter child count of "+frontNode.data);
			int childCount=scn.nextInt();
			for(int i=0;i<childCount;i++) {
				System.out.println("Enter " +(i+1)+" child ");
				int child=scn.nextInt();
				TreeNode<Integer> childNode=new TreeNode<>(child);
				frontNode.children.add(childNode);
				nodes.add(childNode);
			}
		}
		return root;
	}

	public static void printNodes(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>>Q=new LinkedList<>();
		Q.add(root);
		while(!Q.isEmpty()){
			TreeNode<Integer> frontNode=Q.poll();
			System.out.print(frontNode.data+" ");
			for(int i=0;i<frontNode.children.size();i++) {
				Q.add(frontNode.children.get(i));
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=TakeInput();
		printNodes(root);
		int nodesCount=NumberOfNodesInTree(root);
		System.out.println();
		System.out.println(count);

	}
	static int count=1;
	private static int NumberOfNodesInTree(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		
		for(int i=0;i<root.children.size();i++) {
			count++;
			NumberOfNodesInTree(root.children.get(i));
		}		
		return count;
	}
	public static int largest(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int large=root.data;
		for(int i=0;i<root.children.size();i++) {
			int largestFromRestNodes=largest(root.children.get(i));
			if(largestFromRestNodes>large) {
				large=largestFromRestNodes;
			}
			
		}
		return large;
	}

}
