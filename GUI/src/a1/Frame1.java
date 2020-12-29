package a1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Frame1 {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		saga s=new saga();
		x50 x5=new x50();
		x70 x7=new x70();
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 997, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Frame1.class.getResource("/a2/200px-PROTON_Holdings_logo_(2019\u2013present).png")));
		lblNewLabel.setBounds(10, 11, 200, 156);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Model:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(220, 26, 112, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel txtmodel = new JLabel("Model");
		txtmodel.setBounds(294, 154, 336, 14);
		frame.getContentPane().add(txtmodel);
		
		JLabel txttrans = new JLabel("transmission");
		txttrans.setBounds(294, 201, 380, 14);
		frame.getContentPane().add(txttrans);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(294, 255, 331, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"saga", "x50", "x70"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(342, 35, 161, 26);
		frame.getContentPane().add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(294, 300, 386, 199);
		frame.getContentPane().add(textArea);
		
		JLabel carico = new JLabel("");
		carico.setBounds(10, 201, 266, 244);
		frame.getContentPane().add(carico);
		
		
		JButton btConf = new JButton("Confirm");
		btConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(comboBox.getSelectedItem()=="saga") {
						txtmodel.setText("Model : Proton Saga");
						txttrans.setText(s.brand);
						carico.setIcon(new ImageIcon(Frame1.class.getResource("/a2/SaGA-256x256.jpg")));
					}
					if(comboBox.getSelectedItem()=="x50") {
						txtmodel.setText("Model : Proton X50");
						txttrans.setText(x5.autop);
						carico.setIcon(new ImageIcon(Frame1.class.getResource("/a2/x50 (2).jpg")));
					}
					if(comboBox.getSelectedItem()=="x70") {
						txtmodel.setText("Model : Proton X70");
						txttrans.setText(x7.autop);
						//carico.setIcon(new ImageIcon(Frame1.class.getResource("/a2/x70.jpg")));
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Something");
				}
			}
		});
		btConf.setBounds(526, 28, 104, 34);
		frame.getContentPane().add(btConf);
		
		
		
	}
}
