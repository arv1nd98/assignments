package Assignment;

public class StringBreakRev {
	
	public void reverseWord(String str){  
	    String[] str1=str.split(" ");
	    for(int i=0;i<str1.length;i++) {
	    	String str2=str1[i];
	    	StringBuilder s=new StringBuilder(str2);
	    	s.reverse();
	    	System.out.println(s);
	    }
}
	public static void main(String[] args) {
		new StringBreakRev().reverseWord("This is Java program");
		
	}
}