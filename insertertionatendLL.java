package datastructure;

class Node {

	
    int data;
    Node next;
    
    Node(int data)
    {
 	   this.data=data;
 	   next=null;
    }
	

}
public class insertertionatendLL {
	public static void AtEnd(Node head,int data)
	{  
		Node h = head;
		
		while(head.next!=null)
		{
			head=head.next;
		}
		Node newNode = new Node(data);
		
		head.next=newNode;
		
		while(h!=null)
		{   
			System.out.println(h.data+" ");
			
			h=h.next;
		}
		
		
		
		
	}
	
	public static Node addN()
	{
		Node head = null,last=null;
		Scanner a = new Scanner(System.in);
		int data = a.nextInt();
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
			
			data = a.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Node head= addN();
		
		
		int data = a.nextInt();
		
		AtEnd(head,data);
		
		
	}}
