package datastructure;
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
	public class detectloopinLinkedList {
	public static void Loop(Node head)
	{
		

        Node sd = head, ds = head; 
        int flag = 0; 
        
        while (sd != null && ds != null && ds.next != null) { 
            sd = sd.next; 
            ds = ds.next.next; 
            if (sd == ds) { 
                flag = 1; 
                break; 
            } 
        } 
        if (flag == 1) 
            System.out.println("Loop is there "); 
        else
            System.out.println("Loop isn't there");
		
		
	}
	public static Node addNode()
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
		
		
		Node head = addNode();
		Loop(head);
		
	}

}
