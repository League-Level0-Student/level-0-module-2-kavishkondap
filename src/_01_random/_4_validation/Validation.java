//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
			
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

	

		if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "You are very kind!");
}if (randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "You are a great friend!");
}if(randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "You look great today!!");
}if(randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "You are amazing!!!");
}if(randomNumber == 5) {
	JOptionPane.showMessageDialog(null, "Nice Job at school/work!!!");
	
}if(randomNumber == 6){
	JOptionPane.showMessageDialog(null, "You are very smart!!!");
}
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
