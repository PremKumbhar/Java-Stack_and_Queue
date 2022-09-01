package com.bridgelabz.StackAndQueue;

public class Main {
public static void main(String[] args) {
		/*
		 * 1.creating Object an Oject
		 */
		Stack stack = new Stack();
		/*
		 * 2.Calling method to push value to stack
		 */
		stack.push(70);
		stack.push(30);
		stack.push(56);
		/*
		 * 3.calling method to display value of stack
		 */
		stack.displayStack();
		/*
		 * 4.peaking and poping the value till stack gets empty
		 */
		stack.displayPeak();
		stack.displaypop();
		stack.displayPeak();
		stack.displaypop();
		stack.displayPeak();
		stack.displaypop();
		stack.displayPeak();
		stack.displayStack();
		/*
		 * 5.calling method to display value of stack
		 */
		// stack.displayStack();

	}

}
