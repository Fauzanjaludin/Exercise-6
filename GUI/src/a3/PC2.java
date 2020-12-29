package a3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PC2 {

	private JFrame frame;
	private JTextField basicSal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PC2 window = new PC2();
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
	public PC2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1030, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		basicSal = new JTextField();
		basicSal.setBounds(145, 11, 86, 20);
		frame.getContentPane().add(basicSal);
		basicSal.setColumns(10);
		
		
		JComboBox Loanperiod = new JComboBox();
		Loanperiod.setModel(new DefaultComboBoxModel(new String[] {"3","5","7","9","11"}));
		Loanperiod.setMaximumRowCount(5);
		Loanperiod.setBounds(145, 42, 185, 22);
		frame.getContentPane().add(Loanperiod);
		
		JButton btnNewButton = new JButton("Press");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double sal=Double.parseDouble(basicSal.getText());
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Why");
				}
			}
		});
		btnNewButton.setBounds(241, 10, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Input your basic salary");
		lblNewLabel.setBounds(10, 14, 132, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Loan Period");
		lblNewLabel_1.setBounds(10, 46, 125, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
