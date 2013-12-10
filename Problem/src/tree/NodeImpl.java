package tree;

public class NodeImpl implements Node {

	private String nodeId;
	private Node[] children;

	public NodeImpl(String nodeId, Node[] children) {
		super();
		this.nodeId = nodeId;
		this.children = children;
	}

	public NodeImpl(String nodeId) {
		super();
		this.nodeId = nodeId;
		this.children = null;
	}

	@Override
	public int childrenCount() {
		if (children != null) {
			return children.length;
		} else {
			return 0;
		}
	}

	@Override
	public Node[] getChildren() {
		return children;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

}
