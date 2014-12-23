package gui;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import mathoperation.IOperation;
import mathoperation.OperationsAvaible;
import mathoperation.ProxyOperation;

@SuppressWarnings("serial")
public class Controller extends JPanel {
	
	private JTextField par1 = new JTextField("Insert the first number");
	private JTextField par2 = new JTextField("Insert the second number");
	private JLabel symbol = new JLabel("?");
	private JButton button = new JButton("Calculate");
	private JComboBox<Object> comboBox = new JComboBox<>(OperationsAvaible.getAvaible().getOperations().toArray());
	private ProxyOperation operation;
	
	
	public Controller(ProxyOperation operation) {
		super();
		this.operation = operation;
		createGraphics();
	}
	
	private void createGraphics(){
		setSymbolLabel();
		setLayout(new GridLayout(5, 1));
		add(par1);
		add(symbol);
		add(par2);
		add(comboBox);
		add(button);
		buttonAction();
		boxAction();
	}
	
	private void buttonAction(){
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double p1 = Double.valueOf(par1.getText());
					double p2 = Double.valueOf(par2.getText());
					IOperation operationSel = (IOperation) comboBox.getSelectedItem();
					operation.setOperation(operationSel);
					operation.calculate(p1, p2);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "You haven't correctly inserted the numbers !", "Not a number error", 0);
				}
			}
		});
	}
	
	private void boxAction(){
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				IOperation key = (IOperation) comboBox.getSelectedItem();
				symbol.setText(OperationsAvaible.getAvaible().getSymbolOperations().get(key));
			}
		});
	}
	
	private void setSymbolLabel(){
		symbol.setVerticalTextPosition(SwingConstants.CENTER);
		Font font = new Font("SansSerif", Font.BOLD, 30);
	    symbol.setFont(font);
	}
}
