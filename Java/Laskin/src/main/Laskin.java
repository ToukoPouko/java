package main;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Laskin extends JFrame{
	
	public Laskin() {
		JFrame guiFrame = new JFrame();
		GridBagLayout layout = new GridBagLayout();
		JPanel panel = new JPanel(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		double num1, num2;
		String[] operators = new String[4];
		operators[0] = "+";
		operators[1] = "-";
		operators[2] = "/";
		operators[3] = "*";
		char currentOperator;
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Laskin");
		guiFrame.setSize(400, 400);
		guiFrame.setLayout(layout);
		guiFrame.setVisible(true);
		guiFrame.setResizable(false);
		
		JLabel lblResult = new JLabel("0");
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnEquals = new JButton("=");
		JButton btnDot = new JButton(",");
		JButton btnClear = new JButton("CE");
		JButton btnPlus = new JButton("+");
		JButton btnMinus = new JButton("-");
		JButton btnDiv = new JButton("/");
		JButton btnMult = new JButton("*");
		JButton btnEmpty = new JButton("");
		
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(lblResult, gbc);
		

		gbc.gridx = 3;
		gbc.gridy = 0;
		panel.add(btnClear, gbc);
		
		//-----------------------------------------------------------

		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(btn7, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(btn8, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel.add(btn9, gbc);
		
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		panel.add(btnDiv, gbc);
		
		//-----------------------------------------------------------
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(btn4, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(btn5, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel.add(btn6, gbc);
		
	
		gbc.gridx = 3;
		gbc.gridy = 2;
		panel.add(btnMult, gbc);
		
		//-----------------------------------------------------------
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(btn1, gbc);
				
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(btn2, gbc);
				
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel.add(btn3, gbc);
				

		gbc.gridx = 3;
		gbc.gridy = 3;
		panel.add(btnMinus, gbc);
		
		//-----------------------------------------------------------
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(btn0, gbc);
						
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(btnDot, gbc);
						
		gbc.gridx = 2;
		gbc.gridy = 4;
		panel.add(btnEquals, gbc);
						

		gbc.gridx = 3;
		gbc.gridy = 4;
		panel.add(btnPlus, gbc);
		
		
		guiFrame.add(panel);
		
		// Adding action listeners
		
		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "0");
			}
			
		});
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "1");
			}
			
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "2");
			}
			
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "3");
			}
			
		});
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "4");
			}
			
		});
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "5");
			}
			
		});
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "6");
			}
			
		});
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "7");
			}
			
		});
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "8");
			}
			
		});
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText() + "9");
			}
			
		});
		btnPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(String s : operators) {
					if(lblResult.getText().indexOf(s) != -1) {
						return;
					}			
				}
				lblResult.setText(lblResult.getText() + "+");
				
			}
			
		});
		btnMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(String s : operators) {
					if(lblResult.getText().indexOf(s) != -1) {
						return;
					}
				}
				lblResult.setText(lblResult.getText() + "-");
			}
			
		});
		btnDiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(String s : operators) {
					if(lblResult.getText().indexOf(s) != -1) {
						return;
					}
				}
				lblResult.setText(lblResult.getText() + "/");
			}
			
		});
		btnMult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(String s : operators) {
					if(lblResult.getText().indexOf(s) != -1) {
						return;
					}
				}
				
				lblResult.setText(lblResult.getText() + "*");
			}
			
		});
		btnDot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(lblResult.getText().indexOf(",") == -1) {
					lblResult.setText(lblResult.getText() + ",");
				}				
			}
			
		});
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText("0");
			}
			
		});
		btnEquals.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
								
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		new Laskin();
		/*Scanner input = new Scanner(System.in);
		System.out.println("Laskin");
		System.out.println("----------------");
		
		while(true) {
			System.out.println("Ensimmäinen numero: ");
			double num1 = input.nextDouble();
			System.out.println("Toinen numero: ");
			double num2 = input.nextDouble();
			System.out.println("Laskutoimitus (+, -, *, /): ");
			String operation = input.next();
			switch(operation) {
				case "+":
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					break;
				case "-":
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					break;
				case "*":
					System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
					break;
				case "/":
					try {
						System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					}
					catch(Exception e) {
						System.out.println("Ei mahdollinen laskutoimitus (" + num1 + operation + num2 + ")");
					}
			}
			System.out.println("-------------------");
		}*/
		
	}

}
