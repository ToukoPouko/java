package main;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Laskin extends JFrame{
	
	public static char currentOperator = ' ';
	public static double num1, num2;
	public int count = 0;
	
	// TODO: Lisää potenssi ja neliöjuuri
	// Lopputuloksen pyöristys
	
	public Laskin() {
		JFrame guiFrame = new JFrame();
		GridBagLayout layout = new GridBagLayout();
		JPanel panel = new JPanel(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		//double num1, num2;
		String[] operators = new String[4];
		operators[0] = "+";
		operators[1] = "-";
		operators[2] = "/";
		operators[3] = "*";
		operators[4] = "^";
		Dimension dim = new Dimension(75, 20);
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Laskin");
		guiFrame.setSize(300, 300);
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
		JButton btnDot = new JButton(".");
		JButton btnClear = new JButton("AC");
		JButton btnPlus = new JButton("+");
		JButton btnMinus = new JButton("-");
		JButton btnDiv = new JButton("/");
		JButton btnMult = new JButton("*");
		JButton btnBack = new JButton("C");
		JButton btnPot = new JButton("x^2");
		JButton btnSqrt = new JButton("sqrt");
		JButton btnEmpty0 = new JButton(" ");
		JButton btnEmpty1 = new JButton(" ");
		
		lblResult.setPreferredSize(dim);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 3;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(lblResult, gbc);
		
		gbc.gridwidth = 1;
		gbc.gridx = 3;
		gbc.gridy = 0;
		panel.add(btnClear, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 0;
		panel.add(btnBack, gbc);
		
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
		
		gbc.gridx = 4;
		gbc.gridy = 1;
		panel.add(btnPot, gbc);
		
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
		
		gbc.gridx = 4;
		gbc.gridy = 2;
		panel.add(btnSqrt, gbc);
		
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
		
		gbc.gridx = 4;
		gbc.gridy = 3;
		panel.add(btnEmpty0, gbc);
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
		
		gbc.gridx = 4;
		gbc.gridy = 4;
		panel.add(btnEmpty1, gbc);
		
		guiFrame.add(panel);
		
		
		// Adding action listeners
		
		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(lblResult.getText().substring(0, 1) == "0." ) {
					lblResult.setText(lblResult.getText() + "0");
				}
				else if(lblResult.getText().substring(0, 1) != "0") {
					lblResult.setText(lblResult.getText() + "0");
					
				}
				
				
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
				currentOperator = '+';
				count = 0;
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
				currentOperator = '-';
				count = 0;
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
				currentOperator = '/';
				count = 0;
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
				currentOperator = '*';
				count = 0;
			}
			
		});		
		btnPot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(String s : operators) {
					if(lblResult.getText().indexOf(s) != -1) {
						return;
					}
				}
				
				lblResult.setText(lblResult.getText() + "^");
				currentOperator = '^';
				count = 0;
			}
			
		});
		
		btnDot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(lblResult.getText().indexOf(".") == -1 || currentOperator != ' ') {
					if(count < 1) {
						lblResult.setText(lblResult.getText() + ".");
						count += 1;
					}		
				}				
			}
			
		});
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText("0");
				currentOperator = ' ';
				count = 0;
			}
			
		});
		btnEquals.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = lblResult.getText().indexOf(currentOperator);
				num1 = Double.parseDouble(lblResult.getText().substring(0, i));
				num2 = Double.parseDouble(lblResult.getText().substring(i + 1, lblResult.getText().length()));
				switch(currentOperator) {
					case '+':
						lblResult.setText(Double.toString(num1 + num2));
						break;
					case '-':
						lblResult.setText(Double.toString(num1 - num2));
						break;
					case '/':
						lblResult.setText(Double.toString(num1 / num2));
						break;
					case '*':
						lblResult.setText(Double.toString(num1 * num2));
						break;
				}
				i = 0;
				num1 = 0;
				num2 = 0;
				currentOperator = ' ';
				count = 0;
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		new Laskin();
		
	}
	
}
