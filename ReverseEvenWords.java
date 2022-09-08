package week1.day2.assignments;

public class ReverseEvenWords {
	//Split into a String array
	//Find the even index
	//get the string from the even index
	//reverse the string and store it in the same index
	//print the array after concatenating each indexes
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		String evenIndexText;

		for(int i=0;i<split.length;i++) {
			if(i%2!=0) {
				evenIndexText=split[i];
				String rev="";
				char[] ch = evenIndexText.toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					rev=rev+ch[j];
				}
				split[i]=rev;				
			}
		}
		for(int i=0;i<split.length;i++) {
			System.out.print(split[i]+ " ");
		}

		

	}

}
