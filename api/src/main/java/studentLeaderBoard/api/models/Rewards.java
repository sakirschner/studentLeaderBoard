package studentLeaderBoard.api.models;

public class Rewards {
	
	private int id;
	private String reward;
	private String description;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getReward() {
		return reward;
	}
	
	public void setReward(String reward) {
		this.reward = reward;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}