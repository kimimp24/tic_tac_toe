package tic_tac_toe;

import java.util.Scanner;


import tic_tac_toe.board.Display;
import tic_tac_toe.board.Print1;
import tic_tac_toe.board.Print2;
import tic_tac_toe.game.DrawRuleImpl;
import tic_tac_toe.game.Game;
import tic_tac_toe.game.WinnerRuleImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of players");
		int numOfPlayers=scanner.nextInt();
		int sizeOfBoard=0;
		while(sizeOfBoard<3) {
		System.out.println("Enter the board size greater than or equal to 3");
		sizeOfBoard=scanner.nextInt();}
		System.out.println("Enter the display type");
		int flag=scanner.nextInt();
		Display d;
		switch (flag){
			case 1: d=new Print1();
			default: d=new Print2();
		}
		Game game=new Game(sizeOfBoard,numOfPlayers,d, new DrawRuleImpl(),new WinnerRuleImpl());
		game.startGame();
	}

}
