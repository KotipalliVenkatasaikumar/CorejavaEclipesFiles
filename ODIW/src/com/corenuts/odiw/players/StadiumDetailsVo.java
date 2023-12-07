package com.corenuts.odiw.players;

public class StadiumDetailsVo {
	private int stadiumId;
	private String stadiumName;
	private String location;
	private int capacity;
	private int opened;
	private String knowsAs;
	private String floodLights;
	private String curator;
	private String status;

//     stadiumId=1;
//     stadiumName="sai";

//     stadiumId=htmlId;

	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}

	public int getStadiumId() {
		return stadiumId;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getstadiumName() {
		return stadiumName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setOpened(int opened) {
		this.opened = opened;
	}

	public int getOpened() {
		return opened;
	}

	public void setKnowsAs(String knowsAs) {
		this.knowsAs = knowsAs;
	}

	public String getKnowsAs() {
		return knowsAs;
	}

	public void setFloodLights(String floodLights) {
		this.floodLights = floodLights;
	}

	public String getFloodLights() {
		return floodLights;
	}

	public void setCurator(String curator) {
		this.curator = curator;
	}

	public String getCurator() {
		return curator;
	}

}
