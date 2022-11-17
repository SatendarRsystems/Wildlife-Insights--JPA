package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the permissions database table.
 * 
 */
@Entity
@Table(name="permissions")
@NamedQuery(name="Permission.findAll", query="SELECT p FROM Permission p")
public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String description;

	private String name;

	private String slug;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to RolesPermissionsPermission
	@OneToMany(mappedBy="permission")
	private List<RolesPermissionsPermission> rolesPermissionsPermissions;

	public Permission() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<RolesPermissionsPermission> getRolesPermissionsPermissions() {
		return this.rolesPermissionsPermissions;
	}

	public void setRolesPermissionsPermissions(List<RolesPermissionsPermission> rolesPermissionsPermissions) {
		this.rolesPermissionsPermissions = rolesPermissionsPermissions;
	}

	public RolesPermissionsPermission addRolesPermissionsPermission(RolesPermissionsPermission rolesPermissionsPermission) {
		getRolesPermissionsPermissions().add(rolesPermissionsPermission);
		rolesPermissionsPermission.setPermission(this);

		return rolesPermissionsPermission;
	}

	public RolesPermissionsPermission removeRolesPermissionsPermission(RolesPermissionsPermission rolesPermissionsPermission) {
		getRolesPermissionsPermissions().remove(rolesPermissionsPermission);
		rolesPermissionsPermission.setPermission(null);

		return rolesPermissionsPermission;
	}

}