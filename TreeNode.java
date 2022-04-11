/**
 * 
 * @author Belen Desta
 *
 * @param <T>
 */
public class TreeNode<T> {
	protected T data;
	protected TreeNode<T> leftChild;
	protected TreeNode<T> rightChild;
public TreeNode(T dataNode) {
	this.data=dataNode;
	this.leftChild=null;
	this.rightChild=null;
}

public T getData() {
	
	return data;
}



}
