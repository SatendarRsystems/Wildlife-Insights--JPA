package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the initiatives database table.
 * 
 */
@Entity
@Table(name="initiatives")
@NamedQuery(name="Initiative.findAll", query="SELECT i FROM Initiative i")
public class Initiative implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="contact_content")
	private String contactContent;

	@Column(name="contact_email")
	private String contactEmail;

	private String content;

	@Column(name="\"coverImage\"")
	private String coverImage;

	private String description;

	private String introduction;

	@Column(name="is_location_public")
	private Boolean isLocationPublic;

	private String logo;

	private String name;

	private String purpose;

	private String remarks;

	@Column(name="video_url")
	private String videoUrl;

	//bi-directional many-to-one association to BatchDownload
	@OneToMany(mappedBy="initiative")
	private List<BatchDownload> batchDownloads;

	//bi-directional many-to-one association to InitiativeParticipantPivot
	@OneToMany(mappedBy="initiative")
	private List<InitiativeParticipantPivot> initiativeParticipantPivots;

	//bi-directional many-to-one association to Organization
	@ManyToOne
	@JoinColumn(name="owner_organizations_id")
	private Organization organization;

	//bi-directional many-to-one association to Logo
	@OneToMany(mappedBy="initiative")
	private List<Logo> logos;

	//bi-directional many-to-many association to Organization
	//@ManyToMany(mappedBy="initiatives2")
	//TO DO Satendar
	//private List<Organization> organizations;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="initiative")
	private List<Photo> photos;

	//bi-directional many-to-one association to Project
	//@OneToMany(mappedBy="initiative")
	//TO DO Satendar
	//private List<Project> projects1;

	//bi-directional many-to-many association to Project
	//@ManyToMany(mappedBy="initiatives")
	//TO DO Satendar
	//private List<Project> projects2;

	//bi-directional many-to-one association to RoleChange
	@OneToMany(mappedBy="initiative")
	private List<RoleChange> roleChanges;

	public Initiative() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContactContent() {
		return this.contactContent;
	}

	public void setContactContent(String contactContent) {
		this.contactContent = contactContent;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCoverImage() {
		return this.coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Boolean getIsLocationPublic() {
		return this.isLocationPublic;
	}

	public void setIsLocationPublic(Boolean isLocationPublic) {
		this.isLocationPublic = isLocationPublic;
	}

	public String
	getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public List<BatchDownload> getBatchDownloads() {
		return this.batchDownloads;
	}

	public void setBatchDownloads(List<BatchDownload> batchDownloads) {
		this.batchDownloads = batchDownloads;
	}

	public BatchDownload addBatchDownload(BatchDownload batchDownload) {
		getBatchDownloads().add(batchDownload);
		batchDownload.setInitiative(this);

		return batchDownload;
	}

	public BatchDownload removeBatchDownload(BatchDownload batchDownload) {
		getBatchDownloads().remove(batchDownload);
		batchDownload.setInitiative(null);

		return batchDownload;
	}

	public List<InitiativeParticipantPivot> getInitiativeParticipantPivots() {
		return this.initiativeParticipantPivots;
	}

	public void setInitiativeParticipantPivots(List<InitiativeParticipantPivot> initiativeParticipantPivots) {
		this.initiativeParticipantPivots = initiativeParticipantPivots;
	}

	public InitiativeParticipantPivot addInitiativeParticipantPivot(InitiativeParticipantPivot initiativeParticipantPivot) {
		getInitiativeParticipantPivots().add(initiativeParticipantPivot);
		initiativeParticipantPivot.setInitiative(this);

		return initiativeParticipantPivot;
	}

	public InitiativeParticipantPivot removeInitiativeParticipantPivot(InitiativeParticipantPivot initiativeParticipantPivot) {
		getInitiativeParticipantPivots().remove(initiativeParticipantPivot);
		initiativeParticipantPivot.setInitiative(null);

		return initiativeParticipantPivot;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<Logo> getLogos() {
		return this.logos;
	}

	public void setLogos(List<Logo> logos) {
		this.logos = logos;
	}

	public Logo addLogo(Logo logo) {
		getLogos().add(logo);
		logo.setInitiative(this);

		return logo;
	}

	public Logo removeLogo(Logo logo) {
		getLogos().remove(logo);
		logo.setInitiative(null);

		return logo;
	}

	/*
	 * public List<Organization> getOrganizations() { return this.organizations; }
	 * 
	 * public void setOrganizations(List<Organization> organizations) {
	 * this.organizations = organizations; }
	 */

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Photo addPhoto(Photo photo) {
		getPhotos().add(photo);
		photo.setInitiative(this);

		return photo;
	}

	public Photo removePhoto(Photo photo) {
		getPhotos().remove(photo);
		photo.setInitiative(null);

		return photo;
	}

	/*
	 * public List<Project> getProjects1() { return this.projects1; }
	 * 
	 * public void setProjects1(List<Project> projects1) { this.projects1 =
	 * projects1; }
	 * 
	 * public Project addProjects1(Project projects1) {
	 * getProjects1().add(projects1); //projects1.setInitiative(this); //TO DO
	 * Satendar
	 * 
	 * return projects1; }
	 * 
	 * public Project removeProjects1(Project projects1) {
	 * getProjects1().remove(projects1); //projects1.setInitiative(null); //TO DO
	 * Satendar return projects1; }
	 * 
	 * public List<Project> getProjects2() { return this.projects2; }
	 * 
	 * public void setProjects2(List<Project> projects2) { this.projects2 =
	 * projects2; }
	 */
	public List<RoleChange> getRoleChanges() {
		return this.roleChanges;
	}

	public void setRoleChanges(List<RoleChange> roleChanges) {
		this.roleChanges = roleChanges;
	}

	public RoleChange addRoleChange(RoleChange roleChange) {
		getRoleChanges().add(roleChange);
		roleChange.setInitiative(this);

		return roleChange;
	}

	public RoleChange removeRoleChange(RoleChange roleChange) {
		getRoleChanges().remove(roleChange);
		roleChange.setInitiative(null);

		return roleChange;
	}

}