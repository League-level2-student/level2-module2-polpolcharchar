package _06_overloading;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane.showMessageDialog("HI!");
		
		LeagueOptionPane.showMessageDialog("TITLE!", "THIS IS A TITLE");
		

		LeagueOptionPane.showMessageDialog("message", "title", "league.png");
		JFrame frame = new JFrame();
		JPanel panel = LeagueOptionPane.showMessageDialog("msg", "title", "league.png");
		frame.add(panel);
		frame.setVisible(true);
	}
	
	
}
