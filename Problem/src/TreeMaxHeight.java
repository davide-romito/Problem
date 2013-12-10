public class TreeMaxHeight {

	public int getMaxHeight(Node node) {
		int height = 0;
		Node[] n = node.getChildren();
		for (int i = 0; i < n.length; i++) {
			int tmpHeight = 0;
			if (n[i].childrenCount() == 0) {
				tmpHeight = 1;
			} else {
				tmpHeight = getMaxHeight(n[i]) + 1;
			}
			if (tmpHeight > height) {
				height = tmpHeight;
			}
		}
		return height;
	}

	interface Node {
		public int childrenCount();
		public Node[] getChildren();
	}
}
