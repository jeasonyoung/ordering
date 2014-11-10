package org.ipower.aware;
/**
 * 用户信息接口。
 * @author yangyong.
 * @since 2014-05-15.
 */
public interface IUserAware {
	/**
	 * 设置用户ID。
	 * @param userId
	 * 用户ID。
	 */
	void setUserId(String userId);
	/**
	 * 设置用户名称。
	 * @param userName
	 * 用户名称。
	 */
	void setUserName(String userName);
}