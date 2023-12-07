package com.corenuts.odiw.players;


public class HtmlStadiumClirt {
	public static void main(String[] args) {
		StadiumDetailsVo chinnaswamy = new StadiumDetailsVo();
		chinnaswamy.setStadiumName("sap");
		chinnaswamy.setCapacity(40000);
		chinnaswamy.setFloodLights("t");
		chinnaswamy.setLocation("Bangalore");
		chinnaswamy.setStadiumId(128);
		chinnaswamy.setOpened(1996);
		chinnaswamy.setCurator("kumar");
		chinnaswamy.setKnowsAs("ksca");
//		System.out.println(chinnaswamy.getstadiumName());
//		System.out.println(chinnaswamy.getCapacity()); 
//		System.out.println(chinnaswamy.getCurator());
//		System.out.println(chinnaswamy.getFloodLights());
//		System.out.println(chinnaswamy.getLocation());
//		System.out.println(chinnaswamy.getKnowsAs());
//		System.out.println(chinnaswamy.getOpened());
//		System.out.println(chinnaswamy.getStadiumId());
								
		StadiumDetailsDao StadiumDetailsDao=new StadiumDetailsDao();
		StadiumDetailsDao.createStadiumDetails(chinnaswamy);
		
		
	}

}
