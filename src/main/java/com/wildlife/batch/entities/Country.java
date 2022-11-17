package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the countries database table.
 * 
 */
@Entity
@Table(name="countries")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="bgn_longname")
	private Integer bgnLongname;

	@Column(name="bgn_name")
	private Integer bgnName;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="first_order_divisions_id")
	private Integer firstOrderDivisionsId;

	@Column(name="iso3166_a2")
	private String iso3166A2;

	@Column(name="iso3166_a3")
	private String iso3166A3;

	@Column(name="max_latitude")
	private Double maxLatitude;

	@Column(name="max_longitude")
	private Double maxLongitude;

	@Column(name="min_latitude")
	private Double minLatitude;

	@Column(name="min_longitude")
	private Double minLongitude;

	private String name;

	@Column(name="official_name")
	private String officialName;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Continent
	@ManyToOne
	private Continent continent;

	//bi-directional many-to-one association to GeoRegion
	@ManyToOne
	@JoinColumn(name="geo_region_id")
	private GeoRegion geoRegion;

	//bi-directional many-to-one association to FirstOrderDivision
	@OneToMany(mappedBy="country")
	private List<FirstOrderDivision> firstOrderDivisions;

	public Country() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBgnLongname() {
		return this.bgnLongname;
	}

	public void setBgnLongname(Integer bgnLongname) {
		this.bgnLongname = bgnLongname;
	}

	public Integer getBgnName() {
		return this.bgnName;
	}

	public void setBgnName(Integer bgnName) {
		this.bgnName = bgnName;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getFirstOrderDivisionsId() {
		return this.firstOrderDivisionsId;
	}

	public void setFirstOrderDivisionsId(Integer firstOrderDivisionsId) {
		this.firstOrderDivisionsId = firstOrderDivisionsId;
	}

	public String getIso3166A2() {
		return this.iso3166A2;
	}

	public void setIso3166A2(String iso3166A2) {
		this.iso3166A2 = iso3166A2;
	}

	public String getIso3166A3() {
		return this.iso3166A3;
	}

	public void setIso3166A3(String iso3166A3) {
		this.iso3166A3 = iso3166A3;
	}

	public Double getMaxLatitude() {
		return this.maxLatitude;
	}

	public void setMaxLatitude(Double maxLatitude) {
		this.maxLatitude = maxLatitude;
	}

	public Double getMaxLongitude() {
		return this.maxLongitude;
	}

	public void setMaxLongitude(Double maxLongitude) {
		this.maxLongitude = maxLongitude;
	}

	public Double getMinLatitude() {
		return this.minLatitude;
	}

	public void setMinLatitude(Double minLatitude) {
		this.minLatitude = minLatitude;
	}

	public Double getMinLongitude() {
		return this.minLongitude;
	}

	public void setMinLongitude(Double minLongitude) {
		this.minLongitude = minLongitude;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficialName() {
		return this.officialName;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Continent getContinent() {
		return this.continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public GeoRegion getGeoRegion() {
		return this.geoRegion;
	}

	public void setGeoRegion(GeoRegion geoRegion) {
		this.geoRegion = geoRegion;
	}

	public List<FirstOrderDivision> getFirstOrderDivisions() {
		return this.firstOrderDivisions;
	}

	public void setFirstOrderDivisions(List<FirstOrderDivision> firstOrderDivisions) {
		this.firstOrderDivisions = firstOrderDivisions;
	}

	public FirstOrderDivision addFirstOrderDivision(FirstOrderDivision firstOrderDivision) {
		getFirstOrderDivisions().add(firstOrderDivision);
		firstOrderDivision.setCountry(this);

		return firstOrderDivision;
	}

	public FirstOrderDivision removeFirstOrderDivision(FirstOrderDivision firstOrderDivision) {
		getFirstOrderDivisions().remove(firstOrderDivision);
		firstOrderDivision.setCountry(null);

		return firstOrderDivision;
	}

}