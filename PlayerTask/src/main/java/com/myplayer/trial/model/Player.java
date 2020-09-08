package com.myplayer.trial.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	private int playerId;
	private String playerName;
	private String playerTeam;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	public Player(int playerId, String playerName, String playerTeam) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerTeam = playerTeam;
	}
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerTeam=" + playerTeam + "]";
	}
	
	
}
