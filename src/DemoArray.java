import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int marks[] = { 87, 65, 98, 70, 65, 77, 12};

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		for (int i : marks) {
			System.out.println(i);
		}
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 numbers:");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.println("Sum of the entered numbers is : " + sum);
	}

}
