package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the participants database table.
 * 
 */
@Entity
@Table(name="participants")
@NamedQuery(name="Participant.findAll", query="SELECT p FROM Participant p")
public class Participant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="activate_token")
	private String activateToken;

	private Boolean active;

	@Column(name="age_verification")
	private String ageVerification;

	@Column(name="app_version")
	private String appVersion;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private Boolean logged;

	@Column(name="os_name")
	private String osName;

	@Column(name="os_version")
	private String osVersion;

	private String password;

	private String phone;

	@Column(name="postal_code")
	private String postalCode;

	@Column(name="recover_token")
	private String recoverToken;

	@Column(name="refresh_token")
	private String refreshToken;

	private String remarks;

	private String state;

	@Column(name="street_address")
	private String streetAddress;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="use_common_names")
	private Boolean useCommonNames;

	private Boolean whitelisted;

	//bi-directional many-to-one association to BatchDownload
	@OneToMany(mappedBy="participant")
	private List<BatchDownload> batchDownloads;

	//bi-directional many-to-one association to BatchUpload
	@OneToMany(mappedBy="participant")
	private List<BatchUpload> batchUploads;

	//bi-directional many-to-one association to DataFile
	@OneToMany(mappedBy="participant")
	private List<DataFile> dataFiles;

	//bi-directional many-to-one association to DataProviderNotification
	@OneToMany(mappedBy="participant")
	private List<DataProviderNotification> dataProviderNotifications;

	//bi-directional many-to-one association to Deployment
	@OneToMany(mappedBy="participant1")
	private List<Deployment> deployments1;

	//bi-directional many-to-one association to Deployment
	@OneToMany(mappedBy="participant2")
	private List<Deployment> deployments2;

	//bi-directional many-to-one association to IdentificationOutput
	@OneToMany(mappedBy="participant")
	private List<IdentificationOutput> identificationOutputs;

	//bi-directional many-to-one association to InitiativeParticipantPivot
	@OneToMany(mappedBy="participant")
	private List<InitiativeParticipantPivot> initiativeParticipantPivots;

	//bi-directional many-to-one association to OrganizationParticipantPivot
	@OneToMany(mappedBy="participant")
	private List<OrganizationParticipantPivot> organizationParticipantPivots;

	//bi-directional many-to-one association to ParticipantTypeProjectPivot
	@OneToMany(mappedBy="participant")
	private List<ParticipantTypeProjectPivot> participantTypeProjectPivots;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	//bi-directional many-to-one association to Provider
	@OneToMany(mappedBy="participant")
	private List<Provider> providers;

	//bi-directional many-to-one association to PublicBatchDownload
	//@OneToMany(mappedBy="participant")
	//TO DO Satendar
	//private List<PublicBatchDownload> publicBatchDownloads;

	//bi-directional many-to-one association to RoleChange
	@OneToMany(mappedBy="participant1")
	private List<RoleChange> roleChanges1;

	//bi-directional many-to-one association to RoleChange
	@OneToMany(mappedBy="participant2")
	private List<RoleChange> roleChanges2;

	//bi-directional many-to-one association to SensitiveSpeciesAccessNotification
	@OneToMany(mappedBy="participant")
	private List<SensitiveSpeciesAccessNotification> sensitiveSpeciesAccessNotifications;

	//bi-directional many-to-one association to SequenceIdentificationOutput
	@OneToMany(mappedBy="participant")
	private List<SequenceIdentificationOutput> sequenceIdentificationOutputs;

	//bi-directional one-to-one association to UsersAclCache
	@OneToOne(mappedBy="participant")
	private UsersAclCache usersAclCache;

	public Participant() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivateToken() {
		return this.activateToken;
	}

	public void setActivateToken(String activateToken) {
		this.activateToken = activateToken;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getAgeVerification() {
		return this.ageVerification;
	}

	public void setAgeVerification(String ageVerification) {
		this.ageVerification = ageVerification;
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getLogged() {
		return this.logged;
	}

	public void setLogged(Boolean logged) {
		this.logged = logged;
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getRecoverToken() {
		return this.recoverToken;
	}

	public void setRecoverToken(String recoverToken) {
		this.recoverToken = recoverToken;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getUseCommonNames() {
		return this.useCommonNames;
	}

	public void setUseCommonNames(Boolean useCommonNames) {
		this.useCommonNames = useCommonNames;
	}

	public Boolean getWhitelisted() {
		return this.whitelisted;
	}

	public void setWhitelisted(Boolean whitelisted) {
		this.whitelisted = whitelisted;
	}

	public List<BatchDownload> getBatchDownloads() {
		return this.batchDownloads;
	}

	public void setBatchDownloads(List<BatchDownload> batchDownloads) {
		this.batchDownloads = batchDownloads;
	}

	public BatchDownload addBatchDownload(BatchDownload batchDownload) {
		getBatchDownloads().add(batchDownload);
		batchDownload.setParticipant(this);

		return batchDownload;
	}

	public BatchDownload removeBatchDownload(BatchDownload batchDownload) {
		getBatchDownloads().remove(batchDownload);
		batchDownload.setParticipant(null);

		return batchDownload;
	}

	public List<BatchUpload> getBatchUploads() {
		return this.batchUploads;
	}

	public void setBatchUploads(List<BatchUpload> batchUploads) {
		this.batchUploads = batchUploads;
	}

	public BatchUpload addBatchUpload(BatchUpload batchUpload) {
		getBatchUploads().add(batchUpload);
		batchUpload.setParticipant(this);

		return batchUpload;
	}

	public BatchUpload removeBatchUpload(BatchUpload batchUpload) {
		getBatchUploads().remove(batchUpload);
		batchUpload.setParticipant(null);

		return batchUpload;
	}

	public List<DataFile> getDataFiles() {
		return this.dataFiles;
	}

	public void setDataFiles(List<DataFile> dataFiles) {
		this.dataFiles = dataFiles;
	}

	public DataFile addDataFile(DataFile dataFile) {
		getDataFiles().add(dataFile);
		dataFile.setParticipant(this);

		return dataFile;
	}

	public DataFile removeDataFile(DataFile dataFile) {
		getDataFiles().remove(dataFile);
		dataFile.setParticipant(null);

		return dataFile;
	}

	public List<DataProviderNotification> getDataProviderNotifications() {
		return this.dataProviderNotifications;
	}

	public void setDataProviderNotifications(List<DataProviderNotification> dataProviderNotifications) {
		this.dataProviderNotifications = dataProviderNotifications;
	}

	public DataProviderNotification addDataProviderNotification(DataProviderNotification dataProviderNotification) {
		getDataProviderNotifications().add(dataProviderNotification);
		dataProviderNotification.setParticipant(this);

		return dataProviderNotification;
	}

	public DataProviderNotification removeDataProviderNotification(DataProviderNotification dataProviderNotification) {
		getDataProviderNotifications().remove(dataProviderNotification);
		dataProviderNotification.setParticipant(null);

		return dataProviderNotification;
	}

	public List<Deployment> getDeployments1() {
		return this.deployments1;
	}

	public void setDeployments1(List<Deployment> deployments1) {
		this.deployments1 = deployments1;
	}

	public Deployment addDeployments1(Deployment deployments1) {
		getDeployments1().add(deployments1);
		deployments1.setParticipant1(this);

		return deployments1;
	}

	public Deployment removeDeployments1(Deployment deployments1) {
		getDeployments1().remove(deployments1);
		deployments1.setParticipant1(null);

		return deployments1;
	}

	public List<Deployment> getDeployments2() {
		return this.deployments2;
	}

	public void setDeployments2(List<Deployment> deployments2) {
		this.deployments2 = deployments2;
	}

	public Deployment addDeployments2(Deployment deployments2) {
		getDeployments2().add(deployments2);
		deployments2.setParticipant2(this);

		return deployments2;
	}

	public Deployment removeDeployments2(Deployment deployments2) {
		getDeployments2().remove(deployments2);
		deployments2.setParticipant2(null);

		return deployments2;
	}

	public List<IdentificationOutput> getIdentificationOutputs() {
		return this.identificationOutputs;
	}

	public void setIdentificationOutputs(List<IdentificationOutput> identificationOutputs) {
		this.identificationOutputs = identificationOutputs;
	}

	public IdentificationOutput addIdentificationOutput(IdentificationOutput identificationOutput) {
		getIdentificationOutputs().add(identificationOutput);
		identificationOutput.setParticipant(this);

		return identificationOutput;
	}

	public IdentificationOutput removeIdentificationOutput(IdentificationOutput identificationOutput) {
		getIdentificationOutputs().remove(identificationOutput);
		identificationOutput.setParticipant(null);

		return identificationOutput;
	}

	public List<InitiativeParticipantPivot> getInitiativeParticipantPivots() {
		return this.initiativeParticipantPivots;
	}

	public void setInitiativeParticipantPivots(List<InitiativeParticipantPivot> initiativeParticipantPivots) {
		this.initiativeParticipantPivots = initiativeParticipantPivots;
	}

	public InitiativeParticipantPivot addInitiativeParticipantPivot(InitiativeParticipantPivot initiativeParticipantPivot) {
		getInitiativeParticipantPivots().add(initiativeParticipantPivot);
		initiativeParticipantPivot.setParticipant(this);

		return initiativeParticipantPivot;
	}

	public InitiativeParticipantPivot removeInitiativeParticipantPivot(InitiativeParticipantPivot initiativeParticipantPivot) {
		getInitiativeParticipantPivots().remove(initiativeParticipantPivot);
		initiativeParticipantPivot.setParticipant(null);

		return initiativeParticipantPivot;
	}

	public List<OrganizationParticipantPivot> getOrganizationParticipantPivots() {
		return this.organizationParticipantPivots;
	}

	public void setOrganizationParticipantPivots(List<OrganizationParticipantPivot> organizationParticipantPivots) {
		this.organizationParticipantPivots = organizationParticipantPivots;
	}

	public OrganizationParticipantPivot addOrganizationParticipantPivot(OrganizationParticipantPivot organizationParticipantPivot) {
		getOrganizationParticipantPivots().add(organizationParticipantPivot);
		organizationParticipantPivot.setParticipant(this);

		return organizationParticipantPivot;
	}

	public OrganizationParticipantPivot removeOrganizationParticipantPivot(OrganizationParticipantPivot organizationParticipantPivot) {
		getOrganizationParticipantPivots().remove(organizationParticipantPivot);
		organizationParticipantPivot.setParticipant(null);

		return organizationParticipantPivot;
	}

	public List<ParticipantTypeProjectPivot> getParticipantTypeProjectPivots() {
		return this.participantTypeProjectPivots;
	}

	public void setParticipantTypeProjectPivots(List<ParticipantTypeProjectPivot> participantTypeProjectPivots) {
		this.participantTypeProjectPivots = participantTypeProjectPivots;
	}

	public ParticipantTypeProjectPivot addParticipantTypeProjectPivot(ParticipantTypeProjectPivot participantTypeProjectPivot) {
		getParticipantTypeProjectPivots().add(participantTypeProjectPivot);
		participantTypeProjectPivot.setParticipant(this);

		return participantTypeProjectPivot;
	}

	public ParticipantTypeProjectPivot removeParticipantTypeProjectPivot(ParticipantTypeProjectPivot participantTypeProjectPivot) {
		getParticipantTypeProjectPivots().remove(participantTypeProjectPivot);
		participantTypeProjectPivot.setParticipant(null);

		return participantTypeProjectPivot;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Provider> getProviders() {
		return this.providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public Provider addProvider(Provider provider) {
		getProviders().add(provider);
		provider.setParticipant(this);

		return provider;
	}

	public Provider removeProvider(Provider provider) {
		getProviders().remove(provider);
		provider.setParticipant(null);

		return provider;
	}

	/*
	 * public List<PublicBatchDownload> getPublicBatchDownloads() { return
	 * this.publicBatchDownloads; }
	 * 
	 * public void setPublicBatchDownloads(List<PublicBatchDownload>
	 * publicBatchDownloads) { this.publicBatchDownloads = publicBatchDownloads; }
	 */

	/*
	 * public PublicBatchDownload addPublicBatchDownload(PublicBatchDownload
	 * publicBatchDownload) { getPublicBatchDownloads().add(publicBatchDownload);
	 * //publicBatchDownload.setParticipant(this); //TODO Satendar
	 * 
	 * return publicBatchDownload; }
	 * 
	 * public PublicBatchDownload removePublicBatchDownload(PublicBatchDownload
	 * publicBatchDownload) { getPublicBatchDownloads().remove(publicBatchDownload);
	 * //publicBatchDownload.setParticipant(null); //TODO Satendar
	 * 
	 * return publicBatchDownload; }
	 */

	public List<RoleChange> getRoleChanges1() {
		return this.roleChanges1;
	}

	public void setRoleChanges1(List<RoleChange> roleChanges1) {
		this.roleChanges1 = roleChanges1;
	}

	public RoleChange addRoleChanges1(RoleChange roleChanges1) {
		getRoleChanges1().add(roleChanges1);
		roleChanges1.setParticipant1(this);

		return roleChanges1;
	}

	public RoleChange removeRoleChanges1(RoleChange roleChanges1) {
		getRoleChanges1().remove(roleChanges1);
		roleChanges1.setParticipant1(null);

		return roleChanges1;
	}

	public List<RoleChange> getRoleChanges2() {
		return this.roleChanges2;
	}

	public void setRoleChanges2(List<RoleChange> roleChanges2) {
		this.roleChanges2 = roleChanges2;
	}

	public RoleChange addRoleChanges2(RoleChange roleChanges2) {
		getRoleChanges2().add(roleChanges2);
		roleChanges2.setParticipant2(this);

		return roleChanges2;
	}

	public RoleChange removeRoleChanges2(RoleChange roleChanges2) {
		getRoleChanges2().remove(roleChanges2);
		roleChanges2.setParticipant2(null);

		return roleChanges2;
	}

	public List<SensitiveSpeciesAccessNotification> getSensitiveSpeciesAccessNotifications() {
		return this.sensitiveSpeciesAccessNotifications;
	}

	public void setSensitiveSpeciesAccessNotifications(List<SensitiveSpeciesAccessNotification> sensitiveSpeciesAccessNotifications) {
		this.sensitiveSpeciesAccessNotifications = sensitiveSpeciesAccessNotifications;
	}

	public SensitiveSpeciesAccessNotification addSensitiveSpeciesAccessNotification(SensitiveSpeciesAccessNotification sensitiveSpeciesAccessNotification) {
		getSensitiveSpeciesAccessNotifications().add(sensitiveSpeciesAccessNotification);
		sensitiveSpeciesAccessNotification.setParticipant(this);

		return sensitiveSpeciesAccessNotification;
	}

	public SensitiveSpeciesAccessNotification removeSensitiveSpeciesAccessNotification(SensitiveSpeciesAccessNotification sensitiveSpeciesAccessNotification) {
		getSensitiveSpeciesAccessNotifications().remove(sensitiveSpeciesAccessNotification);
		sensitiveSpeciesAccessNotification.setParticipant(null);

		return sensitiveSpeciesAccessNotification;
	}

	public List<SequenceIdentificationOutput> getSequenceIdentificationOutputs() {
		return this.sequenceIdentificationOutputs;
	}

	public void setSequenceIdentificationOutputs(List<SequenceIdentificationOutput> sequenceIdentificationOutputs) {
		this.sequenceIdentificationOutputs = sequenceIdentificationOutputs;
	}

	public SequenceIdentificationOutput addSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		getSequenceIdentificationOutputs().add(sequenceIdentificationOutput);
		sequenceIdentificationOutput.setParticipant(this);

		return sequenceIdentificationOutput;
	}

	public SequenceIdentificationOutput removeSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		getSequenceIdentificationOutputs().remove(sequenceIdentificationOutput);
		sequenceIdentificationOutput.setParticipant(null);

		return sequenceIdentificationOutput;
	}

	public UsersAclCache getUsersAclCache() {
		return this.usersAclCache;
	}

	public void setUsersAclCache(UsersAclCache usersAclCache) {
		this.usersAclCache = usersAclCache;
	}

}