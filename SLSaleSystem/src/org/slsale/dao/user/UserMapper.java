package org.slsale.dao.user;

import org.slsale.pojo.user.User;

public interface UserMapper {
	/**
	 * ��¼
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(User user)throws Exception;
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int addUser(User user)throws Exception;
}
