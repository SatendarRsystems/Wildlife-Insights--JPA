package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the paired_deployments database table.
 * 
 */
@Entity
@Table(name="paired_deployments")
@NamedQuery(name="PairedDeployment.findAll", query="SELECT p FROM PairedDeployment p")
public class PairedDeployment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	private String name;

	private String remarks;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	//bi-directional many-to-one association to Deployment
	@OneToMany(mappedBy="pairedDeployment")
	private List<Deployment> deployments;

	public PairedDeployment() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Deployment> getDeployments() {
		return this.deployments;
	}

	public void setDeployments(List<Deployment> deployments) {
		this.deployments = deployments;
	}

	public Deployment addDeployment(Deployment deployment) {
		getDeployments().add(deployment);
		deployment.setPairedDeployment(this);

		return deployment;
	}

	public Deployment removeDeployment(Deployment deployment) {
		getDeployments().remove(deployment);
		deployment.setPairedDeployment(null);

		return deployment;
	}

}