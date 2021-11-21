package com.bridgelabz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree<Integer> binaryTree = new BinaryTree<>();

		
			System.out.println("PreORder");
			binaryTree.add(56);
			binaryTree.add(30);
			binaryTree.add(70);
			binaryTree.add(22);
			binaryTree.add(40);
			binaryTree.add(60);
			binaryTree.add(95);
			binaryTree.add(11);
			binaryTree.add(65);
			binaryTree.add(3);
			binaryTree.add(16);
			binaryTree.add(63);
			binaryTree.add(67);
			binaryTree.preOrder();
			
			System.out.println("InORder");
			binaryTree.add(56);
			binaryTree.add(30);
			binaryTree.add(70);
			binaryTree.add(22);
			binaryTree.add(40);
			binaryTree.add(60);
			binaryTree.add(95);
			binaryTree.add(11);
			binaryTree.add(65);
			binaryTree.add(3);
			binaryTree.add(16);
			binaryTree.add(63);
			binaryTree.add(67);
			binaryTree.inOrder();
		
			System.out.println("PostORder");
			binaryTree.add(56);
			binaryTree.add(30);
			binaryTree.add(70);
			binaryTree.add(22);
			binaryTree.add(40);
			binaryTree.add(60);
			binaryTree.add(95);
			binaryTree.add(11);
			binaryTree.add(65);
			binaryTree.add(3);
			binaryTree.add(16);
			binaryTree.add(63);
			binaryTree.add(67);
			binaryTree.postOrder();
		}

		
	}

