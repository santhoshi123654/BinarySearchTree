package com.bridgelabz;

public interface INode<K> {
	
	int data = 0;
	Object left = null;

	K getKey();
	void setkey(K key);
	INode<K> getNext();
	void setNext(INode<K> next);
}
