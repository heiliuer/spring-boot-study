/**
 * @package : com.vince.model
 * @date : 2015年4月10日
 * @author : vince
 * @version : 0.9
 */
package com.heiliuer.reservetion.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @describe :

 *            :
 * @return :
 */
@Entity(name="position")
public class Position {
	private int id;// 主键
	private String name;// 职位名称
	
	private Department department;// 职位所属部门
	private Set<UserInfo> users = new HashSet<UserInfo>();
	@Id
	@GeneratedValue
	@Column(name="pId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="pName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	@JoinColumn(name="pDepartmentId")
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@OneToMany(mappedBy="position")
	public Set<UserInfo> getUsers() {
		return users;
	}
	public void setUsers(Set<UserInfo> users) {
		this.users = users;
	}

	
}
