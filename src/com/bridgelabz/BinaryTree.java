package com.bridgelabz;

public class BinaryTree <K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;


	public void add(K key) {

		this.root = this.addRecursive(root, key);
	}

	private MyBinaryNode<K> addRecursive(MyBinaryNode<K> root, K key) {

		if (root == null) {
			return new MyBinaryNode<>(key);
		}
		int comRes = key.compareTo(root.key);
		if (comRes == 0) {
			return root;
		}
		if (comRes < 0) {
			root.left = addRecursive(root.left, key);
		} else {
			root.right = addRecursive(root.right, key);
		}
		return root;
	}

	public void inOrder() {

		inOrderRec(this.root);
	}

	private void inOrderRec(MyBinaryNode<K> root) {
		if (root != null) {

			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);

		}
	}

	public void preOrder() {
		preOrderRec(this.root);
	}

	private void preOrderRec(MyBinaryNode<K> root) {

		if (root != null) {
			System.out.println(root.key);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}

	public void postOrder() {
		postOrderRec(this.root);
	}

	private void postOrderRec(MyBinaryNode<K> root) {

		if (root != null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.println(root.key);
		}
	}

	public boolean search( K key) {
		if (root == null) {
			return false;
		}
		if (root.key == key) {
			return true;
		}

		if (root.key.compareTo(key)<0) {
			root = root.right;
			return search(key);
		}

		if (root.key.compareTo(key) > 0) {
			root = root.left;
			return search(key);
		}
		return false;
	}

}
