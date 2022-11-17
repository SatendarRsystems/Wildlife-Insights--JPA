package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the deployment_groups_types database table.
 * 
 */
@Entity
@Table(name="deployment_groups_types")
@NamedQuery(name="DeploymentGroupsType.findAll", query="SELECT d FROM DeploymentGroupsType d")
public class DeploymentGroupsType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="type_name")
	private String typeName;

	public DeploymentGroupsType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}