package Package1;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		int s1,s2,s3,s4,s5,s6;
		int sum,avg;
		float percentage;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your subject marks");
		System.out.println("Subject1:");
		s1 = sc.nextInt();
		
		System.out.println("Subject2:");
		s2 = sc.nextInt();
		
		System.out.println("Subject3:");
		s3 = sc.nextInt();
		
		System.out.println("Subject4:");
		s4 = sc.nextInt();
		
		System.out.println("Subject5:");
		s5 = sc.nextInt();
		
		System.out.println("Subject6:");
		s6 = sc.nextInt();
		
		sum = sumOf(s1,s2,s3,s4,s5,s6);
		
		avg = averageOf(s1,s2,s3,s4,s5,s6);
		
		percentage= percentageOf(s1,s2,s3,s4,s5,s6);
		
		System.out.println("Total : "+sum);
		System.out.println("Average : "+avg);
		System.out.println("Percentage: "+percentage);
		
	}

	private static float percentageOf(int s1, int s2, int s3, int s4, int s5, int s6) {
		float percent = ((s1+s2+s3+s4+s5+s6)/600)*100;
		return percent;
	}

	private static int averageOf(int s1, int s2, int s3, int s4, int s5, int s6) {
		int avg = sumOf(s1,s2,s3,s4,s5,s6)/6;
		return avg;
	}

	private static int sumOf(int s1, int s2, int s3, int s4, int s5, int s6) {
		
		int total = s1+s2+s3+s4+s5+s6; 
		return total;
	}

}
