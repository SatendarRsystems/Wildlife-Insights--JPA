package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the public_download_requests database table.
 * 
 */
@Entity
@Table(name="public_download_requests")
@NamedQuery(name="PublicDownloadRequest.findAll", query="SELECT p FROM PublicDownloadRequest p")
public class PublicDownloadRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="downloaded_timestamp")
	private Timestamp downloadedTimestamp;

	private String email;

	private String name;

	private String organization;

	//bi-directional many-to-one association to BatchDownload
	@ManyToOne
	@JoinColumn(name="batch_download_job_id")
	private BatchDownload batchDownload;

	public PublicDownloadRequest() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDownloadedTimestamp() {
		return this.downloadedTimestamp;
	}

	public void setDownloadedTimestamp(Timestamp downloadedTimestamp) {
		this.downloadedTimestamp = downloadedTimestamp;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public BatchDownload getBatchDownload() {
		return this.batchDownload;
	}

	public void setBatchDownload(BatchDownload batchDownload) {
		this.batchDownload = batchDownload;
	}

}