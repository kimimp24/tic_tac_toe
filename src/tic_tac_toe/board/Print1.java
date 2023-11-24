package tic_tac_toe.board;

public class Print1 implements Display {

	@Override
	public void print(char [][]board,int n) {
		// TODO Auto-generated method stub
		for(int j=0;j<n;j++) {
			System.out.print(" ___");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print("|");
			for(int j=0;j<n;j++) {
				System.out.print(" "+board[i][j]+" |");
			}
			System.out.println();
			for(int j=0;j<n;j++) {
				System.out.print("|___");
			}
			System.out.println("|");
		}
	}

}
