package tree;

public class Node {
	Node leftnode;
	Node rightnode;
	String str;
	int index;
	
	Node(String _str){
		leftnode = null;
		rightnode = null;
		str = _str;
	}
	
	public String getStr() {
		return this.str;
	}

}
