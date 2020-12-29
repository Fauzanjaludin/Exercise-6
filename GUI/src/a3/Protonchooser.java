package a3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Protonchooser {

	private JFrame frame;
	private JTextField loanA;
	private JTextField IntR;
	private JTextField loanP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Protonchooser window = new Protonchooser();
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
	public Protonchooser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DecimalFormat df=new DecimalFormat("0.00");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		loanA = new JTextField();
		loanA.setToolTipText("Loan Amount");
		loanA.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(loanA);
		loanA.setColumns(10);
		
		IntR = new JTextField();
		IntR.setToolTipText("Interest Rate");
		IntR.setBounds(10, 42, 86, 20);
		frame.getContentPane().add(IntR);
		IntR.setColumns(10);
		
		loanP = new JTextField();
		loanP.setToolTipText("Loan Period");
		loanP.setBounds(10, 73, 86, 20);
		frame.getContentPane().add(loanP);
		loanP.setColumns(10);
		
		JLabel totint = new JLabel("Total Interest");
		totint.setBounds(106, 14, 210, 14);
		frame.getContentPane().add(totint);
		
		JLabel monint = new JLabel("Monthly Interest");
		monint.setBounds(106, 45, 210, 14);
		frame.getContentPane().add(monint);
		
		JLabel monins = new JLabel("Monthly Installment");
		monins.setBounds(106, 76, 210, 14);
		frame.getContentPane().add(monins);
		
		JButton btnNewButton = new JButton("Calculate ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Finance fn=new Finance(Double.parseDouble(loanA.getText()),Double.parseDouble(IntR.getText()),Double.parseDouble(loanP.getText()));
					double[] inter=fn.LoanInter();
					String[] s=fn.tostring(inter);
					totint.setText("Total Interest     : "+s[0]);
					monint.setText("Monthly Interest   : "+s[1]);
					monins.setText("Monthly Installment: "+s[2]);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "");
				}
			}
		});
		btnNewButton.setBounds(335, 10, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
