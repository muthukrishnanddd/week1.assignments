package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		//To find all the prime numbers within the lastnumber specified.
		int lastNumber=51;
		for (int i=1;i<=lastNumber;i++) {
			prime(i);
		}

	}
	
	public static void prime(int num) {
		boolean flag=false;
		int h=num/2;
		for (int i=2;i<=h;i++) {
			if(num%i==0) {
				flag=true;	
				break;
			}

		}
		if(flag==false) {
			System.out.println("Number("+num+") is a prime number");
		}

	}

}
