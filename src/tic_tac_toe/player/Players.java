package tic_tac_toe.player;

import java.util.HashMap;
import java.util.Scanner;

public class Players {
	Player players[];
	int numberOfPlayers;
	HashMap<Character,Player>mp=new HashMap<>();
	public Players(int n){
		players=new Player[n];
		numberOfPlayers=n;
		setPlayer();
	}
	public void setPlayer() {
		for(int i=0;i<numberOfPlayers;i++) {
			char c=' ';
			String s;
			Scanner scanner = new Scanner(System.in);
			int j=i+1;
			boolean set=false;
			
			System.out.println("Enter player number "+ j+" :--" );
			System.out.println("Enter player "+ j+" name:--" );
			s=scanner.nextLine();
			while(!set) {
				System.out.println("Enter player "+j +" piece:--" );
				c=scanner.next().charAt(0);
				set=true;
				if(mp.containsKey(c)) {
					set=false;
					System.out.println("Invalid piece Enter again ");
				}
				
				
			}
			
			Player p=new Player(c,s);
			mp.put(c, p);
			players[i]=p;			
		}
	}
	public Player getPlayer(int j) {
		// TODO Auto-generated method stub
		
		if(j>numberOfPlayers&& j==0)
		return null;
		else return players[j-1];
	}
}
