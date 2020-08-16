package datastructure;

public class PrefixToPostfix {
	static boolean isOperator(char sd)  
	{ 
	    switch (sd)  
	    { 
	        case '+': 
	        case '-': 
	        case '/': 
	        case '*': 
	        return true; 
	    } 
	    return false; 
	} 
	  
		static String preToPost(String expression) 
	{ 
			
	  
	    Stack<String> z= new Stack<String>(); 
	  
	    
	    int x = expression.length(); 
	  
	   
	    for (int i = x - 1; i >= 0; i--)  
	    { 
	  
	        	        if (isOperator(expression.charAt(i)))  
	        { 
	  
	           	            String k1 = z.peek(); z.pop(); 
	            String k2 = z.peek(); z.pop(); 
	  
	            
	            String temp = k1 + k2 + expression.charAt(i); 
	  
	            	            z.push(temp); 
	        } 
	  
	       	        else
	        { 

	            z.push( expression.charAt(i)+""); 
	        } 
	    } 
	  
	    	    return z.peek(); 
	} 
	  
		public static void main(String args[])  
	{ 
	    String exp = "*-A/BC-/AKL"; 
	    System.out.println("Postfix : " + preToPost(exp)); 
	} 
}
