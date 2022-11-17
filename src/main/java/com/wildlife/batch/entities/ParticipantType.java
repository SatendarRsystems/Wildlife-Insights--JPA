package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the participant_types database table.
 * 
 */
@Entity
@Table(name="participant_types")
@NamedQuery(name="ParticipantType.findAll", query="SELECT p FROM ParticipantType p")
public class ParticipantType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String function;

	private String remarks;

	@Column(name="type_name")
	private String typeName;

	//bi-directional many-to-one association to ParticipantTypeProjectPivot
	@OneToMany(mappedBy="participantType")
	private List<ParticipantTypeProjectPivot> participantTypeProjectPivots;

	public ParticipantType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<ParticipantTypeProjectPivot> getParticipantTypeProjectPivots() {
		return this.participantTypeProjectPivots;
	}

	public void setParticipantTypeProjectPivots(List<ParticipantTypeProjectPivot> participantTypeProjectPivots) {
		this.participantTypeProjectPivots = participantTypeProjectPivots;
	}

	public ParticipantTypeProjectPivot addParticipantTypeProjectPivot(ParticipantTypeProjectPivot participantTypeProjectPivot) {
		getParticipantTypeProjectPivots().add(participantTypeProjectPivot);
		participantTypeProjectPivot.setParticipantType(this);

		return participantTypeProjectPivot;
	}

	public ParticipantTypeProjectPivot removeParticipantTypeProjectPivot(ParticipantTypeProjectPivot participantTypeProjectPivot) {
		getParticipantTypeProjectPivots().remove(participantTypeProjectPivot);
		participantTypeProjectPivot.setParticipantType(null);

		return participantTypeProjectPivot;
	}

}