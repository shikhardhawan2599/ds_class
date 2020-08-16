package datastructure;
import java.util.*;

public class InfixToPostfix {
	private Stack S;
	   private String sd;
	   private String ps = "";
	   public InfixToPostfix(String in) {
	      sd = in;
	      int stackSize = sd.length();
	      S = new Stack(stackSize);
	   }
	   public String doTrans() {
	      for (int j = 0; j < sd.length(); j++) {
	         char c = sd.charAt(j);
	         switch (c) {
	            case '+': 
	            case '-':
	               gotOper(c, 1); 
	               break; 
	            case '*': 
	            case '/':
	               gotOper(c, 2); 
	               break; 
	            case '(': 
	              S.push(c);
	               break;
	            case ')': 
	               gotParen(c); 
	               break;
	            default: 
	            	ps = ps + c; 
	               break;
	         }
	      }
	      while (!S.isEmpty()) {
	    	  ps = ps + S.pop();
	      }
	      System.out.println(ps);
	      return ps; 
	   }
	   public void gotOper(char opThis, int prec1) {
	      while (!S.isEmpty()) {
	         char Top = S.pop();
	         if (Top == '(') {
	            S.push(Top);
	            break;
	         } else {
	            int prec;
	            if (Top == '+' || Top == '-')
	            prec = 1;
	            else
	            prec = 2;
	            if (prec < prec1) { 
	               S.push(Top);
	               break;
	            } 
	            else ps = ps + Top;
	         }
	      }
	      S.push(opThis);
	   }
	   public void gotParen(char ch) { 
	      while (!S.isEmpty()) {
	         char chx = S.pop();
	         if (chx == '(') 
	         break; 
	         else ps = ps + chx; 
	      }
	   }
	   public static void main(String[] args) throws IOException {
	      String sd = "1+2*4/5-7+3/6";
	      String out;
	      InfixToPostfix theTrans = new InfixToPostfix(sd);
	      out= theTrans.doTrans(); 
	      System.out.println("Postfix is " + out + '\n');
	   }
	   class Stack {
	      private int maxSize;
	      private char[] stackArray;
	      private int top;
	      
	      public Stack(int max) {
	         maxSize = max;
	         stackArray = new char[maxSize];
	         top = -1;
	      }
	      public void push(char j) {
	         stackArray[++top] = j;
	      }
	      public char pop() {
	         return stackArray[top--];
	      }
	      public char peek() {
	         return stackArray[top];
	      }
	      public boolean isEmpty() {
	         return (top == -1);
	      }
	   }

}
