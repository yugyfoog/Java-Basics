import java.util.Date;
import java.util.Scanner;

public class Demo1 {

	private void printWelcome() {
		System.out.println("Hi, welcome to Revature trraining");
	}
	
	public void printProductNames(String...productName) {
		for (String str : productName) {
			System.out.println(str);
		}
	}
	
	public int addNumbers(int...num) {
		int sum = 0;
		for (int i : num) {
			System.out.println(i);
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to day 2");
		Demo1 d = new Demo1();
		d.printWelcome();
		int result = d.addNumbers(7,7,2,23);
		result += d.addNumbers(3, 9, 9);
		result += d.addNumbers(44, 99, 817,826);
		System.out.println(result);
		
		d.printProductNames("Watch", "Pendrive", "Adaptor");;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you age: ");
		int age = sc.nextInt();
		System.out.println("You are " + age + " years old");
		Date date = new Date();
		System.out.println(date);
	}

}
