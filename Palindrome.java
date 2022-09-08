package week1.day2.assignments;

//Build a logic to find the given string is palindrome or not

/*
 * Pseudo Code

 * a) Declare A String value as"madam"
 
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */

public class Palindrome {

	public static void main(String[] args) {
		String text="madam";
		String rev="";
		char[] ch = text.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		if(text.equalsIgnoreCase(rev)) System.out.println("String (" + text + ") isa  palindrome");
		else System.out.println("String (" + text + ") is NOT a palindrome");

	}

}
