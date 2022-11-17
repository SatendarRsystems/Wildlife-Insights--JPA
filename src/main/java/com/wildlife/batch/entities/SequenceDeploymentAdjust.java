package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sequence_deployment_adjust database table.
 * 
 */
@Entity
@Table(name="sequence_deployment_adjust")
@NamedQuery(name="SequenceDeploymentAdjust.findAll", query="SELECT s FROM SequenceDeploymentAdjust s")
public class SequenceDeploymentAdjust implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="in_process")
	private Boolean inProcess;

	//bi-directional many-to-one association to Deployment
	@ManyToOne
	private Deployment deployment;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	public SequenceDeploymentAdjust() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getInProcess() {
		return this.inProcess;
	}

	public void setInProcess(Boolean inProcess) {
		this.inProcess = inProcess;
	}

	public Deployment getDeployment() {
		return this.deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}