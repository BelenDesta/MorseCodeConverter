import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 
 * @author Belen Desta
 *
 * @param <T>
 */
public class MorseCodeTree<T> implements LinkedConverterTreeInterface<T> {
    private TreeNode<T> root= new TreeNode<>(null);
      private String letters;
    public MorseCodeTree() {
    	buildTree();
    }
	@Override
	public TreeNode<T> getRoot() {
		return (TreeNode<T>) root;
	}

	@Override
	public void setRoot(TreeNode<T> newNode) {
	 root =  newNode;
		
	}

	@Override
	public void insert(T code, T result) {
		addNode(root,code, result);
	}

	@Override
	public void addNode(TreeNode<T> root, T code, T letter) {
		TreeNode<T> current = root;
		String codeS =((String)code);
		for (int i=0; i<codeS.length(); i++){
			if (codeS.substring(i, i+1).equals(".")){
				if (current.leftChild == null){
					current.leftChild = new TreeNode<>(null);
				}
				current = current.leftChild;
			}
			else if (codeS.substring(i, i+1).equals("-")){
				if (current.rightChild == null){
					current.rightChild = new TreeNode<>(null);
				}
				current = current.rightChild;
			}
		}
		current.data=letter;
	}
		

	@Override
	public T fetch(String code) {
		return fetchNode(root, (T) code);
	}

	@Override
	public T fetchNode(TreeNode<T> root, T code) {
		TreeNode<T> current = root;
		String codeSt =((String)code);
		for (int i=0; i<codeSt.length(); i++){
			if (codeSt.substring(i, i+1).equals(".")){
				current = current.leftChild;
			}
			else if (codeSt.substring(i, i+1).equals("-")){
				current = current.rightChild;
			}
		}
		return current.getData();
	}

	@Override
	public LinkedConverterTreeInterface<T> delete(T data) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedConverterTreeInterface<T> update() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildTree() {
		root = new TreeNode<>(null);
		insert((T)".",(T)"e");
		insert((T)"-",(T)"t");
	      insert((T)"..",(T)"i");
	      insert((T)".-",(T)"a");
	      insert((T)"-.",(T)"n");
	      insert((T)"--",(T)"m");
	      
	       //Third Level
	      insert((T)"...",(T)"s");
	      insert((T)"..-",(T)"u");
	      insert((T)".-.",(T)"r");
	      insert((T)".--",(T)"w");
	      insert((T)"-..",(T)"d");
	      insert((T)"-.-",(T)"k");
	      insert((T)"--.",(T)"g");
	      insert((T)"---",(T)"o");

	       //Fourth Level
	      insert((T)"....",(T)"h");
	      insert((T)"...-",(T)"v");
	      insert((T)"..-.",(T)"f");
	      insert((T)".-..",(T)"l");
	      insert((T)".--.",(T)"p");
	      insert((T)".---",(T)"j");
	      insert((T)"-...",(T)"b");
	      insert((T)"-..-",(T)"x");
	      insert((T)"-.-.",(T)"c");
	      insert((T)"-.--",(T)"y");
	      insert((T)"--..",(T)"z");
	      insert((T)"--.-",(T)"q");                  
	   }




	

	@Override
	public ArrayList<T> toArrayList() {
		ArrayList<String> outputTree = new ArrayList<>();
		LNRoutputTraversal(root, (ArrayList<T>) outputTree);
		return (ArrayList<T>) outputTree;
	}

	@Override
	public void LNRoutputTraversal(TreeNode<T> root, ArrayList<T> list) {
		if(root !=null) {
			LNRoutputTraversal(root.leftChild, list);
			list.add(root.getData());
			LNRoutputTraversal(root.rightChild, list);
		}
		
	}

}
