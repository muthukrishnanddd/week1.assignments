package week1.day2.assignments;
/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as ""  
 * g) Displaying the String without duplicate words	
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitText = text.split(" ");
		int count;
		for(int i=0;i<splitText.length;i++) {
			count=0;
			for(int j=0;j<splitText.length;j++) {
				if(splitText[i].equals(splitText[j])) {
					count +=1;
					if(count>1) {
						splitText[i]="";
						break;
					}
				}				
			}		
		}
		//Printing the string array after removing the duplicates
		for(int i=0;i<splitText.length;i++) {
			System.out.print(splitText[i]+ " ");
		}
	}
}
