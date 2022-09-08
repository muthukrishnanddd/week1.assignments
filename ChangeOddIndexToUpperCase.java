package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String text="changeme";
		String changedtext="";
		
		char[] ch = text.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
			if(i%2==0) {
				changedtext=changedtext+text.charAt(i);
			}
			else {
				changedtext=changedtext+text.toUpperCase().charAt(i);
			}
		}
		System.out.println("String after OddIndex changed ToUpperCase :" + changedtext);
		

	}

}
