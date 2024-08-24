import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField total;
	private JTextField avg;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public StudentMarks() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.LIGHT_GRAY, null, null));
		panel.setBounds(40, 41, 557, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Mark Calculation System");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(96, 20, 335, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Subject 1");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(56, 97, 98, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject 2");
		lblNewLabel_1_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(56, 146, 98, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Subject 3");
		lblNewLabel_1_2.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(56, 191, 98, 28);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total Marks");
		lblNewLabel_1_3.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(56, 235, 98, 28);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Average Marks");
		lblNewLabel_1_4.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(56, 279, 113, 28);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Grade");
		lblNewLabel_1_5.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(56, 324, 98, 28);
		panel.add(lblNewLabel_1_5);
		
		sub1 = new JTextField();
		sub1.setFont(new Font("Serif", Font.PLAIN, 18));
		sub1.setBounds(215, 97, 126, 28);
		panel.add(sub1);
		sub1.setColumns(10);
		
		sub2 = new JTextField();
		sub2.setFont(new Font("Serif", Font.PLAIN, 18));
		sub2.setColumns(10);
		sub2.setBounds(215, 146, 126, 28);
		panel.add(sub2);
		
		sub3 = new JTextField();
		sub3.setFont(new Font("Serif", Font.PLAIN, 18));
		sub3.setColumns(10);
		sub3.setBounds(215, 191, 126, 28);
		panel.add(sub3);
		
		total = new JTextField();
		total.setFont(new Font("Serif", Font.PLAIN, 18));
		total.setColumns(10);
		total.setBounds(215, 235, 126, 28);
		panel.add(total);
		
		avg = new JTextField();
		avg.setFont(new Font("Serif", Font.PLAIN, 18));
		avg.setColumns(10);
		avg.setBounds(215, 279, 126, 28);
		panel.add(avg);
		
		grade = new JTextField();
		grade.setFont(new Font("Serif", Font.PLAIN, 18));
		grade.setColumns(10);
		grade.setBounds(215, 324, 126, 28);
		panel.add(grade);
		
		JButton btnadd = new JButton("Add");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int s1 = Integer.parseInt(sub1.getText());
				int s2 = Integer.parseInt(sub2.getText());
				int s3 = Integer.parseInt(sub3.getText());
				
				int totalMarks = s1+s2+s3;
				double average = totalMarks/3;
				
				total.setText(String.valueOf(totalMarks));
				avg.setText(String.valueOf(average));
				
				if(average > 33) {
					grade.setText("Pass");
				}
				else {
					grade.setText("Failed");
				}
				
			}
		});
		btnadd.setFont(new Font("Serif", Font.PLAIN, 20));
		btnadd.setBounds(414, 126, 104, 48);
		panel.add(btnadd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				avg.setText("");
				total.setText("");
				grade.setText("");
				
				sub1.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Serif", Font.PLAIN, 20));
		btnClear.setBounds(414, 198, 104, 48);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnExit.setFont(new Font("Serif", Font.PLAIN, 20));
		btnExit.setBounds(414, 274, 104, 48);
		panel.add(btnExit);
	}
}
