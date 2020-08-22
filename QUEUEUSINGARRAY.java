package datastructure;
import java.util.Queue;
public class QUEUEUSINGARRAY {
	public class QUEUEUSINGARRAY {
		private int data[];
		private int front;
		private int rear; 
		private int size;
	    
		
		public QUEUEUSINGARRAY() {
			data = new int[10];
			front=-1;
			rear=-1;
			size=0;
		}
		
		public QUEUEUSINGARRAY(int X) {
			data = new int[X];
			front=-1;
			rear=-1;
			size=0;
		}

	    int size()
	    {
	    	return size;
	    }

	    boolean isEmpty()
	    {
	    	return size()==0;
	    }

	    int front() throws QueueEmptyException
	    {   
	    	if(size()==0)
	    	{
	    		throw new QueueEmptyException();
	    	}
	    	
	    	return data[front];
	    }
	    
	    void enqueue(int element) 
	    {     
	    	if(size==data.length)
	    	{
	    		doubleC();
	    	}
	    	
	    	
	    	if(size==0)
	    	{
	    		front=0;
	    	}
	    	
	    	
	    	rear++;
	    	size++;
	    	//rear=(rear+1)%data.length;
	    	if(rear==data.length)
	    	{
	    		rear=0;
	    	}
	    	data[rear]=element;
	    }

	    private void doubleC() {
				
	    	int t[]= data;
	    	data= new int[2*t.length];
	    	int ind=0;
	    	for(int i=front; i<t.length;i++)
	    	{
	    		data[ind]=t[i];
	    		ind++;
	    	}
	    	
	    	for(int i=0;i<=front-1;i++)
	    	{
	    		data[ind]=t[i];
	    		ind++;
	    	}
	    	front=0;
	    	rear=t.length-1;
	    	
			
		}

		int  dequeue() throws QueueEmptyException {	
	    	if(size()==0)
	    	{
	    		throw new QueueEmptyException();
	    	}
	    	int t = data[front];
	    	
	    	front = (front+1)%data.length;
//	    	front++;
//	    	if(front==data.length)
//	    	{
//	    		front=0;
//	    	}
	    	size--;
	    	if(size==0)
	    	{
	    		front=-1;
	    		rear=-1;
	    	}
	    	return t;
	    }

}
