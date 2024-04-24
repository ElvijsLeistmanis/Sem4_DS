package datastr;

public class MyBST<T> {
	private MyTreeNode root = null;
	private int counter = 0;
	
	public boolean isEmpty() {
		return (counter==0);
	}
	
	public int howManyElements() {
		return counter;
	}
	
	public void insert(T element) {
		if(isEmpty()) {
			root = new MyTreeNode(element);
			counter++;
		}
		else {
			insertHelpRecurseive(root, element);
		}
	}
	
	private void insertHelpRecurseive(MyTreeNode tempNode, T element) {
		if( ((Comparable)tempNode.getElement()).compareTo(element) == 1) {
			if(tempNode.getLeftCh() == null) {
				MyTreeNode newNode = new MyTreeNode(element);
				tempNode.setLeftCh(newNode);
				newNode.setParent(tempNode);
				counter++;
			}
			else {
				insertHelpRecurseive(tempNode.getLeftCh(), element);
			}
		}
		else if (((Comparable)tempNode.getElement()).compareTo(element) == -1){
			if(tempNode.getRightCh() == null) {
				MyTreeNode newNode = new MyTreeNode<T>(element);
				tempNode.setRightCh(newNode);
				newNode.setParent(tempNode);
				counter++;
			}
			else {
				insertHelpRecurseive(tempNode.getRightCh(), element);
			}
		}
		else {
			System.out.println("Element already exists.");
		}
	}
	
	public void print() throws Exception {
		if(isEmpty()) throw new Exception("Tree is empty.");
		printHelpRecursivePreOrder(root);
	}
	
	private void printHelpRecursivePreOrder(MyTreeNode tempNode) {
		System.out.print("P: " + tempNode.getElement());
		
		if(tempNode.getLeftCh() != null) {
			System.out.print(" -> LC: " + tempNode.getLeftCh().getElement() + " [" + tempNode.getElement() + "]\n");
			printHelpRecursivePreOrder(tempNode.getLeftCh());
		}
		
		if(tempNode.getRightCh() != null) {
			System.out.print(" -> RC: " + tempNode.getRightCh().getElement() + " [" + tempNode.getElement() + "]\n");
			printHelpRecursivePreOrder(tempNode.getRightCh());
		}
	}
	
	public boolean search(T element) throws Exception {
		if(isEmpty()) throw new Exception("Tree is empty.");
		return searchHelper(element, root);
	}
	
	private boolean searchHelper(T element, MyTreeNode tempNode) {
		
		if(tempNode.getElement().equals(element)) return true;
			
		if( ((Comparable)tempNode.getElement()).compareTo(element) == 1) {
			if (tempNode.getLeftCh() != null) {
				return searchHelper(element, tempNode.getLeftCh());
			}
		}
		else if( ((Comparable)tempNode.getElement()).compareTo(element) == -1) {
			if (tempNode.getRightCh() != null) {
				return searchHelper(element, tempNode.getRightCh());
			}
		}
		
		return false;
	}
}
