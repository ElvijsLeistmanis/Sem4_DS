package service;

import datastr.MyBST;

public class MainService {

	public static void main(String[] args) {
		MyBST<Integer> intBST = new MyBST<Integer>();
		
		intBST.insert(5);
		intBST.insert(8);
		intBST.insert(3);
		intBST.insert(4);
		intBST.insert(7);
		intBST.insert(6);
		
		try {
			intBST.print();
			System.out.println("Element exists?:" + intBST.search(3));
			System.out.println("Element exists?:" + intBST.search(100));
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
