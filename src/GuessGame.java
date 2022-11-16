import java.util.*;

class Charaters {

	int n = 10;
	String[] arra = new String[n];

	void empireDisplay() {
		arra[0] = "  _____  ";
		arra[1] = " |     | ";
		arra[2] = "_|_____|_ ";
		arra[3] = "[| o o |]";
		arra[4] = " |  ^  |";
		arra[5] = " | '-' |";
		arra[6] = " +-----+";
		arra[7] = "    |   ";
		arra[8] = "    |   ";
		arra[9] = "🤠 Umpire🤠  ";
		for (int i = 0; i < n; i++) {
			System.out.println("\t" + arra[i]);
		}
	}

	void empire2dis() {
		arra[0] = "  ";
		arra[1] = " {{{|}}}";
		arra[2] = " |_____| ";
		arra[3] = "[| o o |]";
		arra[4] = " |  ^  |";
		arra[5] = " | '-' |";
		arra[6] = " +-----+";
		arra[7] = "   /|\\   ";
		arra[8] = "    |    ";
		arra[9] = "🤠 Umpire🤠  ";

		for (int i = 0; i < n; i++) {
			System.out.println("\t" + arra[i]);
		}

	}

	void empire3dis() {
		arra[0] = "  ";
		arra[1] = " ♠︎♠︎♠︎♠︎♠︎♠︎♠︎";
		arra[2] = " |♠︎♠︎♠︎♠︎♠︎| ";
		arra[3] = "[| o o |]";
		arra[4] = " |  ^  |";
		arra[5] = " | '-' |";
		arra[6] = " +-----+";
		arra[7] = "   /|\\   ";
		arra[8] = "    |    ";
		arra[9] = "🤠 Umpire🤠  ";

		for (int i = 0; i < n; i++) {
			System.out.println("\t" + arra[i]);
		}

	}
}

class Guesser {
	int numFromGuesser;

	int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("🤠: Guesser Guess The Number:");
		numFromGuesser = scan.nextInt();
		return numFromGuesser;

	}
}

class Player {
	int numFromPlayer;

	int guessNumber(String player) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\n🤠: " + player + "  Guess The Number :");
		numFromPlayer = scan.nextInt();
		return numFromPlayer;

	}
}

class Umpire {
	int numFromGuesser;

	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	String p1, p2, p3;
	Scanner scan = new Scanner(System.in);

	void collecNumFromGuesser() {
		Guesser g = new Guesser();
		System.out.print("🤠: Enter Name of 1st Player :");
		p1 = scan.nextLine();

		System.out.print("🤠: Enter Name of 2nd Player :");
		p2 = scan.nextLine();

		System.out.print("🤠: Enter Name of 3rd Player :");
		p3 = scan.nextLine();
		numFromGuesser = g.guessNumber();
	}

	void collectNumFromPlayer() {

		Player p = new Player();

	

		System.out.println("\n______________________________________________________\n");
		numFromPlayer1 = p.guessNumber(p1);
		numFromPlayer2 = p.guessNumber(p2);
		numFromPlayer3 = p.guessNumber(p3);

	}

	void round2(String p1, String p2) {
		Player p = new Player();
		int n = 2;
		Guesser g = new Guesser();
		int newNumberR2;
		boolean flg1 = false;
		boolean flg2 = false;

		int numFromP1;
		int numFromP2;
		System.out.println("\n________________________________________________________________\n\n");

		Charaters ch = new Charaters();
		ch.empire2dis();

		System.out.println("\n\n 🏁  Welcome To Round  Two 🏁 \n");

		System.out.println(" 🏁  Number This Time is New !! 🏁 \n");
		newNumberR2 = g.guessNumber();
		System.out.println("________________________________________________________________\n\n");

		System.out.println("\nEach Player Have two ✌️  Chances to Guess Number , Good Luck !\n");

		for (int i = n; i > 0; i--) {
			if (flg1 == false) {
				numFromP1 = p.guessNumber(p1);
				if (numFromP1 == newNumberR2) {
					flg1 = true;
				}
			}

			if (flg2 == false) {
				numFromP2 = p.guessNumber(p2);
				if (numFromP2 == newNumberR2) {
					flg2 = true;
				}
			}

			if (flg1 == false && flg2 == false && i != 1) {
				System.out.println("\nBoth Players Guessed Wrong Number You both have One ☝️  More Chance:\n");
			} else if (flg1 == false && flg2 == true && i != 1) {
				System.out.println("\n" + p1 + " you Guessed Wrong Number You have One ☝️  More Chance\n");
			} else if (flg2 == false && flg1 == true && i != 1) {
				System.out.println("\n" + p2 + " you Guessed Wrong Number You have One ☝️  More Chance\n");
			}

		}

		if (flg1 == true && flg2 == true) {
			System.out.println("\nGame Draw Between " + p1 + " & " + p2
					+ " Again in Round Two.\n Well Played Now, Lets Level Up the Game 😉 ");
			round3(p1, p2);
		} else if (flg1 == true) {
			System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");

			System.out.println("\n" + p1 + " won the Game 👏  ✨✨✨✨  👏");
		} else if (flg2 == true) {
			System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");

			System.out.println("\n" + p2 + " won the Game 👏  ✨✨✨✨  👏");
		} else {
			System.out.println("\n Wrong Guess Game Over !");
		}

	}

	void round3(String p1, String p2) {
		Player p = new Player();
		int n = 3;
		Guesser g = new Guesser();
		int newNumberR2;
		boolean flg1 = false;
		boolean flg2 = false;

		int numFromP1;
		int numFromP2;
		System.out.println("\n________________________________________________________________\n\n");

		Charaters ch = new Charaters();
		ch.empire3dis();

		System.out.println("\n\n 🏁  Welcome To Round Three 🏁 \n");

		System.out.println(" 🏁  Number This Time is New !! 🏁 \n");
		newNumberR2 = g.guessNumber();
		System.out.println("________________________________________________________________\n\n");

		System.out.println("\nEach Player Have Three  Chances to Guess Number , Good Luck !\n");

		for (int i = n; i > 0; i--) {
			if (flg1 == false) {
				numFromP1 = p.guessNumber(p1);
				if (numFromP1 == newNumberR2) {
					flg1 = true;
				}
			}

			if (flg2 == false) {
				numFromP2 = p.guessNumber(p2);
				if (numFromP2 == newNumberR2) {
					flg2 = true;
				}
			}

			if (flg1 == false && flg2 == false) {

				if (i == 3) {
					System.out.println("\nBoth Players Guessed Wrong Number You both have two ✌️  More Chance:\n");
				}
				if (i == 2) {
					System.out.println("\nBoth Players Guessed Wrong Number You both have One ☝️  More Chance:\n");
				}

			} else if (flg1 == false && flg2 == true) {

				if (i == 3) {
					System.out.println("\n" + p1 + " you Guessed Wrong Number You have two ✌️  More Chance\n");
				}
				if (i == 2) {
					System.out.println("\n" + p1 + " you Guessed Wrong Number You have One ☝️  More Chance\n");
				}
			} else if (flg2 == false && flg1 == true ) {
				if (i == 3) {
					System.out.println("\n" + p2 + " you Guessed Wrong Number You have two ✌️  More Chance\n");

				}
				if (i == 2) {
					System.out.println("\n" + p2 + " you Guessed Wrong Number You have One ☝️  More Chance\n");

				}
			}

		}

		if (flg1 == true && flg2 == true) {
			System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");

			System.out.println("\nGame Draw Between " + p1 + " & " + p2 + " .\n Well Played 👏  ✨✨✨✨  👏. ");

		} else if (flg1 == true) {
			System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");

			System.out.println("\n" + p1 + " won the Game 👏  ✨✨✨✨  👏");
		} else if (flg2 == true) {
			System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");

			System.out.println("\n" + p2 + " won the Game 👏  ✨✨✨✨  👏");
		} else {
			
			System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");
			System.out.println("\n Wrong Guess Game Over !");
		}
	}

	void compare() {

		if (numFromPlayer1 == numFromGuesser) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");

				System.out.println("\n\n All Won The Game well played 👏  ✨✨✨✨  👏");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("\n\n" + p1 + " & " + p2 + " Won The First Round ");
				round2(p1, p2);
			} else if (numFromGuesser == numFromPlayer3) {
				
				System.out.println("\n\n" + p1 + " & " + p3 + " Won The First Round");
				round2(p1, p3);
			} else {
				System.out.println("\n" + p1 + " Won The Game  👏  ✨✨✨✨  👏");
			}
		} else if (numFromPlayer2 == numFromGuesser) {
			if (numFromPlayer3 == numFromGuesser) {
				System.out.println("\n\n" + p2 + " & " + p3 + " Won the first Round");
				round2(p2, p3);
			} else {
				System.out.println("\n" + p2 + " Won The Game  👏  ✨✨✨✨  👏");
			}
		} else if (numFromPlayer3 == numFromGuesser) {
			System.out.println("🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩🚩");

			System.out.println("\n" + p3 + " Won The Game 👏  ✨✨✨✨  👏");
		} else {
			System.out.println("\n\nGame Over Try Again");
		}

	}
}

public class GuessGame {

	public static void main(String[] args) {

		
		char restart='N';
		Scanner scan =new Scanner(System.in);
		Charaters ch = new Charaters();
		Umpire u = new Umpire();
		
		do {
			
			ch.empireDisplay();
			System.out.println("\nHello, \nWelcome to the Guesser Game  😀\n");
			System.out.println("🎮 🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮");
			System.out.println();

			System.out.println("🏁 Let's start The Game 🏁\n");
			u.collecNumFromGuesser();
			System.out.println();
			u.collectNumFromPlayer();
			u.compare();
			
			System.out.print("\n\nPress Y to Restart The game [Y][N] :");
			restart=scan.next().charAt(0);
			if(restart=='N') {
				System.out.println("\n Thanks For Playing !");	
			}
			
		}while(restart=='Y');
	

	}

}
