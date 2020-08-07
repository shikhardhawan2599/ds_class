package datastructure;


class Node
{
	int data;
	Node last;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
}

public class doublyLinkedList {
static Node head;
	
	public static void insert(int data)
	{
		Node newNode = new Node(data);
		
		newNode.next=head;
		newNode.last=null;
		
		if(head!=null)
		{
			head.last=newNode;
		}
		
		head= newNode;
	}
 
	public static void del(Node dl)
	{
		if (head == null || dl == null) { 
            return; 
        } 
		
		 if (head == dl) { 
	            head = dl.next; 
	        } 
		 
		 if (delete.next != null) { 
	            delete.next.last = dl.last; 
	        } 
		 
		 if (dl.last != null) { 
	            dl.last.next = dl.next; 
	        } 
		 
		 return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insert(9);
		del(head.next);
	}


}
