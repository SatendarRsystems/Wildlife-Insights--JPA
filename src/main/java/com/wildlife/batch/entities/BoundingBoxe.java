package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bounding_boxes database table.
 * 
 */
@Entity
@Table(name="bounding_boxes")
@NamedQuery(name="BoundingBoxe.findAll", query="SELECT b FROM BoundingBoxe b")
public class BoundingBoxe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="detection_box")
	private String detectionBox;

	//bi-directional many-to-one association to IdentificationOutput
	@ManyToOne
	@JoinColumn(name="identifications_id")
	private IdentificationOutput identificationOutput;

	public BoundingBoxe() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetectionBox() {
		return this.detectionBox;
	}

	public void setDetectionBox(String detectionBox) {
		this.detectionBox = detectionBox;
	}

	public IdentificationOutput getIdentificationOutput() {
		return this.identificationOutput;
	}

	public void setIdentificationOutput(IdentificationOutput identificationOutput) {
		this.identificationOutput = identificationOutput;
	}

}