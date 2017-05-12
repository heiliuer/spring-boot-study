/**
 * @package : com.vince.model
 * @date : 2015年1月14日
 * @author : vince
 * @version : 0.9
 */
package com.heiliuer.reservetion.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @describe : 预约传输信息模型

 *            :
 * @return :
 */
@Entity(name="reservation")
public class Reservation {
	
	private int id;
	private Date applydatetime;
	private Date auditordatetime;//管理员处理申请的时间
	private Date datetime;
	private short execute;
	private short pass;
	private String refusalreason;

	private ExperimentTable table;
	private UserInfo user;

	@Id
	@GeneratedValue
	@Column(name = "rId")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "rApplyDateTime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getApplydatetime() {
		return applydatetime;
	}

	public void setApplydatetime(Date applydatetime) {
		this.applydatetime = applydatetime;
	}

	@Column(name = "rAuditorDateTime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAuditordatetime() {
		return auditordatetime;
	}

	public void setAuditordatetime(Date auditordatetime) {
		this.auditordatetime = auditordatetime;
	}

	@Column(name = "rDateTime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	@Column(name = "rExecute")
	public short getExecute() {
		return execute;
	}

	public void setExecute(short execute) {
		this.execute = execute;
	}

	@Column(name = "rPass")
	public short getPass() {
		return pass;
	}

	public void setPass(short pass) {
		this.pass = pass;
	}

	@Column(name = "rRefusalReason")
	public String getRefusalreason() {
		return refusalreason;
	}

	public void setRefusalreason(String refusalreason) {
		this.refusalreason = refusalreason;
	}

	@ManyToOne
	@JoinColumn(name = "rTableId")
	public ExperimentTable getTable() {
		return table;
	}

	public void setTable(ExperimentTable table) {
		this.table = table;
	}

	@ManyToOne
	@JoinColumn(name = "rUserId")
	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

}
