package com.testjava;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class TicTacToe {
	
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int ch;
		System.out.println("WELCOME TO TIC-TAC-TOE!");
		System.out.println("This 2 player game!");
		System.out.println("Press 1 to start");
		System.out.println("Press 0 to close");
		ch=scanner.nextInt();
		while(ch!=1 && ch!=0) {
			System.out.println("Give valid choice (1, 0)");
			ch=scanner.nextInt();
		}
		if (ch==1) {
			startGame();
		}	else {
			System.out.println("Closing in 3..2..1..");
			Thread.sleep(3000);
		}
	}
	static void startGame() throws InterruptedException {
		
		String[][] Board = {
							{"-","-","-"},
							{"-","-","-"},
							{"-","-","-"}
							};
		
		Scanner scanner = new Scanner(System.in);
		String player1;
		String player2;
		System.out.println("Give player 1 name (plays X):");
		player1 = scanner.nextLine();
		System.out.println("Give player 2 name (plays O):");
		player2 = scanner.nextLine();
		String curPlays = player1;
		String curSymbol = "X";
		System.out.println("Game Starts in 3..2..1..");
		Thread.sleep(3000);
		printBoard(Board);
		Thread.sleep(1000);
		
		boolean keepPlaying = true;
		while (keepPlaying) {
			int row;
			int column;
			System.out.println(curPlays+" Plays with "+curSymbol+"! Enter your choice (Row 1,2,3 Column 1,2,3)!");
			System.out.println("Row: ");
			row = scanner.nextInt();
			while(row<1||row>3) {
				System.out.println("Row: ");
				row = scanner.nextInt();
			}
			row-=1;
			System.out.println("Column: ");
			column = scanner.nextInt();
			while(column<1||column>3) {
				System.out.println("Column: ");
				column = scanner.nextInt();
			}
			column-=1;
			
			if(Board[row][column]==updateBoard(row,column,curSymbol,Board)[row][column]) {
				continue;
			}
			Board = updateBoard(row,column,curSymbol,Board);
			
			
			if(isWinner(curSymbol,Board)) {
				keepPlaying = false;
				System.out.println(curPlays+" Won!");
			}
			if(isBoardFull(Board) && !isWinner(curSymbol,Board)) {
				keepPlaying = false;
				System.out.println("Board is full nobody won!");
			}
			
			printBoard(Board);
			if(curSymbol=="X") {
				curPlays=player2;
				curSymbol="O";
			}else {
				curPlays=player1;
				curSymbol="X";
			}
			
		}
		
	}
	static void printBoard(String[][] Board) {
		for (int i = 0; i<Board.length; i++) {
			for(int j = 0; j<Board[i].length;j++) {
				System.out.print("|"+Board[i][j]+"|");
			}
			System.out.println("\n");
		}	
	}
	static String[][] updateBoard(int Row, int Column,String symbol,String[][] Board){
		if(Board[Row][Column].equals("-") == true) {
			Board[Row][Column] = symbol;
		} else {
			return Board;
		}
		return Board;
	}
	static boolean isBoardFull(String[][] Board) {
		boolean isfull = true;
		for(int i=0;i<Board.length;i++) {
			for(int j = 0;j<Board[i].length;j++) {
				if(Board[i][j]=="-") {
					return false;
				}
			}
		}
		return isfull;
	}
	static boolean isWinner(String currentSymbol,String[][] Board) {
		boolean win = false;
		for(int i=0;i<Board.length;i++) {
			if(Board[i][0]==currentSymbol && Board[i][1]==currentSymbol && Board[i][2]==currentSymbol ) {
				win = true;
			}
		}
		for(int i=0;i<Board.length;i++) {
			if(Board[0][i]==currentSymbol && Board[1][i]==currentSymbol && Board[2][i]==currentSymbol) {
				win = true;
			}
		}
		if(Board[0][0]==currentSymbol && Board[1][1]==currentSymbol && Board[2][2]==currentSymbol) {
			win = true;
		}
		if(Board[0][2]==currentSymbol && Board[1][1]==currentSymbol && Board[2][0]==currentSymbol) {
			win = true;
		}
		return win;
		
	}
	
	
		
		
}


