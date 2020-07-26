package datads;
import java.util.Scanner;

class Node {

		
	    int data;
	    Node next;
	    
	    Node(int data)
	    {
	 	   this.data=data;
	 	   next=null;
	    }
		

	}
	
public class calculate_average {
		
		public static Node takeInput()
		{
			Node head = null,l=null;
			Scanner s = new Scanner(System.in);
			int data = s.nextInt();
			while(data!=-1)
			{
				Node newNode = new Node(data);
				
				if(head==null)
				{
					head= newNode;
					l = newNode;
				}
				else
				{	
					l.next= newNode; 
					l= newNode;
				} 
				
				data = s.nextInt();
			}
			return head;
		}
		
		public static void Average(Node head)
		{
			
			int sum=0,count=0;
			
			while(head!=null)
			{
				sum=sum+head.data;
				head=head.next;
				count++;
			}
			
			int avg=(int)sum/count;
			
			System.out.println(avg);
			
		}
		
		public static void main(String[] args) {
			

			Node head = takeInput();
			
			Average(head);
		}

	}
	


	


