package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tree.tree;
import tree.tree_distence;

public class tree_distenceTest {
	
	String[] a = {"f","d","e","a","c",null,null,null,null,"b"};
	String[] b = {"f","c","e","d",null,null,null,"a","b"};
	tree t1 = new tree(a,0);
	tree t2 = new tree(b,0);
	
	tree_distence dist = new tree_distence();

//	@Test
//	public void testTreedist() {
//		t1.PostOrderTraversal(t1.getNode(0));
//		t2.PostOrderTraversal(t2.getNode(0));
//		
//		System.out.print(dist.treedist(t1, t2, 3, 2));
//	}
	
	@Test
	public void testzhang() {
		t1.PostOrderTraversal(t1.getNode(0));
		t2.PostOrderTraversal(t2.getNode(0));
		
		t1.getKeyroots();
		t2.getKeyroots();
		
//		for(int i = 0; i < t2.getkeyroots().size(); i++) {
//			System.out.println(t2.getkeyroots().get(i)); 
//		}
		
		System.out.print(dist.zhang(t1, t2));
	}

}
