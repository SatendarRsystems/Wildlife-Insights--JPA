package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sequence_bounding_boxes database table.
 * 
 */
@Entity
@Table(name="sequence_bounding_boxes")
@NamedQuery(name="SequenceBoundingBoxe.findAll", query="SELECT s FROM SequenceBoundingBoxe s")
public class SequenceBoundingBoxe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="detection_box")
	private String detectionBox;

	//bi-directional many-to-one association to SequenceIdentificationOutput
	@ManyToOne
	@JoinColumn(name="identifications_id")
	private SequenceIdentificationOutput sequenceIdentificationOutput;

	public SequenceBoundingBoxe() {
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

	public SequenceIdentificationOutput getSequenceIdentificationOutput() {
		return this.sequenceIdentificationOutput;
	}

	public void setSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		this.sequenceIdentificationOutput = sequenceIdentificationOutput;
	}

}