package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the data_files database table.
 * 
 */
@Entity
@Table(name="data_files")
@NamedQuery(name="DataFile.findAll", query="SELECT d FROM DataFile d")
public class DataFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="bounding_boxes")
	private String boundingBoxes;

	@Column(name="can_delete")
	private Boolean canDelete;

	@Column(name="client_id")
	private String clientId;

	@Column(name="\"createdAt\"")
	private Timestamp createdAt;

	@Column(name="data_file_id")
	private String dataFileId;

	private String filename;

	private String filepath;

	private String filesize;

	@Column(name="has_bounding_box")
	private Boolean hasBoundingBox;

	@Column(name="has_preview_image")
	private Boolean hasPreviewImage;

	private Boolean highlighted;

	@Column(name="human_identified")
	private Boolean humanIdentified;

	@Column(name="identified_by_expert")
	private Boolean identifiedByExpert;

	@Column(name="image_status")
	private String imageStatus;

	@Column(name="\"lastModified\"")
	private Timestamp lastModified;

	@Column(name="latest_identification_outputs_id")
	private Integer latestIdentificationOutputsId;

	private String metadata;

	@Column(name="original_location_url")
	private String originalLocationUrl;

	@Column(name="sequence_id")
	private Integer sequenceId;

	@Column(name="sequence_name")
	private String sequenceName;

	private String status;

	private Boolean test;

	@Column(name="thumbnail_url")
	private String thumbnailUrl;

	private Timestamp timestamp;

	@Column(name="timestamp_updated")
	private Boolean timestampUpdated;

	//bi-directional many-to-one association to DataFileAnnotation
	@OneToMany(mappedBy="dataFile")
	private List<DataFileAnnotation> dataFileAnnotations;

	//bi-directional many-to-one association to DataFileMetavalue
	@OneToMany(mappedBy="dataFile")
	private List<DataFileMetavalue> dataFileMetavalues;

	//bi-directional many-to-one association to DataFileSequencePivot
	@OneToMany(mappedBy="dataFile")
	private List<DataFileSequencePivot> dataFileSequencePivots;

	//bi-directional many-to-one association to Deployment
	@ManyToOne
	private Deployment deployment;

	//bi-directional many-to-one association to MediaType
	@ManyToOne
	@JoinColumn(name="media_types_id")
	private MediaType mediaType;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	//bi-directional many-to-one association to ExifDataFilePivot
	@OneToMany(mappedBy="dataFile")
	private List<ExifDataFilePivot> exifDataFilePivots;

	//bi-directional many-to-one association to IdentificationOutput
	@OneToMany(mappedBy="dataFile")
	private List<IdentificationOutput> identificationOutputs;

	//bi-directional one-to-one association to SequenceRawIdentification
	@OneToOne(mappedBy="dataFile")
	private SequenceRawIdentification sequenceRawIdentification;

	public DataFile() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBoundingBoxes() {
		return this.boundingBoxes;
	}

	public void setBoundingBoxes(String boundingBoxes) {
		this.boundingBoxes = boundingBoxes;
	}

	public Boolean getCanDelete() {
		return this.canDelete;
	}

	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDataFileId() {
		return this.dataFileId;
	}

	public void setDataFileId(String dataFileId) {
		this.dataFileId = dataFileId;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFilesize() {
		return this.filesize;
	}

	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}

	public Boolean getHasBoundingBox() {
		return this.hasBoundingBox;
	}

	public void setHasBoundingBox(Boolean hasBoundingBox) {
		this.hasBoundingBox = hasBoundingBox;
	}

	public Boolean getHasPreviewImage() {
		return this.hasPreviewImage;
	}

	public void setHasPreviewImage(Boolean hasPreviewImage) {
		this.hasPreviewImage = hasPreviewImage;
	}

	public Boolean getHighlighted() {
		return this.highlighted;
	}

	public void setHighlighted(Boolean highlighted) {
		this.highlighted = highlighted;
	}

	public Boolean getHumanIdentified() {
		return this.humanIdentified;
	}

	public void setHumanIdentified(Boolean humanIdentified) {
		this.humanIdentified = humanIdentified;
	}

	public Boolean getIdentifiedByExpert() {
		return this.identifiedByExpert;
	}

	public void setIdentifiedByExpert(Boolean identifiedByExpert) {
		this.identifiedByExpert = identifiedByExpert;
	}

	public String getImageStatus() {
		return this.imageStatus;
	}

	public void setImageStatus(String imageStatus) {
		this.imageStatus = imageStatus;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public Integer getLatestIdentificationOutputsId() {
		return this.latestIdentificationOutputsId;
	}

	public void setLatestIdentificationOutputsId(Integer latestIdentificationOutputsId) {
		this.latestIdentificationOutputsId = latestIdentificationOutputsId;
	}

	public String getMetadata() {
		return this.metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getOriginalLocationUrl() {
		return this.originalLocationUrl;
	}

	public void setOriginalLocationUrl(String originalLocationUrl) {
		this.originalLocationUrl = originalLocationUrl;
	}

	public Integer getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getSequenceName() {
		return this.sequenceName;
	}

	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getTest() {
		return this.test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getTimestampUpdated() {
		return this.timestampUpdated;
	}

	public void setTimestampUpdated(Boolean timestampUpdated) {
		this.timestampUpdated = timestampUpdated;
	}

	public List<DataFileAnnotation> getDataFileAnnotations() {
		return this.dataFileAnnotations;
	}

	public void setDataFileAnnotations(List<DataFileAnnotation> dataFileAnnotations) {
		this.dataFileAnnotations = dataFileAnnotations;
	}

	public DataFileAnnotation addDataFileAnnotation(DataFileAnnotation dataFileAnnotation) {
		getDataFileAnnotations().add(dataFileAnnotation);
		dataFileAnnotation.setDataFile(this);

		return dataFileAnnotation;
	}

	public DataFileAnnotation removeDataFileAnnotation(DataFileAnnotation dataFileAnnotation) {
		getDataFileAnnotations().remove(dataFileAnnotation);
		dataFileAnnotation.setDataFile(null);

		return dataFileAnnotation;
	}

	public List<DataFileMetavalue> getDataFileMetavalues() {
		return this.dataFileMetavalues;
	}

	public void setDataFileMetavalues(List<DataFileMetavalue> dataFileMetavalues) {
		this.dataFileMetavalues = dataFileMetavalues;
	}

	public DataFileMetavalue addDataFileMetavalue(DataFileMetavalue dataFileMetavalue) {
		getDataFileMetavalues().add(dataFileMetavalue);
		dataFileMetavalue.setDataFile(this);

		return dataFileMetavalue;
	}

	public DataFileMetavalue removeDataFileMetavalue(DataFileMetavalue dataFileMetavalue) {
		getDataFileMetavalues().remove(dataFileMetavalue);
		dataFileMetavalue.setDataFile(null);

		return dataFileMetavalue;
	}

	public List<DataFileSequencePivot> getDataFileSequencePivots() {
		return this.dataFileSequencePivots;
	}

	public void setDataFileSequencePivots(List<DataFileSequencePivot> dataFileSequencePivots) {
		this.dataFileSequencePivots = dataFileSequencePivots;
	}

	public DataFileSequencePivot addDataFileSequencePivot(DataFileSequencePivot dataFileSequencePivot) {
		getDataFileSequencePivots().add(dataFileSequencePivot);
		dataFileSequencePivot.setDataFile(this);

		return dataFileSequencePivot;
	}

	public DataFileSequencePivot removeDataFileSequencePivot(DataFileSequencePivot dataFileSequencePivot) {
		getDataFileSequencePivots().remove(dataFileSequencePivot);
		dataFileSequencePivot.setDataFile(null);

		return dataFileSequencePivot;
	}

	public Deployment getDeployment() {
		return this.deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	public MediaType getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public List<ExifDataFilePivot> getExifDataFilePivots() {
		return this.exifDataFilePivots;
	}

	public void setExifDataFilePivots(List<ExifDataFilePivot> exifDataFilePivots) {
		this.exifDataFilePivots = exifDataFilePivots;
	}

	public ExifDataFilePivot addExifDataFilePivot(ExifDataFilePivot exifDataFilePivot) {
		getExifDataFilePivots().add(exifDataFilePivot);
		exifDataFilePivot.setDataFile(this);

		return exifDataFilePivot;
	}

	public ExifDataFilePivot removeExifDataFilePivot(ExifDataFilePivot exifDataFilePivot) {
		getExifDataFilePivots().remove(exifDataFilePivot);
		exifDataFilePivot.setDataFile(null);

		return exifDataFilePivot;
	}

	public List<IdentificationOutput> getIdentificationOutputs() {
		return this.identificationOutputs;
	}

	public void setIdentificationOutputs(List<IdentificationOutput> identificationOutputs) {
		this.identificationOutputs = identificationOutputs;
	}

	public IdentificationOutput addIdentificationOutput(IdentificationOutput identificationOutput) {
		getIdentificationOutputs().add(identificationOutput);
		identificationOutput.setDataFile(this);

		return identificationOutput;
	}

	public IdentificationOutput removeIdentificationOutput(IdentificationOutput identificationOutput) {
		getIdentificationOutputs().remove(identificationOutput);
		identificationOutput.setDataFile(null);

		return identificationOutput;
	}

	public SequenceRawIdentification getSequenceRawIdentification() {
		return this.sequenceRawIdentification;
	}

	public void setSequenceRawIdentification(SequenceRawIdentification sequenceRawIdentification) {
		this.sequenceRawIdentification = sequenceRawIdentification;
	}

}