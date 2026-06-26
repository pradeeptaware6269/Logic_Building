package LinkedList;

public class LL_Practice {

	Node head;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		public void insertFirst(int data)
		{
			Node newNode=new Node(data);
			if(head == null)
			{
				newNode=head;
				return;
			}
			else
			{
				newNode.next=head;
				newNode=head;
			}
		}
		public void insertEnd(int data)
		{
			Node newNode=new Node(data);
			if(head == null)
			{
				newNode=head;
				return;
			}
			
		}
	}
	public static void main(String[] args) {
		LL_Practice p =new LL_Practice();
		
	}
}
