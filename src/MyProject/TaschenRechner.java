package MyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TaschenRechner {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaschenRechner window = new TaschenRechner();
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
	public TaschenRechner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 749, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNum1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum1.setBounds(62, 74, 220, 84);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNum2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(396, 74, 220, 84);
		frame.getContentPane().add(textFieldNum2);
		
		textFieldAns = new JTextField();
		textFieldAns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAns.setFont(new Font("Tahoma", Font.BOLD, 30));
		textFieldAns.setColumns(10);
		textFieldAns.setBounds(408, 346, 220, 84);
		frame.getContentPane().add(textFieldAns);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int num1 ;
				int num2;
				int ans;
				
				try {
					//Konvertieren eines Strings in ein Integer Objekt 
					
					num1 = Integer.parseInt(textFieldNum1.getText());  
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans =num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				 
				catch(Exception e1) {
					
					JOptionPane.showInternalMessageDialog(null,"Please enter valid number !!!");
				}
					
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(73, 222, 155, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMinus = new JButton("Sub");
		btnMinus.setBackground(Color.GRAY);
		btnMinus.setForeground(Color.BLACK);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int num1 ;
				int num2;
				int ans;
				
				try {
					//Konvertieren eines Strings in ein Integer Objekt 
					
					num1 = Integer.parseInt(textFieldNum1.getText());  
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans =num1-num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				 
				catch(Exception e1) {
					
					JOptionPane.showInternalMessageDialog(null,"Please enter valid number !!!");
				}
			}
		});
		btnMinus.setBounds(396, 222, 155, 58);
		frame.getContentPane().add(btnMinus);
		
		JLabel lblNewLabel = new JLabel("The Answer is : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(56, 367, 289, 63);
		frame.getContentPane().add(lblNewLabel);
	}
}
