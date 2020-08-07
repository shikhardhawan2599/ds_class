package datastructure;

public class reverselinkedlist {
	public static Node addN
	{
		Node head = null,last=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1)
		{
			Node newNode = new Node(data);
			
			if(head==null)
			{
				head= newNode;
				last = newNode;
			}
			else
			{	
				last.next= newNode; 
				last= newNode;
			} 
			
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node rev(Node head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		
		Node sd=rev(head.next);
		Node x= sd;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		x.next=head;
		head.next=null;
		return finalHead;
	}
	
	public static void main(String[] args) {
		
		Node head = addN();
		
		rev(head);
		
		
	}

}
