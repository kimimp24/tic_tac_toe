package tic_tac_toe.game;

public class DrawRuleImpl implements DrawRule{
	@Override
	public boolean draw(int numberOfChances, int size) {
		if(numberOfChances==(size*size)) {
//				System.out.println("hyt");
			System.out.println("It is a draw:---------------------------");
			
			return true;}

		return false;
	}
}
