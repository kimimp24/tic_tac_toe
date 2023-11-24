package tic_tac_toe.board;

public class Board {
	int size;
	char board[][];

	public Board(int i){
		size=i;
		board=new char[size][size];
		for(int j=0;j<size;j++) {
			for(int k=0;k<size;k++) {
				board[j][k]=' ';
			}
		}
	}
	public boolean set(int i,int j,char c) {
		if(i>=0 && i<size && j>=0 && j<size) {
		if(board[i][j]!=' ') {System.out.println("not allowed");return false;}
		
		board[i][j]=c;
		return true;}
		else {System.out.println("not allowed");return false;}
	}
	public void print(Display p) {

		p.print(board,size);
	}
	public char show(int i,int j) {
		if(i<size && i>=0 && j<size && j>=0)
		return board[i][j];
		return ' ';
	}
}
