package datastr;

public class MyTreeNode<T> {
	private T element;
	private MyTreeNode<T> parent = null;
	private MyTreeNode<T> leftCh = null;
	private MyTreeNode<T> rightCh = null;
	
	public T getElement() {
		return element;
	}
	
	public MyTreeNode<T> getParent() {
		return parent;
	}
	
	public MyTreeNode<T> getLeftCh() {
		return leftCh;
	}
	
	public MyTreeNode<T> getRightCh() {
		return rightCh;
	}
	
	public void setElement(T element) {
		if(element != null)
			this.element = element;
		else
			this.element = (T)new Object();
	}
	
	public void setParent(MyTreeNode<T> parent) {
		this.parent = parent;
	}
	
	public void setLeftCh(MyTreeNode<T> leftCh) {
		this.leftCh = leftCh;
	}
	
	public void setRightCh(MyTreeNode<T> rightCh) {
		this.rightCh = rightCh;
	}

	public MyTreeNode(T element) {
		setElement(element);
	}
	
	public String toString() {
		return ""+element;
	}
}
