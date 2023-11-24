package tic_tac_toe.game;

import tic_tac_toe.board.Board;

public interface WinnerRule {
	public boolean winner(Board board,int size);
		
	
}
