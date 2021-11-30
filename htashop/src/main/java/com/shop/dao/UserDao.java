package com.shop.dao;

import static utils.ConnectionUtil.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.vo.User;
import com.shop.vo.Customer;

import utils.ConnectionUtil;

public class CustomerDao {
	
	public void updateCustomer(Customer customer)throws SQLException{
		
		String sql = "update SHOP_CUSTOMER "
				   + "set "
				   + "CUSTOMER_NAME = ?, "
				   + "CUSTOMER_PASSWORD = ?, "
				   + "CUSTOMER_BIRTHDAY = ?, "
				   + "CUSTOMER_TEL = ?, "
				   + "CUSTOMER_ADDRESS = ?, "
				   + "CUSTOMER_EMAIL = ? "
				   + "where customer_no = ? ";
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setString(1, customer.getCustomerName());
		pstmt.setString(2, customer.getCustomerPassword());
		pstmt.setString(3, customer.getCustomerTel());
		pstmt.setString(4, customer.getCustomerAddress());
		pstmt.setString(5, customer.getCustomerEmail());
		pstmt.setString(6, customer.getCustomerBirthday().toString());
		pstmt.setInt(7, customer.getCustomerNo());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
		
	}
	

}


public class UserDao {

   /**
    * 모든 사용자 정보를 반환한다.
    * @return 사용자 정보 리스트
    * @throws SQLException
    */
   public List<User> getAllUsers() throws SQLException {
      String sql = "select USER_NO, USER_TYPE, USER_ID, USER_PASSWORD, USER_EMAIL, USER_NAME, "
            + "USER_BIRTHDAY, USER_TEL, USER_GENDER, USER_ADDRESS, "
            + "USER_CREATED_DATE, USER_POINT, USER_IN_OUT, USER_GRADE "
            + "from shop_user ";
      
      Connection connection = getConnection();
      PreparedStatement pstmt = connection.prepareStatement(sql);
      ResultSet rs = pstmt.executeQuery();
      
      List<User> userList = new ArrayList<User>();
      
      while (rs.next()) {
         User user = rowToUser(rs);
         
         userList.add(user);
      }
      
      rs.close();
      pstmt.close();
      connection.close();
      
      return userList;
   }

   
   /**
    * 지정된 아이디에 해당하는 사용자 정보를 반환한다.
    * 해당 아이디로 가입한 사용자가 없는 경우 null이 반환될 수 있다.
    * @param id 아이디
    * @return 사용자 정보
    * @throws SQLException
    */
   public User getUserById(String id) throws SQLException {
      User user = null;
      
      String sql = "select USER_NO, USER_TYPE, USER_ID, USER_PASSWORD, USER_EMAIL, USER_NAME, "
            + "USER_BIRTHDAY, USER_TEL, USER_GENDER, USER_ADDRESS, "
            + "USER_CREATED_DATE, USER_POINT, USER_IN_OUT, USER_GRADE "
            + "from shop_user "
            + "where USER_ID = ? ";
      
      Connection connection = getConnection();
      PreparedStatement pstmt = connection.prepareStatement(sql);
      pstmt.setString(1, id);
      ResultSet rs = pstmt.executeQuery();
      
      if (rs.next()) {
         user = rowToUser(rs);
      }
      
      rs.close();
      pstmt.close();
      connection.close();
      
      return user;
   }
   
   
   /**
    * 지정된 이메일 주소에 해당하는 사용자 정보를 반환한다.
    * 해당 이메일로 가입한 사용자가 없는 경우 null이 반환될 수 있다.
    * @param email 이메일
    * @return 사용자 정보
    * @throws SQLException
    */
   public User getUserByPassword(String email) throws SQLException {
      User user = null;
      
      String sql = "select USER_NO, USER_TYPE, USER_ID, USER_PASSWORD, USER_EMAIL, USER_NAME, "
            + "USER_BIRTHDAY, USER_TEL, USER_GENDER, USER_ADDRESS, "
            + "USER_CREATED_DATE, USER_POINT, USER_IN_OUT, USER_GRADE "
            + "from shop_user "
            + "where USER_EMAIL = ? ";
      
      Connection connection = getConnection();
      PreparedStatement pstmt = connection.prepareStatement(sql);
      pstmt.setString(1, email);
      ResultSet rs = pstmt.executeQuery();
      
      if (rs.next()) {
         user = rowToUser(rs);
      }
      
      rs.close();
      pstmt.close();
      connection.close();
      
      return user;
   }
   
   /**
    * 지정된 유저번호에 해당하는 사용자 정보를 반환한다.
    * @param no 유저번호
    * @return 사용자 정보
    * @throws SQLException
    */
   public User getUserByNo(int no) throws SQLException {
	  String sql = "select USER_NO, USER_TYPE, USER_ID, USER_PASSWORD, USER_EMAIL, USER_NAME, "
	             + "USER_BIRTHDAY, USER_TEL, USER_GENDER, USER_ADDRESS, "
	             + "USER_CREATED_DATE, USER_POINT, USER_IN_OUT, USER_GRADE "
	             + "from shop_user "
	             + "where USER_NO = ? ";
	   
	  User user = null;
	  
	  Connection connection = getConnection();
      PreparedStatement pstmt = connection.prepareStatement(sql);
	  pstmt.setInt(1, no);
	  ResultSet rs = pstmt.executeQuery();
	  
	  if (rs.next()) {
		  user = rowToUser(rs);
	  }
	  
      rs.close();
      pstmt.close();
      connection.close();
      
	  return user;
   }
   
  
  
  
  
   private User rowToUser(ResultSet rs) throws SQLException {
      User user = new User();
      user.setUserNo(rs.getInt("USER_NO"));
      user.setUserType(rs.getString("USER_TYPE"));
      user.setId(rs.getString("USER_ID"));
      user.setPassword(rs.getString("USER_PASSWORD"));
      user.setEmail(rs.getString("USER_EMAIL"));
      user.setName(rs.getString("USER_NAME"));
      user.setBirthday(rs.getDate("USER_BIRTHDAY"));
      user.setTel(rs.getString("USER_TEL"));
      user.setGender(rs.getString("USER_GENDER"));
      user.setAddress(rs.getString("USER_ADDRESS"));
      user.setCreatedDate(rs.getDate("USER_CREATED_DATE"));
      user.setPoint(rs.getInt("USER_POINT"));
      user.setInOut(rs.getString("USER_IN_OUT"));
      user.setGrade(rs.getString("USER_GRADE"));
      return user;
   }
   
}
