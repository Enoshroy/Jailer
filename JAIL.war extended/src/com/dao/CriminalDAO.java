package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Db.DbConnection;
import com.dto.Criminal;
import com.dto.Food;
import com.dto.FoodItems;





public class CriminalDAO {
	public Criminal login(String username, String khadhino) {
		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String query = "select * from jail where name=? and khadhino=?";

		try {
			pst = con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, khadhino);
			//
			rs = pst.executeQuery();

			if (rs.next()) {

				
				Criminal cr = new Criminal();

				
				cr.setName(rs.getString("name"));
				
				cr.setCrime(rs.getString("crime"));
			 
				cr.setDateofrealse(rs.getInt(3));
				cr.setPunishmentperiod(rs.getInt(4));
				
				cr.setKhadhino(rs.getString("Khadhino"));

				return cr;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public List<Criminal> getAllEmployees() {

		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String query = "select * from jail";

		try {
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();

			List<Criminal> crlist = new ArrayList<Criminal>();

			while (rs.next()) {

                 Criminal cr = new Criminal();

				cr.setName(rs.getString("Name"));
				
				cr.setCrime(rs.getString(2));
			 
				cr.setDateofrealse(rs.getInt(3));
				cr.setPunishmentperiod(rs.getInt(4));
				
				cr.setKhadhino(rs.getString(5));

				crlist.add(cr);
			}

			return crlist;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return null;
	}

	

	public  Criminal getCriminalById(String khadhino) {

		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String query = "select * from jail where khadhino=?";

		try {
			pst = con.prepareStatement(query);
			pst.setString(1, khadhino);

			rs = pst.executeQuery();

			if (rs.next()) {
            
				Criminal cr = new Criminal();
				cr.setName(rs.getString("name"));
				
				cr.setCrime(rs.getString(2));
			 
				cr.setDateofrealse(rs.getInt(3));
				cr.setPunishmentperiod(rs.getInt(4));
				
				cr.setKhadhino(rs.getString(5));

				return cr;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public int UpdateEmployee(Criminal cr) {
		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;
		
		String query = "update jail set name=?,crime=?,dateofrealse=?,punishmentperiod=? where khadhino=?";
		
		try {
			pst = con.prepareStatement(query);
			
			
      		pst.setString(1, cr.getName());
      		pst.setString(2, cr.getCrime());
			pst.setInt(3,cr.getDateofrealse());
			pst.setInt(4,cr.getPunishmentperiod());
			
			pst.setString(5, cr.getKhadhino());
			
			
			int result = pst.executeUpdate();			
			return result;		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		return 0;
	}

	public int deleteCriminal(String khadhino) {
		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;
				
		String query = "delete from jail where khadhino=?";
		
		try {
			pst = con.prepareStatement(query);
			pst.setString(1, khadhino);
			
			int result = pst.executeUpdate();			
			return result;	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}

	public List<FoodItems> getAllfoodList() {
		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String query = "select * from fooditems";

		try {
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();

			List<FoodItems> foodlist = new ArrayList<FoodItems>();

			while (rs.next()) {

                FoodItems fi = new FoodItems();

                fi.setFoodnames(rs.getString(1));
				fi.setItemno(rs.getInt(2));
		

			foodlist.add(fi);
			}

			return foodlist;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return null;
	}

	
		
		public  Criminal getCriminalByNamr(String name) {

			Connection con = DbConnection.getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;

			String query = "select * from jail where name=?";

			try {
				pst = con.prepareStatement(query);
				pst.setString(1, name);

				rs = pst.executeQuery();

				if (rs.next()) {
	            
					Criminal cr = new Criminal();
					cr.setName(rs.getString("name"));
					
					cr.setCrime(rs.getString(2));
				 
					cr.setDateofrealse(rs.getInt(3));
					cr.setPunishmentperiod(rs.getInt(4));
					
					cr.setKhadhino(rs.getString(5));

					return cr;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			finally {

				try {
					rs.close();
					pst.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return null;
		}

		public int register(FoodItems ft) {

		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;

		String query = "insert into fooditems values (?, ?)";

		try {
			pst = con.prepareStatement(query);

			
			pst.setString(1, ft.getFoodnames());
			pst.setInt(2, ft.getItemno());
			
			int result = pst.executeUpdate();
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

		public FoodItems AddtoCart(int fooditem) {
			Connection con = DbConnection.getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;

			String query = "select * from fooditems where itemno=?";

			try {
				pst = con.prepareStatement(query);
				
				pst.setInt(1, fooditem);
				
				rs = pst.executeQuery();

				if (rs.next()) {

					
					FoodItems ft = new FoodItems();
                	ft.setFoodnames(rs.getString(1));
				   ft.setItemno(rs.getInt(2));

					return ft;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			finally {

				try {
					rs.close();
					pst.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return null;
		}

		public int InsertfoodList(Food f) {
			

				Connection con = DbConnection.getConnection();
				PreparedStatement pst = null;

				String query = "insert into food values (?)";

				try {
					pst = con.prepareStatement(query);

					
					pst.setString(1, f.getFoodnames());
					
					
					int result = pst.executeUpdate();
					return result;

				} catch (SQLException e) {
					e.printStackTrace();
				}

				return 0;
			}

		public List<Food> getAllFood() {
			Connection con = DbConnection.getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;

			String query = "select * from food";

			try {
				pst = con.prepareStatement(query);
				rs = pst.executeQuery();

				List<Food> foodlist = new ArrayList<Food>();

				while (rs.next()) {

	                Food fi = new Food();

	                fi.setFoodnames(rs.getString(1));
					
			

				foodlist.add(fi);
				}

				return foodlist;

			} catch (SQLException e) {
				e.printStackTrace();
			}

			finally {

				try {
					rs.close();
					pst.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

			return null;
		}

		public int register(Criminal emp) {
			Connection con = DbConnection.getConnection();
			PreparedStatement pst = null;

			String query = "insert into jail values (?, ?, ?, ?, ?)";

			try {
				pst = con.prepareStatement(query);

				pst.setString(1, emp.getName());
				pst.setString(2, emp.getCrime());
				pst.setInt(3, emp.getDateofrealse());
				pst.setInt(4, emp.getPunishmentperiod());
				pst.setString(5, emp.getKhadhino());
				

				int result = pst.executeUpdate();
				return result;

			} catch (SQLException e) {
				e.printStackTrace();
			}

			return 0;
		}


	}	
	

