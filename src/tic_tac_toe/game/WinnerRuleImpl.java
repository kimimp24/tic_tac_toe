package tic_tac_toe.game;

import tic_tac_toe.board.Board;

public class WinnerRuleImpl implements WinnerRule {

	@Override
	public boolean winner(Board board,int size) {
		// TODO Auto-generated method stub
		
			for(int i=1;i<size-1;i++) {
				for(int j=1;j<size-1;j++) {
					if(board.show(i, j)!=' '&&board.show(i, j)==board.show(i+1, j+1) && board.show(i, j)==board.show(i-1, j-1)) {
//						board.print(displayType);
//					System.out.println("heelo");
					
					return true;}
					if(board.show(i, j)!=' '&&board.show(i, j)==board.show(i-1, j+1) && board.show(i+1, j-1)==board.show(i, j)) {
//						board.print(displayType);
//					System.out.println("hello");
					
					return true;}
					if(board.show(i, j)!=' '&&board.show(i, j)==board.show(i-1, j) && board.show(i+1, j)==board.show(i, j)) {
//						board.print(displayType);
//					System.out.println("hlo");
					
					return true;}
					if(board.show(i, j)!=' '&&board.show(i, j)==board.show(i, j-1) && board.show(i, j+1)==board.show(i, j)) {
//						board.print(displayType);
//					System.out.println("heo");
					
					return true;}
				}
			}
		return false;
	}

}
