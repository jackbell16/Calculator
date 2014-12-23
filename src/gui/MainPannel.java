package gui;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class MainPannel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainPannel(int nCol,JPanel...jPanels){
		setLayout(new GridLayout(jPanels.length, nCol));
		for (int i = 0; i < jPanels.length; i++) {
			add(jPanels[i]);
		}
	}
}
