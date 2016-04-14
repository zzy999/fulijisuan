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
			System.out.println("请输入a,b的值");
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			b=in.nextInt();
			c=a/b;
			System.out.println("c="+c);
			System.out.println("*******正常执行*******");
			System.out.println("实数的除法不产生数字类异常：3.0/0.0="+(3.0/0.0));
		
		}
		catch(ArithmeticException e3){
			System.out.println("除数不能为0");
			System.out.println("请重新输入除数");
			Scanner in=new Scanner(System.in);
			b=in.nextInt();
			c=a/b;
			System.out.println("c="+c);
		}

		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("此程序要输入两个参数");
		}
		catch(NumberFormatException e2){
			System.out.println("必须输入数字!");
		}
		
	}

}
