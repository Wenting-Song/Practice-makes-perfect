import java.util.Scanner;

public class tictactoe {
	public static int col, row;
	public static char[][] board = new char[3][3];
	public static Character turn = 'X';
	public static boolean playing = true;

	public static void play() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && (board[i][1]) == board[i][2] && board[i][0] != '_') {
				playing = false;
			}
			if (board[0][i] == board[1][i] && (board[1][i]) == board[2][i] && board[i][i] != '_') {
				playing = false;
			}
			if (board[0][0] == board[1][1] && (board[1][1]) == board[2][2] && board[1][1] != '_') {
				playing = false;
			}
			if (board[0][2] == board[1][1] && (board[1][1]) == board[2][0] && board[1][1] != '_') {
				playing = false;
			}
		}

	}

	public static void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// board[i][j] = '_';
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter player1's name:");
		String name1 = input.nextLine();
		System.out.println("Enter player2's name:");
		String name2 = input.nextLine();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '_';
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		while (playing) {
			// printBoard();
			if (turn == 'X') {
				System.out.println(name1 + " " + "enter your move (row[1-3] column[1-3]): ");
			} else {
				System.out.println(name2 + " " + "enter your move (row[1-3] column[1-3]): ");
			}
			while (true) {
				System.out.print("Enter the numbers");
				row = input.nextInt() - 1;
				col = input.nextInt() - 1;
				if (row < 3 && row >= 0 && col < 3 && col >= 0) {
					board[row][col] = turn;
					break;
				}
				System.out.println("Invalid input entered. try again.");
			}
			play();
			printBoard();
			if (playing == false && turn == 'X') {
				System.out.println("Game Over," + name1 + '_' + "wins");

			} else if (playing == false && turn == 'O') {
				System.out.println("Game Over," + name2 + '_' + "wins");

			}
			if (turn == 'X') {
				turn = 'O';
			} else {
				turn = 'X';
			}
		}

	}

}
