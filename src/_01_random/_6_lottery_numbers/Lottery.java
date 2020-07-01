package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	
	Random random1 = new Random();
	 int randomnumber1 = random1.nextInt(100);
	 Random random2 = new Random();
	 int randomnumber2 = random2.nextInt(100);
	 Random random3 = new Random();
	 int randomnumber3 = random3.nextInt(100);
	 Random random4 = new Random();
	 int randomnumber4 = random4.nextInt(100);
	 Random random5 = new Random();
	 int randomnumber5 = random5.nextInt(100);
	 Random random6 = new Random();
	 int randomnumber6 = random6.nextInt(100);
	
	JOptionPane.showMessageDialog(null, "Lottery Numbers Are: " + randomnumber1+ ", "+randomnumber2+", "+ randomnumber3+", "+ randomnumber4+", "+ randomnumber5+", "+ randomnumber6);
	
	
	
}
}
