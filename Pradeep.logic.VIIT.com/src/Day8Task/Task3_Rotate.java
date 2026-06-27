package Day8Task;

/*
 Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class Task3_Rotate {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void insertEle(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;

		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	public void rotate(int k) {

		if (head == null || head.next == null)
			return;
		while (k > 0) {
			Node current = head;
			Node secondLast = null;

			while (current.next != null) {
				secondLast = current;
				current = current.next;
			}

			secondLast.next = null;
			current.next = head;
			head = current;
			k--;
		}
	}

	public void display() {

		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Task3_Rotate list = new Task3_Rotate();

		list.insertEle(1);
		list.insertEle(2);
		list.insertEle(3);
		list.insertEle(4);
		list.insertEle(5);

		System.out.println("Before Rotation:");
		list.display();

		list.rotate(2);
		System.out.println("After Rotation:");
		list.display();
	}
}
