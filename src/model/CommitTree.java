package model;

import java.util.ArrayList;


public class CommitTree {
	private Object root;
	private int size;
	
	
	private class CommitNode{
		private String id;
		private ArrayList<CommitNode> children;
		private CommitNode parent;
		private ArrayList<String> paths;
		private String message;
		
		public CommitNode(String id, ArrayList<CommitNode> children,
				CommitNode parent, ArrayList<String> paths, String message) {
			super();
			this.id = id;
			this.children = children;
			this.parent = parent;
			this.paths = paths;
			this.message = message;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public ArrayList<CommitNode> getChildren() {
			return children;
		}

		public void setChildren(ArrayList<CommitNode> children) {
			this.children = children;
		}

		public CommitNode getParent() {
			return parent;
		}

		public void setParent(CommitNode parent) {
			this.parent = parent;
		}

		public ArrayList<String> getPaths() {
			return paths;
		}

		public void setPaths(ArrayList<String> paths) {
			this.paths = paths;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "CommitNode [id=" + id + ", children=" + children
					+ ", parent=" + parent + ", paths=" + paths + ", message="
					+ message + "]";
		}
		
		
		//브라운아이즈 - 벌써 일년, 있잖아~~~ git push git commit git commit -m
		
	}
	
}
