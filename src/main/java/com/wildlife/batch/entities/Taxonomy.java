package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;


/**
 * The persistent class for the taxonomies database table.
 * 
 */
@Entity
@Table(name="taxonomies")
@NamedQuery(name="Taxonomy.findAll", query="SELECT t FROM Taxonomy t")
public class Taxonomy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String authority;

	@Column(name="class")
	private String class_;

	@Column(name="common_name_english")
	private String commonNameEnglish;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String family;

	private String genus;

	private String order;

	@Column(name="reference_url")
	private String referenceUrl;

	@Column(name="scientific_name")
	private String scientificName;

	private String species;

	private String subfamily;

	private String suborder;

	private String subspecies;

	private String superfamily;

	@Column(name="taxon_level")
	private String taxonLevel;

	@Column(name="taxonomy_subtype")
	private String taxonomySubtype;

	@Column(name="taxonomy_type")
	private String taxonomyType;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="unique_identifier")
	private UUID unique_identifier; 
	 
	
	public UUID getUnique_identifier() {
		return unique_identifier;
	}

	public void setUnique_identifier(UUID unique_identifier) {
		this.unique_identifier = unique_identifier;
	}

	//bi-directional many-to-one association to LocalTaxonomy
	@OneToMany(mappedBy="taxonomy")
	private List<LocalTaxonomy> localTaxonomies;

	//bi-directional many-to-one association to IucnRedListCategory
	@ManyToOne
	@JoinColumn(name="iucn_category_id")
	private IucnRedListCategory iucnRedListCategory;

	public Taxonomy() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getCommonNameEnglish() {
		return this.commonNameEnglish;
	}

	public void setCommonNameEnglish(String commonNameEnglish) {
		this.commonNameEnglish = commonNameEnglish;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getGenus() {
		return this.genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getReferenceUrl() {
		return this.referenceUrl;
	}

	public void setReferenceUrl(String referenceUrl) {
		this.referenceUrl = referenceUrl;
	}

	public String getScientificName() {
		return this.scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSubfamily() {
		return this.subfamily;
	}

	public void setSubfamily(String subfamily) {
		this.subfamily = subfamily;
	}

	public String getSuborder() {
		return this.suborder;
	}

	public void setSuborder(String suborder) {
		this.suborder = suborder;
	}

	public String getSubspecies() {
		return this.subspecies;
	}

	public void setSubspecies(String subspecies) {
		this.subspecies = subspecies;
	}

	public String getSuperfamily() {
		return this.superfamily;
	}

	public void setSuperfamily(String superfamily) {
		this.superfamily = superfamily;
	}

	public String getTaxonLevel() {
		return this.taxonLevel;
	}

	public void setTaxonLevel(String taxonLevel) {
		this.taxonLevel = taxonLevel;
	}

	public String getTaxonomySubtype() {
		return this.taxonomySubtype;
	}

	public void setTaxonomySubtype(String taxonomySubtype) {
		this.taxonomySubtype = taxonomySubtype;
	}

	public String getTaxonomyType() {
		return this.taxonomyType;
	}

	public void setTaxonomyType(String taxonomyType) {
		this.taxonomyType = taxonomyType;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<LocalTaxonomy> getLocalTaxonomies() {
		return this.localTaxonomies;
	}

	public void setLocalTaxonomies(List<LocalTaxonomy> localTaxonomies) {
		this.localTaxonomies = localTaxonomies;
	}

	public LocalTaxonomy addLocalTaxonomy(LocalTaxonomy localTaxonomy) {
		getLocalTaxonomies().add(localTaxonomy);
		localTaxonomy.setTaxonomy(this);

		return localTaxonomy;
	}

	public LocalTaxonomy removeLocalTaxonomy(LocalTaxonomy localTaxonomy) {
		getLocalTaxonomies().remove(localTaxonomy);
		localTaxonomy.setTaxonomy(null);

		return localTaxonomy;
	}

	public IucnRedListCategory getIucnRedListCategory() {
		return this.iucnRedListCategory;
	}

	public void setIucnRedListCategory(IucnRedListCategory iucnRedListCategory) {
		this.iucnRedListCategory = iucnRedListCategory;
	}

}