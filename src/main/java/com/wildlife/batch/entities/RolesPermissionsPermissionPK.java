package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the roles_permissions_permissions database table.
 * 
 */
@Embeddable
public class RolesPermissionsPermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"rolesid\"", insertable=false, updatable=false)
	private Integer rolesId;

	@Column(name="\"permissionsid\"", insertable=false, updatable=false)
	private Integer permissionsId;

	public RolesPermissionsPermissionPK() {
	}
	public Integer getRolesId() {
		return this.rolesId;
	}
	public void setRolesId(Integer rolesId) {
		this.rolesId = rolesId;
	}
	public Integer getPermissionsId() {
		return this.permissionsId;
	}
	public void setPermissionsId(Integer permissionsId) {
		this.permissionsId = permissionsId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolesPermissionsPermissionPK)) {
			return false;
		}
		RolesPermissionsPermissionPK castOther = (RolesPermissionsPermissionPK)other;
		return 
			this.rolesId.equals(castOther.rolesId)
			&& this.permissionsId.equals(castOther.permissionsId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rolesId.hashCode();
		hash = hash * prime + this.permissionsId.hashCode();
		
		return hash;
	}
}