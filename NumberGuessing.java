import javax.swing.*;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        int sysNum = (int) (Math.random() * 100 + 1);
        int userNum =0;
        int count = 1;
        try {
	JOptionPane.showMessageDialog(null,"You have total 5 attempts ");
            while (userNum != sysNum) {
		if (count <=5){
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                userNum = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + findGuess(userNum,sysNum, count));
                count++;
		}
		else{
			JOptionPane.showMessageDialog(null,"No more attempts left...");
			System.exit(0);
		}
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String findGuess(int userNum , int sysNum , int count)
    {
        if (userNum <= 0 ||userNum > 100) {
            	return "Your guess is invalid";
	
        } else if (userNum == sysNum) {
           	return  "Correct! \n Total Guesses : " + count + "\n YOU WIN ! \n";
	
        } else if (userNum > sysNum) {
           	return "Your guess is too high, try again, \n Try Number : " + count;
	
        } else if (userNum < sysNum) {
           	return  "Your guess is too low, try again, \n Try Number :  " + count;
		
        } else {
           	return "Your guess is incorrect \n Try Number : " + count;
        }
    }
	
    
}