package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.
		String bobby = 
		JOptionPane.showInputDialog(null, "do you know java");
		if(bobby.contentEquals("yes" )) {
			JOptionPane.showMessageDialog(null,"you are awesome" );
		}
	if(bobby.contentEquals("I am Gavin Pennock")) {
		JOptionPane.showMessageDialog(null, "hello your honor" );
	}
	
		if(bobby.contentEquals("no")) {
			JOptionPane.showMessageDialog(null, "good luck washing dishes" );
			
		}
		
		else {
			speak("please leave because i am an amazing piece of technology and you are just a dumb human");
		}
			
			
		}
		
		static void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			}
			 catch (Exception e) {
				 e.printStackTrace();
	}

}

	}



