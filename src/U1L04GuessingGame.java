import javax.swing.JOptionPane;

public class U1L04GuessingGame {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the Guessing Game");
		int computerNum = (int)(Math.random()*100)+1;
		String userInput; 
		int inputNum = 0;
		int numTries = 1;
		while(inputNum != computerNum){
			userInput = JOptionPane.showInputDialog("Enter a number between 1 and 100");
			inputNum = Integer.parseInt(userInput);
			if(inputNum < 1 || inputNum > 100){
				JOptionPane.showMessageDialog(null, "That input wasn't between 1 and 100");
			}
			else if(inputNum != computerNum){
				numTries += 1;
			}
			if(inputNum > computerNum + 10){
				JOptionPane.showMessageDialog(null, "Too High!");
			}
			else if(inputNum == computerNum) {
			numTries += 1;
			break;
			}
			else if(inputNum < computerNum - 10){
				JOptionPane.showMessageDialog(null, "Too Low!");
			}
			else if(inputNum < computerNum + 10 || inputNum > computerNum - 10){
				JOptionPane.showMessageDialog(null, "So Close!");
			}
			}
		JOptionPane.showMessageDialog(null, "You guessed correctly! You guessed "+numTries+" times!");
		

	}

}
