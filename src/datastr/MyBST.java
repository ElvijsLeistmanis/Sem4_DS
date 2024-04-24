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
		if(isEmpty()) root = new MyTreeNode(element);
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
}
