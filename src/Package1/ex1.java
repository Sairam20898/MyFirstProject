package Package1;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi How are you? ");
		int s1 = 20;
		int s2 = 34;
		int s3 = 56;
		
		int total;
		
		total = sum(s1,s2,s3);
		System.out.println("Sum of all = "+total);
	}

	private static int sum(int s1, int s2, int s3) {
		// TODO Auto-generated method stub
		int tota = s1+s2+s3;
		return tota;
	}

}
