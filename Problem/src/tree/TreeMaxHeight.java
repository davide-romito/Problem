package tree;

public class TreeMaxHeight {

	/**
	 * Given a root node of a tree, this method will return the max height of
	 * the tree.
	 * 
	 * @param node
	 *            - the root node
	 * @return the max height of the tree
	 */
	public int getMaxHeight(Node node) {
		int height = 1;
		Node[] n = node.getChildren();
		for (int i = 0; i < n.length; i++) {
			int tmpHeight;
			if (n[i].childrenCount() == 0) {
				tmpHeight = 2;
			} else {
				tmpHeight = getMaxHeight(n[i]) + 1;
			}
			if (tmpHeight > height) {
				height = tmpHeight;
			}
		}
		return height;
	}

}
