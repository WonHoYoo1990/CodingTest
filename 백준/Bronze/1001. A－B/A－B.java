import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum = 0;

		if (A > 0 && B < 10) {
			sum = A - B;
			System.out.println(sum);
		}

	}

}