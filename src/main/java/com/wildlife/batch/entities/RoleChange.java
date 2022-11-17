package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the role_changes database table.
 * 
 */
@Entity
@Table(name="role_changes")
@NamedQuery(name="RoleChange.findAll", query="SELECT r FROM RoleChange r")
public class RoleChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="activation_token")
	private String activationToken;

	@Column(name="change_timestamp")
	private Timestamp changeTimestamp;

	@Column(name="change_type")
	private String changeType;

	private String email;

	private String status;

	//bi-directional many-to-one association to Initiative
	@ManyToOne
	@JoinColumn(name="initiatives_id")
	private Initiative initiative;

	//bi-directional many-to-one association to Organization
	@ManyToOne
	@JoinColumn(name="organizations_id")
	private Organization organization;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	@JoinColumn(name="invitation_initiator_id")
	private Participant participant1;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	@JoinColumn(name="participants_id")
	private Participant participant2;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="projects_id")
	private Project project;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	public RoleChange() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivationToken() {
		return this.activationToken;
	}

	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	public Timestamp getChangeTimestamp() {
		return this.changeTimestamp;
	}

	public void setChangeTimestamp(Timestamp changeTimestamp) {
		this.changeTimestamp = changeTimestamp;
	}

	public String getChangeType() {
		return this.changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Initiative getInitiative() {
		return this.initiative;
	}

	public void setInitiative(Initiative initiative) {
		this.initiative = initiative;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Participant getParticipant1() {
		return this.participant1;
	}

	public void setParticipant1(Participant participant1) {
		this.participant1 = participant1;
	}

	public Participant getParticipant2() {
		return this.participant2;
	}

	public void setParticipant2(Participant participant2) {
		this.participant2 = participant2;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}