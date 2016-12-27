package cn.edu.bjtu.weibo.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.Statement;

import cn.edu.bjtu.weibo.dao.LoginDAO;
import cn.edu.bjtu.weibo.service.LoginService;
/**
 * When user try to login weibo
 * @author Liu Jinfeng
 *
 */
public class LoginServiceImpl implements LoginService{
	/**
	 * 
	 * @param usename
	 * @param password
	 * @return
	 */
	public String getLoginUserId(String usename, String password){
    	LoginDAO dao = new LoginDAOImpl();
   
		return dao.getUserId(usename, password);
  }
  
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean isUserExisted(String username, String password){
		LoginDAO dao = new LoginDAOImpl();
		   
		if(dao.getUserId(username, password)==null){
			return false;
    	}else
    		return true;
		
		/*
		StringBuffer sql=new StringBuffer();
		sql.append("select Name from User where Name=? and Password=?");
		
		Connection conn= null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		DataSource ds=null;
		try {
			
			Context context=new InitialContext();
			
			ds=(DataSource)context.lookup("java:comp/env/sql");//需要改变数据库名
		    conn=ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stmt=conn.prepareStatement(sql.toString());
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs=stmt.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;*/
		
  }
  
  
}
