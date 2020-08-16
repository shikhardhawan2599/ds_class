package datastructure;

public class InfixToPrefix {
	static boolean isOperator(char sd) 
	{ 
	    return (!(sd >= 'a' && sd <= 'z') &&  
	            !(sd >= '0' && sd <= '9') &&  
	            !(sd >= 'A' && sd <= 'Z')); 
	} 
	  
	
	static int getPriority(char SD) 
	{ 
	    if (SD == '-' || SD == '+') 
	        return 1; 
	    else if (SD == '*' || SD == '/') 
	        return 2; 
	    else if (SD == '^') 
	        return 3; 
	    return 0; 
	} 
	  
	
	static String infixtoprefix(String infix) 
	{ 
	    Stack<Character> operators = new Stack<Character>(); 
	  
	    Stack<String> operands = new Stack<String>(); 
	  
	    for (int i = 0; i < infix.length(); i++)  
	    { 
	  
	        
	        if (infix.charAt(i) == '(')  
	        { 
	            operators.push(infix.charAt(i)); 
	        } 
	  
	        	        else if (infix.charAt(i) == ')')  
	        { 
	            while (!operators.empty() &&  
	                operators.peek() != '(')  
	                { 
	  
	               
	                String s1 = operands.peek(); 
	                operands.pop(); 
	  
	               	                String s2 = operands.peek(); 
	                operands.pop(); 
	  
	                
	                char s = operators.peek(); 
	                operators.pop(); 
	  
	               
	                String t = s + s2 + s1; 
	                operands.push(t); 
	            } 
	  
	            
	            operators.pop(); 
	        } 
	  
	      
	        else if (!isOperator(infix.charAt(i)))  
	        { 
	            operands.push(infix.charAt(i) + ""); 
	        } 
	  
	       	        else 
	        { 
	            while (!operators.empty() &&  
	                getPriority(infix.charAt(i)) <=  
	                    getPriority(operators.peek()))  
	                { 
	  
	                String p1 = operands.peek(); 
	                operands.pop(); 
	  
	                String p2 = operands.peek(); 
	                operands.pop(); 
	  
	                char p = operators.peek(); 
	                operators.pop(); 
	  
	                String temp = p + p2 + p1; 
	                operands.push(temp); 
	            } 
	  
	            operators.push(infix.charAt(i)); 
	        } 
	    } 
	  
	   
	    while (!operators.empty())  
	    { 
	        String p1 = operands.peek(); 
	        operands.pop(); 
	  
	        String p2 = operands.peek(); 
	        operands.pop(); 
	  
	        char p = operators.peek(); 
	        operators.pop(); 
	  
	        String temp = p + p2 + p1; 
	        operands.push(temp); 
	    } 
	  
	  	    return operands.peek(); 
	} 
	  
	 
	public static void main(String args[]) 
	{ 
	    String a= "(A-B/C)*(A/K-L)"; 
	    System.out.println( infixtoprefix(a)); 
	} 
}
