import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        long s=sc.nextLong();

        int count=0;
		
		while(s>0) {
			count++;
			s=s/10;
		}
		System.out.println("Number of digit is "+ count);
    }
}
