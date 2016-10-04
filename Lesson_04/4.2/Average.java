import java.util.Scanner;

public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Average average = new Average();

		System.out.println("Enter the first number:");
		double num1 = kb.nextDouble();
		kb.nextLine();

		System.out.println("Enter the second number:");
		double num2 = kb.nextDouble();
		kb.nextLine();

		System.out.println("Enter the third number:");
		double num3 = kb.nextDouble();
		kb.nextLine();

		double avg = average.calcAverage(num1, num2, num3);

		average.print(avg);

	}

	public double calcAverage(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3) / 3;
	}

	public static void print(double avg)
	{
		System.out.printf("The average is %.4f", avg);
	}
}