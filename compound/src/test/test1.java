package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class test1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JButton jB0;
	private JButton jB1;
	private JLabel jL0;
	private JLabel jL1;
	private JLabel jL2;
	private JLabel jL3;
	private JLabel jL4;
	private JTextField jT0;
	private JTextField jT1;
	private JTextField jT2;
	private JTextField jT3;
	private JLabel jL5;
	private JTextField jT4;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JButton jButton6;
	private JButton jButton7;
	private JButton jButton8;
	public test1() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Bilateral(0, 0, 0), new Bilateral(4, 0, 0)));
		setSize(456, 538);
	}

	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setText("清除");
			jButton8.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton8ActionActionPerformed(event);
				}
			});
		}
		return jButton8;
	}

	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setText("等额投资");
			jButton7.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton7ActionActionPerformed(event);
				}
			});
		}
		return jButton7;
	}

	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setText("计算本金");
			jButton6.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton6ActionActionPerformed(event);
				}
			});
		}
		return jButton6;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("等额还款");
			jButton5.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton5ActionActionPerformed(event);
				}
			});
		}
		return jButton5;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("计算年利率");
			jButton4.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton4ActionActionPerformed(event);
				}
			});
		}
		return jButton4;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			
			jButton3.setText("年限计算");
			jButton3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton3ActionActionPerformed(event);
				}
			});
		}
		return jButton3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("计算");
			jButton2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JTextField getJTextField4() {
		if (jT4 == null) {
			jT4 = new JTextField();

		}
		return jT4;
	}

	private JLabel getJLabel5() {
		if (jL5 == null) {
			jL5 = new JLabel();
			jL5.setText("所得结果");
		}
		return jL5;
	}

	private JTextField getJTextField3() {
		if (jT3 == null) {
			jT3 = new JTextField();
			jT3.addKeyListener(new KeyAdapter() {

				public void keyTyped(KeyEvent e) {
					int KeyChar = e.getKeyChar();
					if (KeyChar >= KeyEvent.VK_0 && KeyChar <= KeyEvent.VK_9 || KeyChar == '.') {

					} else {
						e.consume();// 关键，屏蔽掉非法输入
						JOptionPane.showMessageDialog(null, "您输入的是非法输入，请重新输入数字", "标题", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		}
		return jT3;
	}

	private JTextField getJTextField2() {
		if (jT2 == null) {
			jT2 = new JTextField();
			jT2.addKeyListener(new KeyAdapter() {

				public void keyTyped(KeyEvent e) {
					int KeyChar = e.getKeyChar();
					if (KeyChar >= KeyEvent.VK_0 && KeyChar <= KeyEvent.VK_9 || KeyChar == '.') {

					} else {
						e.consume();// 关键，屏蔽掉非法输入
						JOptionPane.showMessageDialog(null, "您输入的是非法输入，请重新输入数字", "标题", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		}
		return jT2;
	}

	
	
	private JTextField getJTextField1() {
		if (jT1 == null) {
			jT1 = new JTextField();
			jT1.addKeyListener(new KeyAdapter() {

				public void keyTyped(KeyEvent e) {
					int KeyChar = e.getKeyChar();
					if (KeyChar >= KeyEvent.VK_0 && KeyChar <= KeyEvent.VK_9 || KeyChar == '.') {

					} else {
						e.consume();// 关键，屏蔽掉非法输入
						JOptionPane.showMessageDialog(null, "您输入的是非法输入，请重新输入数字", "标题", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		}
		return jT1;
	}

	private JTextField getJTextField0() {
		if (jT0 == null) {
			jT0 = new JTextField();
			// 限制只能输入数字
			jT0.addKeyListener(new KeyAdapter() {

				public void keyTyped(KeyEvent e) {
					int KeyChar = e.getKeyChar();
					if (KeyChar >= KeyEvent.VK_0 && KeyChar <= KeyEvent.VK_9 || KeyChar == '.') {

					} else {
						e.consume();// 关键，屏蔽掉非法输入
						JOptionPane.showMessageDialog(null, "您输入的是非法输入，请重新输入数字", "标题", JOptionPane.ERROR_MESSAGE);
					}
				}
			});

		}
		return jT0;
	}

	private JLabel getJLabel4() {
		if (jL4 == null) {
			jL4 = new JLabel();
			jL4.setText("复利次数");
		}
		return jL4;
	}

	private JLabel getJLabel3() {
		if (jL3 == null) {
			jL3 = new JLabel();
			jL3.setText("年限（年）");
		}
		return jL3;
	}

	private JLabel getJLabel2() {
		if (jL2 == null) {
			jL2 = new JLabel();
			jL2.setText("利率（%）");
		}
		return jL2;
	}

	private JLabel getJLabel1() {
		if (jL1 == null) {
			jL1 = new JLabel();
			jL1.setText("本金（元）");
		}
		return jL1;
	}

	private JLabel getJLabel0() {
		if (jL0 == null) {
			jL0 = new JLabel();
			jL0.setBackground(new Color(255, 0, 128));
			jL0.setFont(new Font("Dialog", Font.BOLD, 14));
			jL0.setForeground(Color.yellow);
			jL0.setText("正在进行（复利计算）");
		}
		return jL0;
	}

	private JButton getJButton1() {
		if (jB1 == null) {
			jB1 = new JButton();
			
			jB1.setText("单利计算");
			jB1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jB1ActionActionPerformed(event);
				}
			});
		}
		return jB1;
	}

	private JButton getJButton0() {
		if (jB0 == null) {
			jB0 = new JButton();
			
			jB0.setText("复利计算");
			jB0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jB0;
	}
//Image image;
//	 public void paint(Graphics g) {
//	try{
//		image=ImageIO.read(new File("f:/2.jpg"));
//	}catch(IOException e){
//		e.printStackTrace();
//	}
//	g.drawImage(image,0,0,500,600,this.jPanel0);
//	 }
	
	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBackground(new Color(0, 255, 64));
			jPanel0.setFont(new Font("Dialog", Font.PLAIN, 14));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJButton1(), new Constraints(new Leading(31, 114, 12, 12), new Leading(134, 12, 12)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(31, 118, 12, 12), new Leading(76, 12, 12)));
			jPanel0.add(getJLabel0(), new Constraints(new Leading(128, 10, 10), new Leading(8, 10, 10)));
			jPanel0.add(getJTextField3(), new Constraints(new Leading(294, 128, 12, 12), new Leading(222, 10, 10)));
			jPanel0.add(getJButton6(), new Constraints(new Leading(31, 108, 12, 12), new Leading(380, 12, 12)));
			jPanel0.add(getJButton3(), new Constraints(new Leading(31, 114, 12, 12), new Leading(196, 12, 12)));
			jPanel0.add(getJButton4(), new Constraints(new Leading(33, 114, 12, 12), new Leading(258, 12, 12)));
			jPanel0.add(getJButton5(), new Constraints(new Leading(33, 111, 12, 12), new Leading(315, 10, 10)));
			jPanel0.add(getJButton7(), new Constraints(new Leading(31, 111, 12, 12), new Leading(433, 10, 10)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(215, 10, 10), new Leading(67, 12, 12)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(219, 10, 10), new Leading(218, 22, 12, 12)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(215, 12, 12), new Leading(282, 10, 10)));
			jPanel0.add(getJTextField4(), new Constraints(new Leading(294, 128, 12, 12), new Leading(277, 28, 12, 12)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(297, 119, 12, 12), new Leading(65, 12, 12)));
			jPanel0.add(getJButton8(), new Constraints(new Leading(297, 136, 12, 12), new Leading(428, 12, 12)));
			jPanel0.add(getJButton2(), new Constraints(new Leading(297, 131, 12, 12), new Leading(380, 12, 12)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(215, 12, 12), new Leading(116, 12, 12)));
			jPanel0.add(getJTextField1(), new Constraints(new Leading(297, 124, 12, 12), new Leading(112, 12, 12)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(213, 12, 12), new Leading(168, 12, 12)));
			jPanel0.add(getJTextField2(), new Constraints(new Leading(297, 128, 12, 12), new Leading(166, 12, 12)));
		}
		return jPanel0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class. Note: This class is only created so that you can
	 * easily preview the result at runtime. It is not expected to be managed by
	 * the designer. You can modify it as you like.
	 */
	public static void main(String[] args) {
		// public void init(){
		
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				test1 frame = new test1();
				frame.setDefaultCloseOperation(test1.EXIT_ON_CLOSE);
				frame.setTitle("test1");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	//BackgroundImage=ImagelO.read(new file("Test/iamge/2.jsp"));
	
	@SuppressWarnings("unused")
	private void jfalse() {
		jT3.setVisible(false);
		jL4.setVisible(false);
	}

	@SuppressWarnings("unused")
	private void jtrue() {
		jT3.setVisible(true);
		jL4.setVisible(true);
	}

	@SuppressWarnings("unused")
	private void init() {
		jT0.setText(null);
		jT1.setText(null);
		jT2.setText(null);
		jT3.setText(null);
		jT4.setText(null);
		
	}

	//Image backing;
	//Image overing;
	int x = 0, y = 0;
	Graphics g;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	@SuppressWarnings("unused")
	private void jButton0ActionActionPerformed(ActionEvent event) {
		init();
		jL0.setText("正在进行（复利计算）");
		jL1.setText("本金(元)");
		jL2.setText("年利率(%)");
		jL3.setText("年限");
		jL4.setText("复利次数");

	}

	@SuppressWarnings({ "unused", "static-access" })
	private void account() {
		NumberFormat currencyformatter = NumberFormat.getInstance();
		String Principal = jT0.getText();
		String Rate = jT1.getText();// 年利率
		String Time = jT2.getText();// 年限
		String Profit = jT2.getText();
		String Count = jT3.getText();// 复利次数
		String Sum = jT4.getText();
		if (jL0.getText() == ("正在进行（复利计算）")) {
			CompoundAccount compound = new CompoundAccount(Rate, Principal, Time, Count);
			double f = compound.Account();
			jT4.setText(String.valueOf(currencyformatter.format(f) + "\n"));

		} else if (jL0.getText() == ("正在进行（单利计算）")) {
			SingleAccount Single = new SingleAccount(Rate, Principal, Time);
			double f = Single.Account();
			
			jT4.setText(String.valueOf(currencyformatter.format(f) + "\n"));
		} else if (jL0.getText() == ("正在进行（年限计算）")) {
			TimeAccount time = new TimeAccount(Rate, Principal, Profit, Count);
			int f = time.Account();
			
			jT4.setText(("年数为：" + String.valueOf(f) + "年" + "\n"));
		} else if (jL0.getText() == ("正在进行（计算年利率）")) {
			BestEfficiency efficiency = new BestEfficiency(Profit, Principal, Time, Count);
			double f = efficiency.Account();
			
			jT4.setText(("年利率为：" + String.valueOf(f) + "\n"));

		} else if (jL0.getText() == ("正在进行（等额还款）")) {
			FundAccount fund = new FundAccount(Rate, Principal, Time);
			double f = fund.Account();
			jT4.setText(String.valueOf(currencyformatter.format(f) + "\n"));
		} else if (jL0.getText() == ("正在进行（本金估算）")) {
			PrincipalAccount principal = new PrincipalAccount(Rate, Profit, Time, Count);
			double f = principal.Account();
			
			jT4.setText(String.valueOf(currencyformatter.format(f) + "\n"));
		} else if (jL0.getText() == ("正在进行（等额投资）")) {
			YearAccount income = new YearAccount(Rate, Principal, Time);
			double f = income.Account();
			
			jT4.setText(String.valueOf(currencyformatter.format(f) + "\n"));
		}

	}

	@SuppressWarnings("static-access")
	private void jButton2ActionActionPerformed(ActionEvent event) {
		if (jT0.getText().trim().equals("") || jT1.getText().trim().equals("") || jT2.getText().trim().equals("")) {
			JOptionPane jo = new JOptionPane();
			jo.showMessageDialog(null, "请输入数据再计算，谢谢！");
		} else {
			account();
		}

	}

	private void jB1ActionActionPerformed(ActionEvent event) {
		init();
		jL0.setText("你所在的区域为（单利计算）");
		jL1.setText("本金(元)");
		jL2.setText("年利率(%)");
		jL3.setText("年限");
		jfalse();

	}

	private void jButton3ActionActionPerformed(ActionEvent event) {
		init();
		jL0.setText("正在进行（年限计算）");
		jL1.setText("本金(元)");
		jL2.setText("年利率(%)");
		jL3.setText("本利和");
		jtrue();
	}

	private void jButton4ActionActionPerformed(ActionEvent event) {
		init();
		
		jL0.setText("正在进行（计算年利率）");
		jL1.setText("本金（元）");
		jL2.setText("本利和(元)");
		jL3.setText("年限（年）");

	}

	private void jButton5ActionActionPerformed(ActionEvent event) {
		init();
		jL0.setText("正在进行（等额还款）");
		jL1.setText("贷款金额(元)");
		jL2.setText("本利和(元)");
		jL3.setText("年限(年)");
		jfalse();
	}

	private void jButton6ActionActionPerformed(ActionEvent event) {
		init();
		jL0.setText("正在进行（本金估算）");
		jL1.setText("本利和(元)");
		jL2.setText("年利率(%)");
		jL3.setText("年限(年)");
	}

	private void jButton7ActionActionPerformed(ActionEvent event) {
		init();
		jL0.setText("正在进行（等额投资）");
		jL1.setText("投资(元)");
		jL2.setText("年利率(%)");
		jL3.setText("年限(年)");
	}

	@SuppressWarnings("static-access")
	private void jButton8ActionActionPerformed(ActionEvent event) {
		if (jT0.getText().trim().equals("") || jT1.getText().trim().equals("") || jT2.getText().trim().equals("")) {
			JOptionPane jo = new JOptionPane();
			jo.showMessageDialog(null, "您的数据是空的，不需要清除，谢谢！");
		} else {
			init();
		}
	}

//	private void jButton11ActionActionPerformed(ActionEvent event) {
//		addpicture();
//	}

}
