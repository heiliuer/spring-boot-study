/**
 * @package : com.vince.model
 * @date : 2015年1月20日
 * @author : vince
 * @version : 0.9
 */
package com.heiliuer.reservetion.entity;

import javax.persistence.*;

/**
 * @describe :

 *            :
 * @return :
 */
@Entity(name = "experimenttable")
public class ExperimentTable {
	private int id;
	private String tablename;// 实验台名称

	private UserInfo admin;// 实验台管理员

	@Id
	@GeneratedValue
	@Column(name = "tId")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "tTableName")
	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	@ManyToOne
	@JoinColumn(name = "tAdminId")
	public UserInfo getAdmin() {
		return admin;
	}

	public void setAdmin(UserInfo admin) {
		this.admin = admin;
	}

}
