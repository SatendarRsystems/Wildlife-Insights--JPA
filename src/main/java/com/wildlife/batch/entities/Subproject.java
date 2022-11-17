package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the subprojects database table.
 * 
 */
@Entity
@Table(name="subprojects")
@NamedQuery(name="Subproject.findAll", query="SELECT s FROM Subproject s")
public class Subproject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String design;

	private String metadata;

	private String name;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Deployment
	@OneToMany(mappedBy="subproject")
	private List<Deployment> deployments;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	public Subproject() {
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

	public String getDesign() {
		return this.design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getMetadata() {
		return this.metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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
		deployment.setSubproject(this);

		return deployment;
	}

	public Deployment removeDeployment(Deployment deployment) {
		getDeployments().remove(deployment);
		deployment.setSubproject(null);

		return deployment;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}