package test;

import java.util.Scanner;

public class trycatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		try{
//			a=Integer.parseInt(args[0]);
//			b=a=Integer.parseInt(args[1]);
			System.out.println("������a,b��ֵ");
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			b=in.nextInt();
			c=a/b;
			System.out.println("c="+c);
			System.out.println("*******����ִ��*******");
			System.out.println("ʵ���ĳ����������������쳣��3.0/0.0="+(3.0/0.0));
		
		}
		catch(ArithmeticException e3){
			System.out.println("��������Ϊ0");
			System.out.println("�������������");
			Scanner in=new Scanner(System.in);
			b=in.nextInt();
			c=a/b;
			System.out.println("c="+c);
		}

		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("�˳���Ҫ������������");
		}
		catch(NumberFormatException e2){
			System.out.println("������������!");
		}
		
	}

}
