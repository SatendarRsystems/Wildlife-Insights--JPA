package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the data_cache database table.
 * 
 */
@Entity
@Table(name="data_cache")
@NamedQuery(name="DataCache.findAll", query="SELECT d FROM DataCache d")
public class DataCache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String key;

	private String data;

	@Column(name="last_changed")
	private Timestamp lastChanged;

	public DataCache() {
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Timestamp getLastChanged() {
		return this.lastChanged;
	}

	public void setLastChanged(Timestamp lastChanged) {
		this.lastChanged = lastChanged;
	}

}