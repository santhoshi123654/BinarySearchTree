package com.bridgelabz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree<Integer> binaryTree = new BinaryTree<>();

		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);

		System.out.println("\n enter 1 : To inOrder binary tree"
						   +"\n enter 2 : To pre order binary tree"
						   +"\n enter 3 : To post order binary tree"
						   +"\n enter 4 :To Search an Element");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num) {

		case 1:
			binaryTree.inOrder();
			break;
		case 2:
			binaryTree.preOrder();
			break;
		case 3:
			binaryTree.postOrder();
			break;
			
		case 4 :
			System.out.println("Enter a value for searching ");
			int element =scanner.nextInt();
			System.out.println(binaryTree.search(element));
			break;
		default:
			System.out.println("Enter valid number ");
		}
	}

	
	}

