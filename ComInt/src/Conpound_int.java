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
				System.out.println("���볬����Χ������������:");

			}
		}
	}

	static Scanner scanner = new Scanner(System.in);

	static void tip()// ���㹫ʽ��һЩ�����Ľ���
	{
		System.out.printf("�����������\n");
		System.out.printf("    �������㹫ʽ:F=P*pow((1+i/m),N*m)\n");
		System.out.printf("    �������㹫ʽ:F=P+P*N*i\n");
		System.out.printf("    �ȶ�Ͷ�ʹ�ʽ:F=P*12*(1+i)*(pow(1+i,N)-1)/i\n");
		System.out.printf("\tF:������ֵ|�����ֵ\n");
		System.out.printf("\tP:����\n");
		System.out.printf("\ti:����\n");
		System.out.printf("\tN�����ʻ�ȡʱ���������\n");
		System.out.printf("\tm:�긴������(һ�굱�еĹ�������)\n");
	}

	static void menu()// �˵�
	{
		System.out.printf("\t\t|-----------------------------------|\n");
		System.out.printf("\t\t|             welcome               |\n");
		System.out.printf("\t\t|-----------------------------------|\n");
		System.out.printf("\t\t|           1:���㱾��                                        |\n");
		System.out.printf("\t\t|           2:�����긴����ֵ                             |\n");
		System.out.printf("\t\t|           3:��������                                        |\n");
		System.out.printf("\t\t|           4:�������                                        |\n");
		System.out.printf("\t\t|           5:����������                                    |\n");
		System.out.printf("\t\t|           6:�ȶͶ(��|��)          |\n");
		System.out.printf("\t\t|           7:�ȶ��                                        |\n");
		System.out.printf("\t\t|           0:����                                               |\n");
		System.out.printf("\t\t|-----------------------------------|\n");
		System.out.printf("��������Ҫѡ��Ĺ���(0~7):");

	}

	static double capital_formula(double F, double i, int N, int m)// ������㹫ʽ
	{
		double P;
		P = F / Math.pow((1 + i / m), N * m);
		return P;
	}
	static void benjin()// ���㱾��
	{
		int N, m;
		double i, F, P;
		System.out.printf("������ֵ:");
		F = scanner.nextDouble();
		System.out.printf("������:");
		i = scanner.nextDouble();
		System.out.printf("��������:");
		N = scanner.nextInt();
		System.out.printf("�긴������:");
		m = scanner.nextInt();
		P = capital_formula(F, i, N, m);
		System.out.println("�긴����ֵΪ" + F + "��Ҫ����Ϊ:" + P);
	}

	static double compound_amount_formla(double P, double i, int N, int m)// �������㹫ʽ
	{
		double F;
		F = P * Math.pow((1 + i / m), N * m);
		return F;
	}

	static void fuli() throws ClassNotFoundException, SQLException// ���㸴����ֵ
	{
		int N, m;
		double i, F, P;
		System.out.printf("���뱾��:");
		P = scanner.nextDouble();
		System.out.printf("������:");
		i = scanner.nextDouble();
		System.out.printf("��������:");
		N = scanner.nextInt();
		System.out.printf("�긴������:");
		m = scanner.nextInt();
		F = compound_amount_formla(P, i, N, m);
		System.out.println("������ֵ:" + F);
		server(P, i, N, m, F);
		//P,i,N,m,F->Server(P,i,N,m,F)->DB
		
	}

	static double simple_interest_formula(double P, int N, double i)// �������㹫ʽ
	{
		double F;
		F = P + P * N * i;
		return F;
	}

	static void danli()// ��������
	{
		int N;
		double i, F, P;
		System.out.printf("���뱾��:");
		P = scanner.nextDouble();
		System.out.printf("������:");
		i = scanner.nextDouble();
		System.out.printf("��������:");
		N = scanner.nextInt();
		F = simple_interest_formula(P, N, i);
		System.out.println("��Ϣ��Ϊ:" + F);
	}

	static int years_formula(double F, double P, double i, int m)// ���ݸ�����ֵ�����
	{
		int year;
		year = (int) (Math.log(F / P) / Math.log(1 + i / m) / m);
		return year;
	}

	static void years()// �����
	{
		int N, m;
		double i, F, P;
		System.out.printf("������ֵ:");
		F = scanner.nextDouble();
		System.out.printf("���뱾��:");
		P = scanner.nextDouble();
		System.out.printf("������:");
		i = scanner.nextDouble();
		System.out.printf("�긴������:");
		m = scanner.nextInt();
		N = years_formula(F, P, i, m);
		System.out.println("��" + P + "��" + F + "��Ҫ" + N + "��");
	}

	static double rate_formula(int m, double F, double P, int N)// ���������ʼ��㹫ʽ
	{
		double rate;
		rate = m * (Math.pow(F / P, 1.0 / (N * m)) - 1);
		return rate;
	}

	static void annual_int_rate()// ����������
	{
		int N, m;
		double i, F, P;
		System.out.printf("������ֵ:");
		F = scanner.nextDouble();
		System.out.printf("���뱾��:");
		P = scanner.nextDouble();
		System.out.printf("��������:");
		N = scanner.nextInt();
		System.out.printf("�긴������:");
		m = scanner.nextInt();
		i = rate_formula(m, F, P, N);
		System.out.println("��" + P + "��" + F + "��Ҫ" + i);
	}

	static double according_year_formula(double P, int N, double i)// ������ݵȶ�Ͷ�ʼ��㹫ʽ
	{
		double final_value;
		final_value = P * (Math.pow(1 + i, N) - 1) / i;
		return final_value;
	}

	static double according_month_formula(double P, int N, double i)// �����·ݵȶ�Ͷ�ʼ��㹫ʽ
	{
		double final_value;
		final_value = P * 12 * (1 + i) * (Math.pow(1 + i, N) - 1) / i;
		return final_value;
	}

	static void YM_Equal_cast_final()// ����ȶ�Ͷ��
	{
		int N, n;
		double i, F, P;
		System.out.printf("\t\t1:����Ͷ��\n\t\t2:����Ͷ��\n");
		System.out.printf("��ѡ����Ҫ�Ĺ���<1|2>:");
		n = scanner.nextInt();
		if (n == 1) {
			System.out.printf("���뱾��:");
			P = scanner.nextDouble();
			System.out.printf("��������:");
			N = scanner.nextInt();
			System.out.printf("������:");
			i = scanner.nextDouble();
			F = according_year_formula(P, N, i);
			System.out.println(N + "�����ܲ�ֵ:" + F);

		} else if (n == 2) {
			System.out.printf("���뱾��:");
			P = scanner.nextDouble();
			System.out.printf("��������:");
			N = scanner.nextInt();
			System.out.printf("������:");
			i = scanner.nextDouble();
			F = according_month_formula(P, N, i);
			System.out.println(N + "�����ܲ�ֵ:" + F);
		} else {
			System.out.printf("��������!\n");
		}

	}

	static double Average_capital_plus_interest_formula(double F, int N,double i)// �ȶ�ʽ
	{
		double refund;
		refund = F * i / (12 * (1 + i) * (Math.pow(1 + i, N) - 1));
		return refund;
	}

	static void Average_capital_plus_interest()// �ȶ��
	{
		int N;
		double i, F, P;
		System.out.printf("������:");
		F = scanner.nextDouble();
		System.out.printf("��������:");
		N = scanner.nextInt();
		System.out.printf("������:");
		i = scanner.nextDouble();
		P = Average_capital_plus_interest_formula(F, N, i);
		System.out.println("����" + F + "ÿ����Ҫ����" + P);
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
