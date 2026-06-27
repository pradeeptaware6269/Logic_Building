package Day8Task;

/*Rotate Array By One
 * 
 
Given an array, the task is to cyclically right-rotate the array by one. 

Examples:  

Input: arr[] = [1, 2, 3, 4, 5] 
Output: [5, 1, 2, 3, 4]

Input: arr[] = [2, 3, 4, 5, 1]
Output: [1, 2, 3, 4, 5]

*/public class Task2_cyclic_Rotate {

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

    public void cyclicRotate() {

        if (head == null || head.next == null)
            return;

        Node current = head;
        Node secondLast = null;

        while (current.next != null) {
            secondLast = current;
            current = current.next;
        }

        secondLast.next = null;
        current.next = head;
        head = current;
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

        Task2_cyclic_Rotate list = new Task2_cyclic_Rotate();

        list.insertEle(1);
        list.insertEle(2);
        list.insertEle(3);
        list.insertEle(4);
        list.insertEle(5);

        System.out.println("Before Rotation:");
        list.display();

        list.cyclicRotate();

        System.out.println("After Rotation:");
        list.display();
    }
}