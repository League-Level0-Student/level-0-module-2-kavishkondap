package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null,"How old are you?");
	int integer = Integer.parseInt(answer);
if(integer>=18) {
	JOptionPane.showInputDialog(null,"Who do you think should be the next president?");
}else {
	JOptionPane.showMessageDialog(null, "No one cares what you think");
}




}
}
