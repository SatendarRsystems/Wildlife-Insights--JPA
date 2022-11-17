package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the previous_identifiers database table.
 * 
 */
@Entity
@Table(name="previous_identifiers")
@NamedQuery(name="PreviousIdentifier.findAll", query="SELECT p FROM PreviousIdentifier p")
public class PreviousIdentifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="associated_table")
	private String associatedTable;

	private String description;

	@Column(name="prev_identifier_int")
	private Integer prevIdentifierInt;

	@Column(name="prev_identifier_str")
	private String prevIdentifierStr;

	private String source;

	public PreviousIdentifier() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAssociatedTable() {
		return this.associatedTable;
	}

	public void setAssociatedTable(String associatedTable) {
		this.associatedTable = associatedTable;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrevIdentifierInt() {
		return this.prevIdentifierInt;
	}

	public void setPrevIdentifierInt(Integer prevIdentifierInt) {
		this.prevIdentifierInt = prevIdentifierInt;
	}

	public String getPrevIdentifierStr() {
		return this.prevIdentifierStr;
	}

	public void setPrevIdentifierStr(String prevIdentifierStr) {
		this.prevIdentifierStr = prevIdentifierStr;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}