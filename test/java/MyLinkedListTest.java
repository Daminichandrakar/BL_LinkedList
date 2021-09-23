package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.MyLinkedList;
import com.bl.MyNode;

class MyLinkedListTest {

	@Test
	public void addNode() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secoundNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(firstNode);;
		myLinkedList.addNode(secoundNode);
		myLinkedList.addNode(thirdNode);
		System.out.println("addNode");
		myLinkedList.display();
		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secoundNode)
				&& myLinkedList.tail.equals(firstNode);
		assertTrue(result);
	}

}
