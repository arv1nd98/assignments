package Assignment;

public class StringBreakTask {
	 public static void main(String args[]) 
	    { 
	        String str = "this is a Java program"; 
	        String[] arrOfStr = str.split(" ", 5); 
	  
	        for (String a : arrOfStr) 
	            System.out.println(a); 
	    } 
	} 
