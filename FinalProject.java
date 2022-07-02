package finalProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;
import java.awt.Choice;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Toolkit;

import java.applet.*;
/*<applet>
<applet code="FinalProject.class" width=900 height=900>
</applet>*/


public class FinalProject extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextArea textArea;
	
	int refs;

	String def;
	
	double item1= 50;
	double item2= 100;
	double item3= 200;
	double item4= 100;
	double item5= 300;
	double itax = 10;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalProject frame = new FinalProject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FinalProject() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rakes\\Desktop\\Calendar\\background.jpg"));
		setTitle("RK Super Market");
		setBounds(400, 400, 1280, 630);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 11, 1244, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToMy = new JLabel("WELCOME TO MY SHOP");
		lblWelcomeToMy.setFont(new Font("Algerian", Font.BOLD, 30));
		lblWelcomeToMy.setBounds(444, 11, 356, 36);
		panel.add(lblWelcomeToMy);
		
		JLabel lblItemList = new JLabel("ITEM LIST");
		lblItemList.setForeground(Color.RED);
		lblItemList.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblItemList.setBounds(51, 95, 110, 33);
		contentPane.add(lblItemList);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setForeground(Color.RED);
		lblQuantity.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblQuantity.setBounds(199, 95, 118, 33);
		contentPane.add(lblQuantity);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblPrice.setBounds(369, 95, 84, 33);
		contentPane.add(lblPrice);
		
		JLabel lblFinalCost = new JLabel("FINAL COST");
		lblFinalCost.setForeground(Color.RED);
		lblFinalCost.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblFinalCost.setBounds(533, 95, 130, 33);
		contentPane.add(lblFinalCost);
		
		JCheckBox chckbxItem = new JCheckBox("ITEM1");
		chckbxItem.setFont(new Font("Montserrat Medium", Font.PLAIN, 17));
		chckbxItem.setBounds(48, 155, 97, 23);
		contentPane.add(chckbxItem);
		
		JCheckBox chckbxItem_1 = new JCheckBox("ITEM2");
		chckbxItem_1.setFont(new Font("Montserrat Medium", Font.PLAIN, 17));
		chckbxItem_1.setBounds(48, 193, 97, 23);
		contentPane.add(chckbxItem_1);
		
		JCheckBox chckbxItem_2 = new JCheckBox("ITEM3");
		chckbxItem_2.setFont(new Font("Montserrat Medium", Font.PLAIN, 17));
		chckbxItem_2.setBounds(48, 234, 97, 23);
		contentPane.add(chckbxItem_2);
		
		JCheckBox chckbxItem_3 = new JCheckBox("ITEM4");
		chckbxItem_3.setFont(new Font("Montserrat Medium", Font.PLAIN, 17));
		chckbxItem_3.setBounds(48, 270, 97, 23);
		contentPane.add(chckbxItem_3);
		
		def="0";
		
		Choice choice = new Choice();
		choice.setFont(new Font("Kristen ITC", Font.PLAIN, 15));
		choice.setBounds(225, 151, 55, 20);
		choice.add("0");
		choice.add("1");
		choice.add("2");
		choice.add("3");
		choice.add("4");
		contentPane.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setFont(new Font("Kristen ITC", Font.PLAIN, 15));
		choice_1.setBounds(225, 189, 55, 27);
		choice_1.add("0");
		choice_1.add("1");
		choice_1.add("2");
		choice_1.add("3");
		choice_1.add("4");
		contentPane.add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setFont(new Font("Kristen ITC", Font.PLAIN, 15));
		choice_2.setBounds(225, 230, 55, 27);
		choice_2.add("0");
		choice_2.add("1");
		choice_2.add("2");
		choice_2.add("3");
		choice_2.add("4");
		contentPane.add(choice_2);
		
		Choice choice_3 = new Choice();
		choice_3.setFont(new Font("Kristen ITC", Font.PLAIN, 15));
		choice_3.setBounds(225, 266, 55, 27);
		choice_3.add("0");
		choice_3.add("1");
		choice_3.add("2");
		choice_3.add("3");
		choice_3.add("4");
		contentPane.add(choice_3);
		
		Choice choice_4 = new Choice();
		choice_4.setFont(new Font("Kristen ITC", Font.PLAIN, 15));
		choice_4.setBounds(225, 300, 55, 27);
		choice_4.add("0");
		choice_4.add("1");
		choice_4.add("2");
		choice_4.add("3");
		choice_4.add("4");
		contentPane.add(choice_4);
		
		Label label = new Label("$ 50");
		label.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		label.setBounds(381, 156, 45, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("$ 100");
		label_1.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		label_1.setBounds(381, 194, 45, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("$ 200");
		label_2.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		label_2.setBounds(381, 235, 45, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("$ 100");
		label_3.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		label_3.setBounds(381, 271, 45, 22);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(546, 159, 97, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(546, 198, 97, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(546, 239, 97, 23);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(546, 275, 97, 23);
		contentPane.add(textField_3);
		
		JLabel lblSu = new JLabel("SUB TOTAL");
		lblSu.setForeground(Color.RED);
		lblSu.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblSu.setBounds(45, 363, 118, 33);
		contentPane.add(lblSu);
		
		JLabel lblTax = new JLabel("TAX");
		lblTax.setForeground(Color.RED);
		lblTax.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblTax.setBounds(300, 363, 55, 33);
		contentPane.add(lblTax);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(Color.RED);
		lblTotal.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblTotal.setBounds(484, 363, 77, 33);
		contentPane.add(lblTotal);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(173, 368, 97, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(365, 368, 97, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(566, 368, 97, 31);
		contentPane.add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setBounds(751, 138, 503, 390);
		contentPane.add(textArea);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(546, 309, 97, 23);
		contentPane.add(textField_8);
		
		JLabel lblBillReciept = new JLabel("BILL RECIEPT");
		lblBillReciept.setForeground(Color.RED);
		lblBillReciept.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblBillReciept.setBounds(925, 95, 148, 33);
		contentPane.add(lblBillReciept);
		
		JLabel lblCustomerName = new JLabel("CUSTOMER NAME");
		lblCustomerName.setForeground(Color.RED);
		lblCustomerName.setFont(new Font("Montserrat Medium", Font.PLAIN, 20));
		lblCustomerName.setBounds(35, 426, 201, 33);
		contentPane.add(lblCustomerName);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Axure Handwriting", Font.PLAIN, 14));
		textField_7.setBounds(246, 426, 262, 31);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JCheckBox chckbxItem_4 = new JCheckBox("ITEM5");
		chckbxItem_4.setFont(new Font("Montserrat Medium", Font.PLAIN, 17));
		chckbxItem_4.setBounds(48, 304, 97, 23);
		contentPane.add(chckbxItem_4);
		
		
		Label label_4 = new Label("$ 300");
		label_4.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		label_4.setBounds(381, 305, 45, 22);
		contentPane.add(label_4);
		
		Button button = new Button("RESET");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				
				chckbxItem.setSelected(false);
				chckbxItem_1.setSelected(false);
				chckbxItem_2.setSelected(false);
				chckbxItem_3.setSelected(false);
				chckbxItem_4.setSelected(false);
				
				textArea.setText(null);
				
				choice.select(def);
				choice_1.select(def);
				choice_2.select(def);
				choice_3.select(def);
				choice_4.select(def);

				
			}
		});
		button.setBackground(SystemColor.activeCaption);
		button.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		button.setBounds(25, 477, 129, 35);
		contentPane.add(button);
		
		Button button_1 = new Button("CALCULATE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double i1= item1 * Double.parseDouble(choice.getSelectedItem());
				double i2= item2 * Double.parseDouble(choice_1.getSelectedItem());
				double i3= item3 * Double.parseDouble(choice_2.getSelectedItem());
				double i4= item4 * Double.parseDouble(choice_3.getSelectedItem());
				double i5= item5 * Double.parseDouble(choice_4.getSelectedItem());
				
				Double SubTotal= i1 + i2 + i3 + i4 + i5;
				double tax=(itax * SubTotal)/100;
				
				String s= String.format("$ %.2f", SubTotal);
				textField_4.setText(s);
				
				String stax=String.format("$ %.2f", tax);
				textField_5.setText(stax);
				
				Double Total = SubTotal + tax;
				
				String total=String.format("$ %.2f", Total);
				textField_6.setText(total);
				
				String cost1=String.format("$ %.2f", i1);
				String cost2=String.format("$ %.2f", i2);
				String cost3=String.format("$ %.2f", i3);
				String cost4=String.format("$ %.2f", i4);
				String cost5=String.format("$ %.2f", i5);
				
				textField.setText(cost1);
				textField_1.setText(cost2);
				textField_2.setText(cost3);
				textField_3.setText(cost4);
				textField_8.setText(cost5);
				
				
			}
		});
		button_1.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		button_1.setBackground(SystemColor.activeCaption);
		button_1.setBounds(159, 477, 129, 35);
		contentPane.add(button_1);
		
		Button button_2 = new Button("EXIT");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame= new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if want to exit", "MY_Shop", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		button_2.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		button_2.setBackground(SystemColor.activeCaption);
		button_2.setBounds(569, 477, 129, 35);
		contentPane.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 539, 1244, 41);
		contentPane.add(panel_1);
		
		JLabel lblcopyrights = new JLabel("Copyright \u00a9 RakeshKadam");
		lblcopyrights.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblcopyrights.setBounds(497, 11, 249, 19);
		panel_1.add(lblcopyrights);
		
		Button button_3 = new Button("PRINT");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.print();
				}
				catch(java.awt.print.PrinterException ev){
					System.err.format("No Printer Found",ev.getMessage());
				}
			}
		});
		button_3.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		button_3.setBackground(SystemColor.activeCaption);
		button_3.setBounds(297, 477, 129, 35);
		contentPane.add(button_3);
		
		
		
		Button button_4 = new Button("RECIEPT");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rchoice = String.format(choice.getSelectedItem());
				String rchoice1 = String.format(choice_1.getSelectedItem());
				String rchoice2 = String.format(choice_2.getSelectedItem());
				String rchoice3 = String.format(choice_3.getSelectedItem());
				String rchoice4 = String.format(choice_4.getSelectedItem());
				
				String rtextField = String.format(textField.getText());
				String rtextField1 = String.format(textField_1.getText());
				String rtextField2 = String.format(textField_2.getText());
				String rtextField3 = String.format(textField_3.getText());
				String rtextField8 = String.format(textField_8.getText());
				String rtextField7 = String.format(textField_7.getText());
				
				String rtax = String.format(textField_5.getText());
				String rsubtotal = String.format(textField_4.getText());
				String rtotal = String.format(textField_6.getText());
			
				 refs=1325 * (int) (Math.random() * 425);
				
						Calendar timer= Calendar.getInstance();
						timer.getTime();
						
						SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
						tTime.format(timer.getTime());
						
						SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
						tDate.format(timer.getTime());
				
						textArea.append("\t\tRK Super Market \n" + "Customer name: " + rtextField7 +" Bill no: " + refs +
								"\n//===============================================================\t"+
								"\n ITEM1:\t" + rchoice + " " + "\tCost of ITEM1   " + rtextField +
								"\n ITEM2:\t" + rchoice1 + " " + "\tCost of ITEM2   " + rtextField1 +
								"\n ITEM3:\t" + rchoice2 + " " + "\tCost of ITEM3   " + rtextField2 +
								"\n ITEM4:\t" + rchoice3+ " " + "\tCost of ITEM4   " + rtextField3 +
								"\n ITEM4:\t" + rchoice4+ " " + "\tCost of ITEM4   " + rtextField8 +
								     "\n//===============================================================\t"+
								"\nSub Total :\t" + rsubtotal +
								"\n      Tax :\t" + rtax +
								"\n    Total :\t" + rtotal +
								"\n//===============================================================\t"+
								"\nDate: " + tDate.format(timer.getTime()) +
								"\nTime: " + tTime.format(timer.getTime()) +
								"\n\n\t\tThank You\n"
								);
				}
		});
		button_4.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		button_4.setBackground(SystemColor.activeCaption);
		button_4.setBounds(433, 477, 129, 35);
		contentPane.add(button_4);
		
		Button button_5 = new Button("SAVE");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bill=Integer.toString(refs);
				try {
				File f = new File("D:\\" + bill+".txt");
				FileWriter fw = new FileWriter(f);
				String s1= textArea.getText();
				fw.write(s1);
				fw.close();
				
				}
				catch (IOException e) { }
					
				
			}
		});
		button_5.setFont(new Font("Montserrat Medium", Font.BOLD, 17));
		button_5.setBackground(SystemColor.activeCaption);
		button_5.setBounds(546, 426, 129, 35);
		contentPane.add(button_5);
	
	}
}
