package SwingObserverExample;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExampleLambda {

	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExampleLambda example = new SwingObserverExampleLambda();
		example.go();
	}

	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
		button.addActionListener(event -> System.out.println("Come on, do it!"));
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
