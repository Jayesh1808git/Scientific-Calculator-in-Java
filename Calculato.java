import java.awt.Component;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
import java.awt.Color;
public class Calculato {

	private JFrame frame;
	private JTextField textField;
	double first,second,result;
	String operation,answer;
	double a;
	boolean on = false;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculato window = new Calculato();
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
	public Calculato() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Scientific Calcualtor Project");
		frame.getContentPane().setBackground(Color.black);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 478, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("           Scientific Calculator");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Stylus BT", Font.BOLD, 27));
		lblNewLabel.setBounds(10, 10, 466, 49);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(20, 69, 413, 72);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBackground(new Color(27,27,27));
		textField.setBorder(null);
		textField.setEditable(false);
		
		
		
		JButton Btnsin = new JButton("sin");
		Btnsin.setEnabled(false);
		
		
		Btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.sin(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
			
		});
		Btnsin.setBackground(Color.orange);
		Btnsin.setBorder(null);
		Btnsin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Btnsin.setBounds(24, 173, 64, 49);
		Btnsin.setFocusable(false);
		frame.getContentPane().add(Btnsin);
		
		JButton Btnsin_h = new JButton("sinh");
		Btnsin_h.setEnabled(false);
		Btnsin_h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.sinh(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnsin_h.setBackground(Color.orange);
		Btnsin_h.setBorder(null);
		Btnsin_h.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Btnsin_h.setBounds(24, 242, 64, 49);
		Btnsin_h.setFocusable(false);
		frame.getContentPane().add(Btnsin_h);
		
		JButton Btnfact = new JButton("n!");
		Btnfact.setEnabled(false);
		Btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a=Double.parseDouble(textField.getText());
					double fact=1;
					while(a !=0) {
						fact=fact*a;
						a--;
					}
					textField.setText(String.valueOf(fact));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnfact.setFocusable(false);
		Btnfact.setBackground(Color.orange);
		Btnfact.setBorder(null);
		Btnfact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnfact.setBounds(24, 310, 64, 49);
		frame.getContentPane().add(Btnfact);
		
		JButton Btn_7 = new JButton("7");
		Btn_7.setEnabled(false);
		Btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_7.getText();
				textField.setText(Number);
			}
		});
		Btn_7.setFocusable(false);
		Btn_7.setBackground(Color.orange);
		Btn_7.setBorder(null);
		Btn_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_7.setBounds(24, 380, 64, 49);
		frame.getContentPane().add(Btn_7);
		JButton Btn_4 = new JButton("4");
		Btn_4.setEnabled(false);
		Btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_4.getText();
				textField.setText(Number);
			}
		});
		Btn_4.setFocusable(false);
		Btn_4.setBackground(Color.orange);
		Btn_4.setBorder(null);
		Btn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_4.setBounds(24, 444, 64, 49);
		frame.getContentPane().add(Btn_4);
		
		JButton Btn_1 = new JButton("1");
		Btn_1.setEnabled(false);
		Btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_1.getText();
				textField.setText(Number);
			}
		});
		Btn_1.setFocusable(false);
		Btn_1.setBackground(Color.orange);
		Btn_1.setBorder(null);
		Btn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_1.setBounds(24, 514, 64, 49);
		frame.getContentPane().add(Btn_1);
		
		JButton Btn_0 = new JButton("0");
		Btn_0.setEnabled(false);
		Btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_0.getText();
				textField.setText(Number);
			}
		});
		Btn_0.setFocusable(false);
		Btn_0.setBackground(Color.orange);
		Btn_0.setBorder(null);
		Btn_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_0.setBounds(24, 581, 148, 49);
		frame.getContentPane().add(Btn_0);
		
		JButton Btncos = new JButton("cos");
		Btncos.setEnabled(false);
		Btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.cos(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btncos.setFocusable(false);
		Btncos.setBackground(Color.orange);
		Btncos.setBorder(null);
		Btncos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Btncos.setBounds(108, 173, 64, 49);
		frame.getContentPane().add(Btncos);
		
		JButton Btncos_h = new JButton("cosh");
		Btncos_h.setEnabled(false);
		Btncos_h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.cosh(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btncos_h.setFocusable(false);
		Btncos_h.setBackground(Color.orange);
		Btncos_h.setBorder(null);
		Btncos_h.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Btncos_h.setBounds(108, 242, 64, 49);
		frame.getContentPane().add(Btncos_h);
		
		JButton Btnraise2 = new JButton("x^2");
		Btnraise2.setEnabled(false);
		Btnraise2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Double.parseDouble(textField.getText());
					a=a*a;
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnraise2.setFocusable(false);
		Btnraise2.setBackground(Color.orange);
		Btnraise2.setBorder(null);
		Btnraise2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Btnraise2.setBounds(108, 310, 64, 49);
		frame.getContentPane().add(Btnraise2);
		
		JButton Btn_8 = new JButton("8");
		Btn_8.setEnabled(false);
		Btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_8.getText();
				textField.setText(Number);
			}
		});
		Btn_8.setFocusable(false);
		Btn_8.setBackground(Color.orange);
		Btn_8.setBorder(null);
		Btn_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_8.setBounds(108, 380, 64, 49);
		frame.getContentPane().add(Btn_8);
		
		JButton Btn_5 = new JButton("5");
		Btn_5.setEnabled(false);
		Btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_5.getText();
				textField.setText(Number);
			}
		});
		Btn_5.setFocusable(false);
		Btn_5.setBackground(Color.orange);
		Btn_5.setBorder(null);
		Btn_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_5.setBounds(108, 444, 64, 49);
		frame.getContentPane().add(Btn_5);
		
		JButton Btn_2 = new JButton("2");
		Btn_2.setEnabled(false);
		Btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_2.getText();
				textField.setText(Number);
			}
		});
		Btn_2.setFocusable(false);
		Btn_2.setBackground(Color.orange);
		Btn_2.setBorder(null);
		Btn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_2.setBounds(108, 514, 64, 49);
		frame.getContentPane().add(Btn_2);
		
		JButton Btntan = new JButton("tan");
		Btntan.setEnabled(false);
		Btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.tan(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btntan.setFocusable(false);
		Btntan.setBackground(Color.orange);
		Btntan.setBorder(null);
		Btntan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Btntan.setBounds(192, 173, 64, 49);
		frame.getContentPane().add(Btntan);
		
		JButton Btntan_h = new JButton("tanh");
		Btntan_h.setEnabled(false);
		Btntan_h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.tanh(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btntan_h.setFocusable(false);
		Btntan_h.setBackground(Color.orange);
		Btntan_h.setBorder(null);
		Btntan_h.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Btntan_h.setBounds(192, 242, 64, 49);
		frame.getContentPane().add(Btntan_h);
		
		JButton Btnraise3 = new JButton("x^3");
		Btnraise3.setEnabled(false);
		Btnraise3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Double.parseDouble(textField.getText());
					a=a*a*a;
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnraise3.setFocusable(false);
		Btnraise3.setBackground(Color.orange);
		Btnraise3.setBorder(null);
		Btnraise3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Btnraise3.setBounds(192, 310, 64, 49);
		frame.getContentPane().add(Btnraise3);
		
		JButton Btn_9 = new JButton("9");
		Btn_9.setEnabled(false);
		Btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_9.getText();
				textField.setText(Number);
			}
		});
		Btn_9.setFocusable(false);
		Btn_9.setBackground(Color.orange);
		Btn_9.setBorder(null);
		Btn_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_9.setBounds(192, 380, 64, 49);
		frame.getContentPane().add(Btn_9);
		
		JButton Btn_6 = new JButton("6");
		Btn_6.setEnabled(false);
		Btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_6.getText();
				textField.setText(Number);
			}
		});
		Btn_6.setFocusable(false);
		Btn_6.setBackground(Color.orange);
		Btn_6.setBorder(null);
		Btn_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_6.setBounds(192, 444, 64, 49);
		frame.getContentPane().add(Btn_6);
		
		JButton Btn_3 = new JButton("3");
		Btn_3.setEnabled(false);
		Btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+Btn_3.getText();
				textField.setText(Number);
			}
		});
		Btn_3.setFocusable(false);
		Btn_3.setBackground(Color.orange);
		Btn_3.setBorder(null);
		Btn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn_3.setBounds(192, 514, 64, 49);
		frame.getContentPane().add(Btn_3);
	
		JButton Btndot = new JButton(".");
		Btndot.setEnabled(false);
		Btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					String Number=textField.getText()+Btndot.getText();
					textField.setText(Number);
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
				
				
			}
		});
		Btndot.setFocusable(false);
		Btndot.setBackground(Color.orange);
		Btndot.setBorder(null);
		Btndot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btndot.setBounds(192, 581, 64, 49);
		frame.getContentPane().add(Btndot);
		
		JButton Btnroot = new JButton("√");
		Btnroot.setEnabled(false);
		Btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.sqrt(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnroot.setFocusable(false);
		Btnroot.setBackground(Color.orange);
		Btnroot.setBorder(null);
		Btnroot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnroot.setBounds(276, 173, 64, 49);
		frame.getContentPane().add(Btnroot);
		
		JButton Btnlog = new JButton("log");
		Btnlog.setEnabled(false);
		Btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.log(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
			
			
	    });
		Btnlog.setFocusable(false);
		Btnlog.setBackground(Color.orange);
		Btnlog.setBorder(null);
		Btnlog.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnlog.setBounds(276, 242, 64, 49);
		frame.getContentPane().add(Btnlog);
		
		JButton Btnraise_y = new JButton("x^y");
		Btnraise_y.setEnabled(false);
		Btnraise_y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="X^Y";
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnraise_y.setFocusable(false);
		Btnraise_y.setBackground(Color.orange);
		Btnraise_y.setBorder(null);
		Btnraise_y.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Btnraise_y.setBounds(276, 310, 64, 49);
		frame.getContentPane().add(Btnraise_y);
		
		JButton Btndel = new JButton("DEL");
		Btndel.setEnabled(false);
		Btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Del=null;
				if(textField.getText().length()>0) {
					StringBuilder st= new StringBuilder(textField.getText());
					st.deleteCharAt(textField.getText().length()-1);
					Del=st.toString();
					textField.setText(Del);
				}
				 
			}
		});
		Btndel.setFocusable(false);
		Btndel.setBackground(new Color(128,0,32));
		Btndel.setBorder(null);
		Btndel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Btndel.setBounds(276, 380, 64, 49);
		frame.getContentPane().add(Btndel);
		
		JButton Btndiv = new JButton("÷");
		Btndiv.setEnabled(false);
		Btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="/";
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
				
			}
		});
		Btndiv.setFocusable(false);
		Btndiv.setBackground(Color.orange);
		Btndiv.setBorder(null);
		Btndiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btndiv.setBounds(276, 444, 64, 49);
		frame.getContentPane().add(Btndiv);
		
		JButton Btnsub = new JButton("-");
		Btnsub.setEnabled(false);
		Btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="-";
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
				
			}
		});
		Btnsub.setFocusable(false);
		Btnsub.setBackground(Color.orange);
		Btnsub.setBorder(null);
		Btnsub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnsub.setBounds(276, 514, 64, 49);
		frame.getContentPane().add(Btnsub);
		
		JButton Btnmod = new JButton("%");
		Btnmod.setEnabled(false);
		Btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="%";
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnmod.setFocusable(false);
		Btnmod.setBackground(Color.orange);
		Btnmod.setBorder(null);
		Btnmod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnmod.setBounds(276, 581, 64, 49);
		frame.getContentPane().add(Btnmod);
		
		 JButton Btnex = new JButton("e^x");
		 Btnex.setEnabled(false);
		Btnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= Math.exp(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnex.setFocusable(false);
		Btnex.setBackground(Color.orange);
		Btnex.setBorder(null);
		Btnex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Btnex.setBounds(369, 242, 64, 49);
		frame.getContentPane().add(Btnex);
		
		JButton Btnbyx = new JButton("1/x");
		Btnbyx.setEnabled(false);
		Btnbyx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					double a= 1/(Double.parseDouble(textField.getText()));
					textField.setText(String.valueOf(a));
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnbyx.setFocusable(false);
		Btnbyx.setBackground(Color.orange);
		Btnbyx.setBorder(null);
		Btnbyx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnbyx.setBounds(369, 310, 64, 49);
		frame.getContentPane().add(Btnbyx);
		
		JButton Btnclear = new JButton("AC");
		Btnclear.setEnabled(false);
		Btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		Btnclear.setFocusable(false);
		Btnclear.setBackground(new Color(128,0,32));
		Btnclear.setBorder(null);
		Btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btnclear.setBounds(369, 380, 64, 49);
		frame.getContentPane().add(Btnclear);
		
		JButton Btnmul = new JButton("*");
		Btnmul.setEnabled(false);
		Btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		Btnmul.setFocusable(false);
		Btnmul.setBackground(Color.orange);
		Btnmul.setBorder(null);
		Btnmul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnmul.setBounds(369, 444, 64, 49);
		frame.getContentPane().add(Btnmul);
		
		JButton Btnadd = new JButton("+");
		Btnadd.setEnabled(false);
		Btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input=textField.getText();
					if(input.isEmpty()) {
						throw new IllegalArgumentException("Please provide the input.");
					}
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="+";
				}
				catch(NumberFormatException ex){
					textField.setText("Invalid input.");
				}
				 catch (IllegalArgumentException ex) {
	                    textField.setText(ex.getMessage());
	                }
			}
		});
		Btnadd.setFocusable(false);
		Btnadd.setBackground(Color.orange);
		Btnadd.setBorder(null);
		Btnadd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Btnadd.setBounds(369, 514, 64, 49);
		frame.getContentPane().add(Btnadd);
		
		JButton Btnequal = new JButton("=");
		Btnequal.setEnabled(false);
		Btnequal.setForeground(new Color(0, 0, 0));
		Btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "X^Y") {
					result=Math.pow(first, second);
					answer=String.format("%.5f", result);
					textField.setText(answer);
					
				}
			}
		});
		Btnequal.setFocusable(false);
		Btnequal.setBackground(Color.orange);
		Btnequal.setBorder(null);
		Btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btnequal.setBounds(369, 581, 64, 49);
		frame.getContentPane().add(Btnequal);

		JButton Btnonoff = new JButton("On/Off");
		Btnonoff.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				    on = !on;  // Toggle the state
				    Btnsin.setEnabled(on);
					Btnsin_h.setEnabled(on);
					Btnfact.setEnabled(on);
					Btn_7.setEnabled(on);
					Btn_4.setEnabled(on);
					Btn_1.setEnabled(on);
					Btn_0.setEnabled(on);
					Btncos.setEnabled(on);
					Btncos_h.setEnabled(on);
					Btnraise2.setEnabled(on);
					Btn_8.setEnabled(on);
					Btn_5.setEnabled(on);
					Btn_2.setEnabled(on);
					Btntan.setEnabled(on);
					Btntan_h.setEnabled(on);
					Btnraise3.setEnabled(on);
					Btn_9.setEnabled(on);
					Btn_6.setEnabled(on);
					Btn_3.setEnabled(on);
					Btndot.setEnabled(on);
					Btnroot.setEnabled(on);
					Btnlog.setEnabled(on);
					Btnraise_y.setEnabled(on);
					Btndel.setEnabled(on);
					Btndiv.setEnabled(on);
					Btnsub.setEnabled(on);
					Btnmod.setEnabled(on);
					Btnex.setEnabled(on);
					Btnbyx.setEnabled(on);
					Btnclear.setEnabled(on);		
					Btnmul.setEnabled(on);		
					Btnadd.setEnabled(on);
					Btnequal.setEnabled(on);
					if(on) {
						textField.setBackground(Color.blue);
					}
					else {
						textField.setBackground(new Color(27,27,27));
						textField.setText(null);
					}
	               
			}
		});
		Btnonoff.setFocusable(false);
		Btnonoff.setBackground(Color.orange);
		Btnonoff.setBorder(null);
		Btnonoff.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Btnonoff.setBounds(369, 173, 64, 49);
		frame.getContentPane().add(Btnonoff);
	}
}
