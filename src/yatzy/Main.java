package yatzy;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		printboard();

	}

	/**
	 * Print the game board!
	 */

	private static void printboard() {

		JOptionPane.showMessageDialog(null, "message", "Board", -1);
		String name = JOptionPane.showInputDialog("enter you name:");
		JOptionPane.showInputDialog("Din mamma", "Är bäc");
		JOptionPane.showMessageDialog(null, "So your name is " + name);
	}
}
