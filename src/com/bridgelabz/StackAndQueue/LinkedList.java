package com.bridgelabz.StackAndQueue;

public class LinkedList {
	/*
	 *1.Creating node head
	 */
	Node head;

	/*
	 * 2.creating variables
	 */
	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	/*
	 * 3.creating method to add the first value to stack
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	/*
	 * 4.created method to diplay the linkedlist/stack
	 */
	public void display() {
		if (head == null)
			System.out.println("No elements to display");
		else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}