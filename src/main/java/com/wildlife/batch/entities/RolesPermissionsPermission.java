package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the roles_permissions_permissions database table.
 * 
 */
@Entity
@Table(name="roles_permissions_permissions")
@NamedQuery(name="RolesPermissionsPermission.findAll", query="SELECT r FROM RolesPermissionsPermission r")
public class RolesPermissionsPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolesPermissionsPermissionPK id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Permission
	@ManyToOne
	@JoinColumn(name="\"permissionsId\"")
	private Permission permission;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="\"rolesId\"")
	private Role role;

	public RolesPermissionsPermission() {
	}

	public RolesPermissionsPermissionPK getId() {
		return this.id;
	}

	public void setId(RolesPermissionsPermissionPK id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}