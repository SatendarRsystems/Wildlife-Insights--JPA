package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the devices database table.
 * 
 */
@Entity
@Table(name="devices")
@NamedQuery(name="Device.findAll", query="SELECT d FROM Device d")
public class Device implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String make;

	private String model;

	@Column(name="model_number")
	private String modelNumber;

	private String name;

	@Column(name="product_url")
	private String productUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="purchase_date")
	private Date purchaseDate;

	@Column(name="purchase_price")
	private Double purchasePrice;

	@Column(name="purchase_year")
	private Integer purchaseYear;

	private String remarks;

	@Column(name="serial_number")
	private String serialNumber;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Deployment
	@OneToMany(mappedBy="device")
	private List<Deployment> deployments;

	//bi-directional many-to-one association to Organization
	@ManyToOne
	@JoinColumn(name="organizations_id")
	private Organization organization;

	//bi-directional many-to-one association to Sensor
	//@OneToMany(mappedBy="devicesId")
	//private List<Sensor> sensors;

	public Device() {
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

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelNumber() {
		return this.modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductUrl() {
		return this.productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public Date getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Double getPurchasePrice() {
		return this.purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getPurchaseYear() {
		return this.purchaseYear;
	}

	public void setPurchaseYear(Integer purchaseYear) {
		this.purchaseYear = purchaseYear;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
		deployment.setDevice(this);

		return deployment;
	}

	public Deployment removeDeployment(Deployment deployment) {
		getDeployments().remove(deployment);
		deployment.setDevice(null);

		return deployment;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/*
	 * public List<Sensor> getSensors() { return this.sensors; }
	 * 
	 * public void setSensors(List<Sensor> sensors) { this.sensors = sensors; }
	 */

	/*
	 * public Sensor addSensor(Sensor sensor) { getSensors().add(sensor);
	 * //sensor.setDevice(this);
	 * 
	 * return sensor; }
	 */

	/*
	 * public Sensor removeSensor(Sensor sensor) { getSensors().remove(sensor);
	 * //sensor.setDevice(null);
	 * 
	 * return sensor; }
	 */

}