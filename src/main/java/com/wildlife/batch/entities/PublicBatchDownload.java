package com.wildlife.batch.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the public_batch_downloads database table.
 * 
 */
@Entity
@Table(name="public_batch_downloads")
@NamedQuery(name="PublicBatchDownload.findAll", query="SELECT p FROM PublicBatchDownload p")
public class PublicBatchDownload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="additional_information")
	private String additionalInformation;

	@Column(name="error_message")
	private String errorMessage;

	@Column(name="expected_products")
	private String expectedProducts;

	@Column(name="filter_criteria")
	private String filterCriteria;

	@Column(name="finished_timestamp")
	private Timestamp finishedTimestamp;

	@Column(name="intended_use_of_data")
	private String intendedUseOfData;

	@Column(name="participant_id")
	private Integer participantId;

	@Column(name="requested_timestamp")
	private Timestamp requestedTimestamp;

	private String status;

	private String uuid;

	//bi-directional many-to-many association to Project
	@ManyToMany
	@JoinColumn(name="id")
	private List<Project> projects;

	public PublicBatchDownload() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdditionalInformation() {
		return this.additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getExpectedProducts() {
		return this.expectedProducts;
	}

	public void setExpectedProducts(String expectedProducts) {
		this.expectedProducts = expectedProducts;
	}

	public String getFilterCriteria() {
		return this.filterCriteria;
	}

	public void setFilterCriteria(String filterCriteria) {
		this.filterCriteria = filterCriteria;
	}

	public Timestamp getFinishedTimestamp() {
		return this.finishedTimestamp;
	}

	public void setFinishedTimestamp(Timestamp finishedTimestamp) {
		this.finishedTimestamp = finishedTimestamp;
	}

	public String getIntendedUseOfData() {
		return this.intendedUseOfData;
	}

	public void setIntendedUseOfData(String intendedUseOfData) {
		this.intendedUseOfData = intendedUseOfData;
	}

	public Integer getParticipantId() {
		return this.participantId;
	}

	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}

	public Timestamp getRequestedTimestamp() {
		return this.requestedTimestamp;
	}

	public void setRequestedTimestamp(Timestamp requestedTimestamp) {
		this.requestedTimestamp = requestedTimestamp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}