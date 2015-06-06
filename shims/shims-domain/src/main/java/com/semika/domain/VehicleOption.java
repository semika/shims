/**
 * 
 */
package com.semika.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Semika Siriwardana
 *
 */
@Entity
@Table(name="VEHICLE_OPTION")
public class VehicleOption extends Audited implements Serializable {
	
	@Id
	@SequenceGenerator(name = "vo_seq",sequenceName = "vo_seq")
	@GeneratedValue(generator="vo_seq", strategy=GenerationType.AUTO) 
	private Long id;
	
	@Column(name = "NAME")
	private String optionName;
	
	@Column(name = "DESCRIPTION") 
	private String description;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the optionName
	 */
	public String getOptionName() {
		return optionName;
	}

	/**
	 * @param optionName the optionName to set
	 */
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
