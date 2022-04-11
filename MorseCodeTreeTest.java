import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Belen Desta
 *
 */
public class MorseCodeTreeTest {
    MorseCodeTree list= new MorseCodeTree();
 @Before
 public void setUp() throws Exception{
	 
 }
 @After
 public void tearDown()throws Exception{
	 list=null;
 }
 @Test
 public void testInsert() {
	 list.insert(".","A");
	 String checkFetch = (String) list.fetch(".");
	 assertEquals("A", checkFetch);
 }
 @Test
 public void testGetRoot(){
	 String root;
	 root = (String) list.getRoot().getData();
	 assertEquals(null,root);
 }
 @Test
 public void testSetRoot() {
	 String root;
	 assertEquals(null, list.getRoot().getData());
	 TreeNode<String> st= new TreeNode("B");
	 list.setRoot(st);
	 root= (String) list.getRoot().getData();
	 assertEquals("B", root);
 }
 @Test
 public void testFetch() {
	 String testFetch;
	 testFetch = (String) list.fetch("--.");
	 assertEquals("g", testFetch);
	 testFetch = (String) list.fetch("...-");
	 assertEquals("v", testFetch);
 }
 @Test
 public void testToArrayList() {
	 ArrayList<String> lis = new ArrayList<>();
	 lis=list.toArrayList();
	 assertEquals("h",lis.get(0));
	 assertEquals("s",lis.get(1));
	 assertEquals("v",lis.get(2));
	 assertEquals("i",lis.get(3));
	 assertEquals("f",lis.get(4));
	 assertEquals("u",lis.get(5));
	 assertEquals("e",lis.get(6));
	 assertEquals("l",lis.get(7));
	 assertEquals("r",lis.get(8));
	 assertEquals("a",lis.get(9));
	 assertEquals("p",lis.get(10));
	 assertEquals("w",lis.get(11));
	 assertEquals("j",lis.get(12));
	 assertEquals("b",lis.get(14));
	 assertEquals("d",lis.get(15));
	 assertEquals("x",lis.get(16));
	 assertEquals("n",lis.get(17));
	 assertEquals("c",lis.get(18));
	 assertEquals("k",lis.get(19));
	 assertEquals("y",lis.get(20));
	 assertEquals("t",lis.get(21));
	 assertEquals("z",lis.get(22));
	 assertEquals("g",lis.get(23));
	 assertEquals("q",lis.get(24));
	 assertEquals("m",lis.get(25));
	 assertEquals("o",lis.get(26));
	 
 }
}
