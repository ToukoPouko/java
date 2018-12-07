package main;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Laskin extends JFrame{
	
	public Laskin() {
		JFrame guiFrame = new JFrame();
		GridBagLayout layout = new GridBagLayout();
		JPanel panel = new JPanel(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Laskin");
		guiFrame.setSize(200, 200);
		guiFrame.setLayout(layout);
		guiFrame.setVisible(true);
		guiFrame.setResizable(false);
		
		JLabel lblResult = new JLabel("test");
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
		//guiFrame.getContentPane().setLayout(layout);
		
		/*guiFrame.add(lblResult);
		guiFrame.add(btnClear);
		guiFrame.add(btnPlus);
		guiFrame.add(btnEmpty);
		guiFrame.add(btn7);
		guiFrame.add(btn8);
		guiFrame.add(btn9);
		guiFrame.add(btnMinus);
		guiFrame.add(btn4);
		guiFrame.add(btn5);
		guiFrame.add(btn6);
		guiFrame.add(btn1);
		guiFrame.add(btn2);
		guiFrame.add(btn3);
		guiFrame.add(btn0);
		guiFrame.add(btnDot);
		guiFrame.add(btnEquals);*/
		
		/*layout.addLayoutComponent("0", btn0);
		layout.addLayoutComponent("1", btn1);
		layout.addLayoutComponent("2", btn2);
		layout.addLayoutComponent("3", btn3);
		layout.addLayoutComponent("4", btn4);
		layout.addLayoutComponent("5", btn5);
		layout.addLayoutComponent("6", btn6);
		layout.addLayoutComponent("7", btn7);
		layout.addLayoutComponent("8", btn8);
		layout.addLayoutComponent("9", btn9);*/
		
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
