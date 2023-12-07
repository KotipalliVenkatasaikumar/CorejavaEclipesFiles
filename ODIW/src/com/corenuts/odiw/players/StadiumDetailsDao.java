package com.corenuts.odiw.players;

import java.sql.*;
//import java.PrepareStatement;

public class StadiumDetailsDao implements StadiumDetailsInterface {

	@Override
	public void createStadiumDetails(StadiumDetailsVo stadiumVo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		try {
			System.out.println("111");
			Class.forName("com.mysql.jdbc.Driver"); // 1.register or load driver class
			System.out.println("222");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root"); // 2. establish the
																								// connection
			System.out.println("33");
			ps = con.prepareStatement("insert into ipl.stadiumtdetails values (?,?,?,?,?,?,?,?)"); // 3. establish the
																									// statement
			ps.setInt(1, stadiumVo.getStadiumId());
			ps.setString(2, stadiumVo.getstadiumName());
			ps.setString(3, stadiumVo.getLocation());
			ps.setInt(4, stadiumVo.getCapacity());
			ps.setInt(5, stadiumVo.getOpened());
			ps.setString(6, stadiumVo.getKnowsAs());
			ps.setString(7, stadiumVo.getFloodLights());
			ps.setString(8, stadiumVo.getCurator());

			System.out.println("444444");
			int i = ps.executeUpdate(); // 4. execute the statement
			if (i > 0) {

				System.out.println("success");
			} else {
				System.out.println("faill");
			}
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("88888888888" + e.getMessage());

		} finally {
			try {
				ps.close();
				con.close(); // 5. connection closing
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

//		System.out.println("StadiumDetailsDao==== "+stadiumVo.getstadiumName());

	}

	@Override
	public StadiumDetailsVo[] getStadiumDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}

//	@Override
//	public StadiumDetailsVo[] getStadiumDetails() {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		try {
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//			PreparedStatement ps= con.prepareStatement("select * from ipl.stadiumtdetails"); 
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
//				String stadiumId1 =rs.getString("id");
//				System.out.println(stadiumId1);
//				String stadiumName1 =rs.getString("name");
//				System.out.println(stadiumName1);
//				String location =rs.getString("loc");
//				System.out.println(location);
//				String capacity1 =rs.getString("capacity");
//				System.out.println(capacity1);
//				String opened =rs.getString("open");
//				System.out.println(opened);
//				String knowsAs1 =rs.getString("known");
//				System.out.println(knowsAs1);
//				String 
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return null;
