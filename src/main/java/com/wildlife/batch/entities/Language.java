package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the languages database table.
 * 
 */
@Entity
@Table(name="languages")
@NamedQuery(name="Language.findAll", query="SELECT l FROM Language l")
public class Language implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String code;

	private String name;

	//bi-directional many-to-one association to CommonName
	@OneToMany(mappedBy="languageBean")
	private List<CommonName> commonNames;

	public Language() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CommonName> getCommonNames() {
		return this.commonNames;
	}

	public void setCommonNames(List<CommonName> commonNames) {
		this.commonNames = commonNames;
	}

	public CommonName addCommonName(CommonName commonName) {
		getCommonNames().add(commonName);
		commonName.setLanguageBean(this);

		return commonName;
	}

	public CommonName removeCommonName(CommonName commonName) {
		getCommonNames().remove(commonName);
		commonName.setLanguageBean(null);

		return commonName;
	}

}