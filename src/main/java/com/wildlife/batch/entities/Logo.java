package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logos database table.
 * 
 */
@Entity
@Table(name="logos")
@NamedQuery(name="Logo.findAll", query="SELECT l FROM Logo l")
public class Logo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="\"linkPublic\"")
	private String linkPublic;

	private String name;

	private String text;

	//bi-directional many-to-one association to Initiative
	@ManyToOne
	private Initiative initiative;

	public Logo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLinkPublic() {
		return this.linkPublic;
	}

	public void setLinkPublic(String linkPublic) {
		this.linkPublic = linkPublic;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Initiative getInitiative() {
		return this.initiative;
	}

	public void setInitiative(Initiative initiative) {
		this.initiative = initiative;
	}

}