package week1.day1;

public class FibanosiSeries {

	public static void main(String[] args) {
		int num=15;
		int fnum=0;
		int snum=1;
		int sum;
		for (int i=1;i<=11;i++) {
			 sum=fnum+snum;
			 fnum=snum;
			 snum=sum;
			 System.out.println(sum);
			 
		}

	}

}
