package cn.edu.bjtu.weibo.service.impl;

/**
 * When user try to login weibo
 * @author Liu Jinfeng
 *
 */
public interface LoginServiceImpl implements LoginService{
	/**
	 * 
	 * @param usename
	 * @param password
	 * @return
	 */
	String getLoginUserId(String usename, String password){
    return null;
  }
  
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	boolean isUserExisted(String username, String password){
    return true;
  }
}
