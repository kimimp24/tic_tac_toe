package tic_tac_toe.game;

import java.util.HashMap;
import java.util.Scanner;

import tic_tac_toe.board.Board;
import tic_tac_toe.board.Display;
import tic_tac_toe.board.Print1;
import tic_tac_toe.player.Player;
import tic_tac_toe.player.Players;

public class Game {
	Board board;
	int playersCount;
	Players playersList;
	Display displayType;
	int numberOfChances;
	int size;
	DrawRule drawRule;
	WinnerRule winnerRule;
	public Game(int s,int i,Display d,DrawRule r,WinnerRule w) {
		size=s;
		board=new Board(size);
		playersCount=i;
		playersList=new Players(playersCount);
		displayType=d;
		numberOfChances=0;
		drawRule=r;
		winnerRule=w;
	}
	
	
	public void startGame() {
		System.out.println("Start tic_tac_toe.game:-------------------" );
		
		boolean flag=true;
		int turn =0;
		while(flag) {
			
			Scanner scanner = new Scanner(System.in);
			if(turn==playersCount)turn =0;
			int j=turn+1;
			int m;
			int n;
			boolean set=false;
			while(!set) {
				board.print(displayType);	
				System.out.println("Enter player number "+ j+" place:--" );
				System.out.println("Enter player "+ j+" row from 0 till (not including) " + size+" :--" );
				m=scanner.nextInt();
				System.out.println("Enter player "+j +" column from 0 till (not including) " + size+" :--"  );
				n=scanner.nextInt();
				
				set=true;
				set=board.set(m,n,playersList.getPlayer(j).getPiece());
				if(!set)System.out.println("invalid position" );
//				board.print(d);//n
			}
//			System.out.println("hp"+turn);
			turn++;
			numberOfChances++;
//			flag=false;
			boolean winner=winnerRule.winner(board,size);
			boolean draw=drawRule.draw(numberOfChances, size);
			flag=!(draw|winner);
			if(winner) {
				board.print(displayType);
				System.out.println("Winner is :---- "+playersList.getPlayer(j).getName());
			}
			if(draw) {
				board.print(displayType);
			}
//			System.out.println("ho"+flag);
		}
		
	}
	
	
}
