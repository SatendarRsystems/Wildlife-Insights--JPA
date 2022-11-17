package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sensors database table.
 * 
 */
@Entity
@Table(name="sensors")
@NamedQuery(name="Sensor.findAll", query="SELECT s FROM Sensor s")
public class Sensor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private Boolean active;

	@Column(name="devices_id")
	private Integer devicesId;

	private Double gain;

	private String name;

	private String remarks;

	@Column(name="trigger_speed")
	private Double triggerSpeed;

	public Sensor() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getDevicesId() {
		return this.devicesId;
	}

	public void setDevicesId(Integer devicesId) {
		this.devicesId = devicesId;
	}

	public Double getGain() {
		return this.gain;
	}

	public void setGain(Double gain) {
		this.gain = gain;
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

	public Double getTriggerSpeed() {
		return this.triggerSpeed;
	}

	public void setTriggerSpeed(Double triggerSpeed) {
		this.triggerSpeed = triggerSpeed;
	}

}