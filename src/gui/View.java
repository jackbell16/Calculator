package gui;

import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import mathoperation.ProxyOperation;

@SuppressWarnings("serial")
public class View extends JPanel implements Observer {
	
	private ProxyOperation operation;
	private JLabel result = new JLabel();
	
	
	public View(ProxyOperation operation) {
		super();
		this.operation = operation;
		operation.addObserver(this);
		add(result);
		Font font = new Font("SansSerif", Font.BOLD, 30);
	    result.setFont(font);
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		result.setText(operation.getResut());
	}
}
