package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class tree {
	List<Node> nodeList = new LinkedList<Node>();
	int root;
	List<Integer> keyroots = new LinkedList<Integer>();
	
	public tree(){
		
	};
	public tree(String[] array, int i){
		this.nodeList = CreateTree(array);
		this.root = i;
	};
	
	public Node getNode(int index) {
		return nodeList.get(index);
	}
	
	public void setnodeList(List<Node> nodeList) {
		this.nodeList = nodeList;
	}
	public List<Node> getnodeList(){
		return this.nodeList;
	}
	public List<Integer> getkeyroots(){
		return this.keyroots;
	}

	public List<Node> CreateTree(String[] array) {
		
		List<Node> nodeList1 = new LinkedList<Node>();
		for(int index = 0; index < array.length; index++) {
			if(array[index] == null)
				nodeList.add(null);
			//	continue;
			else
				nodeList.add(new Node(array[index]));
		}
			
		
		for(int parentIndex = 0; parentIndex < nodeList.size()/2-1; parentIndex++) {
			nodeList.get(parentIndex).leftnode = nodeList.get(parentIndex*2+1);
			nodeList.get(parentIndex).rightnode = nodeList.get(parentIndex*2+2);
		}
		
		int lastparentIndex = nodeList.size()/2-1;
		nodeList.get(lastparentIndex).leftnode = nodeList.get(lastparentIndex*2+1);
		
		if(nodeList.size()%2 == 1)
			nodeList.get(lastparentIndex).rightnode = nodeList.get(lastparentIndex*2+2);
		
		//去掉list中的空节点
		for(int i = 0; i < nodeList.size(); i++) {
			if(nodeList.get(i) != null)
				nodeList1.add(nodeList.get(i));
		}
		
		return nodeList1;
	}
	
	//后序遍历,node为根节点
	int index = 1;
	public void PostOrderTraversal(Node node) {
	//	if(node == null)
	//		return;
		if(node.leftnode!= null)
			PostOrderTraversal(node.leftnode);
		if(node.rightnode != null)
			PostOrderTraversal(node.rightnode);
		
		
		node.index = index++;
		nodeList.add(node);
		nodeList.remove(node);
	//	return node;
	//	System.out.println(node.index);
	}

	
	//以第index个节点为根的最左叶子节点的序号
	public int GetMostLeftNode(int i) {

		while(nodeList.get(i-1).leftnode !=null)
			i = nodeList.get(i-1).leftnode.index;
		
		return i;
	}
	
	//后序遍历之后，lr_keyroots取每个节点的右孩子节点的序号集合和根节点
	public void getKeyroots() {
		for(int i = 0; i<nodeList.size(); i++) {
			if(nodeList.get(i).rightnode != null) {
			//	System.out.println(nodeList.get(i).rightnode.index);
				keyroots.add(nodeList.get(i).rightnode.index);
			}
		}
		keyroots.add(nodeList.get(nodeList.size()-1).index);

	}
	
}
