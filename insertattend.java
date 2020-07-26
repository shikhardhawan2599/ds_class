package datads;
import java.util.*;


class Node {

	
    int data;
    Node next;
    
    Node(int data)
    {
 	   this.data=data;
 	   next=null;
    }
	

}

public class insertattend {
	
	public static void InsertAtEnd(Node head,int data)
	{  
		Node last = head;
		
		while(head.next!=null)
		{
			head=head.next;
		}
		Node newNode = new Node (data);
		
		head.next=newNode;
		
		while(last!=null)
		{   
			System.out.println(last.data+" ");
			
			last=last.next;
		}
		
		
		
		
	}
	
	public static Node takeInput()
	{
		Node head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1)
		{
			Node newNode = new Node(data);
			
			if(head==null)
			{
				head= newNode;
				tail = newNode;
			}
			else
			{	
				tail.next= newNode; 
				tail= newNode;
			} 
			
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Node head= takeInput();
		
		System.out.println("enter your ELEMENTS");
		
		int data = s.nextInt();
		
		InsertAtEnd(head,data);
		
		
	}
	
}


	

