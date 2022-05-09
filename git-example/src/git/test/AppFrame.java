package git.test;

import javax.swing.JFrame;

public class AppFrame extends JFrame{

	public AppFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("MyFrame");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		System.out.println("New line.");
	}
}
