package TEST;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{

	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 수 :");
		double a = Double.parseDouble(scanner.nextLine());;
		
		System.out.println("두 번째 수 :");
		double b = Double.parseDouble(scanner.nextLine());;

		
		if (b != 0.0)
		{
			System.out.println("결과값 :" + a / b);

		}
		
		else
		{
			System.out.println("결과 : 무한대");

		}
		
		

		
		
		
/*
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = ((lengthTop + lengthBottom) * height /2.0);
		System.out.println(area);
		
	}
*/
}
}
