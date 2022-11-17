package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the roles database table.
 * 
 */
@Entity
@Table(name="roles")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String name;

	private String slug;

	@Column(name="super_admin")
	private Boolean superAdmin;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to InitiativeParticipantPivot
	@OneToMany(mappedBy="role")
	private List<InitiativeParticipantPivot> initiativeParticipantPivots;

	//bi-directional many-to-one association to OrganizationParticipantPivot
	@OneToMany(mappedBy="role")
	private List<OrganizationParticipantPivot> organizationParticipantPivots;

	//bi-directional many-to-one association to ParticipantTypeProjectPivot
	@OneToMany(mappedBy="role")
	private List<ParticipantTypeProjectPivot> participantTypeProjectPivots;

	//bi-directional many-to-one association to Participant
	@OneToMany(mappedBy="role")
	private List<Participant> participants;

	//bi-directional many-to-one association to RoleChange
	@OneToMany(mappedBy="role")
	private List<RoleChange> roleChanges;

	//bi-directional many-to-one association to RolesPermissionsPermission
	@OneToMany(mappedBy="role")
	private List<RolesPermissionsPermission> rolesPermissionsPermissions;

	public Role() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Boolean getSuperAdmin() {
		return this.superAdmin;
	}

	public void setSuperAdmin(Boolean superAdmin) {
		this.superAdmin = superAdmin;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<InitiativeParticipantPivot> getInitiativeParticipantPivots() {
		return this.initiativeParticipantPivots;
	}

	public void setInitiativeParticipantPivots(List<InitiativeParticipantPivot> initiativeParticipantPivots) {
		this.initiativeParticipantPivots = initiativeParticipantPivots;
	}

	public InitiativeParticipantPivot addInitiativeParticipantPivot(InitiativeParticipantPivot initiativeParticipantPivot) {
		getInitiativeParticipantPivots().add(initiativeParticipantPivot);
		initiativeParticipantPivot.setRole(this);

		return initiativeParticipantPivot;
	}

	public InitiativeParticipantPivot removeInitiativeParticipantPivot(InitiativeParticipantPivot initiativeParticipantPivot) {
		getInitiativeParticipantPivots().remove(initiativeParticipantPivot);
		initiativeParticipantPivot.setRole(null);

		return initiativeParticipantPivot;
	}

	public List<OrganizationParticipantPivot> getOrganizationParticipantPivots() {
		return this.organizationParticipantPivots;
	}

	public void setOrganizationParticipantPivots(List<OrganizationParticipantPivot> organizationParticipantPivots) {
		this.organizationParticipantPivots = organizationParticipantPivots;
	}

	public OrganizationParticipantPivot addOrganizationParticipantPivot(OrganizationParticipantPivot organizationParticipantPivot) {
		getOrganizationParticipantPivots().add(organizationParticipantPivot);
		organizationParticipantPivot.setRole(this);

		return organizationParticipantPivot;
	}

	public OrganizationParticipantPivot removeOrganizationParticipantPivot(OrganizationParticipantPivot organizationParticipantPivot) {
		getOrganizationParticipantPivots().remove(organizationParticipantPivot);
		organizationParticipantPivot.setRole(null);

		return organizationParticipantPivot;
	}

	public List<ParticipantTypeProjectPivot> getParticipantTypeProjectPivots() {
		return this.participantTypeProjectPivots;
	}

	public void setParticipantTypeProjectPivots(List<ParticipantTypeProjectPivot> participantTypeProjectPivots) {
		this.participantTypeProjectPivots = participantTypeProjectPivots;
	}

	public ParticipantTypeProjectPivot addParticipantTypeProjectPivot(ParticipantTypeProjectPivot participantTypeProjectPivot) {
		getParticipantTypeProjectPivots().add(participantTypeProjectPivot);
		participantTypeProjectPivot.setRole(this);

		return participantTypeProjectPivot;
	}

	public ParticipantTypeProjectPivot removeParticipantTypeProjectPivot(ParticipantTypeProjectPivot participantTypeProjectPivot) {
		getParticipantTypeProjectPivots().remove(participantTypeProjectPivot);
		participantTypeProjectPivot.setRole(null);

		return participantTypeProjectPivot;
	}

	public List<Participant> getParticipants() {
		return this.participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public Participant addParticipant(Participant participant) {
		getParticipants().add(participant);
		participant.setRole(this);

		return participant;
	}

	public Participant removeParticipant(Participant participant) {
		getParticipants().remove(participant);
		participant.setRole(null);

		return participant;
	}

	public List<RoleChange> getRoleChanges() {
		return this.roleChanges;
	}

	public void setRoleChanges(List<RoleChange> roleChanges) {
		this.roleChanges = roleChanges;
	}

	public RoleChange addRoleChange(RoleChange roleChange) {
		getRoleChanges().add(roleChange);
		roleChange.setRole(this);

		return roleChange;
	}

	public RoleChange removeRoleChange(RoleChange roleChange) {
		getRoleChanges().remove(roleChange);
		roleChange.setRole(null);

		return roleChange;
	}

	public List<RolesPermissionsPermission> getRolesPermissionsPermissions() {
		return this.rolesPermissionsPermissions;
	}

	public void setRolesPermissionsPermissions(List<RolesPermissionsPermission> rolesPermissionsPermissions) {
		this.rolesPermissionsPermissions = rolesPermissionsPermissions;
	}

	public RolesPermissionsPermission addRolesPermissionsPermission(RolesPermissionsPermission rolesPermissionsPermission) {
		getRolesPermissionsPermissions().add(rolesPermissionsPermission);
		rolesPermissionsPermission.setRole(this);

		return rolesPermissionsPermission;
	}

	public RolesPermissionsPermission removeRolesPermissionsPermission(RolesPermissionsPermission rolesPermissionsPermission) {
		getRolesPermissionsPermissions().remove(rolesPermissionsPermission);
		rolesPermissionsPermission.setRole(null);

		return rolesPermissionsPermission;
	}

}