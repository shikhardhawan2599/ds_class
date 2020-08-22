package datastructure;
import java.util.ArrayList;

	public class CIRCULARQUEUE {
		private int size, front, rear; 
		  
		private ArrayList<Integer> cq = new ArrayList<Integer>(); 
		  
		CIRCULARQUEUE(int size) 
		{ 
		    this.size = size; 
		    this.front = this.rear = -1; 
		} 
		  
		public void enQueue(int data) 
		{ 
		      
		    if((front == 0 && rear == size - 1) || 
		      (rear == (front - 1) % (size - 1))) 
		    { 
		        System.out.print("Queue is Full"); 
		    } 
		  
		    else if(front == -1) 
		    { 
		        front = 0; 
		        rear = 0; 
		        cq.add(rear, data); 
		    } 
		  
		    else if(rear == size - 1 && front != 0) 
		    { 
		        rear = 0; 
		        cq.set(rear, data); 
		    } 
		  
		    else
		    { 
		        rear = (rear + 1); 
		      
		        
		        if(front <= rear) 
		        { 
		            cq.add(rear, data); 
		        } 
		      
		      
		        else
		        { 
		            cq.set(rear, data); 
		        } 
		    } 
		} 
		  
		
		public int deQueue() 
		{ 
		    int x; 
		  
		 
		    if(front == -1) 
		    { 
		        System.out.print("Queue is Empty"); 
		          
		        return -1;  
		    } 
		  
		    x = cq.get(front); 
		  
		    if(front == rear) 
		    { 
		        front = -1; 
		        rear = -1; 
		    } 
		  
		    else if(front == size - 1) 
		    { 
		        front = 0; 
		    } 
		    else
		    { 
		        front = front + 1; 
		    } 
		      
		    return x; 
		} 
		  
		
		public void displayQueue() 
		{ 
		      
		  
		    if(front == -1) 
		    { 
		        System.out.print("Queue is Empty"); 
		        return; 
		    } 
		   
		   
		  
		    if(rear >= front) 
		    { 
		      
		       
		        for(int i = front; i <= rear; i++) 
		        { 
		            System.out.print(cq.get(i)); 
		            System.out.print(" "); 
		        } 
		        System.out.println(); 
		    } 
		  
		   
		    else
		    { 
		        
		        for(int i = front; i < size; i++) 
		        { 
		            System.out.print(cq.get(i)); 
		            System.out.print(" "); 
		        } 
		  
		     
		        for(int i = 0; i <= rear; i++) 
		        { 
		            System.out.print(cq.get(i)); 
		            System.out.print(" "); 
		        } 
		        System.out.println(); 
		    } 
		} 
		  
		
		public static void main(String[] args) 
		{ 
		      
		   
			CIRCULARQUEUE y = new CIRCULARQUEUE(12); 
		      
		    y.enQueue(12); 
		    y.enQueue(13); 
		    y.enQueue(14); 
		    y.enQueue(15); 
		      
		    y.displayQueue(); 
		  
		    int t = y.deQueue(); 
		  
		    if(t != -1) 
		    { 
		        System.out.print("Deleted value = "); 
		        System.out.println(t); 
		    } 
		  
		    t= y.deQueue(); 
		  
		   
		    if(t != -1) 
		    { 
		        System.out.print("Deleted value = "); 
		        System.out.println(t); 
		    } 
		  
		    y.displayQueue(); 
		      
		    y.enQueue(16); 
		    y.enQueue(17); 
		    y.enQueue(18); 
		      
		    y.displayQueue(); 
		      
		    y.enQueue(17); 
		} 
}

