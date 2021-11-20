package TreeDataStructure;

import java.util.ArrayList;

public class TreeNode<Integer> {
	public int data;
	public ArrayList<TreeNode<Integer>> children;
	public TreeNode(int data) {
		this.data=data;
		children=new ArrayList<>();
	}
}
