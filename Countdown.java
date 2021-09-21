/*
Countdown.java
L Harold
1 5 2020
*/

import java.lang.Math.*; //imports the method to choose the random vowels and consonants
	public class Countdown{

		//Data members

		private String p1Word;
		private String p2Word;
		private int p1Score;
		private int p2Score;
		private String vowel[]={"a", "e", "i", "o", "u"}; //Places vowels in an array
		private int vowelAmount;
		private String consonant[]={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"}; //Places consonants in an array
		private int consonantAmount;
		private String wordBank[]={"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "import",  "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strict", "super", "switch", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"}; //Places all valid keywords in an array
		private int rounds;
		private int lettersLength;//
		private String randomVowels;
		private String randomConsonants;
		private StringBuffer vowelOut;
		private StringBuffer consOut;




		//Constructor

	public Countdown (){

			p1Word =" "; //Stores the guess of Player 1
			p2Word = " "; //Stores the guess of Player 2
			p1Score = 0; //Stores Player 1's score
			p2Score = 0; //Stores Player 2's score
			vowelAmount = 0; //Stores amount of vowels from Player
			consonantAmount = 0;//Stores amount of vowels from Player
			rounds = 0;//Stores amount of rounds that will be played
			lettersLength = 0;//Stores length of the 9 vowel/cons combination
			vowelOut = new StringBuffer();//StringBuffer to hold the randomised vowels
			consOut = new StringBuffer();//StringBuffer to hold the randomised consonants

		}


		//Setters

		public void setP1Word(String p1Word){
		this.p1Word=p1Word;
		}

		public void setP2Word(String p2Word){
		this.p2Word=p2Word;
		}

		public void setVowelAmount(int vowelAmount){
		this.vowelAmount=vowelAmount;
		}

		public void setConsonantAmount(int consonantAmount){
		this.consonantAmount=consonantAmount;
		}

		public void setRounds(int Rounds){
		this.rounds=rounds;
		}



		//Compute - Perfoms the calculations needed for the app class

		public void computeScoreOne(){//Add one to the p1Score if their word is valid and longer than p2Word
			//p1Score= 0;
			for(int i=0;i<wordBank.length;i++){
				if(p1Word.equals(wordBank[i])){
					if( p1Word.length() > p2Word.length()){
						p1Score= p1Score + 1;
				}
			}
		}
	}





		public void computeScoreTwo(){ //Add one to the p1Score if their word is valid and longer than p2Word
			//p2Score=0;
			for(int i=0;i<wordBank.length;i++){
				if(p2Word.equals(wordBank[i])){
					if( p2Word.length() > p1Word.length()){
						p2Score= p2Score + 1;

				}
			}
		}
	}


		public void computeVowOne(){
			vowelOut= new StringBuffer();//Clears the StringBuffer
			for(int i=0;i<vowelAmount;i++){//Loops the randomising to the amount of vowels that are input
				randomVowels = vowel [(int)(Math.random()*4)]; //Chooses a random vowel from the vowel array
				vowelOut.append(randomVowels);//Places the random vowels into the StringBuffer

			}
			randomVowels = vowelOut.toString();//Converts the StringBuffer to a String
		}

		public void computeConOne(){
			consOut = new StringBuffer();//Clears the StringBuffer
			for(int i=0;i<consonantAmount;i++){//Loops the randomising to the amount of consonants that are input
				randomConsonants = consonant [(int)(Math.random()*20)]; //Chooses a random consonant from the consonant array
					consOut.append(randomConsonants);//Places the random consonants into the StringBuffer

			}
			randomConsonants = consOut.toString();//Converts the StringBuffer to a String
		}




		//Getters - Sends to the app class to be used

		public int getP1Score(){
					return p1Score;
		}
		public int getP2Score(){
					return p2Score;
		}


		public int getVowelAmount(){
			return vowelAmount;
		}

		public int getConsonantAmount(){
			return consonantAmount;
		}

		public int getRounds(){
			return rounds;
		}

		public String getRandomVowels(){
			return randomVowels;
		}

		public String getRandomConsonants(){
					return randomConsonants;
		}

	}





