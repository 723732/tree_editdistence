package test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import tree.Node;
import tree.tree;

public class treeTest {
	
	String[] a = {"f","d","e","a","c",null,null,null,null,"b"};
	tree t = new tree(a,0);
    
//	@Test
//	public void testCreateTree() {
//		System.out.println(t.getnodeList().size());
//		for(int i = 0; i < t.getnodeList().size(); i++) {
//			System.out.println(t.getNode(i).getStr());
//		}		 
//	}
//
//	@Test
//	public void testPostOrderTraversal() {
//
//		t.PostOrderTraversal(t.getNode(0));
//
//		for(int i = 0; i < t.getnodeList().size(); i++) {
//			System.out.println(t.getnodeList().get(i).getStr());
//		}	
//	}
	
//	@Test
//	public void testGetMostLeftNode() {
//		t.PostOrderTraversal(t.getNode(0));
//		
//		for(int i = 1; i <= t.getnodeList().size(); i++) {
//			System.out.println(t.GetMostLeftNode(i)); 
//		}
//		
//		
//	}
	
	@Test
	public void testgetKeyroots() {
		t.PostOrderTraversal(t.getNode(0));
		t.getKeyroots();
//		System.out.println(t.getKeyroots().length);
		for(int i = 0; i < t.getkeyroots().size(); i++) {
			System.out.println(t.getkeyroots().get(i)); 
		}
		
	}

}
