package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the bait_types database table.
 * 
 */
@Entity
@Table(name="bait_types")
@NamedQuery(name="BaitType.findAll", query="SELECT b FROM BaitType b")
public class BaitType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String description;

	private String schedule;

	private String scheme;

	@Column(name="type_name")
	private String typeName;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Deployment
	@OneToMany(mappedBy="baitType")
	private List<Deployment> deployments;

	public BaitType() {
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

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getScheme() {
		return this.scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Deployment> getDeployments() {
		return this.deployments;
	}

	public void setDeployments(List<Deployment> deployments) {
		this.deployments = deployments;
	}

	public Deployment addDeployment(Deployment deployment) {
		getDeployments().add(deployment);
		deployment.setBaitType(this);

		return deployment;
	}

	public Deployment removeDeployment(Deployment deployment) {
		getDeployments().remove(deployment);
		deployment.setBaitType(null);

		return deployment;
	}

}