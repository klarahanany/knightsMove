package Model;
import java.util.ArrayList;

public class Player {
	private String nickname;
	private int points;
	private Knight knight;
	private ArrayList<Game> gamesHistory;
	

	public Player(String nickname, Knight knight) {
		super();
		this.nickname = nickname;
		this.points = 0;
		this.knight = knight;
	}
	 
	

	public void addToGameHistory(Game game) {
		gamesHistory.add(game);
	}



	public String getNickname() {
		return nickname;
	}



	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}



	public Knight getKnight() {
		return knight;
	}



	public void setKnight(Knight knight) {
		this.knight = knight;
	}



	public ArrayList<Game> getGamesHistory() {
		return gamesHistory;
	}



	public void setGamesHistory(ArrayList<Game> gamesHistory) {
		this.gamesHistory = gamesHistory;
	}
	
}
