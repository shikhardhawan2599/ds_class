package datastructure;
import java.util.Scanner;

public class insertatpositionLL {
	
	public static Node addN()
	{
		Node head = null,sd=null;
		Scanner b = new Scanner(System.in);
		int data = b.nextInt();
		while(data!=-1)
		{
			{
				head= newNode;
				sd = newNode;
			}
			else
			{	
				sd.next= newNode; 
				sd= newNode;
			} 
			
			data =  b.nextInt();
		}
		return head;
	}
	
	public static Node insert(Node head, int data, int a)
	{
			 Node newNode= new Node(data);
			 int i=0;
			 Node c= head;
			 
			 if(a==0)
			 {
				 newNode.next= head;
				 head= newNode;
				 return newNode; 
			 }
			 
			 while(i<a-1)
			 {
				 c=c.next;
				 i++;
			 }
			 newNode.next= c.next;
			 c.next= newNode;
			 return head;	
			 
	}
	
	public static void main(String[] args) {
		
		Node head = addN();
		
		insert(head, 6, 2);
		
		
	}
  

}
