package com.ipl.model;

public class player {

	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	private int playerNumber;
	private String playerName;
	private int runs;
	public player(int playerNumber, String playerName, int runs) {
		super();
		this.playerNumber = playerNumber;
		this.playerName = playerName;
		this.runs = runs;
	}
	public player() {
		super();
	}
	@Override
	public String toString() {
		return "playerNumber=" + playerNumber + ", playerName=" + playerName + ", runs=" + runs ;
	}
	
}
