package LinkedList;

public class LL {

	Node head;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertFirst(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void insertLast(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node currentNode = head;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = newNode;
	}

	public void printList() {
		Node currentNode = head;

		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}

		System.out.println("NULL");
	}

	// delete first
	public void deleteFirst() {

		if (head == null) {
			System.out.println("The given List is Empty :");
			return;
		} else {
			head = head.next;
		}
	}

	// delete last
	public void deleteLast() {
		if (head == null) {
			System.out.println("The given List is Empty :");
			return;
		} else {
			Node secondLast = head;
			Node lastNode = head.next;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
				secondLast = secondLast.next;

			}
			secondLast.next = null;
		}
	}

	// here we can simply size of the
	public void countSize() {

	}

	public static void main(String[] args) {

		LL list = new LL();

		list.insertFirst("C");
		list.insertFirst("B");
		list.insertFirst("A");

		list.insertLast("D");
		list.insertLast("E");

		list.printList();

		list.deleteFirst();
		list.printList();

		list.deleteLast();
		list.printList();
	}
}