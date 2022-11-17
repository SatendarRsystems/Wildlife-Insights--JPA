package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the users_acl_cache database table.
 * 
 */
@Entity
@Table(name="users_acl_cache")
@NamedQuery(name="UsersAclCache.findAll", query="SELECT u FROM UsersAclCache u")
public class UsersAclCache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer userId;

	private String acl;

	@Column(name="last_changed")
	private Timestamp lastChanged;

	//bi-directional one-to-one association to Participant
	@OneToOne
	@JoinColumn(name="user_id")
	private Participant participant;

	public UsersAclCache() {
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAcl() {
		return this.acl;
	}

	public void setAcl(String acl) {
		this.acl = acl;
	}

	public Timestamp getLastChanged() {
		return this.lastChanged;
	}

	public void setLastChanged(Timestamp lastChanged) {
		this.lastChanged = lastChanged;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

}