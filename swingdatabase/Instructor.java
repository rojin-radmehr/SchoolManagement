package swingdatabase;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Instructor {

	public static void main(String[] args) {
		JFrame f = new JFrame("Instructor Form");
		JLabel instructorId, name, email, phonenumber, targetyear;
		final JTextField idfield = new JTextField();
		final JTextField namefield = new JTextField();
		final JTextField numberfield = new JTextField();
		final JTextField emailfield = new JTextField();
		
		JCheckBox targetYearField1 = new JCheckBox("Fall 2023");
		JCheckBox targetYearField2 = new JCheckBox("Fall 2022");
		
		instructorId = new JLabel("Instructor Id:");
		instructorId.setBounds(50,50,100,30);
		idfield.setBounds(140,50,100,30);
		
		name = new JLabel("Name:");
		name.setBounds(50,100,100,30);
		namefield.setBounds(140,100,100,30);
		
		email = new JLabel("Email:");
		email.setBounds(50,150,100,30);
		emailfield.setBounds(140,150,100,30);
		
		targetyear = new JLabel("Target Year:");
		targetyear.setBounds(50,200,100,30);
		targetYearField1.setBounds(140,150,100,30);
		targetYearField2.setBounds(140,180,100,30);
		
		JButton b = new JButton("Register");
		b.setBounds(100,500,100,30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String instructorId = idfield.getText();
				String name = namefield.getText();
				String email = emailfield.getText();
				String phone_number = numberfield.getText();
				String targetyear = ((targetYearField1.isSelected()))
			}
		});

	}

}
