package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pgbench_accounts database table.
 * 
 */
@Entity
@Table(name="pgbench_accounts")
@NamedQuery(name="PgbenchAccount.findAll", query="SELECT p FROM PgbenchAccount p")
public class PgbenchAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aid;

	private Integer abalance;

	private Integer bid;

	private String filler;

	public PgbenchAccount() {
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getAbalance() {
		return this.abalance;
	}

	public void setAbalance(Integer abalance) {
		this.abalance = abalance;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getFiller() {
		return this.filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

}