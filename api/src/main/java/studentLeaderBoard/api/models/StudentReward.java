package studentLeaderBoard.api.models;

import java.sql.Date;

public class StudentReward {
	private int id;
	private int userId;
	private int rewardId;
	private Date date;
	private String notes;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getRewardId() {
		return rewardId;
	}
	
	public void setTaskId(int rewardId) {
		this.rewardId = rewardId;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
