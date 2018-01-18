package com.interview.test;

public class LinkedList {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 6, 7};
		LinkedList l = new LinkedList();
		for (int i : arr) {
			l.insert(i);
		}

		Node root = l.root;
		while (root != null) {
			System.out.println(root.data);
			root = root.next;
		}
	}

	Node root = null;
	Node last = null;

	class Node {
		int data;
		Node next;
	}

	public void insert(int i) {
		Node n = new Node();
		n.data = i;

		if (root == null) {
			root = n;
		} else {
			last.next = n;
		}
		last = n;
	}

}
