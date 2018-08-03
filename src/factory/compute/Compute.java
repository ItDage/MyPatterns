package factory.compute;

import java.util.Scanner;

public class Compute {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入num1:");
		double num1  = sc.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入操作:");
		String operator = sc2.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("请输入num2:");
		double num2 = sc.nextDouble();
		
		Operator object = SimpleFactory.createObject(operator);
		object.setNum1(num1);
		object.setNum2(num2);
		System.out.println(num1 + operator + num2 + "=" + object.getResult());
	}
}
