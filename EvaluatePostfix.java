package datastructure;

public class EvaluatePostfix {
	 static int EvaluatePostfix(String k) 
	    { 
	        Stack<Integer> z=new Stack<Integar>(); 
	          
	        for(int i=0;i<k.length();i++) 
	        { 
	            char sd=k.charAt(i); 
	              
	            if(Character.isDigit(sd)) 
	            z.push(sd - '0'); 
	              
	            else
	            { 
	                int s1 = z.pop(); 
	                int s2 = z.pop(); 
	                  
	                switch(sd) 
	                { 
	                    case '+': 
	                    z.push(s2+s1); 
	                    break; 
	                      
	                    case '-': 
	                    z.push(s2- s1); 
	                    break; 
	                      
	                    case '/': 
	                    z.push(s2/s1); 
	                    break; 
	                      
	                    case '*': 
	                    z.push(s2*s1); 
	                    break; 
	              } 
	            } 
	        } 
	        return z.pop();     
	    } 
	      
	    public static void main(String[] args)  
	    { 
	        String k="231*+9-"; 
	        System.out.println("postfix evaluation: "+EvaluatePostfix(k)); 
	    } 
}
