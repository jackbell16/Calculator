package gui;

import javax.swing.JFrame;

import mathoperation.ProxyOperation;

public class MainGUI {
	public static void main(String[] args) {
		ProxyOperation operation = new ProxyOperation();
		Controller controller = new Controller(operation);
		View view = new View(operation);
		MainPannel mainPannel = new MainPannel(1, controller,view);
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(mainPannel);
		frame.setSize(700, 500);
		frame.setVisible(true);
	}
}
