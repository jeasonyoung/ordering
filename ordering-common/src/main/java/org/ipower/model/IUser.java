package org.ipower.model;

import org.ipower.aware.IUserAware;

/**
 * 当前用户接口。
 * @author yangyong.
 * @since 2014-07-16.
 */
public interface IUser extends IUserAware {
	/**
	 * 获取用户ID。
	 * @return 用户ID。
	 */
	String getUserId();
	/**
	 * 获取用户名称。
	 * @return 用户名称。
	 */
	String getUserName();
}