package TEST;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{

	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° �� :");
		double a = Double.parseDouble(scanner.nextLine());;
		
		System.out.println("�� ��° �� :");
		double b = Double.parseDouble(scanner.nextLine());;

		
		if (b != 0.0)
		{
			System.out.println("����� :" + a / b);

		}
		
		else
		{
			System.out.println("��� : ���Ѵ�");

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
