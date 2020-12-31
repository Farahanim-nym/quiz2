import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2Class {

	private JFrame frmWaterCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2Class window = new Quiz2Class();
					window.frmWaterCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz2Class() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWaterCalculator = new JFrame();
		frmWaterCalculator.setBackground(Color.PINK);
		frmWaterCalculator.getContentPane().setBackground(new Color(153, 255, 255));
		frmWaterCalculator.getContentPane().setForeground(Color.BLACK);
		frmWaterCalculator.setTitle("Water Calculator");
		frmWaterCalculator.setBounds(100, 100, 450, 300);
		frmWaterCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWaterCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How much water should I drink?");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(36, 25, 220, 14);
		frmWaterCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("My weight (kg) :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setBounds(82, 90, 95, 24);
		frmWaterCalculator.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textField.setBounds(187, 82, 103, 32);
		frmWaterCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double weight;
				double water=0;
				try {
					weight=Double.parseDouble(textField.getText());
					water=weight*0.033;
					
						
					
					
					
				}catch(Exception e1) {
					   JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
				
				JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water+" L "   +"of water a day!");
			}
		});
		btnNewButton.setBounds(177, 189, 89, 23);
		frmWaterCalculator.getContentPane().add(btnNewButton);
	}
}
