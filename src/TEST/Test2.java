package TEST;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù ��° ��: ");
		double num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("�� ��° ��: ");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("-------------------");
		if(num2 != 0.0) {
			System.out.println("���: " + (num1/num2));
			
		}
		else 
		{
			System.out.println("���: ���Ѵ�");
		}
		
	}

}