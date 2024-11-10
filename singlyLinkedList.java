import java.util.*;
public class singlyLinkedList {
	static class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head = null;
	
	public void creation() 
	{
		int data,n;
		Scanner sc = new Scanner(System.in); 
		do {
		data =sc.nextInt();
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		System.out.println("Want to add more data? Press 1");
		n = sc.nextInt();
 		}
		while(n==1);
		
	}
	public void travers()
	{
		if(head == null)
		{
			System.out.println("LL not exist");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	

	public static void main(String[] args) {
		singlyLinkedList sl = new singlyLinkedList();
		sl.creation();
		sl.travers();
	}

}
