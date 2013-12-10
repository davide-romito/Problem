package tree;

public interface Node {
	/**
	 * This method return the number of the children of the node
	 */
	public int childrenCount();

	/**
	 * This method return the array of node that are children of the node
	 */
	public Node[] getChildren();
}
