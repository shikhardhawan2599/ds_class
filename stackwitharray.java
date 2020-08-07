package datastructure;

public class stackwitharray {
	
	private int d[]; 
	private int top;
	
	public stackwitharray {
		d= new int[10];
		top=-1;
	}
	
	public stackwitharray(int p) {
		d = new int[p];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
		
	}
   
	public int sz()
	{
		return top+1;
	}

    public int top() throws StackEmptyException
    {    
    	if(sz()==0)
    	{
    		StackEmptyException s = new StackEmptyException();	
    		throw s;
    	}
    	return d[top];
    }

    public void push(int elem) throws StackFullException
    {   
    	if(sz()==d.length)
    	{
    		// stack full
    		
//    		StackFullException e = new StackFullException();
//    		throw e;
    		
    		doublep();	
    	}
    	
    	
    	top++;
    	d[top]=elem;
    }
    
    private void doublep()
    {
    	int temp[] = d;
    	
    	d = new int[temp.length*2];
    	
    	for(int i=0;i<=top;i++)
    	{
    		d[i]=temp[i];
    	}
    }
    public int pop() throws StackEmptyException
    {  
    	if(sz)==0)
    	{
    		StackEmptyException s = new StackEmptyException();	
    		throw s;
    	}
    	
    	int temp = d[top];
    	top--;
    	return temp;
    }

}
