//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Get the user to enter a question for the 8 ball to answer
	String answer = JOptionPane.showInputDialog(null,"Enter a yes or no quetion for the Magic 8-Ball to answer");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
Random rand = new Random ();
int randomNumber = rand.nextInt(3+0+1)+0 ;
	System.out.println(randomNumber);
	// 4. If the random number is 0
if (randomNumber==0) {
	JOptionPane.showMessageDialog(null, "Yes");
}if (randomNumber==1) {
	JOptionPane.showMessageDialog(null, "No");
}if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "Maybe You Should Ask Google");
}if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "System Error");
}
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}}
