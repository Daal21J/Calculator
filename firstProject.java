package FirstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class firstProject {

	private JFrame frame;
	private JTextField textField;
	private JTextField prvText;
	String previous="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstProject window = new firstProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public firstProject() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 832, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textField = new JTextField("");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Yu Gothic", Font.PLAIN, 40));
		textField.setBackground(Color.WHITE);
		textField.setBounds(61, 57, 680, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//numbers here:
        JButton btn9 = new JButton("9");
		
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn9.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn9.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn9.setBounds(456, 233, 85, 65);
		frame.getContentPane().add(btn9);
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn8.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn8.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn8.setBounds(356, 233, 85, 65);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn7.getText();
			    textField.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn7.setBounds(256, 233, 85, 65);
		frame.getContentPane().add(btn7);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn5.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn5.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn5.setBounds(356, 325, 85, 65);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn4.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn4.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn4.setBounds(256, 325, 85, 65);
		frame.getContentPane().add(btn4);
		

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn6.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn6.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn6.setBounds(456, 325, 85, 65);
		frame.getContentPane().add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn2.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn2.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn2.setBounds(356, 413, 85, 65);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn1.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn1.setBounds(256, 413, 85, 65);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn0.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn0.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn0.setBounds(256, 504, 85, 65);
		frame.getContentPane().add(btn0);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String EnterValue=textField.getText()+btn3.getText();
			    textField.setText(EnterValue);	
			}
		});
		btn3.setFont(new Font("Cambria", Font.PLAIN, 35));
		btn3.setBounds(456, 413, 85, 65);
		frame.getContentPane().add(btn3);
		
		//operators here
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Op="-";
				if(!textField.getText().isEmpty()&& prvText.getText().isEmpty()) {
					prvText.setText(textField.getText()+Op);
					textField.setText("");
					previous="-";
				}
				if(!textField.getText().isEmpty() && !prvText.getText().isEmpty()){
					String expr=null;
					StringBuilder sB=new StringBuilder(prvText.getText());
					sB.deleteCharAt(prvText.getText().length()-1);
					expr=sB.toString();
					Double result=null;
					if(previous=="+") {
						 result=Double.parseDouble(expr)+Double.parseDouble(textField.getText());
					}
					if(previous=="-") {
						 result=Double.parseDouble(expr)-Double.parseDouble(textField.getText());		
						 }
					if(previous=="×") {
						 result=Double.parseDouble(expr)*Double.parseDouble(textField.getText());
					}
					if(previous=="/") {
						 result=Double.parseDouble(expr)/Double.parseDouble(textField.getText());
					}
					if(previous=="%") {
						 result=Double.parseDouble(expr)%Double.parseDouble(textField.getText());
					}
				
					previous="-";
					prvText.setText(result+Op);
					textField.setText("");	
				
				}
			}
		});
		btnMinus.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnMinus.setBounds(656, 233, 85, 65);
		frame.getContentPane().add(btnMinus);
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Op="+";
				if(textField.getText()!=""&& prvText.getText().isEmpty()) {
					prvText.setText(textField.getText()+Op);
					textField.setText("");
					previous="+";
				}
				if(!textField.getText().isEmpty() && !prvText.getText().isEmpty()){
					String expr=null;
					StringBuilder sB=new StringBuilder(prvText.getText());
					sB.deleteCharAt(prvText.getText().length()-1);
					expr=sB.toString();
					Double result=null;
					if(previous=="+") {
						 result=Double.parseDouble(expr)+Double.parseDouble(textField.getText());
					}
					if(previous=="-") {
						 result=Double.parseDouble(expr)-Double.parseDouble(textField.getText());
					}
					if(previous=="×") {
						 result=Double.parseDouble(expr)*Double.parseDouble(textField.getText());
					}
					if(previous=="/") {
						 result=Double.parseDouble(expr)/Double.parseDouble(textField.getText());
					}
					if(previous=="%") {
						 result=Double.parseDouble(expr)%Double.parseDouble(textField.getText());
					}
					previous="+";
					prvText.setText(result+Op);
					textField.setText("");	
				
				}
			}
		});
		btnPlus.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnPlus.setBounds(656, 325, 85, 65);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMultip = new JButton("×");
		btnMultip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Op="×";
				if(!textField.getText().isEmpty()&& prvText.getText().isEmpty()) {
					prvText.setText(textField.getText()+Op);
					textField.setText("");
					previous="×";
				}
				if(!textField.getText().isEmpty() && !prvText.getText().isEmpty()){
					String expr=null;
					StringBuilder sB=new StringBuilder(prvText.getText());
					sB.deleteCharAt(prvText.getText().length()-1);
					expr=sB.toString();
					Double result=null;
					if(previous=="+") {
						 result=Double.parseDouble(expr)+Double.parseDouble(textField.getText());
					}
					if(previous=="-") {
						 result=Double.parseDouble(expr)-Double.parseDouble(textField.getText());
					}
					if(previous=="×") {
						 result=Double.parseDouble(expr)*Double.parseDouble(textField.getText());
					}
					if(previous=="/") {
						 result=Double.parseDouble(expr)/Double.parseDouble(textField.getText());
					}
					if(previous=="%") {
						 result=Double.parseDouble(expr)%Double.parseDouble(textField.getText());
					}
					previous="×";
					prvText.setText(result+Op);
					textField.setText("");	
				
				}
			}
		});
		btnMultip.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnMultip.setBounds(556, 233, 85, 65);
		frame.getContentPane().add(btnMultip);
		
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Op="/";
				if(!textField.getText().isEmpty()&& prvText.getText().isEmpty()) {
					prvText.setText(textField.getText()+Op);
					textField.setText("");
					previous="/";
				}
				if(!textField.getText().isEmpty() && !prvText.getText().isEmpty()){
					String expr=null;
					StringBuilder sB=new StringBuilder(prvText.getText());
					sB.deleteCharAt(prvText.getText().length()-1);
					expr=sB.toString();
					Double result=null;
					if(previous=="+") {
						 result=Double.parseDouble(expr)+Double.parseDouble(textField.getText());
					}
					if(previous=="-") {
						 result=Double.parseDouble(expr)-Double.parseDouble(textField.getText());
					}
					if(previous=="×") {
						 result=Double.parseDouble(expr)*Double.parseDouble(textField.getText());
					}
					if(previous=="/") {
						 result=Double.parseDouble(expr)/Double.parseDouble(textField.getText());
					}
					if(previous=="%") {
						 result=Double.parseDouble(expr)%Double.parseDouble(textField.getText());
					}
					previous="/";
					prvText.setText(result+Op);
					textField.setText("");	
				
				}
			}
		});
		btnDiv.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnDiv.setBounds(556, 325, 85, 65);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Op="%";
				if(!textField.getText().isEmpty()&& prvText.getText().isEmpty()) {
					prvText.setText(textField.getText()+Op);
					textField.setText("");
					previous="%";
				}
				if(!textField.getText().isEmpty() && !prvText.getText().isEmpty()){
					String expr=null;
					StringBuilder sB=new StringBuilder(prvText.getText());
					sB.deleteCharAt(prvText.getText().length()-1);
					expr=sB.toString();
					Double result=null;
					if(previous=="+") {
						 result=Double.parseDouble(expr)+Double.parseDouble(textField.getText());
					}
					if(previous=="-") {
						 result=Double.parseDouble(expr)-Double.parseDouble(textField.getText());
	
					}
					if(previous=="×") {
						 result=Double.parseDouble(expr)*Double.parseDouble(textField.getText());
					}
					if(previous=="/") {
						 result=Double.parseDouble(expr)/Double.parseDouble(textField.getText());
					}
					if(previous=="%") {
						 result=Double.parseDouble(expr)%Double.parseDouble(textField.getText());
					}
					previous="%";
					prvText.setText(result+Op);
					textField.setText("");	
				
				}
			}
		});
		btnMod.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnMod.setBounds(556, 413, 85, 65);
		frame.getContentPane().add(btnMod);
	
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()&&!prvText.getText().isEmpty()) {
					String expr=null;
					StringBuilder sB=new StringBuilder(prvText.getText());
					sB.deleteCharAt(prvText.getText().length()-1);
					expr=sB.toString();
					Double result=null;
					if(previous=="+") {
						 result=Double.parseDouble(expr)+Double.parseDouble(textField.getText());
					}
					if(previous=="-") {
						 result=Double.parseDouble(expr)-Double.parseDouble(textField.getText());
					}
					if(previous=="×") {
						 result=Double.parseDouble(expr)*Double.parseDouble(textField.getText());
					}
					if(previous=="/") {
						 result=Double.parseDouble(expr)/Double.parseDouble(textField.getText());
					}
					if(previous=="%") {
						 result=Double.parseDouble(expr)%Double.parseDouble(textField.getText());
					}
					prvText.setText("");
					textField.setText(""+result);
					
				}
				
			}
		});
		btnEqual.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnEqual.setForeground(new Color(0, 0, 0));
		btnEqual.setBackground(new Color(255, 240, 245));
		btnEqual.setBounds(456, 504, 285, 65);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlusMinus = new JButton("±");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()&&!(textField.getText().contains("-"))) {
					textField.setText("-");
				}else if(!textField.getText().isEmpty()) {
					String text=null;
					StringBuilder sB=new StringBuilder(textField.getText());
					if(textField.getText().contains("-")) {
						sB.deleteCharAt(0);
					    text=sB.toString();
					    textField.setText(text);
					}else {
						 text="-"+sB.toString();
						 textField.setText(text);
						}
					};
				}
	
			});
		btnPlusMinus.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnPlusMinus.setBounds(356, 504, 85, 65);
		frame.getContentPane().add(btnPlusMinus);
		
		//trigonometrie
		
		JButton btnTanx = new JButton("tan");
		btnTanx.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnTanx.setBounds(61, 325, 85, 65);
		frame.getContentPane().add(btnTanx);
		
		
		
		JButton btnSinx = new JButton("sin");
		btnSinx.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnSinx.setBounds(61, 140, 85, 65);
		frame.getContentPane().add(btnSinx);
		
		JButton btnCosx = new JButton("cos");
		btnCosx.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnCosx.setBounds(61, 233, 85, 65);
		frame.getContentPane().add(btnCosx);
		
		//math miscellaneous
		
		JButton btnLog = new JButton("log");
		btnLog.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnLog.setBounds(156, 140, 85, 65);
		frame.getContentPane().add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnLn.setBounds(156, 233, 85, 65);
		frame.getContentPane().add(btnLn);
	
		
		JButton btnFact = new JButton("n!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText().contains("!"))) {
				String EnterValue=textField.getText()+"!";
			    textField.setText(EnterValue);
				}}
		}
		);
		
		JButton btnPow = new JButton("xⁿ");
		btnPow.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnPow.setBounds(156, 413, 85, 65);
		frame.getContentPane().add(btnPow);
		
		btnFact.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnFact.setBounds(256, 140, 85, 65);
		frame.getContentPane().add(btnFact);

		JButton btnRoot = new JButton("√");
		btnRoot.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnRoot.setBounds(156, 325, 85, 65);
		frame.getContentPane().add(btnRoot);
		
		
		
		JButton btnPi = new JButton("π");
		btnPi.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnPi.setBounds(156, 504, 85, 65);
		frame.getContentPane().add(btnPi);
		

		
		//composition
		
		JButton btnOpPar = new JButton("(");
		btnOpPar.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnOpPar.setBounds(356, 140, 85, 65);
		frame.getContentPane().add(btnOpPar);
		

		
		JButton btnCloPar = new JButton(")");
		btnCloPar.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnCloPar.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnCloPar.setBounds(456, 140, 85, 65);
		frame.getContentPane().add(btnCloPar);
	
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0) {
					String newText=null;
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					newText=strB.toString();
					textField.setText(newText);
					
				}
			}
		});
		btnDel.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnDel.setBounds(556, 140, 85, 65);
		frame.getContentPane().add(btnDel);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				prvText.setText(null);
			}
		});
		btnAc.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnAc.setBounds(656, 140, 85, 65);
		frame.getContentPane().add(btnAc);	
		
		
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText().contains("."))) {
				String EnterValue=textField.getText()+btnDot.getText();
			    textField.setText(EnterValue);
				
			}
			}
		});
		btnDot.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnDot.setBounds(656, 413, 85, 65);
		frame.getContentPane().add(btnDot);
		
		JButton btnExp = new JButton("exp");
		btnExp.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnExp.setBounds(61, 413, 85, 65);
		frame.getContentPane().add(btnExp);
		
		JButton btnAbs = new JButton("abs");
		btnAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAbs.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnAbs.setBounds(61, 504, 85, 65);
		frame.getContentPane().add(btnAbs);
		
		prvText = new JTextField("");
		prvText.setHorizontalAlignment(SwingConstants.RIGHT);
		prvText.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		prvText.setBounds(61, 10, 680, 49);
		frame.getContentPane().add(prvText);
		prvText.setColumns(10);
		

		
	

	}
}
