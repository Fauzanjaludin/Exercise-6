package a4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Test1 {

	private JFrame frame;
	private JTextField Salary;
	private JTextField txtInt;
	private JTextField loanPer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 window = new Test1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 933, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel price = new JLabel("Price :");
		price.setFont(new Font("Tahoma", Font.PLAIN, 16));
		price.setBounds(371, 339, 506, 20);
		frame.getContentPane().add(price);
		
		JLabel carmod = new JLabel("Car");
		carmod.setHorizontalAlignment(SwingConstants.CENTER);
		carmod.setBounds(60, 453, 256, 14);
		frame.getContentPane().add(carmod);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Test1.class.getResource("/a2/200px-PROTON_Holdings_logo_(2019\u2013present).png")));
		lblNewLabel.setBounds(56, 11, 205, 179);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel pic = new JLabel("");
		pic.setHorizontalAlignment(SwingConstants.CENTER);
		pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/SaGA-256x256.jpg")));
		pic.setBounds(10, 186, 351, 256);
		frame.getContentPane().add(pic);
		
		JLabel Sallabel = new JLabel("Salary");
		Sallabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Sallabel.setBounds(271, 25, 63, 29);
		frame.getContentPane().add(Sallabel);
		
		JLabel modlabel = new JLabel("Model");
		modlabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		modlabel.setBounds(271, 65, 71, 20);
		frame.getContentPane().add(modlabel);
		
		JLabel aftSal = new JLabel("Salary After Monthly Payment :");
		aftSal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		aftSal.setBounds(547, 25, 360, 29);
		frame.getContentPane().add(aftSal);
		
		JLabel lblNewLabel_4 = new JLabel("Features");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(371, 185, 122, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel intRate = new JLabel("Interest Rate");
		intRate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		intRate.setBounds(271, 99, 210, 20);
		frame.getContentPane().add(intRate);
		
		JLabel lblNewLabel_6 = new JLabel("Loan Period");
		lblNewLabel_6.setToolTipText("in Years");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(271, 130, 205, 19);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel totInt = new JLabel("Total Interest :");
		totInt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		totInt.setBounds(371, 378, 485, 14);
		frame.getContentPane().add(totInt);
		
		JLabel monInt = new JLabel("Monthly Interest :");
		monInt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		monInt.setBounds(371, 403, 485, 14);
		frame.getContentPane().add(monInt);
		
		JLabel monIns = new JLabel("Monthly Installment :");
		monIns.setFont(new Font("Tahoma", Font.PLAIN, 14));
		monIns.setBounds(371, 428, 485, 14);
		frame.getContentPane().add(monIns);
		
		Salary = new JTextField();
		Salary.setToolTipText("in myr");
		Salary.setBounds(336, 32, 180, 20);
		frame.getContentPane().add(Salary);
		Salary.setColumns(10);
		
		txtInt = new JTextField();
		txtInt.setToolTipText("in percent");
		txtInt.setBounds(387, 102, 210, 20);
		frame.getContentPane().add(txtInt);
		txtInt.setColumns(10);
		
		loanPer = new JTextField();
		loanPer.setBounds(387, 130, 210, 20);
		frame.getContentPane().add(loanPer);
		loanPer.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Saga", "X50", "X70"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(336, 65, 180, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel tranLabel = new JLabel("Transmission :");
		tranLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tranLabel.setBounds(371, 219, 485, 29);
		frame.getContentPane().add(tranLabel);
		
		JLabel tyreLabel = new JLabel("Tyres :");
		tyreLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tyreLabel.setBounds(371, 249, 485, 29);
		frame.getContentPane().add(tyreLabel);
		
		JLabel colorLabel = new JLabel("Color :\r\n");
		colorLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		colorLabel.setBounds(371, 279, 485, 29);
		frame.getContentPane().add(colorLabel);
		
		JLabel apLabel = new JLabel("Autopark :");
		apLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		apLabel.setBounds(371, 309, 485, 29);
		frame.getContentPane().add(apLabel);
		
		JButton btnNewButton = new JButton("Test");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(comboBox.getSelectedItem()=="Saga") {
						Finance fn=new Finance(39800.00,Double.parseDouble(txtInt.getText()),Double.parseDouble(loanPer.getText()));
						double[] inter=fn.LoanInter();
						String[] s=fn.tostring(inter);
						totInt.setText("Total Interest     : "+s[0]);
						monInt.setText("Monthly Interest   : "+s[1]);
						monIns.setText("Monthly Installment: "+s[2]);
						String a=String.valueOf(fn.afterpay(Double.parseDouble(Salary.getText()),Double.parseDouble(s[2])));
						aftSal.setText("Salary After Monthly Payment :"+a);
						carmod.setText("Model : Proton Saga");
						tranLabel.setText("Transmission :5 speed Manual And 4 speed Auto ");
						tyreLabel.setText("Tyre : Dunlop 16 inch");
						colorLabel.setText("Color : Solid/Metallic Red,Blue,Silver,White,Yellow");
						apLabel.setText("AutoPark : Not Available");
						pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/SaGA-256x256.jpg")));
						price.setText("Price : RM 39800");
					}
					if(comboBox.getSelectedItem()=="X50") {
						Finance fn=new Finance(79200.00,Double.parseDouble(txtInt.getText()),Double.parseDouble(loanPer.getText()));
						double[] inter=fn.LoanInter();
						String[] s=fn.tostring(inter);
						totInt.setText("Total Interest     : "+s[0]);
						monInt.setText("Monthly Interest   : "+s[1]);
						monIns.setText("Monthly Installment: "+s[2]);
						String a=String.valueOf(fn.afterpay(Double.parseDouble(Salary.getText()),Double.parseDouble(s[2])));
						aftSal.setText("Salary After Monthly Payment :"+a);
						carmod.setText("Model : Proton X50");
						tranLabel.setText("Transmission : 7 speed Auto");
						tyreLabel.setText("Tyre : GoodYear 17 inch");
						colorLabel.setText("Color : Solid/Metallic Red,Blue,Bronze,Silver,White");
						apLabel.setText("AutoPark : Available");
						pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/x50 (2).jpg")));
						price.setText("Price : RM 79200.00");
					}
					if(comboBox.getSelectedItem()=="X70") {
						Finance fn=new Finance(94800.00,Double.parseDouble(txtInt.getText()),Double.parseDouble(loanPer.getText()));
						double[] inter=fn.LoanInter();
						String[] s=fn.tostring(inter);
						totInt.setText("Total Interest     : "+s[0]);
						monInt.setText("Monthly Interest   : "+s[1]);
						monIns.setText("Monthly Installment: "+s[2]);
						String a=String.valueOf(fn.afterpay(Double.parseDouble(Salary.getText()),Double.parseDouble(s[2])));
						aftSal.setText("Salary After Monthly Payment :"+a);
						carmod.setText("Model : Proton X70");
						tranLabel.setText("Transmission : 7 speed Auto");
						tyreLabel.setText("Tyre : GoodYear 17 inch");
						colorLabel.setText("Color : Solid/Metallic Red,Blue,Silver,White");
						apLabel.setText("AutoPark : Available");
						pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/x70.jpeg")));
						price.setText("Price : RM 94800.00");
						
					
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Oops it brokey");
				}
			}
		});
		btnNewButton.setBounds(607, 95, 256, 55);
		frame.getContentPane().add(btnNewButton);
	}
}
