package AddingIntegers;
import java.util.Scanner;
public class AddingIntegers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int number1 = input.nextInt();
		
		int number2 = input.nextInt();
		
//		int sum = number1 + number2;
		
//		System.out.printf("Sum is %d%n", sum);
		if(number1 == number2)
			System.out.printf("%d==%d%n", number1,  number2);
		if(number1 != number2)
			System.out.printf("%d!=%d%n", number1,  number2);
		if(number1 < number2)
			System.out.printf("%d<%d%n", number1,  number2);
		if(number1 > number2)
			System.out.printf("%d>%d%n", number1,  number2);
	}
}
