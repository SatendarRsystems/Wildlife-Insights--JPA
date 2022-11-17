package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Array;
import java.util.List;


/**
 * The persistent class for the batch_downloads database table.
 * 
 */
@Entity
@Table(name="batch_downloads")
@NamedQuery(name="BatchDownload.findAll", query="SELECT b FROM BatchDownload b")
public class BatchDownload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="data_checksum")
	private String dataChecksum;

	@Column(name="error_message")
	private String errorMessage;

	@Column(name="finished_timestamp")
	private Timestamp finishedTimestamp;

	@Column(name="is_blank_image_excluded")
	private Boolean isBlankImageExcluded;

	@Column(name="is_human_image_excluded")
	private Boolean isHumanImageExcluded;

	@Column(name="is_identify_image_excluded")
	private Boolean isIdentifyImageExcluded;

	@Column(name="is_public")
	private Boolean isPublic;

	@Column(name="projects_in_download_bundle")
	private Integer projectsInDownloadBundle;

	@Column(name="requested_timestamp")
	private Timestamp requestedTimestamp;

	private String status;

	private String uuid;

	//bi-directional many-to-one association to Initiative
	@ManyToOne
	private Initiative initiative;

	//bi-directional many-to-one association to Organization
	@ManyToOne
	private Organization organization;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	//bi-directional many-to-one association to PublicDownloadRequest
	@OneToMany(mappedBy="batchDownload")
	private List<PublicDownloadRequest> publicDownloadRequests;

	public BatchDownload() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataChecksum() {
		return this.dataChecksum;
	}

	public void setDataChecksum(String dataChecksum) {
		this.dataChecksum = dataChecksum;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Timestamp getFinishedTimestamp() {
		return this.finishedTimestamp;
	}

	public void setFinishedTimestamp(Timestamp finishedTimestamp) {
		this.finishedTimestamp = finishedTimestamp;
	}

	public Boolean getIsBlankImageExcluded() {
		return this.isBlankImageExcluded;
	}

	public void setIsBlankImageExcluded(Boolean isBlankImageExcluded) {
		this.isBlankImageExcluded = isBlankImageExcluded;
	}

	public Boolean getIsHumanImageExcluded() {
		return this.isHumanImageExcluded;
	}

	public void setIsHumanImageExcluded(Boolean isHumanImageExcluded) {
		this.isHumanImageExcluded = isHumanImageExcluded;
	}

	public Boolean getIsIdentifyImageExcluded() {
		return this.isIdentifyImageExcluded;
	}

	public void setIsIdentifyImageExcluded(Boolean isIdentifyImageExcluded) {
		this.isIdentifyImageExcluded = isIdentifyImageExcluded;
	}

	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public Integer getProjectsInDownloadBundle() {
		return this.projectsInDownloadBundle;
	}

	public void setProjectsInDownloadBundle(Integer projectsInDownloadBundle) {
		this.projectsInDownloadBundle = projectsInDownloadBundle;
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

	public Initiative getInitiative() {
		return this.initiative;
	}

	public void setInitiative(Initiative initiative) {
		this.initiative = initiative;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<PublicDownloadRequest> getPublicDownloadRequests() {
		return this.publicDownloadRequests;
	}

	public void setPublicDownloadRequests(List<PublicDownloadRequest> publicDownloadRequests) {
		this.publicDownloadRequests = publicDownloadRequests;
	}

	public PublicDownloadRequest addPublicDownloadRequest(PublicDownloadRequest publicDownloadRequest) {
		getPublicDownloadRequests().add(publicDownloadRequest);
		publicDownloadRequest.setBatchDownload(this);

		return publicDownloadRequest;
	}

	public PublicDownloadRequest removePublicDownloadRequest(PublicDownloadRequest publicDownloadRequest) {
		getPublicDownloadRequests().remove(publicDownloadRequest);
		publicDownloadRequest.setBatchDownload(null);

		return publicDownloadRequest;
	}

}