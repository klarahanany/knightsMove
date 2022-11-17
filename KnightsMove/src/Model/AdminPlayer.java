package Model;

public class AdminPlayer extends Player {
	private String password;

	public AdminPlayer(String nickname, Knight knight, String password) {
		super(nickname, knight);
		this.password = password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}
	

}
