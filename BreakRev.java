package Assignment;

import java.util.StringTokenizer;

public class BreakRev {
String breakrev(String breakrev) {
	char[]arr= breakrev.toCharArray();
	String rev="";
	for(int i=arr.length-1;i>=0;i--) {
		arr[i]=arr[i];
		rev=rev+arr[i];
	}
	String s=rev;
	StringTokenizer str1=new StringTokenizer(s,"");
	String srev="";
	while (str1.hasMoreTokens()) {
		srev=str1.nextToken()+System.lineSeparator()+srev;
	}
	System.out.println(srev);	
	return " ";
}	
	public static void main(String[] args) {
BreakRev rev = new BreakRev();
String rev1=rev.breakrev("This is Java Program");
System.out.println(rev1);

	}

}
