package org.slsale.service.user;

import org.slsale.pojo.user.User;

public interface UserService {
	/**
	 * �û���¼
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(User user)throws Exception;
	
	/**
	 * �û�ע��
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int addUser(User user)throws Exception;
}
