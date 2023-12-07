package com.corenuts.odiw.players;

public interface StadiumDetailsInterface {
//	abstract void createStadiumDetails(int stadiumId,String StadiumName,String location,int capacity,
//			int opened,String knownAs,boolean floodLight,String curator);  
//	abstract void deleteStadiumDetails(int stadiumId);
	abstract void createStadiumDetails(StadiumDetailsVo stadiumVo);

	abstract StadiumDetailsVo[] getStadiumDetails();
}
