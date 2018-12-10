package main;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Laskin extends JFrame implements KeyListener{
	
	public static String currentOperator = " ";
	public static double num1, num2;
	public int count = 0;
	
	// TODO: Lopputuloksen pyöristys
	// opButtonien btnEquals.doClick() parantelua
	// Erroreiden käsittely
	
	JLabel lblResult = new JLabel("");
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
	JButton btnPot = new JButton("^");
	JButton btnSqrt = new JButton("s");
	JButton btnEmpty0 = new JButton(" ");
	JButton btnEmpty1 = new JButton(" ");
	
	public Laskin() {
		JFrame guiFrame = new JFrame();
		GridBagLayout layout = new GridBagLayout();
		JPanel panel = new JPanel(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		//double num1, num2;
		String[] operators = new String[6];
		operators[0] = "+";
		operators[1] = "-";
		operators[2] = "/";
		operators[3] = "*";
		operators[4] = "^";
		operators[5] = "s";
		Dimension dim = new Dimension(75, 20);
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		ArrayList<JButton> numButtons = new ArrayList<JButton>();
		ArrayList<JButton> opButtons = new ArrayList<JButton>();
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Laskin");
		guiFrame.setSize(300, 300);
		guiFrame.setLayout(layout);
		guiFrame.setVisible(true);
		guiFrame.setResizable(false);
		guiFrame.addKeyListener(this);
		guiFrame.setFocusable(true);
		guiFrame.setFocusTraversalKeysEnabled(false);
		
		
		numButtons.add(btn1);
		numButtons.add(btn2);
		numButtons.add(btn3);
		numButtons.add(btn4);
		numButtons.add(btn5);
		numButtons.add(btn6);
		numButtons.add(btn7);
		numButtons.add(btn8);
		numButtons.add(btn9);
		opButtons.add(btnPlus);
		opButtons.add(btnMinus);
		opButtons.add(btnMult);
		opButtons.add(btnDiv);
		opButtons.add(btnPot);
		opButtons.add(btnSqrt);
		
		for(JButton btn : numButtons) {
			buttons.add(btn);
		}
		for(JButton btn : opButtons) {
			buttons.add(btn);
		}
		buttons.add(btnBack);
		buttons.add(btnClear);
		buttons.add(btnDot);
		buttons.add(btnEmpty0);
		buttons.add(btnEmpty1);
		buttons.add(btn0);
		buttons.add(btnEquals);
		
		for(JButton btn : buttons) {
			btn.setFocusable(false);
		}
		
		
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
				
				if(lblResult.getText().length() == 0) {
					lblResult.setText("0");
				}
				else if(lblResult.getText().substring(0, 1) == "0." ) {
					lblResult.setText(lblResult.getText() + "0");
				}
				else if(lblResult.getText().substring(0, 1) != "0") {
					lblResult.setText(lblResult.getText() + "0");
					
				}
				
				
			}
			
		});
		// Add actions for numeric buttons
		for(JButton btn : numButtons) {
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					lblResult.setText(lblResult.getText() + (numButtons.indexOf(btn)+1));
				}
				
			});
		}
		// Add actions for operator buttons
		for(JButton btn: opButtons) {
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					for(String s : operators) {
						if(lblResult.getText().indexOf(s) != -1) {
							if(lblResult.getText().substring(lblResult.getText().indexOf(s) + 1) != "") {
								btnEquals.doClick();
							}
							return;
						}			
					}
					lblResult.setText(lblResult.getText() + btn.getText());
					currentOperator = btn.getText();
					count = 0;
				}
			});
		}
		
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(String s : operators) {
					if(lblResult.getText().indexOf(s) != -1) {
						return;
					}			
				}
				lblResult.setText("sqrt(" + lblResult.getText() + ")");
				currentOperator = "s";
				count = 0;
			}
		});
		
		btnDot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(lblResult.getText().indexOf(".") == -1 || currentOperator != " ") {
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
				lblResult.setText("");
				currentOperator = " ";
				count = 0;
			}
			
		});
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblResult.setText(lblResult.getText().substring(0, lblResult.getText().length() - 1));
			}
			
		});
		
		
		btnEquals.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = lblResult.getText().indexOf(currentOperator);
				if(currentOperator != "s") {
					num1 = Double.parseDouble(lblResult.getText().substring(0, i));
					num2 = Double.parseDouble(lblResult.getText().substring(i + 1, lblResult.getText().length()));
				}
				
				switch(currentOperator) {
					case "+":
						lblResult.setText(Double.toString(num1 + num2));
						break;
					case "-":
						lblResult.setText(Double.toString(num1 - num2));
						break;
					case "/":
						lblResult.setText(Double.toString(num1 / num2));
						break;
					case "*":
						lblResult.setText(Double.toString(num1 * num2));
						break;
					case "^":
						lblResult.setText(Double.toString(Math.pow(num1, num2)));
						break;
					case "s":
						int j = lblResult.getText().indexOf("(");
						int a = lblResult.getText().indexOf(")");
						num1 = Double.parseDouble(lblResult.getText().substring(j + 1, a));
						lblResult.setText(Double.toString(Math.sqrt(num1)));
						break;
				}
				i = 0;
				num1 = 0;
				num2 = 0;
				currentOperator = " ";
				count = 0;
			}
			
		});
		
	}
	
	public void keyTyped(KeyEvent e) {
		return;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		//System.out.println(key);
		switch(key) {
			case 8:
				btnBack.doClick();
				break;
			case 127:
				btnClear.doClick();
				break;
			case 10:
				btnEquals.doClick();
				break;
			case 107:
				btnPlus.doClick();
				break;
			case 111:
				btnDiv.doClick();
				break;
			case 106:
				btnMult.doClick();
				break;
			case 109:
				btnMinus.doClick();
				break;
			case 110:
				btnDot.doClick();
				break;
			case 96:
				btn0.doClick();
				break;
			case 97:
				btn1.doClick();
				break;
			case 98:
				btn2.doClick();
				break;
			case 99:
				btn3.doClick();
				break;
			case 100:
				btn4.doClick();
				break;
			case 101:
				btn5.doClick();
				break;
			case 102:
				btn6.doClick();
				break;
			case 103:
				btn7.doClick();
				break;
			case 104:
				btn8.doClick();
				break;
			case 105:
				btn9.doClick();
				break;
				
			
		}
	}
	
	public void keyReleased(KeyEvent e) {
		return;
	}
	
	public static void main(String[] args) {
		new Laskin();
		
	}
	
}
