import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Conpound_int {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		tip();
		while (true) {
			menu();
			int n = scanner.nextInt();
			if (n >= 0 && n <= 7) {
				if (n == 0)
					break;
				switch (n) {
				case 1:
					benjin();
					break;
				case 2:
					fuli();
					break;
				case 3:
					danli();
					break;
				case 4:
					years();
					break;
				case 5:
					annual_int_rate();
					break;
				case 6:
					YM_Equal_cast_final();
					break;
				case 7:
					Average_capital_plus_interest();
					break;
				case 0:
					n = 0;
					break;

				}
			} else {
				System.out.println("输入超出范围，请重新输入:");

			}
		}
	}

	static Scanner scanner = new Scanner(System.in);

	static void tip()// 计算公式和一些变量的介绍
	{
		System.out.printf("复利计算软件\n");
		System.out.printf("    复利计算公式:F=P*pow((1+i/m),N*m)\n");
		System.out.printf("    单利计算公式:F=P+P*N*i\n");
		System.out.printf("    等额投资公式:F=P*12*(1+i)*(pow(1+i,N)-1)/i\n");
		System.out.printf("\tF:复利终值|年金终值\n");
		System.out.printf("\tP:本金\n");
		System.out.printf("\ti:利率\n");
		System.out.printf("\tN：利率获取时间的整数倍\n");
		System.out.printf("\tm:年复利次数(一年当中的滚利次数)\n");
	}

	static void menu()// 菜单
	{
		System.out.printf("\t\t|-----------------------------------|\n");
		System.out.printf("\t\t|             welcome               |\n");
		System.out.printf("\t\t|-----------------------------------|\n");
		System.out.printf("\t\t|           1:计算本金                                        |\n");
		System.out.printf("\t\t|           2:计算年复利终值                             |\n");
		System.out.printf("\t\t|           3:单利计算                                        |\n");
		System.out.printf("\t\t|           4:计算年份                                        |\n");
		System.out.printf("\t\t|           5:计算年利率                                    |\n");
		System.out.printf("\t\t|           6:等额定投(年|月)          |\n");
		System.out.printf("\t\t|           7:等额还款                                        |\n");
		System.out.printf("\t\t|           0:结束                                               |\n");
		System.out.printf("\t\t|-----------------------------------|\n");
		System.out.printf("请输入你要选择的功能(0~7):");

	}

	static double capital_formula(double F, double i, int N, int m)// 本金计算公式
	{
		double P;
		P = F / Math.pow((1 + i / m), N * m);
		return P;
	}
	static void benjin()// 计算本金
	{
		int N, m;
		double i, F, P;
		System.out.printf("复利终值:");
		F = scanner.nextDouble();
		System.out.printf("年利率:");
		i = scanner.nextDouble();
		System.out.printf("存入年限:");
		N = scanner.nextInt();
		System.out.printf("年复利次数:");
		m = scanner.nextInt();
		P = capital_formula(F, i, N, m);
		System.out.println("年复利终值为" + F + "需要本金为:" + P);
	}

	static double compound_amount_formla(double P, double i, int N, int m)// 复利计算公式
	{
		double F;
		F = P * Math.pow((1 + i / m), N * m);
		return F;
	}

	static void fuli() throws ClassNotFoundException, SQLException// 计算复利终值
	{
		int N, m;
		double i, F, P;
		System.out.printf("存入本金:");
		P = scanner.nextDouble();
		System.out.printf("年利率:");
		i = scanner.nextDouble();
		System.out.printf("存入年限:");
		N = scanner.nextInt();
		System.out.printf("年复利次数:");
		m = scanner.nextInt();
		F = compound_amount_formla(P, i, N, m);
		System.out.println("复利终值:" + F);
		server(P, i, N, m, F);
		//P,i,N,m,F->Server(P,i,N,m,F)->DB
		
	}

	static double simple_interest_formula(double P, int N, double i)// 单利计算公式
	{
		double F;
		F = P + P * N * i;
		return F;
	}

	static void danli()// 单利计算
	{
		int N;
		double i, F, P;
		System.out.printf("存入本金:");
		P = scanner.nextDouble();
		System.out.printf("年利率:");
		i = scanner.nextDouble();
		System.out.printf("存入年限:");
		N = scanner.nextInt();
		F = simple_interest_formula(P, N, i);
		System.out.println("本息和为:" + F);
	}

	static int years_formula(double F, double P, double i, int m)// 根据复利终值求年份
	{
		int year;
		year = (int) (Math.log(F / P) / Math.log(1 + i / m) / m);
		return year;
	}

	static void years()// 求年份
	{
		int N, m;
		double i, F, P;
		System.out.printf("复利终值:");
		F = scanner.nextDouble();
		System.out.printf("存入本金:");
		P = scanner.nextDouble();
		System.out.printf("年利率:");
		i = scanner.nextDouble();
		System.out.printf("年复利次数:");
		m = scanner.nextInt();
		N = years_formula(F, P, i, m);
		System.out.println("从" + P + "到" + F + "需要" + N + "年");
	}

	static double rate_formula(int m, double F, double P, int N)// 复利的利率计算公式
	{
		double rate;
		rate = m * (Math.pow(F / P, 1.0 / (N * m)) - 1);
		return rate;
	}

	static void annual_int_rate()// 计算年利率
	{
		int N, m;
		double i, F, P;
		System.out.printf("复利终值:");
		F = scanner.nextDouble();
		System.out.printf("存入本金:");
		P = scanner.nextDouble();
		System.out.printf("存入年限:");
		N = scanner.nextInt();
		System.out.printf("年复利次数:");
		m = scanner.nextInt();
		i = rate_formula(m, F, P, N);
		System.out.println("从" + P + "到" + F + "需要" + i);
	}

	static double according_year_formula(double P, int N, double i)// 按照年份等额投资计算公式
	{
		double final_value;
		final_value = P * (Math.pow(1 + i, N) - 1) / i;
		return final_value;
	}

	static double according_month_formula(double P, int N, double i)// 按照月份等额投资计算公式
	{
		double final_value;
		final_value = P * 12 * (1 + i) * (Math.pow(1 + i, N) - 1) / i;
		return final_value;
	}

	static void YM_Equal_cast_final()// 计算等额投资
	{
		int N, n;
		double i, F, P;
		System.out.printf("\t\t1:按年投资\n\t\t2:按月投资\n");
		System.out.printf("请选择你要的功能<1|2>:");
		n = scanner.nextInt();
		if (n == 1) {
			System.out.printf("存入本金:");
			P = scanner.nextDouble();
			System.out.printf("存入年限:");
			N = scanner.nextInt();
			System.out.printf("年利率:");
			i = scanner.nextDouble();
			F = according_year_formula(P, N, i);
			System.out.println(N + "年后的总产值:" + F);

		} else if (n == 2) {
			System.out.printf("存入本金:");
			P = scanner.nextDouble();
			System.out.printf("存入年限:");
			N = scanner.nextInt();
			System.out.printf("年利率:");
			i = scanner.nextDouble();
			F = according_month_formula(P, N, i);
			System.out.println(N + "年后的总产值:" + F);
		} else {
			System.out.printf("输入有误!\n");
		}

	}

	static double Average_capital_plus_interest_formula(double F, int N,double i)// 等额还款公式
	{
		double refund;
		refund = F * i / (12 * (1 + i) * (Math.pow(1 + i, N) - 1));
		return refund;
	}

	static void Average_capital_plus_interest()// 等额还款
	{
		int N;
		double i, F, P;
		System.out.printf("贷款金额:");
		F = scanner.nextDouble();
		System.out.printf("存入年限:");
		N = scanner.nextInt();
		System.out.printf("年利率:");
		i = scanner.nextDouble();
		P = Average_capital_plus_interest_formula(F, N, i);
		System.out.println("贷款" + F + "每月需要还款" + P);
	}
	public static void server(double P,double i,int N,int m,double F) throws SQLException, ClassNotFoundException
	{
	String name = "root";
	String pwd = "zzy999";
	String url = "jdbc:mysql://localhost_3306/compound";
	//Class.forName("com.mysql.jdbc.Driver");
   try
	{
		Class.forName("com.mysql.jdbc.Driver");
	}
	catch(ClassNotFoundException e)
	{	
		e.printStackTrace();
	}	
	Connection conn = DriverManager.getConnection(url,name,pwd);
	//String sql = "select * from calculation";
	Statement stmt = conn.createStatement();
//	ResultSet rs = stmt.executeQuery(sql);
//	while(rs.next())
//	{
//		P=rs.getDouble((int) P);
//	}
	
	
	String sql1 = "insert into calculation(P,i,N,m,F) values (?,?,?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql1);
	//P,i,N,m,F
	pstmt.setDouble(1,P);
	pstmt.setDouble(2,i);
	pstmt.setInt(3,N);
	pstmt.setInt(4,m);
	pstmt.setDouble(5,F);
	///pstmt.executeUpdate(); 
	pstmt.executeUpdate(sql1);
	
//	try 
//	{
//		
//	} catch (Exception e) 
//	{
//		// TODO: handle exception
//	}finally
//	{
//		if(rs.next())
//		{
//			
//		}
//		else
//		{
//			
//			
//		}
//	}
//	
	
	//rs.close();
	stmt.close();
	conn.close();
}

}
