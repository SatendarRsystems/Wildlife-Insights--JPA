package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the identification_metakeys database table.
 * 
 */
@Entity
@Table(name="identification_metakeys")
@NamedQuery(name="IdentificationMetakey.findAll", query="SELECT i FROM IdentificationMetakey i")
public class IdentificationMetakey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="key_name")
	private String keyName;

	@Column(name="key_variable")
	private String keyVariable;

	private Integer remarks;

	//bi-directional many-to-one association to IdentificationMetavalue
	@OneToMany(mappedBy="identificationMetakey")
	private List<IdentificationMetavalue> identificationMetavalues;

	public IdentificationMetakey() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getKeyVariable() {
		return this.keyVariable;
	}

	public void setKeyVariable(String keyVariable) {
		this.keyVariable = keyVariable;
	}

	public Integer getRemarks() {
		return this.remarks;
	}

	public void setRemarks(Integer remarks) {
		this.remarks = remarks;
	}

	public List<IdentificationMetavalue> getIdentificationMetavalues() {
		return this.identificationMetavalues;
	}

	public void setIdentificationMetavalues(List<IdentificationMetavalue> identificationMetavalues) {
		this.identificationMetavalues = identificationMetavalues;
	}

	public IdentificationMetavalue addIdentificationMetavalue(IdentificationMetavalue identificationMetavalue) {
		getIdentificationMetavalues().add(identificationMetavalue);
		identificationMetavalue.setIdentificationMetakey(this);

		return identificationMetavalue;
	}

	public IdentificationMetavalue removeIdentificationMetavalue(IdentificationMetavalue identificationMetavalue) {
		getIdentificationMetavalues().remove(identificationMetavalue);
		identificationMetavalue.setIdentificationMetakey(null);

		return identificationMetavalue;
	}

}