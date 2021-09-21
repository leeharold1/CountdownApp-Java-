/*
CountdownApp.java
L Harold
1 5 2020
*/

import javax.swing.*;
public class CountdownApp{
public static void main(String args[]){

	String p1Word;
	String p2Word;
	int p1Score;
	int p2Score;
	int vowelAmount;
	int consonantAmount;
	int rounds;
	int lettersLength;
	String randomVowels;
	String randomConsonants;
	String play;
	String playAgain;


 Countdown myCountdown=new Countdown();

	play = JOptionPane.showInputDialog(null, "Would you like to play?");//Asks user if they want to play
	if(play.equalsIgnoreCase("yes")){//If answer is yes, run the game

	do{//Run the app while the parameter is met, in this case, playAgain being yes or no

		rounds = Integer.parseInt(JOptionPane.showInputDialog(null, "How many rounds would you like to play?"));//Ask the user how many rounds to determine how many times the game will loop



			for(int i=0;i<rounds;i++){ //if rounds entered are greater than one, the game will loop that amount of times


			vowelAmount= Integer.parseInt(JOptionPane.showInputDialog(null, "How many vowels?"));//Asks the user and stores the consonant Amount
			myCountdown.setVowelAmount(vowelAmount);//Sends vowelAmount amount to instan for the compute

			consonantAmount= Integer.parseInt(JOptionPane.showInputDialog(null, "How many consonants?"));//Asks the user and stores the consonant Amount
			myCountdown.setConsonantAmount(consonantAmount);//Sends consonantAmount to instan for the compute

			lettersLength = vowelAmount + consonantAmount;//Adds the amount of vowels and amount of consonants together

				if (lettersLength > 8 && lettersLength < 10){ //If lettersLength is equal to nine, the game will play

							myCountdown.computeVowOne();//Performs compute in instan
							randomVowels=myCountdown.getRandomVowels();//Gets variable from instan


							myCountdown.computeConOne();//Performs compute in instan
							randomConsonants=myCountdown.getRandomConsonants();//Gets variable from instan


								p1Word= JOptionPane.showInputDialog(null,  randomVowels  + randomConsonants + ". " + " Player 1 enter your word.");//displays the 9 random vowels/consonants and asks Player 1 for their word

								myCountdown.setP1Word(p1Word);//Gets p1Score from the instan
								myCountdown.computeScoreOne();//Computes P1's score

								p2Word= JOptionPane.showInputDialog(null,  randomVowels  + randomConsonants + ". Player 2 enter your word.");//Displays the 9 random vowels/consonants and asks Player 2 for their word
								myCountdown.setP2Word(p2Word);	//Gets the p2Score from the instan
								myCountdown.computeScoreTwo();//Computes P2's score

								p1Score=myCountdown.getP1Score();//Gets p1Score after the compute takes place
								p2Score=myCountdown.getP2Score();//Gets  p2Score after the compute takes place





						JOptionPane.showMessageDialog(null, "At the end of the round, Player 1 has " + p1Score + " and Player 2 has " + p2Score );//Displays P1 and P2 scores at the end of the round
					}

				else if (lettersLength > 9 || lettersLength < 9){
					JOptionPane.showMessageDialog(null,"Error, vowels and consonants do not reach or exceed 9 letters. Please try again."); //If the random vowel/consonant are not exactly 9, the game shuts down and displays an error message

					}
				}
						p1Score=myCountdown.getP1Score();//Gets p1Score from instan
						p2Score=myCountdown.getP2Score();//Gets p2Score from instan


					if( p1Score >  p2Score){
						JOptionPane.showMessageDialog(null, "Congratulations Player 1, they win with " + p1Score + " point(s).");//Displays Player 1 as the winner and their point total
					}

					else if(p2Score > p1Score){
						JOptionPane.showMessageDialog(null, "Congratulations Player 2, they win with " + p2Score + " point(s).");//Displays Player 2 as the winner and their point total
					}

					else{
						JOptionPane.showMessageDialog(null, "It is a draw. Player 1 has " + p1Score + " point(s) and " + " Player 2 has " + p2Score + " point(s).");//Displays that it's a draw
					}
						playAgain=JOptionPane.showInputDialog(null, "Play again?");//Asks user to play again and stores the variable
					}

						while(playAgain.equalsIgnoreCase("yes"));//While the user says yes to play again, the app will run, when the user inputs no, the app will end.


				}

				else if(play.equalsIgnoreCase("no")){
						JOptionPane.showMessageDialog(null, "Ok, have a good day then.");//Game ends
					}
				}
			}















